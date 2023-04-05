/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.postest5;

/**
 *
 * @author Swift 3
 */
public final class KonserRock extends Konser{
    private String band;
    private int harga;

    public KonserRock(String namaKonser, String alamat, String tanggal, String band, int harga) {
        super(namaKonser, alamat, tanggal);
        this.band = band;
        this.harga = harga;
    }

    /**
     * @return the band
     */
    public String getBand() {
        return band;
    }

    /**
     * @param band the band to set
     */
    public void setBand(String band) {
        this.band = band;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    @Override
    public void tampil(){
        System.out.println("Status           : " + status);
        System.out.println("Nama Konser      : " + getNamaKonser());
        System.out.println("Alamat           : " + getAlamat() );
        System.out.println("Tanggal          : " + getTanggal() );
        System.out.println("Band             : " + band);
        System.out.println("Harga            : " + harga);
    }


}
