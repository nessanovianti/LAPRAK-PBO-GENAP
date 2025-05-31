/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak7;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class TokoBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kategori_Buku[] daftarBuku = new Kategori_Buku[3];

        System.out.println("== MASUKKAN DATA BUKU ==");

        for (int i = 0; i < 3; i++) {
            System.out.println("Buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Nama Pengarang: ");
            String pengarang = input.nextLine();
            System.out.print("Penerbit: ");
            String penerbit = input.nextLine();
            System.out.print("Tahun Cetak: ");
            int tahun = Integer.parseInt(input.nextLine());
            System.out.print("Kategori (su/r/d/a): ");
            String kategori = input.nextLine();

            daftarBuku[i] = new Kategori_Buku(judul, pengarang, penerbit, tahun, kategori);
            System.out.println();
        }

        System.out.println("\n== DAFTAR BUKU YANG TELAH DIMASUKKAN ==");
        for (Kategori_Buku buku : daftarBuku) {
            buku.tampilkanInfo();
        }

        input.close();
    }
}
