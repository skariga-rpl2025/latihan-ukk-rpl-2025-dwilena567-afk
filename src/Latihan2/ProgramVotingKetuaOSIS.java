/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

import java.util.Scanner;

/**
 *
 * @author Lab Studio
 */
public class ProgramVotingKetuaOSIS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suaraA = 0;
        int suaraB = 0;

        System.out.println("===== PROGRAM VOTING OSIS =====");
        System.out.println("(Ketik \"selesai\" untuk mengakhiri)\n");

        while (true) {
            System.out.print("Masukkan pilihan Anda (A/B): ");
            String pilihan = input.nextLine().trim();

            if (pilihan.equalsIgnoreCase("selesai")) {
                break; // keluar dari perulangan
            }

            if (pilihan.equalsIgnoreCase("A")) {
                suaraA++;
            } else if (pilihan.equalsIgnoreCase("B")) {
                suaraB++;
            } else {
                System.out.println("Input tidak valid! Masukkan hanya A, B, atau selesai.\n");
            }
        }
    }
}
    

