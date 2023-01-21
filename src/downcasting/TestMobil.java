/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package downcasting;

/**
 *
 * @author Muh Ikhsan M
 */
public class TestMobil {
  Mobil mobil1;

  public TestMobil() {
     mobil1 = new MobilBalap();
     
      //mobil1.ngebut();
      //analisa
      //mobil1 = new Mobil();
      ((MobilBalap)mobil1).ngebut();//downcasting
  }  
  public static void main(String[]args){
      TestMobil testMobil = new TestMobil();
  }
}

