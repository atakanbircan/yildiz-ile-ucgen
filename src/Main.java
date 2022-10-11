import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sekme;
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        sekme= input.nextInt();


        for (int i=1;i<=sekme;i++){
            for (int k=1;k<=(sekme-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}