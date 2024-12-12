package aldo_university;

import java.util.Scanner;

public class Luas_Segitiga {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Masukkan Alas");
    int  alas = scanner.nextInt();
    
     System.out.println("Masukkan Tinggi ");
    int  tinggi = scanner.nextInt();
    
    
    
    double luas = 0.5  * alas * tinggi;
    
    System.out.println("Luas adalah " + luas);
    
    }
    
    
}