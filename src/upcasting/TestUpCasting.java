/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upcasting;

/**
 *
 * @author Muh Ikhsan M
 */
public class TestUpCasting {
   /* public TestUpCasting(){
        GalaxyNote galaxyNote = new GalaxyNote();
        Smartphone smartphone = (Smartphone)galaxyNote;
        smartphone.versi();
    }*/
    
    public TestUpCasting() {
    Android android = new Smartphone();
    android.versi(); }
    
    public static void main(String[]args){
        TestUpCasting testUpCasting = new TestUpCasting();
    }
}
