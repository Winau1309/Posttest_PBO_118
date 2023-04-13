package com.mycompany.posttest6;

public final class KonserRock extends Konser implements Festival{
    private String band;
    private int harga;
private String namaArtis;
    private String lokasiKonser;

    public KonserRock(String namaKonser, String alamat, String tanggal, String band, int harga, String namaArtis, String lokasiKonser) {
        super(namaKonser, alamat, tanggal);
        this.band = band;
        this.harga = harga;
        this.namaArtis = namaArtis;
        this.lokasiKonser = lokasiKonser;
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

    /**
     * @return the namaArtis
     */
    public String getNamaArtis() {
        return namaArtis;
    }

    /**
     * @param namaArtis the namaArtis to set
     */
    public void setNamaArtis(String namaArtis) {
        this.namaArtis = namaArtis;
    }

    /**
     * @return the lokasiKonser
     */
    public String getLokasiKonser() {
        return lokasiKonser;
    }

    /**
     * @param lokasiKonser the lokasiKonser to set
     */
    public void setLokasiKonser(String lokasiKonser) {
        this.lokasiKonser = lokasiKonser;
    }
    
    
    
   
        
    @Override
    public void tampil() {
        System.out.println("Status           : " + status);
        System.out.println("Nama Konser      : " + getNamaKonser());
        System.out.println("Alamat           : " + getAlamat() );
        System.out.println("Tanggal          : " + getTanggal() );
        System.out.println("Group            : " + getBand());
        System.out.println("Harga            : " + getHarga());
        System.out.println("Konser Pop ini akan dimeriahkan oleh " + namaArtis + " di " + lokasiKonser);
   }

   public void mulaiKonser() {
      System.out.println("Konser " + namaArtis + " dimulai di " + lokasiKonser);
   
   }
    
}