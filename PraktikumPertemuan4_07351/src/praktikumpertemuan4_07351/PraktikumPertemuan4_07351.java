package praktikumpertemuan4_07351;

import gui07351.MenuGui07351;
//import controller07351.PendaftarController07351;
//import entity07351.PendaftarEntity07351;
//import java.util.Scanner;

public class PraktikumPertemuan4_07351 {
//    private static Scanner input07351 = new Scanner(System.in);
//    private static PendaftarController07351 pendaftarController07351 = new PendaftarController07351();
//    
    public static void main(String[] args) {
        new MenuGui07351();
        
//        int pil07351;
//        
//        do{
//            System.out.println("==================================================");
//            System.out.print("""
//                           menu pendaftaran kurus : 
//                           1. tambah data
//                           2. tampilkan data
//                           3. ubah data
//                           4. hapus data
//                           0. exit
//                           """);
//            System.out.print("Masukkan nomor yang di inginkan : ");
//            pil07351=input07351.nextInt();
//            switch(pil07351){
//                case 1 -> {
//                    insert07351();
//                }
//                case 2 -> {
//                    view07351();
//                }
//                case 3 -> {
//                    update07351();
//                }
//                case 4 -> {
//                    delete07351();
//                }
//            }
//        }while(pil07351!=0);
//        System.out.println("==================================================");
    }
    
//    static void insert07351(){
//        input07351.nextLine();
//        System.out.println("==================================================");
//        System.out.print("Masukkan nama    : ");
//        String nama07351 = input07351.nextLine();
//        System.out.print("Masukkan alamat  : ");
//        String alamat07351 = input07351.nextLine();
//        System.out.print("Masukkan no Telp : ");
//        String noTelp07351 = input07351.nextLine();
//        
//        pendaftarController07351.insert07351(nama07351, alamat07351, noTelp07351);
//    }
//    
//    static void update07351(){
//        System.out.println("==================================================");
//        String edit07351;
//        int pil07351;
//        
//        System.out.print("Masukkan id data yang ingin di edit : ");
//        int id07351 = input07351.nextInt();
//        do{
//            view07351(id07351);
//            System.out.print("""
//                               menu update :
//                               1. nama
//                               2. alamat
//                               3. noTep
//                               0. exit
//                               """);
//            System.out.print("masukkan pilihan : ");
//            pil07351=input07351.nextInt();
//            input07351.nextLine();
//            switch(pil07351){
//                case 1 ->{
//                    System.out.print("Masukkan nama : ");
//                    edit07351 = input07351.nextLine();
//                    pendaftarController07351.update07351(pil07351,id07351, edit07351);
//                }
//                case 2 ->{
//                    System.out.print("Masukkan alamat : ");
//                    edit07351 = input07351.nextLine();
//                    pendaftarController07351.update07351(pil07351,id07351, edit07351);
//                }
//                case 3 ->{
//                    System.out.print("Masukkan noTelp : ");
//                    edit07351 = input07351.nextLine();
//                    pendaftarController07351.update07351(pil07351,id07351, edit07351);
//                }
//            }
//        }while(pil07351!=0);
//    }
//    static void view07351(){
//        System.out.println("==================================================");
//        System.out.println("\tDATA PENDAFTAR KURUS");
//        System.out.println("==================================================");
//        for(PendaftarEntity07351 pendaftar07351 : pendaftarController07351.getData07351()){
//            System.out.println("id     : " + pendaftar07351.getId07351());
//            System.out.println("nama   : " + pendaftar07351.getNama07351());
//            System.out.println("alamat : " + pendaftar07351.getAlamat07351());
//            System.out.println("noTelp : " + pendaftar07351.getNoTelp07351());
//            System.out.println("==================================================");
//        }
//    }
//    
//    static void view07351(int id07351){
//        System.out.println("==================================================");
//        System.out.println("\tDATA PENDAFTAR KURUS");
//        System.out.println("==================================================");
//        for(PendaftarEntity07351 pendaftar07351 : pendaftarController07351.getDataById(id07351)){
//            System.out.println("id     : " + pendaftar07351.getId07351());
//            System.out.println("nama   : " + pendaftar07351.getNama07351());
//            System.out.println("alamat : " + pendaftar07351.getAlamat07351());
//            System.out.println("noTelp : " + pendaftar07351.getNoTelp07351());
//            System.out.println("==================================================");
//        }
//    }
//    
//    static void delete07351(){
//        System.out.println("==================================================");
//        System.out.print("Masukkan id data yang akan di hapus : ");
//        int id07351 = input07351.nextInt();
//        pendaftarController07351.delete07351(id07351);
//    }
}
