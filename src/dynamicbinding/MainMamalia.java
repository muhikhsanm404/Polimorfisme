/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dynamicbinding;

/**
 *
 * @author Muh Ikhsan M
 */
public class MainMamalia {
    
    public static void main(String[]args){
        show (new Mamalia());
        show (new Sapi());
        show (new Limosin());
        show (new Brahman());
        show(new Kelinci());
    }

    private static void show(Mamalia mamalia) {  //Mamalia mamalia
        System.out.println(mamalia);  //mamalia
        
    }
}
//kelas itu jadi obj ada superclass namanya abtrak class
//manggil tostring sebenernya ada override anak dari super nya abrtak class
// dinamik new samsung();  // statik Samsung sam = new Samsung();
// Samsung sout --> ""

