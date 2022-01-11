package proses07351;

import entity07351.SepatuEntity07351;
import java.util.ArrayList;
import java.util.Scanner;

public class SepatuProses07351 implements Interface07351{
    private static Scanner input07351 = new Scanner(System.in);
    private static ArrayList<SepatuEntity07351> sepatuBasket07351= new ArrayList<>();
    private static ArrayList<SepatuEntity07351> sepatuFutsal07351= new ArrayList<>();
    private static ArrayList<SepatuEntity07351> sepatuSepakBola07351= new ArrayList<>();
    private static int stokSepatuBasket07351;
    private static int stokSepatuFutsal07351;
    private static int stokSepatuSepakBola07351;
    private static int id07351;

    public static int getStokSepatuBasket07351() {
        return stokSepatuBasket07351;
    }

    public static int getStokSepatuFutsal07351() {
        return stokSepatuFutsal07351;
    }

    public static int getStokSepatuSepakBola07351() {
        return stokSepatuSepakBola07351;
    }
    
    public void insert07351(int pil07351){
        if(pil07351!=0){
            System.out.print("Masukkan Merek  : ");
            String merek07351=input07351.nextLine();
            System.out.print("Masukkan Model  : ");
            String nama07351=input07351.nextLine();
            System.out.print("Masukkan Warna  : ");
            String warna07351 = input07351.nextLine();
            System.out.print("Masukkan Ukuran : ");
            int ukuran07351=input07351.nextInt();
            System.out.print("Masukkan Harga  : ");
            int harga07351=input07351.nextInt();
            input07351.nextLine();
            switch(pil07351){
                case 1 -> {
                    if(sepatuBasket07351.isEmpty()){
                        id07351 = 1;
                    }else{
                        id07351 = sepatuBasket07351.size()+1;
                    }
                    sepatuBasket07351.add(new SepatuEntity07351(merek07351,warna07351,"Sepatu Basket",ukuran07351,harga07351,id07351,nama07351));
                    stokSepatuBasket07351 = sepatuBasket07351.size();
                }
                case 2 -> {
                    if(sepatuFutsal07351.isEmpty()){
                        id07351 = 1;
                    }else{
                        id07351 = sepatuFutsal07351.size()+1;
                    }
                    sepatuFutsal07351.add(new SepatuEntity07351(merek07351,warna07351,"Sepatu Futsal",ukuran07351,harga07351,id07351,nama07351));
                    stokSepatuFutsal07351 = sepatuFutsal07351.size();
                }
                case 3 -> {
                    if(sepatuSepakBola07351.isEmpty()){
                        id07351 = 1;
                    }else{
                        id07351 = sepatuSepakBola07351.size()+1;
                    }
                    sepatuSepakBola07351.add(new SepatuEntity07351(merek07351,warna07351,"Sepatu Sepak Bola",ukuran07351,harga07351,id07351,nama07351));
                    stokSepatuSepakBola07351 = sepatuSepakBola07351.size();
                }
            }
        }
    }
    
    @Override
    public void view07351() {
        System.out.println("===============================================");
        System.out.println("\t\tSEPATU BASKET");
        System.out.println("===============================================");
        if(sepatuBasket07351.isEmpty()){
            System.out.println("Stok Kosong");
        }else{
            for(SepatuEntity07351 sepatu07351 : sepatuBasket07351){
                System.out.println("id     : " + sepatu07351.getId07351());
                System.out.println("Merek  : " + sepatu07351.getMerek07351());
                System.out.println("Model  : " + sepatu07351.getNama07351());
                System.out.println("Warna  : " + sepatu07351.getWarna07351());
                System.out.println("Jenis  : " + sepatu07351.getJenis07351());
                System.out.println("Ukuran : " + sepatu07351.getUkuran07351());
                System.out.println("Harga  : " + sepatu07351.getHarga07351());
                System.out.println("===============================================");
            }
        }
        
        System.out.println("===============================================");
        System.out.println("\t\tSEPATU FUTSAL");
        System.out.println("===============================================");
        if(sepatuFutsal07351.isEmpty()){
            System.out.println("Stok Kosong");
        }else{
            for(SepatuEntity07351 sepatu07351 : sepatuFutsal07351){
                System.out.println("id     : " + sepatu07351.getId07351());
                System.out.println("Merek  : " + sepatu07351.getMerek07351());
                System.out.println("Model  : " + sepatu07351.getNama07351());
                System.out.println("Warna  : " + sepatu07351.getWarna07351());
                System.out.println("Jenis  : " + sepatu07351.getJenis07351());
                System.out.println("Ukuran : " + sepatu07351.getUkuran07351());
                System.out.println("Harga  : " + sepatu07351.getHarga07351());
                System.out.println("===============================================");
            }
        }
        
        System.out.println("===============================================");
        System.out.println("\t\tSEPATU SEPATU SEPAK BOLA");
        System.out.println("===============================================");
        if(sepatuSepakBola07351.isEmpty()){
            System.out.println("Stok Kosong");
        }else{
            for(SepatuEntity07351 sepatu07351 : sepatuSepakBola07351){
                System.out.println("id     : " + sepatu07351.getId07351());
                System.out.println("Merek  : " + sepatu07351.getMerek07351());
                System.out.println("Model  : " + sepatu07351.getNama07351());
                System.out.println("Warna  : " + sepatu07351.getWarna07351());
                System.out.println("Jenis  : " + sepatu07351.getJenis07351());
                System.out.println("Ukuran : " + sepatu07351.getUkuran07351());
                System.out.println("Harga  : " + sepatu07351.getHarga07351());
                System.out.println("===============================================");
            }
        }
    }
    
    public void view07351(int pil07351){
        switch(pil07351){
            case 1 -> {
                System.out.println("===============================================");
                System.out.println("\t\tSEPATU BASKET");
                System.out.println("===============================================");
                if(sepatuBasket07351.isEmpty()){
                    System.out.println("Stok Kosong");
                }else{
                    for(SepatuEntity07351 sepatu07351 : sepatuBasket07351){
                        System.out.println("id     : " + sepatu07351.getId07351());
                        System.out.println("Merek  : " + sepatu07351.getMerek07351());
                        System.out.println("Model  : " + sepatu07351.getNama07351());
                        System.out.println("Warna  : " + sepatu07351.getWarna07351());
                        System.out.println("Jenis  : " + sepatu07351.getJenis07351());
                        System.out.println("Ukuran : " + sepatu07351.getUkuran07351());
                        System.out.println("Harga  : " + sepatu07351.getHarga07351());
                        System.out.println("===============================================");
                    }
                }
            }
            case 2 -> {
                System.out.println("===============================================");
                System.out.println("\t\tSEPATU FUTSAL");
                System.out.println("===============================================");
                if(sepatuFutsal07351.isEmpty()){
                    System.out.println("Stok Kosong");
                }else{
                    for(SepatuEntity07351 sepatu07351 : sepatuFutsal07351){
                        System.out.println("id     : " + sepatu07351.getId07351());
                        System.out.println("Merek  : " + sepatu07351.getMerek07351());
                        System.out.println("Model  : " + sepatu07351.getNama07351());
                        System.out.println("Warna  : " + sepatu07351.getWarna07351());
                        System.out.println("Jenis  : " + sepatu07351.getJenis07351());
                        System.out.println("Ukuran : " + sepatu07351.getUkuran07351());
                        System.out.println("Harga  : " + sepatu07351.getHarga07351());
                        System.out.println("===============================================");
                    }
                }
            }
            case 3 -> {
                System.out.println("===============================================");
                System.out.println("\t\tSEPATU SEPAK BOLA");
                System.out.println("===============================================");
                if(sepatuSepakBola07351.isEmpty()){
                    System.out.println("Stok Kosong");
                }else{
                    for(SepatuEntity07351 sepatu07351 : sepatuSepakBola07351){
                        System.out.println("id     : " + sepatu07351.getId07351());
                        System.out.println("Merek  : " + sepatu07351.getMerek07351());
                        System.out.println("Model  : " + sepatu07351.getNama07351());
                        System.out.println("Warna  : " + sepatu07351.getWarna07351());
                        System.out.println("Jenis  : " + sepatu07351.getJenis07351());
                        System.out.println("Ukuran : " + sepatu07351.getUkuran07351());
                        System.out.println("Harga  : " + sepatu07351.getHarga07351());
                        System.out.println("===============================================");
                    }
                }
            }
        }
    }
    
    public void update07351(int pil07351,int id07351){
        if(pil07351!=0){
            System.out.print("Masukkan Merek  : ");
            String merek07351=input07351.nextLine();
            System.out.print("Masukkan Model  : ");
            String nama07351=input07351.nextLine();
            System.out.print("Masukkan Warna  : ");
            String warna07351 = input07351.nextLine();
            System.out.print("Masukkan Ukuran : ");
            int ukuran07351=input07351.nextInt();
            System.out.print("Masukkan Harga  : ");
            int harga07351=input07351.nextInt();
            input07351.nextLine();
            switch(pil07351){
                case 1 -> {
                    for(SepatuEntity07351 sepatu07351 : sepatuBasket07351){
                        if(sepatu07351.getId07351()==id07351){
                            sepatu07351.setMerek07351(merek07351);
                            sepatu07351.setNama07351(nama07351);
                            sepatu07351.setWarna07351(warna07351);
                            sepatu07351.setUkuran07351(ukuran07351);
                            sepatu07351.setHarga07351(harga07351);
                        }
                    }
                }
                case 2 -> {
                    for(SepatuEntity07351 sepatu07351 : sepatuFutsal07351){
                        if(sepatu07351.getId07351()==id07351){
                            sepatu07351.setMerek07351(merek07351);
                            sepatu07351.setNama07351(nama07351);
                            sepatu07351.setWarna07351(warna07351);
                            sepatu07351.setUkuran07351(ukuran07351);
                            sepatu07351.setHarga07351(harga07351);
                        }
                    }
                }
                case 3 -> {
                    for(SepatuEntity07351 sepatu07351 : sepatuSepakBola07351){
                        if(sepatu07351.getId07351()==id07351){
                            sepatu07351.setMerek07351(merek07351);
                            sepatu07351.setNama07351(nama07351);
                            sepatu07351.setWarna07351(warna07351);
                            sepatu07351.setUkuran07351(ukuran07351);
                            sepatu07351.setHarga07351(harga07351);
                        }
                    }
                }
            }
        }
    }
    
    public void delete07351(int pil07351, int id_07351){
        switch(pil07351){
            case 1 -> {
                if(sepatuBasket07351.isEmpty()){
                    System.out.println("stok sepatu kosong");
                }else{
                    sepatuBasket07351.remove(getIndex07351(pil07351,id_07351));
                    stokSepatuBasket07351=sepatuBasket07351.size();
                }
            }
            case 2 -> {
                if(sepatuFutsal07351.isEmpty()){
                    System.out.println("stok sepatu kosong");
                }else{
                    sepatuFutsal07351.remove(getIndex07351(pil07351,id_07351));
                    stokSepatuFutsal07351=sepatuFutsal07351.size();
                }
            }
            case 3 -> {
                if(sepatuSepakBola07351.isEmpty()){
                    System.out.println("stok sepatu kosong");
                }else{
                    sepatuSepakBola07351.remove(getIndex07351(pil07351,id_07351));
                    stokSepatuSepakBola07351=sepatuSepakBola07351.size();
                }
            }
        }
    }
    
    private int getIndex07351(int pil07351,int id_07351){
        if(pil07351==1){
            for(SepatuEntity07351 sepatu07351 : sepatuBasket07351){
                if(sepatu07351.getId07351()==id_07351){
                    return sepatuBasket07351.indexOf(sepatu07351);
                }
            }
        }else if(pil07351==2){
            for(SepatuEntity07351 sepatu07351 : sepatuFutsal07351){
                if(sepatu07351.getId07351()==id_07351){
                    return sepatuFutsal07351.indexOf(sepatu07351);
                }
            }
        }else if(pil07351==3){
            for(SepatuEntity07351 sepatu07351 : sepatuSepakBola07351){
                if(sepatu07351.getId07351()==id_07351){
                    return sepatuSepakBola07351.indexOf(sepatu07351);
                }
            }
        }
        return -1;
    }
    
    public void delete07351(){
        sepatuBasket07351.clear();
        sepatuFutsal07351.clear();
        sepatuSepakBola07351.clear();
        stokSepatuBasket07351=sepatuSepakBola07351.size();
        stokSepatuFutsal07351=sepatuSepakBola07351.size();
        stokSepatuSepakBola07351=sepatuSepakBola07351.size();
    }
}
