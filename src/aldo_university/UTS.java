package aldo_university;
        
import java.util.Scanner;

public class UTS {
    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama :");
        String name = scanner.nextLine();
        
        System.out.print("Masukkan NIM : ");
        long NIM = scanner.nextLong();
        
        
        System.out.println("Nama Mahasiswa :" + name);
        System.out.println("Masukkan NIM :" + NIM );
                
        scanner.close();
        
    }
}
