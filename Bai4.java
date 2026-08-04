/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toantu;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[]args){
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a =  objScanner.nextDouble();
        System.out.println("Nhập b:");
        double b =  objScanner.nextDouble();
        System.out.println("Nhập c:");
        double c =  objScanner.nextDouble();
        if (a+b>c && a+c>b && b+c>a){
            if(a==b && b==c){
                System.out.println("Tam giác đều");}
            else if (a==b || a==c || b==c){
                if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a){
                    System.out.println("Tam giác vuông cân");
                }else{
                System.out.println("Tam giác cân");}
            }
            else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a){
                System.out.println("Tam giác vuông");}
            else{
                System.out.println("Tam giác thường");
            }
        }else{
            System.out.println("Ba cạnh không tạo thành tam giác!");
        }
        objScanner.close();
    }
}
