/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan5;

/**
 *
 * @author Lab Studio
 */
public class Run_Kendaraan {
     public static void main(String[] args) {
        // Membuat objek kendaraan
        Kendaraan mobil = new Kendaraan();

        // Mengisi data menggunakan setter
        mobil.setNoPolisi("N 1234 AA");
        mobil.setMerk("Toyota Avanza");
        mobil.setTahun(2022);

        // Menampilkan data menggunakan getter
        System.out.println("==== DATA KENDARAAN ====");
        System.out.println("No. Polisi : " + mobil.getNoPolisi());
        System.out.println("Merk       : " + mobil.getMerk());
        System.out.println("Tahun      : " + mobil.getTahun());
    }
}

