/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array16april2026;

/**
 *
 * @author ANGGUN Z
 */
public class StringData {
     public static void main(String[] args) {
        // TODO code application logic here
         String identitas [][]= {{"ABDUL","Kediri","\t085646668991"} ,{"KUSNO",
"Trenggalek", "085646668992"}, {"PONIRAN", "Bojonegoro",
"085646668999"}};
         
         System.out.println("NAMA\tALAMAT\t\tTELEPON");
         
         
         for (int a = 0; a < identitas.length; a++ ){
             System.out.println(identitas[a][0] + "\t" + identitas[a][1] + "\t" + identitas[a][2]);
         }
      
     }
}
