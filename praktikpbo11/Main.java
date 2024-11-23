/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikpbo11;

/**
 *
 * @author wh664
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek anggota
        Anggota anggota1 = new Anggota("Alice");
        Anggota anggota2 = new Anggota("Bob");

        // Membuat objek klub
        Klub klub = new Klub("Klub Olahraga");

        // Menambahkan anggota ke dalam klub
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);

        // Menampilkan informasi klub dan anggotanya
        klub.infoKlub();
    }
}

