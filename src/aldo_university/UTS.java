 package aldo_university;


import java.util.Scanner;

public class UTS { 
    public static void main (String[] args){
        //input nim dan nama//
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama :");
        String name = scanner.nextLine();
        
        System.out.print("Masukkan NIM : ");
        long NIM = scanner.nextLong();
        
        
        System.out.println("Nama Mahasiswa :" + name);
        System.out.println("Masukkan NIM :" + NIM );
                
      // luas lingkaran
        double PI = 3.14;
        
        System.out.println("\nMasukkan Jari Jari :");
        int r = scanner.nextInt();
        
        double luas =  PI * r * r;
        
        System.out.println("Luas Lingakran adalah :" + luas);
        
        
        
    }
}
