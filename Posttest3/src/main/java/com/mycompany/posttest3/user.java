package com.mycompany.posttest3;

/**
 *
 * @author Swift 3
 */
public class user extends tiket{
    private int tkt;
    
    public user (String nama, int tanggal, int tkt, String artis){
        super(nama, tanggal, artis);
        this.tkt = tkt;
    }

    public int getTkt() {
        return tkt;
    }

    public void setTkt(int tkt) {
        this.tkt = tkt;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("tiket : " + this.tkt);
    }
    
    public void displayInfo(boolean showTKT){
        if (showTKT) displayInfo();
        else super.displayInfo();
    }
}
