/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Muh Ikhsan M
 */
public class Main {
     public static void main(String[] args) {
      System.out.println("### APLIKASI PERHITUNGAN MATEMATIKA (*/+-) ###\n");
      tampilkanSemua(); 
      System.out.println("\n### MUH IKHSAN M | THANKS YOU | 21104410070 ###\n");
     }
     
    public static void tampilkanSemua(){   
     //DOWN CASTING (+)
    OperasiBilangan penjumlah = new Penjumlahan();
    penjumlah.setA(10.5);
    penjumlah.setB(0.5);
    penjumlah.tampilkan();
    // (-)
    OperasiBilangan pengurang = new Pengurangan();
    pengurang.setA(10.5);
    pengurang.setB(0.5);
    pengurang.tampilkan();
    
    //INSTANCE (/)
    Pembagian pembagi = new Pembagian();
    pembagi.setA(10.5);
    pembagi.setB(0.5);
    pembagi.tampilkan();
    
    //METHOD UP CASTING (*)
    OperasiBilangan pengali = (OperasiBilangan) new Perkalian();
    pengali.setA(10.5);
    pengali.setB(0.5);
    pengali.tampilkan();
    
 }
}

