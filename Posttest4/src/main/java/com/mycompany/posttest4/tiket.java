/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest4;

/**
 *
 * @author Swift 3
 */
public class tiket extends user{
    private String name, artist;
    private int tanggal;
    
    
    public tiket(String nama, String artis, String tiket, int boking,String name, String artist, int tanggal) {
        super(nama, artis, tiket, boking);
        this.name = name; // untuk menginisialisasi atribut "name"
        this.artist = artist;
        this.tanggal = tanggal;
    
       
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @return the tanggal
     */
    public int getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }
    
    @Override
    public void tampil(){
        super.tampil();
        System.out.println("Nama            : " + name );
        System.out.println("Artis           : " + artist );
        System.out.println("Tanggal         : " + tanggal );
    }
}
