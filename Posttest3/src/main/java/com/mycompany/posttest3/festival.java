package com.mycompany.posttest3;

/**
 *
 * @author Swift 3
 */
public class festival extends tiket{
    private int tiket;
    
    public festival(String nama, int tanggal, int tiket, String artis){
        super(nama, tanggal, artis);
        this.tiket = tiket;
    }

    public int getTiket() {
        return tiket;
    }

    public void setTiket(int tiket) {
        this.tiket = tiket;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kouta Tiket: " + this.tiket);
    }
    
    public void displayInfo(boolean showTIKET){
        if (showTIKET) displayInfo();
        else super.displayInfo();
}
    }