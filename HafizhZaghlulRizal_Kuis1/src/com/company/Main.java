package com.company;

class Mahasiswa{
    String nama;
    String npm;
    String prodi;
    Buku judul;

    //Method
    void pinjamBuku(Buku paramJudul){
        judul = paramJudul;
    }

    //constractor
    Mahasiswa(String paramNama, String paramNpm, String paramProdi){
        nama = paramNama;
        npm = paramNpm;
        prodi = paramProdi;
    }

    //Method
    void detailMahasiswa(){
        System.out.println("Nama            : " + nama);
        System.out.println("NPM             : " + npm);
        System.out.println("Program Studi   : " + prodi);
        judul.detailBuku();
        System.out.println("---------------------------------------------------------");
    }

}

class Buku{
    String namaBuku;
    String kodeBuku;
    String tglPinjam;
    String tglKembali;

    //Constructor
    Buku(String paramNamaBuku, String paramKodeBuku, String paramPinjam, String paramKembali){
        namaBuku = paramNamaBuku;
        kodeBuku = paramKodeBuku;
        tglPinjam = paramPinjam;
        tglKembali = paramKembali;

    }
    void detailBuku(){
        System.out.println("Buku Dipinjam   : " + namaBuku);
        System.out.println("Kode Buku       : " + kodeBuku);
        System.out.println("Tanggal Pinjam  : " + tglPinjam);
        System.out.println("Tanggal Kembali : " + tglKembali);
    }

}

public class Main {

    public static void main(String[] args) {
        Mahasiswa hafizh = new Mahasiswa("Hafizh", "2055061017", "Teknik Informatika");
        Buku PBO = new Buku("Pemrograman Berbasis Objek", "1389", "21 Maret 2022", "28 Maret 2022");
        hafizh.pinjamBuku(PBO);
        hafizh.detailMahasiswa();

        Mahasiswa ucok = new Mahasiswa("Ucok", "1915031089", "Teknik Elektro");
        Buku kalkulus = new Buku("Kalkulus", "1277", "17 Maret 2022", "24 Maret 2022");
        ucok.pinjamBuku(kalkulus);
        ucok.detailMahasiswa();
    }
}
