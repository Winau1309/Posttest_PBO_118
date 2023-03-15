package com.mycompany.tiketkonser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

public class Tiketkonser {

    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<User> dataUser = new ArrayList<>();
        
        while (true){
            System.out.println("========================");
            System.out.println("=   Pemesanan Tiket    =");
            System.out.println("========================");
            System.out.println("--------- MENU ---------");
            System.out.println("|   1. Tambah Pesanan  |");
            System.out.println("|   2. Baca Pesanan    |");
            System.out.println("|   3. Ubah Data User  |");
            System.out.println("|   4. Hapus Pesanan   |");
            System.out.println("|   5. Exit            |");
            System.out.println("========================");
            System.out.print("Pilih Menu : ");
            int menu = Integer.parseInt(br.readLine());
            
            switch (menu) {
                case 1:
                    System.out.println("------------------");
                    System.out.println("- Tambah Pesanan -");
                    System.out.println("------------------");
                    System.out.println("Create Username: ");
                    String usr = br.readLine();
                    System.out.println("Create Password: ");
                    String pass = br.readLine();
                    System.out.println("Nama Tiket: ");
                    String tkt = br.readLine();
                    System.out.println("Masukan Jumlah Tiket: ");
                    String jmlh = br.readLine();
                    User newuser = new User(usr, pass, tkt,  jmlh);
                    dataUser.add(newuser);
                    break;
                case 2:
                    System.out.println("------------------");
                    System.out.println("-  Baca Pesanan  -");
                    System.out.println("------------------");
                    for (int i = 0; i < dataUser.size(); i++){
                        System.out.println("\nPesanan ke-" + (i+1));
                        System.out.println("Username :" + dataUser.get(i).getUsername());
                        System.out.println("Password :" + dataUser.get(i).getPassword());
                        System.out.println("Nama Tiket :" + dataUser.get(i).getTiket());
                        System.out.println("Jumlah Tiket : " + dataUser.get(i).getJumlah());
                    }
                    break;
                case 3:
                    System.out.println("------------------");
                    System.out.println("- Ubah Data User -");
                    System.out.println("------------------");
                    System.out.println("Masukkan Username : ");
                    String username = br.readLine();
                    
                    for (int i = 0; i < dataUser.size(); i++){
                        if(dataUser.get(i).getUsername().equals(username)){
                            dataUser.get(i).setUsername(username);
                        }
                        
                    }
                    
                    for (User setuser : dataUser) {
                        if (setuser.getUsername().equals(username)){
                            System.out.println("Ganti username :");
                            setuser.setUsername(br.readLine());
                            break;
                        }
                    }
                    break;
                case 4:
                    for(int i = 0; i < dataUser.size(); i++){
                        System.out.println(i+1 + ". " + dataUser.get(i).getUsername());
                    }
                    System.out.println("\nMasukan Nama User yang mau dihapus: ");
                    String findNama = br.readLine();
                    
                    for(int i = 0; i < dataUser.size(); i ++){
                        if(dataUser.get(i).getUsername().equals(findNama)){
                            dataUser.remove(i);
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
    
}
