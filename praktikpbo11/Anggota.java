/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikpbo11;

/**
 *
 * @author wh664
 */


import java.util.ArrayList;
import java.util.List;

class Anggota {
    private String nama;

    // Constructor
    public Anggota(String nama) {
        this.nama = nama;
    }

    // Method untuk menampilkan informasi anggota
    public void infoAnggota() {
        System.out.println("Nama Anggota: " + nama);
    }
}

class Klub {
    private String namaKlub;
    private List<Anggota> anggotaList;

    // Constructor
    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
        this.anggotaList = new ArrayList<>();
    }

    // Method untuk menambah anggota ke dalam klub
    public void tambahAnggota(Anggota anggota) {
        anggotaList.add(anggota);
    }

    // Method untuk menampilkan informasi klub beserta anggotanya
    public void infoKlub() {
        System.out.println("Nama Klub: " + namaKlub);
        for (Anggota anggota : anggotaList) {
            anggota.infoAnggota();
        }
    }
}
