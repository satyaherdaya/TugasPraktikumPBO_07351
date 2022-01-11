package model07351;

import java.util.ArrayList;
import helper07351.KoneksiDB07351;
import entity07351.PendaftarEntity07351;
import java.sql.*;

public class PendaftarModel07351 {
    private String sql07351;
    public Connection conn07351 = KoneksiDB07351.getKoneksi07351();
    
    public ArrayList<PendaftarEntity07351> getDataPendaftar07351(){
        ArrayList<PendaftarEntity07351> dataPendaftar07351 = new ArrayList();
        try{
            Statement stmt07351 = conn07351.createStatement();
            sql07351 = "SELECT * FROM pendaftar";
            ResultSet rs07351 = stmt07351.executeQuery(sql07351);
            while(rs07351.next()){
                PendaftarEntity07351 pendaftar07351 = new PendaftarEntity07351();
                pendaftar07351.setId07351(rs07351.getInt("id"));
                pendaftar07351.setNama07351(rs07351.getString("nama"));
                pendaftar07351.setAlamat07351(rs07351.getString("alamat"));
                pendaftar07351.setNoTelp07351(rs07351.getString("noTelp"));
                dataPendaftar07351.add(pendaftar07351);
            }
        }catch(SQLException e07351){
            System.out.println(e07351);
        }
        return dataPendaftar07351;
    }
    
    public ArrayList<PendaftarEntity07351> getDataPendaftar07351(int id07351){
        ArrayList<PendaftarEntity07351> dataPendaftar07351 = new ArrayList();
        try{
            sql07351 = "SELECT * FROM pendaftar WHERE id=?";
            PreparedStatement stmt07351 = conn07351.prepareStatement(sql07351);
            stmt07351.setInt(1, id07351);
            ResultSet rs07351 = stmt07351.executeQuery();
            while(rs07351.next()){
                PendaftarEntity07351 pendaftar07351 = new PendaftarEntity07351();
                pendaftar07351.setId07351(rs07351.getInt("id"));
                pendaftar07351.setNama07351(rs07351.getString("nama"));
                pendaftar07351.setAlamat07351(rs07351.getString("alamat"));
                pendaftar07351.setNoTelp07351(rs07351.getString("noTelp"));
                dataPendaftar07351.add(pendaftar07351);
            }
        }catch(SQLException e07351){
            System.out.println(e07351);
        }
        return dataPendaftar07351;
    }
    
    public void insert07351(String nama07351,String alamat07351,String noTelp07351){
        try{
            sql07351 = "INSERT INTO pendaftar(nama,alamat,noTelp) values(?,?,?)";
            PreparedStatement stmt07351 = conn07351.prepareStatement(sql07351);
            stmt07351.setString(1, nama07351);
            stmt07351.setString(2, alamat07351);
            stmt07351.setString(3, noTelp07351);
            int rows07351 = stmt07351.executeUpdate();
            System.out.println(rows07351 + " data telah ditambahkan");
        }catch(SQLException e07351){
            System.out.println("gagal input data");
            System.out.println(e07351);
        }
    }
    
    public void updateNama07351(int id07351,String nama07351){
        try{
            sql07351 = "UPDATE pendaftar SET nama=? WHERE id=?";
            PreparedStatement stmt07351 = conn07351.prepareStatement(sql07351);
            stmt07351.setString(1, nama07351);
            stmt07351.setInt(2, id07351);
            int rows07351 = stmt07351.executeUpdate();
            System.out.println(rows07351 + " berhasil diupdate");
        }catch(SQLException e){
            System.out.println("gagal uodate data");
            System.out.println(e);
        }
    }
    
    public void updateAlamat07351(int id07351,String alamat07351){
        try{
            sql07351 = "UPDATE pendaftar SET alamat=? WHERE id=?";
            PreparedStatement stmt07351 = conn07351.prepareStatement(sql07351);
            stmt07351.setString(1, alamat07351);
            stmt07351.setInt(2, id07351);
            int rows07351 = stmt07351.executeUpdate();
            System.out.println(rows07351 + " data berhasil diupdate");
        }catch(SQLException e){
            System.out.println("gagal uodate data");
            System.out.println(e);
        }
    }
    
    public void updateNoTelp07351(int id07351,String noTelp07351){
        try{
            sql07351 = "UPDATE pendaftar SET noTelp=? WHERE id=?";
            PreparedStatement stmt07351 = conn07351.prepareStatement(sql07351);
            stmt07351.setString(1, noTelp07351);
            stmt07351.setInt(2, id07351);
            int rows07351 = stmt07351.executeUpdate();
            System.out.println(rows07351 + " data berhasil diupdate");
        }catch(SQLException e07351){
            System.out.println("gagal uodate data");
            System.out.println(e07351);
        }
    }
    
    public void delete07351(int id07351){
        try{
            sql07351 = "DELETE FROM pendaftar where id=?";
            PreparedStatement stmt07351 = conn07351.prepareStatement(sql07351);
            stmt07351.setInt(1, id07351);
            int rows = stmt07351.executeUpdate();
            System.out.println(rows + " data berhasil dihapus");
        }catch(SQLException e07351){
            System.out.println("gagal hapus data");
            System.out.println(e07351);
        }
    }
}
