package com.mycompany.posttest2;

class User{
    private String username;
    private String password;
    private String tiket;
    private String jumlah;

       public User(String user, String password, String tiket, String jumlah){
        this.username = user;
        this.password = password;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }
    
    public String getUsername(){return this.username;}
    public String getPassword(){return this.password;}
    public String getTiket(){return this.tiket;}
    public String getJumlah(){return this.jumlah;}
    
    
    public void setUsername(String userbaru){this.username = userbaru;}
    public void setPassword(String passbaru){this.password = passbaru;}
    public void setTiket(String tiketbaru){this.tiket = tiketbaru;}
    public void setJumlah(String jumlahbaru){this.jumlah = jumlahbaru;}
}

