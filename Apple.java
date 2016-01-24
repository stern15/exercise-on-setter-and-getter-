/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apple;

/**
 *
 * @author semasuka
 */
public class Apple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tuna tunaObj1 =new tuna();
        tuna tunaObj2 =new tuna(15);
        tuna tunaObj3 =new tuna(15,13);
        tuna tunaObj4 =new tuna(15,13,30);
        
        System.out.printf("%s\n", tunaObj1.toMil());
        System.out.printf("%s\n", tunaObj2.toMil());
        System.out.printf("%s\n", tunaObj3.toMil());
        System.out.printf("%s\n", tunaObj4.toMil());
        System.out.println("---------------------------");
        System.out.printf("%s\n", tunaObj1.toNor());
        System.out.printf("%s\n", tunaObj2.toNor());
        System.out.printf("%s\n", tunaObj3.toNor());
        System.out.printf("%s\n", tunaObj4.toNor());

   }  
}
