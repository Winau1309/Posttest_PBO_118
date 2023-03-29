package com.mycompany.posttest4;

public class user {
    private String nama; 
    private String artis;
    private String tiket;
    private int boking;
    

    // untuk membuat objek baru dari class dgn nilai atribut yang telah
    // diinisialisasi pada saat objek dibuat.
    public user(String nama, String artis, String tiket, int boking) {
        this.nama = nama; // untuk menginisialisasi atribut "name"
        this.artis = artis;
        this.tiket = tiket;
        this.boking = boking;
       
    }
    

    
    public void tampil(){
        System.out.println("Nmor booking           : " + getBoking() );
        System.out.println("Nama festival          : " + getNama() );
        System.out.println("nama                   : " + getArtis() );
        System.out.println("jumlah tiket           : " + getTiket() );
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the artis
     */
    public String getArtis() {
        return artis;
    }

    /**
     * @param artis the artis to set
     */
    public void setArtis(String artis) {
        this.artis = artis;
    }

    /**
     * @return the tiket
     */
    public String getTiket() {
        return tiket;
    }

    /**
     * @param tiket the tiket to set
     */
    public void setTiket(String tiket) {
        this.tiket = tiket;
    }

    /**
     * @return the boking
     */
    public int getBoking() {
        return boking;
    }

    /**
     * @param boking the boking to set
     */
    public void setBoking(int boking) {
        this.boking = boking;
    }
}