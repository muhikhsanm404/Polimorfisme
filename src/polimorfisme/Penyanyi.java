/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author Muh Ikhsan M
 */
public class Penyanyi {
    String nama="Unknown";
    public Penyanyi() {
        System.out.println("Nama penyanyinya null");
    }
    public Penyanyi(String nama){
        System.out.println("Nama penyanyi : "+nama);
    }

    public String nama(String nama){
       return this.nama = nama; 
    }
    protected void genre (String genre){
        System.out.println("Genre-nya: pop");
    }
}
