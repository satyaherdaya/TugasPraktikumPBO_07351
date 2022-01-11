package proses07351;

import entity07351.AdminEntity07351;
import java.util.ArrayList;

public class AdminProses07351 implements Interface07351{
    private static ArrayList<AdminEntity07351> admin07351 = new ArrayList<>();

    public static ArrayList<AdminEntity07351> getAdmin07351() {
        return admin07351;
    }
    
    public void insert07351(int id07351, String nama07351, String username07351, String password07351){
        admin07351.add(new AdminEntity07351(username07351,password07351,id07351,nama07351));
    }
    
    @Override
    public void view07351() {
        for(AdminEntity07351 adm07351 : admin07351){
            System.out.println("===============================================");
            System.out.println("Id       : " + adm07351.getId07351());
            System.out.println("Nama     : " + adm07351.getNama07351());
            System.out.println("===============================================");
        }
    }
    
    public int cekAdmin07351(String username07351, String password07351){
        for(AdminEntity07351 adm07351 : admin07351){
            if(adm07351.getUsername07351().equals(username07351) && adm07351.getPassword07351().equals(password07351)){
                return adm07351.getId07351();
            }
        }
        return -1;
    }
}
