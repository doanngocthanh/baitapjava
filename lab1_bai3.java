/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**import java.util.Scanner;
 * 
 *
 * @author NgocThanhDoan
 */
public class lab1_bai3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("nhap canh: ");
        int canh = scan.nextInt();
        int thetichlapphuong = canh*canh*canh;
        System.out.print(" the tich lap phuong la: "+thetichlapphuong);
        
    }
}
