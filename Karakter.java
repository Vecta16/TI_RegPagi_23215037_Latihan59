/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan59.detektifconan;

/**
 *
 * @author 
 * Nama : Arrijal Tanzil Maulana
 * NIM : 23215037
 * Kelas : TI
 * Deskripsi Program : Program ini berisi tentang mengetahui beberapa Karakter 
 *                     yang ada di serial anime detective conan. 
 */
public class Karakter {

    private String nama;
    private String peran;

    public Karakter(String nama, String peran) {
        this.nama = nama;
        this.peran = peran;
    }

    public String getNama() {
        return nama;
    }

    public String getPeran() {
        return peran;
    }

}
