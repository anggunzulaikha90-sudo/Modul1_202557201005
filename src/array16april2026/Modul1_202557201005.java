/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array16april2026;

import javax.swing.JOptionPane;

/**
 *
 * @author ANGGUN Z
 */
public class Modul1_202557201005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        System.out.println("Isi Array: ");
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                System.out.print(data[a][b] + " ");
            }
            System.out.println();
        }

        // Nilai Rata-rata array
        int total = 0;
        int jumlahElemen = 0;
        double jumlahGanjil1=0;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                total += data[a][b];
                jumlahElemen++;
                if (b %2!=0) {
                        jumlahGanjil1=jumlahGanjil1+data[a][b];
                    }
            }
        }
        double rataRata = (double) total / jumlahElemen;
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Rata-rata: " + rataRata);

        //Cari index
        int angkaCari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka yang mau dicari di array: "));
        String alamatIndex = "";
        boolean ketemu = false;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                if (data[a][b] == angkaCari) {
                    ketemu = true;
                    alamatIndex += "[" + a + "][" + b + "]\n";

                }
            }
        }
       {
            String wadahNilaiBaru = JOptionPane.showInputDialog("Nilai ditemukan di : " + alamatIndex + "Mau diganti berapa? ");
            int nilaiBaru = Integer.parseInt(wadahNilaiBaru);
            for (int a = 0; a < data.length; a++) {
                for (int b = 0; b < data[0].length; b++) {
                    if (data[a][b] == angkaCari) {
                        ketemu = true;

                        data[a][b] = nilaiBaru;
                    }
                }
            }

            if (!ketemu) {//jika nilai tidak ditemukan
                JOptionPane.showMessageDialog(null, "Nilai tidak ditemukan!");
            }
            // Perubahan Array
            System.out.println("\nArray setelah perubahan: ");
            for (int a = 0; a < data.length; a++) {
                for (int b = 0; b < data[0].length; b++) {
                    System.out.print(data[a][b] + " ");
                }
                System.out.println();
            }

            // Jumlah Kolom Ganjil
//            int jumlahGanjil1 = 0;
//            for (int a = 0; a < data.length; a++) {
//                for (int b = 0; b < data[0].length; b++) {
//                    
//                }
//            }
            System.out.println("\nJumlah elemen pada kolom ganjil: " + jumlahGanjil1);                
            }
        }
    }
