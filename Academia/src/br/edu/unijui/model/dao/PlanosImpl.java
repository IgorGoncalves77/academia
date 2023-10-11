package br.edu.unijui.model.dao;
import br.edu.unijui.dataBase.DataBase;
import br.edu.unijui.model.Planos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlanosImpl {
    private final Connection con;
    private PreparedStatement pstmtInserir;
    private PreparedStatement pstmtAlterar;
    private PreparedStatement pstmtExcluir;
    private PreparedStatement pstmtListar;

    public PlanosImpl() throws ClassNotFoundException, SQLException {
        con = new DataBase().getConnection();
        inicializarPreparedStatements();
    }

    private void inicializarPreparedStatements() throws SQLException {
        // Defina os PreparedStatement para inserção, atualização e exclusão aqui, se necessário.
    }

    public boolean inserirPlano(Planos plano) {
        try {
            pstmtInserir = con.prepareStatement(
                    "INSERT INTO planostreinamento (plano_id, nome_plano, descricao, duracao_semanas, preco)" +
                    "VALUES (default, ?, ?, ?, ?)");

            pstmtInserir.setString(1, plano.getNomePlano());
            pstmtInserir.setString(2, plano.getDescricao());
            pstmtInserir.setInt(3, plano.getDuracaoSemanas());
            pstmtInserir.setDouble(4, plano.getPreco());

            pstmtInserir.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PlanosImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean alterarPlano(Planos plano) {
        try {
            pstmtAlterar = con.prepareStatement(
                    "UPDATE planostreinamento " +
                    "SET nome_plano=?, descricao=?, duracao_semanas=?, preco=? " +
                    "WHERE plano_id=?");

            pstmtAlterar.setString(1, plano.getNomePlano());
            pstmtAlterar.setString(2, plano.getDescricao());
            pstmtAlterar.setInt(3, plano.getDuracaoSemanas());
            pstmtAlterar.setDouble(4, plano.getPreco());
            pstmtAlterar.setInt(5, plano.getPlano_id());

            int rowsAffected = pstmtAlterar.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(PlanosImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean excluirPlano(Planos plano) {
        try {
            pstmtExcluir = con.prepareStatement(
                    "DELETE FROM planostreinamento " +
                    "WHERE plano_id=?");

            pstmtExcluir.setInt(1, plano.getPlano_id());

            int rowsAffected = pstmtExcluir.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(PlanosImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static ArrayList<Planos> listarPlanos () throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();

        ArrayList<Planos> planos = new ArrayList();
        try {
            PreparedStatement pstmt = db.getConnection().prepareStatement("SELECT * FROM planostreinamento");

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Planos plano = new Planos();
                plano.setPlano_id(rs.getInt("plano_id"));
                plano.setNomePlano(rs.getString("nome_plano"));
                plano.setDescricao(rs.getString("descricao"));
                plano.setDuracaoSemanas(rs.getInt("duracao_semanas"));
                plano.setPreco(rs.getDouble("preco"));

                planos.add(plano);
            }

            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(PlanosImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return planos;
    }
    
    public ResultSet listarPlanos2() throws SQLException {
        pstmtListar = con.prepareStatement("SELECT nome_plano, duracao_semanas, preco FROM planostreinamento", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = pstmtListar.executeQuery();
        return rs;
    }
}
