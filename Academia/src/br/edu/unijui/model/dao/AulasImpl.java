package br.edu.unijui.model.dao;
import br.edu.unijui.dataBase.DataBase;
import br.edu.unijui.model.Aulas;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.ResultSet;
import java.util.ArrayList;

public class AulasImpl{
    private final Connection con;
    private PreparedStatement pstmtInserir;
    private PreparedStatement pstmtAlterar;
    private PreparedStatement pstmtExcluir;
    private PreparedStatement pstmtListar;

    public AulasImpl() throws ClassNotFoundException, SQLException {
       con = new DataBase().getConnection();
        inicializarPreparedStatements();
    }
    
    private void inicializarPreparedStatements() throws SQLException {
       
    }
    
    public boolean inserirAula(Aulas aula) {
        try {
            pstmtInserir = con.prepareStatement(
                    "INSERT INTO aulas (aula_id, nome_aula, descricao, horario, dia_semana, instrutor_id)" +
                    "VALUES (default, ?, ?, ?, ?, ?)");

            pstmtInserir.setString(1, aula.getNomeAula());
            pstmtInserir.setString(2, aula.getDescricao());
            pstmtInserir.setString(3, aula.getHorario());
            pstmtInserir.setString(4, aula.getDiaSemana());
            pstmtInserir.setInt(5, aula.getInstrutor_id());

            pstmtInserir.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AulasImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

       public boolean alterarAula(Aulas aula) {
        try {
            pstmtAlterar = con.prepareStatement(
                    "UPDATE aulas " +
                    "SET nome_aula=?, descricao=?, horario=?, dia_semana=?, instrutor_id=? " +
                    "WHERE aula_id=?");

            pstmtAlterar.setString(1, aula.getNomeAula());
            pstmtAlterar.setString(2, aula.getDescricao());
            pstmtAlterar.setString(3, aula.getHorario());
            pstmtAlterar.setString(4, aula.getDiaSemana());
            pstmtAlterar.setInt(5, aula.getInstrutor_id());
            pstmtAlterar.setInt(6, aula.getAula_id());

            int rowsAffected = pstmtAlterar.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(AulasImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean excluirAula(Aulas aula) {
        try {
            pstmtExcluir = con.prepareStatement(
                    "DELETE FROM aulas " +
                    "WHERE aula_id=?");

            pstmtExcluir.setInt(1, aula.getAula_id());

            int rowsAffected = pstmtExcluir.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(AulasImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Aulas> listarAulas() {
        List<Aulas> aulasList = new ArrayList<>();

        try {
            pstmtListar = con.prepareStatement("SELECT * FROM aulas");
            ResultSet rs = pstmtListar.executeQuery();

            while (rs.next()) {
                Aulas aula = new Aulas();
                aula.setAula_id(rs.getInt("aula_id"));
                aula.setNomeAula(rs.getString("nome_aula"));
                aula.setDescricao(rs.getString("descricao"));
                aula.setHorario(rs.getString("horario"));
                aula.setDiaSemana(rs.getString("dia_semana"));
                aula.setInstrutor_id(rs.getInt("instrutor_id"));

                aulasList.add(aula);
            }

            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(AulasImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return aulasList;
    }
    
    public ResultSet listarAulas2() throws SQLException {
        pstmtListar = con.prepareStatement("SELECT nome_aula, dia_semana, horario FROM aulas", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = pstmtListar.executeQuery();
        return rs;
    }
    
}
