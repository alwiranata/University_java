
package aldo_university;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Uts_new {
    public static void main(String[] args){
        // kubus 
        Scanner scanner = new Scanner(System.in);
        int s , volume; 
        System.out.print("Masukkan sisi =");
        s = scanner.nextInt();
        volume = s*s*s;
        System.out.println(volume);
        
        //balok
        Scanner input = new Scanner (System.in);
        System.out.print("panjang =");
        int p = input.nextInt();
        System.out.print("lebar =");
        int l = input.nextInt();
        System.out.print("tinggi =");
        int t = input.nextInt();       
        int hasil = p*l *t;
        System.out.println(hasil);
        
        //input data diri
         String name = JOptionPane.showInputDialog("Masukkan nama");
         String nama_lengkap = name;
                 
         System.out.println("===== Data Diri ====");
         System.out.println("nama_lengkpa = " + nama_lengkap);
         
         //penggabungan segitiga , persegi panjang , lingkaran
         //segitiga
         Scanner add = new Scanner(System.in);
         System.out.print("Masukkan alas :");
         int alas = add.nextInt();
         System.out.print("masuukan tinggi : ");
         int tinggi = add.nextInt();
         double luas_segitiga = 0.5 * alas * tinggi ;
         
         //persegi panjang
         System.out.print("Masukkann panjang:");
         int panjang = add.nextInt();
         System.out.print("Masukkan lebar:");
         int lebar = add.nextInt();
         int luas_persegiPanjang = panjang * lebar;
         
         //lingkaran
         System.out.print("masukkan jari jari: ");
         int r = add.nextInt();
         double luas_lingkaran =  3.14 * r * r;
         
         double gabungan = luas_segitiga + luas_persegiPanjang +  luas_lingkaran;
         System.out.println("gabungan =" +gabungan);
         
         
         
    }
}
