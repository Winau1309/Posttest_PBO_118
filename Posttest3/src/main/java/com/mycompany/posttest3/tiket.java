package com.mycompany.posttest3;

public class tiket {
    static protected String nama, artis;
    static protected int tanggal;
    
    public tiket (String nama, int tanggal, String artis){
        this.nama = nama;
        this.tanggal = tanggal;
        this.artis = artis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }
    
    public void displayInfo(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Nomor Booking : " + this.tanggal);
        System.out.println("Artis : " + this.artis);
    }
}

