package praktikumpertemuan2_07351;

import java.util.Scanner;
import proses07351.*;

public class PraktikumPertemuan2_07351 {
    private static Scanner input07351=new Scanner(System.in);
    private static AdminProses07351 adminProses07351 = new AdminProses07351();
    private static SepatuProses07351 sepatuProses07351 = new SepatuProses07351();
    private static int stokTotal07351 = 0;
    
    public static void main(String[] args) {
        dataAdmin07351();
        
        int pil07351;
        
        do{
            System.out.println("1. Login");
            System.out.println("2. View Admin");
            System.out.println("0. keluar");
            System.out.print("masukkan pilihan : ");
            pil07351 = input07351.nextInt();
            input07351.nextLine();
            switch(pil07351){
                case 1 -> {
                    menuLogin07351();
                }
                case 2 -> {
                    adminProses07351.view07351();
                }
            }
        }while(pil07351!=0);    
    }
    
    static void dataAdmin07351(){
        int[] id07351 = {1,2,3};
        String[] nama07351 = {"Admin","Admin2","Admin3"};
        String[] username07351 = {"admin","admin2","admin3"};
        String[] password07351 = {"admin","admin2","admin3"};
        
        for(int i07351=0;i07351<nama07351.length;i07351++){
            adminProses07351.insert07351(id07351[i07351],nama07351[i07351],username07351[i07351],password07351[i07351]);
        }
    }
    
    static void menuLogin07351(){
        do{
            System.out.println("LOGIN");
            System.out.print("username : ");
            String username07351 = input07351.nextLine();
            System.out.print("password : ");
            String password07351 = input07351.nextLine();
            int cek07351 = adminProses07351.cekAdmin07351(username07351, password07351);
            System.out.println("===============================================");
               if(cek07351!=-1){
                menuAdmin07351(cek07351);
                break;
            }else{
                System.out.println("username/password salah");
            }
            System.out.println();
        }while(true);
    }
    
    static void menuAdmin07351(int cek07351){
        int pil07351;
        System.out.println("Selamat Datang " + AdminProses07351.getAdmin07351().get(cek07351-1).getNama07351());
        do{
            System.out.println("===============================================");
            System.out.println("Stok Total Sepatu : " + stokTotal07351);
            System.out.print("""
                             Menu :
                             1. Tambah Data Sepatu
                             2. Lihat Data Sepatu
                             3. Ubah Data Sepatu
                             4. Hapus Data Sepatu
                             0. Logout
                             """);
            System.out.print("masukkan pilihan anda : ");
            pil07351 = input07351.nextInt();
            input07351.nextLine();
            switch(pil07351){
                case 1 -> {
                    menuInsert07351();
                }
                case 2 -> {
                    menuView07351();
                }
                case 3 -> {
                    menuUpdate07351();
                }
                case 4 -> {
                    menuDelete07351();
                }
            }
        }while(pil07351!=0);
    }
    
    static void menuInsert07351(){
        int pil_07351;
        do{
            System.out.println("===============================================");
            System.out.println("Menu Tambah Data : ");
            System.out.println("1. Sepatu Basket       || Stok : " + SepatuProses07351.getStokSepatuBasket07351());
            System.out.println("2. Sepatu Futsal       || Stok : " + SepatuProses07351.getStokSepatuFutsal07351());
            System.out.println("3. Sepatu Sepak Bola   || Stok : " + SepatuProses07351.getStokSepatuSepakBola07351());
            System.out.println("0. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            pil_07351 = input07351.nextInt();
            input07351.nextLine();
            sepatuProses07351.insert07351(pil_07351);
        }while(pil_07351!=0);
        stokTotal07351 = SepatuProses07351.getStokSepatuBasket07351()+SepatuProses07351.getStokSepatuFutsal07351()+SepatuProses07351.getStokSepatuSepakBola07351();
    }
    
    static void menuView07351(){
        int pil_07351;
        do{
            System.out.println("===============================================");
            System.out.println("Menu Lihat Data : ");
            System.out.println("1. Sepatu Basket       || Stok : " + SepatuProses07351.getStokSepatuBasket07351());
            System.out.println("2. Sepatu Futsal       || Stok : " + SepatuProses07351.getStokSepatuFutsal07351());
            System.out.println("3. Sepatu Sepak Bola   || Stok : " + SepatuProses07351.getStokSepatuSepakBola07351());
            System.out.println("4. Semua Stok Sepatu   || Stok : " + stokTotal07351);
            System.out.println("0. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            pil_07351 = input07351.nextInt();
            switch(pil_07351){
                case 1 -> {
                    sepatuProses07351.view07351(pil_07351);
                }
                case 2 -> {
                    sepatuProses07351.view07351(pil_07351);
                }
                case 3 -> {
                    sepatuProses07351.view07351(pil_07351);
                }
                case 4 -> {
                    sepatuProses07351.view07351();
                }
            }
        }while(pil_07351!=0);
    }
    
    static void menuUpdate07351(){
        int pil_07351;
        do{
            System.out.println("===============================================");
            System.out.println("Menu Ubah Data : ");
            System.out.println("Stok Sepatu : " + stokTotal07351);
            System.out.println("1. Sepatu Basket       || Stok : " + SepatuProses07351.getStokSepatuBasket07351());
            System.out.println("2. Sepatu Futsal       || Stok : " + SepatuProses07351.getStokSepatuFutsal07351());
            System.out.println("3. Sepatu Sepak Bola   || Stok : " + SepatuProses07351.getStokSepatuSepakBola07351());
            System.out.println("0. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            pil_07351 = input07351.nextInt();
            switch(pil_07351){
                case 1 -> {
                    sepatuProses07351.view07351(pil_07351);
                    System.out.print("masukkan id sepatu : ");
                    int id_07351 = input07351.nextInt();
                    sepatuProses07351.update07351(pil_07351,id_07351);
                }
                case 2 -> {
                    sepatuProses07351.view07351(pil_07351);
                    System.out.print("masukkan id sepatu : ");
                    int id_07351 = input07351.nextInt();
                    sepatuProses07351.update07351(pil_07351,id_07351);
                }
                case 3 -> {
                    sepatuProses07351.view07351(pil_07351);
                    System.out.print("masukkan id sepatu : ");
                    int id_07351 = input07351.nextInt();
                    sepatuProses07351.update07351(pil_07351,id_07351);
                }
            }
        }while(pil_07351!=0);
    }
    
    static void menuDelete07351(){
        int pil_07351;
        do{
            System.out.println("===============================================");
            System.out.println("Menu Hapus Data : ");
            System.out.println("Stok Total Sepatu : " + stokTotal07351);
            System.out.println("1. Sepatu Basket       || Stok : " + SepatuProses07351.getStokSepatuBasket07351());
            System.out.println("2. Sepatu Futsal       || Stok : " + SepatuProses07351.getStokSepatuFutsal07351());
            System.out.println("3. Sepatu Sepak Bola   || Stok : " + SepatuProses07351.getStokSepatuSepakBola07351());
            System.out.println("4. Semua Stok Sepatu   || Stok : " + stokTotal07351);
            System.out.println("0. Exit");
            System.out.print("masukkan pilihan anda : ");
            pil_07351 = input07351.nextInt();
            switch(pil_07351){
                case 1 -> {
                    sepatuProses07351.view07351(pil_07351);
                    System.out.print("masukkan id sepatu : ");
                    int id_07351 = input07351.nextInt();
                    sepatuProses07351.delete07351(pil_07351, id_07351);
                }
                case 2 -> {
                    sepatuProses07351.view07351(pil_07351);
                    System.out.print("masukkan id sepatu : ");
                    int id_07351 = input07351.nextInt();
                    sepatuProses07351.delete07351(pil_07351, id_07351);
                }
                case 3 -> {
                    sepatuProses07351.view07351(pil_07351);
                    System.out.print("masukkan id sepatu : ");
                    int id_07351 = input07351.nextInt();
                    sepatuProses07351.delete07351(pil_07351, id_07351);
                }
                case 4 -> {
                    sepatuProses07351.delete07351();
                }
            }
            stokTotal07351 = SepatuProses07351.getStokSepatuBasket07351()+SepatuProses07351.getStokSepatuFutsal07351()+SepatuProses07351.getStokSepatuSepakBola07351();
        }while(pil_07351!=0);
    }
}
