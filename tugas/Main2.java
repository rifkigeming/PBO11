/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author wh664
 */

// Kelas Main untuk menjalankan program
public class Main2 {
    public static void main(String[] args) {
        // Membuat pengarang
        Pengarang pengarang1 = new Pengarang("J.K. Rowling");
        Pengarang pengarang2 = new Pengarang("George Orwell");

        // Membuat buku dengan pengarang
        Buku buku1 = new Buku("Harry Potter", pengarang1);
        Buku buku2 = new Buku("1984", pengarang2);

        // Membuat perpustakaan dengan kapasitas 5 buku
        Perpustakaan perpustakaan = new Perpustakaan(5);

        // Menambahkan buku ke dalam perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menampilkan informasi perpustakaan dan semua bukunya
        perpustakaan.infoPerpustakaan();
    }
}
