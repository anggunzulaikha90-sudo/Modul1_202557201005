/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array16april2026;
import java.util.*;
/**
 *
 * @author ANGGUN Z
 */
public class StringData {
    public static void main(String[] args) {
        String identitas [][]= {{"ABDUL","\n085646668991","\nKediri"} ,{"KUSNO",
"\n085646668992", "\nTrenggalek"}, {"PONIRAN", "\n085646668999",
"\nBojonegoro"}};
      
        System.out.println("NAMA\tALAMAT\tTELEPON");
        
        for (int a = 0; a < identitas.length; a++){
            System.out.println(identitas[a][0] + "\t" + identitas[a][1] + "\t" + identitas[a][2]);
        
        }
        
    }
}
