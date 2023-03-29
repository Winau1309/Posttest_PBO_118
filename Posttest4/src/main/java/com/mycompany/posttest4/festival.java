package com.mycompany.posttest4;

public class festival extends user{
    private int booking;
    
    public festival(String nama, int boking, String artis, String tiket) {
        super(nama, artis, tiket, boking);
        this.booking = booking;
       
    }

    
    

    /**
     * @return the booking
     */
    public int getBooking() {
        return booking;
    }

    /**
     * @param booking the booking to set
     */
    public void setBooking(int booking) {
        this.booking = booking;
    }
    
    
    @Override
    public void tampil(){
        super.tampil();
        System.out.println("Booking    : " + booking);
      
    }
}