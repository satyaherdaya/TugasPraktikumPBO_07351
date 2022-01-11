package praktikumpertemuan1_07351;

import java.util.Scanner;

public class PraktikumPertemuanPertama07351 {

    static Scanner input07351 = new Scanner(System.in);
    public static void main(String[] args) {
        int jumMatkul07351;
        char jawab07351;
        
        do{
            System.out.print("Masukkan Jumlah Matkul : ");
            jumMatkul07351 = input07351.nextInt();
            System.out.println();
            
            String namaMatkul07351[] = new String[jumMatkul07351];
            int nilaiMatkul07351[] = new int[jumMatkul07351];
            int nilaiRataMatkul07351 = 0;
        
            input07351.nextLine();
            int loop07351 = 0;
            do{
                System.out.print("Masukkan Nama Matkul : ");
                namaMatkul07351[loop07351] = input07351.nextLine();
                System.out.print("Masukkan Nilai Matkul : ");
                nilaiMatkul07351[loop07351] = input07351.nextInt();
                System.out.println();
                input07351.nextLine();
                loop07351++;
            }while(loop07351<jumMatkul07351);

            for(int i07351=0;i07351<jumMatkul07351;i07351++){
                nilaiRataMatkul07351 = nilaiRataMatkul07351 + nilaiMatkul07351[i07351];
            }

            nilaiRataMatkul07351 = nilaiRataMatkul07351/jumMatkul07351;

            System.out.println();
            if(nilaiRataMatkul07351>=70){
                System.out.println("Nilai Rata-Rata : " + nilaiRataMatkul07351 + " || LULUS");
            }else if(nilaiRataMatkul07351<70){
                System.out.println("Nilai Rata-Rata : " + nilaiRataMatkul07351 + " || GUGUR");
            }
            
            System.out.println();
            System.out.print("Ingin Mengulangi Program? (y/n) : ");
            jawab07351 = input07351.next().charAt(0);
            input07351.nextLine();
            System.out.println();
        }while(jawab07351 == 'y');
    }
}