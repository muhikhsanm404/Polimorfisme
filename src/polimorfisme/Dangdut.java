/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author Muh Ikhsan M
 */
public class Dangdut extends Penyanyi{
    String nama = "Yeni Inka";

@Override
public String nama(String nama){
return this.nama = nama;
}

@Override
protected void genre(String genre){
    System.out.println("Genre-nya: pop");
}
}
