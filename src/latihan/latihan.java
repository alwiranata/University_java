
package latihan;

 import java.util.Scanner;
public class latihan {
    public static void main (String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int value = input.nextInt() ;
        if(value  % 2 == 0){
            System.out.println(value + " adalah bilangan genap");
        }else{
            System.out.println(value + " adalah bilangan ganjil");
        }
    }
}
