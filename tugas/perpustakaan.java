/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author wh664
 */
// Kelas Buku
class Buku {
    private String judul;
    private Pengarang pengarang; // Agregasi: Buku memiliki Pengarang

    // Constructor untuk Buku
    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    // Menampilkan informasi buku beserta pengarangnya
    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        pengarang.infoPengarang();  // Menampilkan informasi pengarang
    }
}

// Kelas Pengarang
class Pengarang {
    private String namaPengarang;

    // Constructor untuk Pengarang
    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    // Menampilkan informasi pengarang
    public void infoPengarang() {
        System.out.println("Pengarang: " + namaPengarang);
    }
}

// Kelas Perpustakaan
class Perpustakaan {
    private Buku[] daftarBuku;  // Array untuk menyimpan daftar buku
    private int jumlahBuku;  // Menyimpan jumlah buku yang ada

    // Constructor untuk Perpustakaan
    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    // Menambahkan buku ke dalam perpustakaan
    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Perpustakaan sudah penuh!");
        }
    }

    // Menampilkan informasi semua buku di perpustakaan
    public void infoPerpustakaan() {
        System.out.println("Informasi Perpustakaan:");
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].infoBuku();
            System.out.println();  // Pemisah antar buku
        }
    }
}


