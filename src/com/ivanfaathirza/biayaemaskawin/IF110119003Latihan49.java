package com.ivanfaathirza.biayaemaskawin;

import java.util.Scanner;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung biaya total dari berat emas (gram)
 * berdasarkan masukkan dari user menggunakan getter dan setter
 * dengan berorientasi objek
 */


public class IF110119003Latihan49 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Emas emas = new Emas();
        System.out.println("Program Perhitungan harga Emas");
        System.out.print("Masukkan berat (gram) : ");
        emas.setTotalBerat(scan.nextDouble());
        emas.tampilHasil(emas.hitungTotal(emas.getTotalBerat()));
    }
}
