/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan04d;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Latihan04d {
    String namaplng,noplng;
    int pemakaian,biaya;
    
    Scanner masukan = new Scanner(System.in);
    
    void setNamaPLNG(){
        System.out.print("Nama          : ");
        namaplng = masukan.nextLine();
    }
    
    void setNoPLNG(){
        System.out.print("NO. Pelanggan : ");
        noplng = masukan.nextLine();
    }
    
    void setPemakaian(){
        System.out.print("Pemakaian Air : ");
        pemakaian = masukan.nextInt();
    }
    
    void setBiaya(){
        if(pemakaian <=10){
        biaya = pemakaian * 1000;
        }
        else if(pemakaian <=20){
        biaya = 10 * 1000 + (pemakaian - 10)*2000 ;
        }
        else {
            biaya = 10 * 1000 + 10 * 2000 + (pemakaian - 20)* 5000;
        }
        System.out.println("Biaya Pakai  : " + biaya);
    }
            
    
     
    
}
