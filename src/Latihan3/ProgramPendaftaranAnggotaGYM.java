/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

import java.util.Scanner;

/**
 *
 * @author Lab Studio
 */
public class ProgramPendaftaranAnggotaGYM {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalAnggota = 0;
        String lagi;

        do {
            // Meminta nama anggota
            System.out.print("Masukkan nama anggota: ");
            String nama = input.nextLine();
            totalAnggota++;

            // Menanyakan apakah ingin daftar lagi
            System.out.print("Daftar anggota lagi? [ya/tidak]> ");
            lagi = input.nextLine().toLowerCase();

        } while (lagi.equals("ya"));  // Perulangan jika jawab "ya"

        // Menampilkan total
        System.out.println("Total anggota yang didaftarkan hari ini: " + totalAnggota);
    }
} 

