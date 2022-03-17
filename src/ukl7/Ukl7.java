/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl7;

import java.util.Scanner;

/**
 *
 * @author CATURWARGA COMPUTER
 */
public class Ukl7 {

    /**
     * @param args the command line arguments
     */
   static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nama = {"Galuh", "Indro", "Jedi", "Kanu"};//memberikan pilihan nama
        String[] alamat = {"Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo"};//memberikan pilihan tempat
        int[] golongan = {1, 3, 2, 3};//memberikan pilihan golongan

        System.out.print("Masukkan no id pelanggan : ");
        int id = input.nextInt(); //untuk memasukan input id yang ingin dipilih

        if (id < 1 || id > nama.length) {
            System.out.println("SALAH INPUT !!!");
            System.exit(0);//untuk memberikan kata salah jika salah memasukan input
        } else {
            System.out.print("Masukkan pemakaian listrik (kwh) : ");
            int listrik = input.nextInt();//untuk memasukan pemakaian kwh yang ingin dipilih

            int tagihan = hitung(golongan[id - 1], listrik);

            System.out.println("");
            System.out.println("-----------------------------");
            System.out.println("");
            System.out.println("Nama pelanggan     : " + nama[id - 1]);//untuk memberikan output nama 
            System.out.println("Golongan           : " + golongan[id - 1]);//untuk memberikan output golongan
            System.out.println("Alamat             : " + alamat[id - 1]);//untuk memberikan output alamat
            System.out.println("Penggunaan listrik : " + listrik + " kwh");//untuk memberikan output listrik/kwh
            System.out.println("Total tagihan      : Rp. " + tagihan);//untuk menampilkan tagihannya

            if (tagihan < 50000) {
                System.out.println("Total tagihan menjadi Rp. 50000");
            }

        }
    }

    static int hitung(int golongan, int listrik) {

        int admin = 13000;
        int tagihan = 0;

        if (golongan == 1) {
            tagihan = listrik * 1000 + admin;
        } else if (golongan == 2) {
            tagihan = listrik * 1300 + admin;
        } else if (golongan == 3) {
            tagihan = listrik * 1500 + admin;
        }
             //harga tagihan listrik + admin
        return tagihan;
    }
}
