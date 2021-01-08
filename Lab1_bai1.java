/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;


public class Lab1_bai1 {
    public static void main(String[] args) {
        Scanner nhapvao= new Scanner(System.in);
        System.out.print("ho va ten:");
        String hoten=nhapvao.nextLine();
        System.out.print("dien TB:");
        Double diemTB= nhapvao.nextDouble();
        System.out.printf("%s %f diem",hoten,diemTB);
    }

}
