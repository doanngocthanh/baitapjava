/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author NgocThanhDoan
 */
public class lab1_bai4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = scan.nextInt();
        System.out.print("nhap b: ");
        int b = scan.nextInt();
        System.out.print("nhap c: ");
        int c = scan.nextInt();
        int delta = (int) (Math.pow(b,2)-4*a*c);
        System.out.print("delta la: "+delta);
                
    }
}
