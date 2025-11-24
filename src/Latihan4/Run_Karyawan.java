/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;

/**
 *
 * @author Lab Studio
 */
public class Run_Karyawan {
    public static void main(String[] args) {   
        // Membuat objek Karyawan
        Karyawan kry = new Karyawan();

        // Mengisi data menggunakan setter
        kry.setNIP("K001");
        kry.setNama("Budi Hartono");
        kry.setDivisi("Marketing");

        // Menampilkan data menggunakan getter
        System.out.println("==== DATA KARYAWAN ====");
        System.out.println("NIP     : " + kry.getNIP());
        System.out.println("Nama    : " + kry.getNama());
        System.out.println("Divisi  : " + kry.getDivisi());
    }
}
    

