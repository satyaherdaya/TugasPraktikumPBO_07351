package helper07351;

import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiDB07351 {
    public static Connection getKoneksi07351(){
        Connection conn07351 = null;
        String driver07351 = "com.mysql.cj.jdbc.Driver";
        String url07351 = "jdbc:mysql://localhost:3306/db_pendaftarankursus";
        String user07351 = "root";
        String pass07351 = "";
        try{
            Class.forName(driver07351);
            conn07351 = DriverManager.getConnection(url07351, user07351, pass07351);
            System.out.println("Berhasil Koneksi ke Database");
        }catch(Exception e07351){
            System.out.println("Gagal Koneksi ke Database");
            e07351.printStackTrace();
        }
        return conn07351;
    }
}
