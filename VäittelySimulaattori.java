
package väittelysimulaattori;

import java.util.Random;
import java.util.Scanner;

public class VäittelySimulaattori {
// java case switch 
    
    public static void main(String[] args) {
        
        String nappi;
        int pisteet = 0;
        int vuorot = 0;
        int ratkaisu = 0;
        int perustele = 0;
        int privosoi = 0;
        
        Random rand = new Random();
        int random = rand.nextInt(2) + 1;
        
       Scanner lukija = new Scanner(System.in);
       System.out.println("peli alkaa");
       System.out.println("Pentti on mieltä x");
       System.out.println("d = ehdota ratkaisua,f = perustele,g = provosoi,h = luovuta");
       nappi = lukija.nextLine();
       
       while(!nappi.equals("h") || pisteet < 100){
           if(nappi.equals("d")){
               System.out.println("Miksi?");
               pisteet = pisteet + 10;
               System.out.println("pisteet "+pisteet+"%");
               vuorot++;
               ratkaisu++;
               System.out.println("d = ehdota ratkaisua,f = perustele,g = provosoi,h = luovuta");
               nappi = lukija.nextLine();}
           
           if(nappi.equals("f")){
               if(ratkaisu > 0){
               switch(random){
                   case 1: 
               System.out.println("Niin, mutta...");
               pisteet = pisteet + 10;
               System.out.println("pisteet "+pisteet+"%");
               vuorot++;
               perustele++;
               System.out.println("d = ehdota ratkaisua,f = perustele,g = provosoi,h = luovuta");
               nappi = lukija.nextLine();
               break;
                   case 2:
               System.out.println("Entä jos...");
               pisteet = pisteet + 10;
               System.out.println("pisteet "+pisteet+"%");
               vuorot++;
               perustele++;
               System.out.println("d = ehdota ratkaisua,f = perustele,g = provosoi,h = luovuta");
               nappi = lukija.nextLine();
               break;
               }
               }else{System.out.println("?");
               System.out.println("pisteet "+pisteet+"%");
               vuorot++;
               perustele++;
               System.out.println("d = ehdota ratkaisua,f = perustele,g = provosoi,h = luovuta");
               nappi = lukija.nextLine();
           }
           }    
           
    
       }
        
        
        
        
        
    }
    
}
