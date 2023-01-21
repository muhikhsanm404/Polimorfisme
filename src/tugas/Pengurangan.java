/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Muh Ikhsan M
 */
public class Pengurangan extends OperasiBilangan {
      @Override
    public void tampilkan(){
      double a = this.getA();
      double b = this.getB();
      double hasil = A - B;
      
      System.out.println(A + " - " + B + " = " + hasil);
  }
}
