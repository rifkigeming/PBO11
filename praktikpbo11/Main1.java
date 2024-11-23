/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikpbo11;



/**
 *
 * @author wh664
 */
public class Main1 {
    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new Buku("Java untuk Pemula");
        Buku buku2 = new Buku("Dasar-Dasar Pemrograman");

        // Membuat objek perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan buku ke dalam perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menampilkan informasi perpustakaan dan buku-bukunya
        perpustakaan.infoPerpustakaan();
    }
}

