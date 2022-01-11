package controller07351;

import entity07351.PendaftarEntity07351;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PendaftarController07351 {
    public void insert07351(String nama07351, String alamat07351,String noTelp07351){
        AllObjModel07351.pendaftarModel07351.insert07351(nama07351, alamat07351, noTelp07351);
    }
    
    public void update07351(int pil07351, int id07351, String edit07351){
            switch(pil07351){
                case 1 ->{
                    AllObjModel07351.pendaftarModel07351.updateNama07351(id07351, edit07351);
                }
                case 2 ->{
                    AllObjModel07351.pendaftarModel07351.updateAlamat07351(id07351, edit07351);
                }
                case 3 ->{
                    AllObjModel07351.pendaftarModel07351.updateNoTelp07351(id07351, edit07351);
                }
            }
    }
    
    public ArrayList<PendaftarEntity07351> getData07351(){
        return AllObjModel07351.pendaftarModel07351.getDataPendaftar07351();
    }
    
    public ArrayList<PendaftarEntity07351> getDataById(int id07351){
        return AllObjModel07351.pendaftarModel07351.getDataPendaftar07351(id07351);
    }
    
    public void delete07351(int id07351){
        AllObjModel07351.pendaftarModel07351.delete07351(id07351);
    }
    public DefaultTableModel daftarPendaftar07531(){
        DefaultTableModel dataDaftarMahasiswaSatya = new DefaultTableModel();
        Object[] kolomSatya = {"ID","NAMA","ALAMAT","NOTELP"};
        dataDaftarMahasiswaSatya.setColumnIdentifiers(kolomSatya);
        
        int sizeSatya = getData07351().size();
        for(int iSatya = 0;iSatya<sizeSatya;iSatya++){
            Object[] dataSatya = new Object[5];
            dataSatya[0] = AllObjModel07351.pendaftarModel07351.getDataPendaftar07351().get(iSatya).getId07351();
            dataSatya[1] = AllObjModel07351.pendaftarModel07351.getDataPendaftar07351().get(iSatya).getNama07351();
            dataSatya[2] = AllObjModel07351.pendaftarModel07351.getDataPendaftar07351().get(iSatya).getAlamat07351();
            dataSatya[3] = AllObjModel07351.pendaftarModel07351.getDataPendaftar07351().get(iSatya).getNoTelp07351();
            dataDaftarMahasiswaSatya.addRow(dataSatya);
        }
        return dataDaftarMahasiswaSatya;
    }
}
