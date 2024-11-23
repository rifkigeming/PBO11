/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikpbo11;

/**
 *
 * @author wh664
 */
import java.util.ArrayList;
import java.util.List;

class Buku {
    private String judul;

    // Constructor untuk Buku
    public Buku(String judul) {
        this.judul = judul;
    }

    // Method untuk menampilkan informasi buku
    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
    }
}

class Perpustakaan {
    private List<Buku> bukuList;

    // Constructor untuk Perpustakaan
    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }

    // Method untuk menambahkan buku ke dalam daftar
    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    // Method untuk menampilkan informasi perpustakaan dan buku-bukunya
    public void infoPerpustakaan() {
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}
