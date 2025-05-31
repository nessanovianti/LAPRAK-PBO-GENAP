/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak7;

/**
 *
 * @author ASUS
 */

class Toko {
    private String judul;
    private String nama_pengarang;
    private String penerbit;
    private int tahun_cetak;

    public Toko(String judul, String nama_pengarang, String penerbit, int tahun_cetak) {
        this.judul = judul;
        this.nama_pengarang = nama_pengarang;
        this.penerbit = penerbit;
        this.tahun_cetak = tahun_cetak;
    }

    public String getJudul() {
        return judul;
    }

    public String getNamaPengarang() {
        return nama_pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int getTahunCetak() {
        return tahun_cetak;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + nama_pengarang);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun Cetak: " + tahun_cetak);
        
    }
}
