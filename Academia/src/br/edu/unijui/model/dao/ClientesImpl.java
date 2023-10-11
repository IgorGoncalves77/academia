package br.edu.unijui.model.dao;
import br.edu.unijui.dataBase.DataBase;
import br.edu.unijui.model.Clientes;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ClientesImpl{
    private final Connection con;
    private PreparedStatement pstmtInserir;
    private PreparedStatement pstmtAlterar;
    private PreparedStatement pstmtExcluir;
    private PreparedStatement pstmtListar;

    public ClientesImpl() throws ClassNotFoundException, SQLException {
       con = new DataBase().getConnection();
        inicializarPreparedStatements();
    }
    
    private void inicializarPreparedStatements() throws SQLException {
       
    }
    
    public boolean inserirCliente(Clientes cliente) {
        try {
            System.out.println(cliente.getGenero());
            pstmtInserir = con.prepareStatement(""
                + "insert into clientes (client_id, nome, sobrenome, data_nascimento, genero, telefone, email)" 
                + "values (default, ?, ?, ?, ?, ?, ?)");
        
            pstmtInserir.setString(1, cliente.getNome());
            pstmtInserir.setString(2, cliente.getSobrenome());
            pstmtInserir.setString(3, cliente.getDataNascimento());
            pstmtInserir.setString(4, cliente.getGenero());
            pstmtInserir.setString(5, cliente.getTelefone());
            pstmtInserir.setString(6, cliente.getEmail());
            pstmtInserir.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClientesImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean alterarCliente(Clientes cliente) {
        try {
            pstmtAlterar = con.prepareStatement(
                "UPDATE clientes " +
                "SET nome=?, sobrenome=?, data_nascimento=?, genero=?, telefone=?, email=? " +
                "WHERE client_id=?"
            );

            pstmtAlterar.setString(1, cliente.getNome());
            pstmtAlterar.setString(2, cliente.getSobrenome());
            pstmtAlterar.setString(3, cliente.getDataNascimento());
            pstmtAlterar.setString(4, cliente.getGenero());
            pstmtAlterar.setString(5, cliente.getTelefone());
            pstmtAlterar.setString(6, cliente.getEmail());
            pstmtAlterar.setInt(7, cliente.getClient_id());

            int rowsAffected = pstmtAlterar.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ClientesImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean excluirCliente(Clientes cliente) {
        try {
            pstmtExcluir = con.prepareStatement(
                "DELETE FROM clientes " +
                "WHERE client_id=?"
            );

            pstmtExcluir.setInt(1, cliente.getClient_id());

            int rowsAffected = pstmtExcluir.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ClientesImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static ArrayList<Clientes> listarClientes () throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();

        ArrayList<Clientes> clientes = new ArrayList();
        try {
            PreparedStatement pstmt = db.getConnection().prepareStatement("SELECT * FROM clientes");

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Clientes cliente = new Clientes();
                cliente.setClient_id(rs.getInt("client_id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setDataNascimento(rs.getString("data_nascimento"));
                cliente.setGenero(rs.getString("genero"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));

                clientes.add(cliente);
            }

            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }
    
    public ResultSet listarClientes2() throws SQLException {
        pstmtListar = con.prepareStatement("SELECT nome, data_nascimento, telefone FROM clientes", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = pstmtListar.executeQuery();
        return rs;
    }
}
