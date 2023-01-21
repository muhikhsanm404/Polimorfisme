/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classcasting;

/**
 *
 * @author Muh Ikhsan M
 */


public class TestMobil {
  Mobil mobil1;
  

  public TestMobil() {
    mobil1 = new MobilBalap();
     MobilBalap mobil2 = (MobilBalap) mobil1;
     // manggil superclass
     mobil1.show(); 
     
  }  
  public static void main(String[]args){
      TestMobil testMobil = new TestMobil();
     // testMobil.TestMobil();
  }
}

// knp yA Gk keluar outputan
