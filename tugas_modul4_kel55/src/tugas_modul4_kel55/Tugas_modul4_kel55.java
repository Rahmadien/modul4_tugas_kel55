package tugas_modul4_kel55;

import java.util.Scanner;


public class Tugas_modul4_kel55 {

    static String kelompok(String kel){
            return kel;
    }
    static String praktikan1(){
        return "Rasyid Muliya Irawan 21120119130060";
    }
    static String praktikan2(String nama){
        return nama;
    }
    public void pembatas(){
        System.out.println("=========================");
    }
    public static void main(String[] args) {
        System.out.println(kelompok("Kelompok 55"));
       
        System.out.println(praktikan1());
        System.out.println(praktikan2("Rahmadien Akbariza Syifa Ul Haq 21120119140144"));
        
        Tugas_modul4_kel55 garis = new Tugas_modul4_kel55(); 
        garis.pembatas();
        
        Scanner scan= new Scanner(System.in);
        int stage=0,counttel=0,countcs=0;
        
        info x;
        x = new info();
       
        while(stage>=0)
        {
            System.out.println("Selamat Datang di Informasi Harga Sewa Panggung");
            System.out.println("Tersedia Stage 1(pagi) dan stage 2 (malam)");
            System.out.println("Pilih Stage yang ingin anda sewa :");
            System.out.println("1. Stage 1");
            System.out.println("2. Stage 2");
            System.out.print("masukkan pilihan :");
            stage=scan.nextInt();
            x.tombol(stage);
            x.get_pilihan();
        if(stage!=1 & 2 !=stage)
        break;
        }      
    }
}


