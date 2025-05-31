/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak7;

/**
 *
 * @author ASUS
 */

class Kategori_Buku extends Toko {
    private String kategori;

    public Kategori_Buku(String judul, String nama_pengarang, String penerbit, int tahun_cetak, String kategori) {
        super(judul, nama_pengarang, penerbit, tahun_cetak);
        this.kategori = kategori;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kategori: " + kategoriToString());
        System.out.println();
    }

    private String kategoriToString() {
        switch (kategori) {
            case "su": return "Semua Umur";
            case "r": return "Remaja";
            case "d": return "Dewasa";
            case "a": return "Anak";
            default: return "Tidak Diketahui";
        }
    }
}
