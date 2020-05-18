/*
Institution: Universidad Veracruzana
File creator: Brandon Adalit Trujillo Capistrán
Class name: PracticingDAO
Date of creation: April 22nd. 2020
*/
package dataAccess;
import Domain.Practicing;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PracticingDAO implements IPracticingDAO {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consulta;
    private ResultSet resultados;
    
    public PracticingDAO() {
        connectDB = new ConnectDB();
    }
    
    @Override
    public Practicing searchPracticingByEnrollment (String enrollment){
        Practicing practicing = null;
        try (Connection connect = connectDB.getConnection()){
            String query = "Select name, enrollment from practicing where enrollment = ?";
            PreparedStatement sentencia = connect.prepareStatement(query);
            sentencia.setString(1, enrollment);
            resultados = sentencia.executeQuery();
            while (resultados.next()){
                practicing = new Practicing();
                practicing.setEnrollment(resultados.getString("enrollment"));
                practicing.setName(resultados.getString("name"));
            }
        }catch (SQLException exc){
         Logger.getLogger(PracticingDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return practicing;
    }

    public Practicing searchPracticingByKeyword (String keyword) {
        Practicing practicing = null;
        try (Connection connect = connectDB.getConnection()) {
            String query = "SELECT enrollment, name FROM practicing WHERE enrollment LIKE %{?}%";
            PreparedStatement sentencia = connect.prepareStatement(query);
            sentencia.setString(1, keyword);
            resultados = sentencia.executeQuery();
            while (resultados.next()) {
                practicing = new Practicing();
                practicing.setEnrollment(resultados.getString("enrollment"));
                practicing.setName(resultados.getString("name"));
            }
        } catch (SQLException exc) {
            Logger.getLogger(PracticingDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return practicing;
    }

    public void deletePracticingByEnrollment (String enrollment) {
        Scanner sc = new Scanner(System.in);
        Connection connect = null;
        PreparedStatement sentence = null;
        try {
            connect = connectDB.getConnection();
            String query = "START TRANSACTION; DELETE FROM practicing where enrollment = ?";
            sentence = connect.prepareStatement(query);
            sentence.setString(1, enrollment);
            resultados = sentence.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(PracticingDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
        boolean userAnswer = true;
        if (userAnswer) {
            try {
                sentence = connect.prepareStatement("COMMIT");
                sentence.executeQuery();
            } catch (SQLException exc) {
                Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
        } else {
            try {
                sentence = connect.prepareStatement("ROLLBACK");
                sentence.executeQuery();
            } catch (SQLException exc) {
                Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
        }
    }
    
    @Override
    public List<Practicing> returnAllPracticing(){
        List<Practicing> allPracticing = new ArrayList();
        try {
        connection = connectDB.getConnection();
        consulta = connection.createStatement();
        resultados = consulta.executeQuery("select name, enrollment from practicing");
        while (resultados.next()){
            Practicing practicing = new Practicing();
            practicing.setEnrollment(resultados.getString("enrollment"));
            practicing.setName(resultados.getString("name"));
            allPracticing.add(practicing);
        }
        } catch (SQLException exc) {
                Logger.getLogger(PracticingDAO.class.getName()).log(Level.SEVERE, null, exc);
        }  finally {
            connectDB.closeConnection();
        }
        return allPracticing;
    } 
    
}
