package code.jep456;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Jep456 {

    private void testConnexionAvecFeature() throws SQLException {
        try {
            Connection _ = DriverManager.getConnection("localhost", "onepoint", "free");
        } catch (SQLException sql) {
            System.out.println("ce n'est pas free");
        }
    }

    private void testConnexionAvantFeature() throws SQLException {
        try {
            Connection connect = DriverManager.getConnection("localhost", "onepoint", "free");
        } catch (SQLException sql) {
            System.out.println("ce n'est pas free");
        }
    }


    private void incrementsAvecFeature(){
        List<String> names = List.of("Thomas", "nicolas", "alice", "gérard");
        int count = 0;
        for(String name: names){
            count++;
        }
        System.out.println(" le compte est de : " + count);
    }


    private void incrementsAvantFeature(){
        List<String> names = List.of("Thomas", "nicolas", "alice", "gérard");
        int count = 0;
        for(String _: names){
            count++;
        }
        System.out.println(" le compte est de : " + count);
    }

}
