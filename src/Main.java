/**
 * Binary Converter
 *
 * Simple Java program that will convert given numerical input from decimal to binary or vice versa.
 *
 * Author: todyerutz@plainintricacy.wordpress.com
 *
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int in;
        do{
            System.out.println("Please select the type of conversion:");
            System.out.println();
            System.out.println("1 - Decimal to Binary");
            System.out.println("2 - Binary to Decimal");
            System.out.println("0 - Exit");
            in = Integer.parseInt(input.nextLine());
        }while(in<0||in>2);

        switch(in) {
            case 1:
                System.out.println("Decimal to Binary Conversion");
                System.out.println("Please enter the decimal number you want to convert:");
                int num = Integer.parseInt(input.nextLine());
                Dec2Bin(num);
                break;
            case 2:
                System.out.println("Binary to Decimal Conversion");
                System.out.println("Please enter the binary number you want to convert:");
                String bnr;
                bnr = input.nextLine();
                Bin2Dec(bnr);
                break;
            case 0:
                System.out.println("Exiting program...");
                break;
        }
        input.close();
    }

    public static void Dec2Bin(int q){
        String bin="";
        System.out.println("Decimal: " + q);
        System.out.print("Binary: ");
        while(q>=1){
            bin+=(q%2);
            q/=2;
        }
        for(int i=0; i<bin.length(); i++){
            System.out.print(bin.charAt(i));
        }
        System.out.println();
    }

    public static void Bin2Dec(String q){
        int dec=0;
        for(int i=0; i<q.length(); i++) {
            if (q.charAt(i) == '1') {
                dec += (int) Math.pow(2, i);
            }
        }
        System.out.println("Binary: " + q);
        System.out.println("Decimal: " + dec);
        System.out.println();
    }

}
