package br.edu.unijui.model.dao;
import br.edu.unijui.dataBase.DataBase;
import br.edu.unijui.model.Instrutores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InstrutoresImpl {
    private final Connection con;
    private PreparedStatement pstmtInserir;
    private PreparedStatement pstmtAlterar;
    private PreparedStatement pstmtExcluir;
    private PreparedStatement pstmtListar;

    public InstrutoresImpl() throws ClassNotFoundException, SQLException {
        con = new DataBase().getConnection();
        inicializarPreparedStatements();
    }

    private void inicializarPreparedStatements() throws SQLException {
        // Defina os PreparedStatement para inserção, atualização e exclusão aqui, se necessário.
    }

    public boolean inserirInstrutor(Instrutores instrutor) {
        try {
            pstmtInserir = con.prepareStatement(
                    "INSERT INTO instrutores (instrutor_id, nome, sobrenome, data_nascimento, telefone, email)" +
                    "VALUES (default, ?, ?, ?, ?, ?)");

            pstmtInserir.setString(1, instrutor.getNome());
            pstmtInserir.setString(2, instrutor.getSobrenome());
            pstmtInserir.setString(3, instrutor.getDataNascimento());
            pstmtInserir.setString(4, instrutor.getTelefone());
            pstmtInserir.setString(5, instrutor.getEmail());

            pstmtInserir.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(InstrutoresImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean alterarInstrutor(Instrutores instrutor) {
        try {
            pstmtAlterar = con.prepareStatement(
                    "UPDATE instrutores " +
                    "SET nome=?, sobrenome=?, data_nascimento=?, telefone=?, email=? " +
                    "WHERE instrutor_id=?");

            pstmtAlterar.setString(1, instrutor.getNome());
            pstmtAlterar.setString(2, instrutor.getSobrenome());
            pstmtAlterar.setString(3, instrutor.getDataNascimento());
            pstmtAlterar.setString(4, instrutor.getTelefone());
            pstmtAlterar.setString(5, instrutor.getEmail());
            pstmtAlterar.setInt(6, instrutor.getInstrutor_id());

            int rowsAffected = pstmtAlterar.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(InstrutoresImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean excluirInstrutor(Instrutores instrutor) {
        try {
            pstmtExcluir = con.prepareStatement(
                    "DELETE FROM instrutores " +
                    "WHERE instrutor_id=?");

            pstmtExcluir.setInt(1, instrutor.getInstrutor_id());

            int rowsAffected = pstmtExcluir.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(InstrutoresImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static ArrayList<Instrutores> listarInstrutores () throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        
        ArrayList<Instrutores> instrutores = new ArrayList();
        try {
            PreparedStatement pstmt = db.getConnection().prepareStatement("SELECT * FROM instrutores");

            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Instrutores instrutor = new Instrutores();
                instrutor.setInstrutor_id(rs.getInt("instrutor_id"));
                instrutor.setNome(rs.getString("nome"));
                instrutor.setSobrenome(rs.getString("sobrenome"));
                instrutor.setDataNascimento(rs.getString("data_nascimento"));
                instrutor.setTelefone(rs.getString("telefone"));
                instrutor.setEmail(rs.getString("email"));

                instrutores.add(instrutor);
            }

            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(InstrutoresImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return instrutores;
    }
    
    public ResultSet listarInstrutores2() throws SQLException {
        pstmtListar = con.prepareStatement("SELECT nome, data_nascimento, telefone FROM instrutores", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = pstmtListar.executeQuery();
        return rs;
    }
}
