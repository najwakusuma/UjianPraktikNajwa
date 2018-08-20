/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktik;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TugasPraktik {
    public static void main(String[] args){
       
     
        String namaToko = "NajwaKusuma";
        System.out.println(namaToko);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("nama barang :");
        String namaBarang = scan.next();
        System.out.println("harga :");
        int harga = scan.nextInt();
        System.out.println("kode barang :");
        int kodeBarang = scan.nextInt();
        if(harga>=100.000||harga>=200.000||harga>=500.000);
        {    
         if(harga<=100.000 ){
                System.out.println("Discount 10%");
            }
            else if(harga<=200.000 ){
                System.out.println("Discount 20%");
            }
                    else if(harga<=500.000 ){
                System.out.println("Discount 50%");
            }
            
        System.out.println("nama kasir :");
        String namaKasir = scan.next();
        }
        {
            
        }
    }
}
