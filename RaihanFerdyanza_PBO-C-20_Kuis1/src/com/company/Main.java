//Raihan Ferdyanza 2015061085 PSTIC UNILA BANDARLAMPUNG
package com.company;

//Class
class Peminjam{
    String nama;
    String nomorKartu;
    String jenisKelamin;
    String alamat;
    Buku namaBuku;

    //Constructor
    Peminjam(String parameterNama, String parameterNomorKartu, String parameterJenisKelamin,String parameterAlamat){
        nama = parameterNama;
        nomorKartu = parameterNomorKartu;
        jenisKelamin = parameterJenisKelamin;
        alamat = parameterAlamat;
    }

    //Method
    void pinjamBuku(Buku parameterNamaBuku){
        namaBuku = parameterNamaBuku;
    }

    //Method
    void informasiPeminjam(){
        System.out.println("Informasi Peminjam Buku Perpustakaan");
        System.out.println("Nama                 : " + nama);
        System.out.println("Nomor Kartu          : " + nomorKartu);
        System.out.println("Jenis Kelamin        : " + jenisKelamin);
        System.out.println("Alamat               : " + alamat);
        namaBuku.informasiBuku();
        System.out.println("===---===---===---===---===*===---===---===---===---===");
    }

}

//Class
class Buku{
    String namaBuku;
    String nomorBuku;
    String tglPeminjaman;
    String tglPengembalian;

    //Constructor
    Buku(String parameterNamaBuku, String parameterNomorBuku, String parameterTglPeminjaman, String parameterTglPengembalian){
        namaBuku = parameterNamaBuku;
        nomorBuku = parameterNomorBuku;
        tglPeminjaman = parameterTglPeminjaman;
        tglPengembalian = parameterTglPengembalian;

    }
    //Method
    void informasiBuku(){
        System.out.println("Meminjam buku        : " + namaBuku);
        System.out.println("Nomor Buku           : " + nomorBuku);
        System.out.println("Tanggal Peminjaman   : " + tglPeminjaman);
        System.out.println("Tanggal Pengembalian : " + tglPengembalian);
    }

}

public class Main {

    public static void main(String[] args) {

        Peminjam raihan = new Peminjam("Raihan Ferdyanza", "2015061085", "Laki-laki","Jl.Dr.Susilo No.12 Teluk Betung Utara, Bandarlampung");
        Buku pbo = new Buku("Pemrograman Berorientasi Objek", "28200206", "27 Maret 2022", "31 Maret 2022");
        raihan.pinjamBuku(pbo);
        raihan.informasiPeminjam();

        Peminjam fikriyanti = new Peminjam("Fikriyanti Eka", "2115061089", "Perempuan","Jl. Cendana No.24 Kedaton Permai, Bandarlampung");
        Buku elektronika = new Buku("Elektronika", "28062003", "26 Maret 2022", "30 Maret 2022");
        fikriyanti.pinjamBuku(elektronika);
        fikriyanti.informasiPeminjam();

    }
}