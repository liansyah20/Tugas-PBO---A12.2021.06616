/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan04c;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Latihan04c {
        
        String nama,prodi,grade;
        int nilaia ;
        
        Scanner masukan = new Scanner(System.in);
        
        void setNamaMhs(){
        System.out.print("Nama          : ");
        nama = masukan.nextLine();
        }
        
        void setProdi(){
        System.out.print("Program Studi : ");
        prodi = masukan.nextLine();
        }
        
        void setNilaiA(){
        System.out.print("Nilai         : ");
        nilaia = masukan.nextInt();
        }
    
        void setNilaiH(){        
        if(nilaia > 85 && nilaia <=100){
            System.out.println("Nilai Huruf   : A");
        }
        else if(nilaia > 70&& nilaia <=85){
            System.out.println("Nilai Huruf   : B");
        }
        else if(nilaia > 60&& nilaia <=70){
            System.out.println("Nilai Huruf   : C");
        }
        else if(nilaia > 50&& nilaia <=60){
            System.out.println("Nilai Huruf   : D");
        }
        else if(nilaia <=50){
            System.out.println("Nilai Huruf   : E");
        }
        
        }
}

