/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan5;

/**
 *
 * @author Lab Studio
 */
public class Kendaraan {
    private String noPolisi;
    private String merk;
    private int tahun;

    // Setter
    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Getter
    public String getNoPolisi() {
        return noPolisi;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahun() {
        return tahun;
    }
}
