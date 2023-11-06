package br.edu.unijui.model.dao;
import br.edu.unijui.dataBase.DataBase;
import br.edu.unijui.model.Inscricoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InscricoesImpl {
    private final Connection con;
    private PreparedStatement pstmtInserir;
    private PreparedStatement pstmtAlterar;
    private PreparedStatement pstmtExcluir;
    private PreparedStatement pstmtListar;

    public InscricoesImpl() throws ClassNotFoundException, SQLException {
        con = new DataBase().getConnection();
        inicializarPreparedStatements();
    }

    private void inicializarPreparedStatements() throws SQLException {
        // Defina os PreparedStatement para inserção, atualização e exclusão aqui, se necessário.
    }

    public boolean inserirInscricao(Inscricoes inscricao) {
        try {
            pstmtInserir = con.prepareStatement(
                    "INSERT INTO inscricoes (inscricao_id, client_id, plano_id, data_inscricao, data_vencimento, status_pagamento)" +
                    "VALUES (default, ?, ?, ?, ?, ?)");

            pstmtInserir.setInt(1, inscricao.getClient_id());
            pstmtInserir.setInt(2, inscricao.getPlano_id());
            pstmtInserir.setString(3, inscricao.getDataInscricao());
            pstmtInserir.setString(4, inscricao.getDataVencimento());
            pstmtInserir.setString(5, inscricao.getStatusPagamento());

            pstmtInserir.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(InscricoesImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean alterarInscricao(Inscricoes inscricao) {
        try {
            pstmtAlterar = con.prepareStatement(
                    "UPDATE inscricao " +
                    "SET client_id=?, plano_id=?, dataInscricao=?, dataVencimento=?, statusPagamento=? " +
                    "WHERE inscricao_id=?");

            pstmtAlterar.setInt(1, inscricao.getClient_id());
            pstmtAlterar.setInt(2, inscricao.getPlano_id());
            pstmtAlterar.setString(3, inscricao.getDataInscricao());
            pstmtAlterar.setString(4, inscricao.getDataVencimento());
            pstmtAlterar.setString(5, inscricao.getStatusPagamento());
            pstmtAlterar.setInt(6, inscricao.getInscricao_id());

            int rowsAffected = pstmtAlterar.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(InscricoesImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean excluirInscricao(Inscricoes inscricao) {
        try {
            pstmtExcluir = con.prepareStatement(
                    "DELETE FROM inscricao " +
                    "WHERE inscricao_id=?");

            pstmtExcluir.setInt(1, inscricao.getInscricao_id());

            int rowsAffected = pstmtExcluir.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(InscricoesImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Inscricoes> listarInscricoes() {
        List<Inscricoes> inscricoesList = new ArrayList<>();

        try {
            pstmtListar = con.prepareStatement("SELECT * FROM inscricoes");
            ResultSet rs = pstmtListar.executeQuery();

            while (rs.next()) {
                Inscricoes inscricao = new Inscricoes();
                inscricao.setInscricao_id(rs.getInt("inscricao_id"));
                inscricao.setClient_id(rs.getInt("client_id"));
                inscricao.setPlano_id(rs.getInt("plano_id"));
                inscricao.setDataInscricao(rs.getString("data_inscricao"));
                inscricao.setDataVencimento(rs.getString("data_vencimento"));
                inscricao.setStatusPagamento(rs.getString("status_pagamento"));
                
                inscricoesList.add(inscricao);
            }

            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(InscricoesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return inscricoesList;
    }
    
    public ResultSet consultarClientesEmAtraso() throws SQLException {
        pstmtListar = con.prepareStatement("SELECT c.nome, p.nome_plano, i.data_vencimento, i.status_pagamento " +
            "FROM inscricoes i " +
            "INNER JOIN clientes c ON i.client_id = c.client_id " +
            "INNER JOIN planostreinamento p ON i.plano_id = p.plano_id " +
            "WHERE i.status_pagamento = 'Em Atraso'", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = pstmtListar.executeQuery();
        return rs;
    }
    
    public ResultSet listarInscricoes2() throws SQLException {
        pstmtListar = con.prepareStatement("SELECT c.nome AS nome_cliente, p.nome_plano, i.data_vencimento, i.status_pagamento " +
                "FROM inscricoes i " +
                "INNER JOIN clientes c ON i.client_id = c.client_id " +
                "INNER JOIN planostreinamento p ON i.plano_id = p.plano_id", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = pstmtListar.executeQuery();
        return rs;
    }
}
