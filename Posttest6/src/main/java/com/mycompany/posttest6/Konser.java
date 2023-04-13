package com.mycompany.posttest6;

 // abstract class
public abstract class Konser {
    protected  final String status = "Sudah Dibeli"; // final pada atribut
    private String namaKonser;
    private String alamat;
    private String tanggal;
    
    // Constructor
    public Konser(String namaKonser, String alamat, String tanggal) {
        this.namaKonser = namaKonser;
        this.alamat = alamat;
        this.tanggal = tanggal;
    }
    
    // abstract method  
    public abstract void tampil();

    /**
     * @return the namaKonser
     */
    public String getNamaKonser() {
        return namaKonser;
    }

    /**
     * @param namaKonser the namaKonser to set
     */
    public void setNamaKonser(String namaKonser) {
        this.namaKonser = namaKonser;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
     
     //Overloading
    public void info(String namaKonser){
        System.out.println("\nData Kpop dengan Nama " + namaKonser + "  berhasil ditambahkan!" );
    }
    
    //Overloading
    public void info(int harga){
        System.out.println("\nData Rock dengan Harga" + harga + " berhasil diubah!");
    }
  
}