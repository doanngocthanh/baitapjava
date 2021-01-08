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
public class lab1_bai2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        int dai = scan.nextInt();
        System.out.print("nhap chieu rong: ");
        int rong = scan.nextInt();
        int chuvi =(dai+rong)*2;
        System.out.println("chu vi la: "+chuvi);
        int dientich = dai*rong;
        System.out.println("dien tich la: "+dientich);
        int canhnhonhat = Math.min(dai,rong);
        System.out.print("canh nho nhat la: "+canhnhonhat);
        
                
    }
}
