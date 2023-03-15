package com.mycompany.posttest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Posttest2 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<User> dataUser = new ArrayList<>();
        
        while (true){
            System.out.println("==============================");
            System.out.println("=   Pemesanan Tiket Konser   =");
            System.out.println("==============================");
            System.out.println("------------ MENU ------------");
            System.out.println("|     1. Tambah Pesanan      |");
            System.out.println("|     2. Baca Pesanan        |");
            System.out.println("|     3. Ubah Data User      |");
            System.out.println("|     4. Hapus Pesanan       |");
            System.out.println("|     5. Exit                |");
            System.out.println("==============================");
            System.out.print("Pilih Menu : ");
            int menu = Integer.parseInt(br.readLine());
            
            switch (menu) {
                case 1 -> {
                    System.out.println("------------------------------");
                    System.out.println("--      Tambah Pesanan      --");
                    System.out.println("------------------------------");
                    System.out.println("Create Username : ");
                    String usr = br.readLine();
                    System.out.println("Create Password : ");
                    String pass = br.readLine();
                    System.out.println("Nama Tiket  : ");
                    String tkt = br.readLine();
                    System.out.println("Masukan Jumlah Tiket : ");
                    String jmlh = br.readLine();
                    User newuser = new User(usr, pass, tkt,  jmlh);
                    dataUser.add(newuser);
                    System.out.println("------------------------------");
                    System.out.println("Data Berhasil Ditambahkan!");
                }
                case 2 -> {
                    System.out.println("------------------------------");
                    System.out.println("--       Baca Pesanan       --");
                    System.out.println("------------------------------");
                    for (int i = 0; i < dataUser.size(); i++){
                        System.out.println("\nPesanan ke-" + (i+1));
                        System.out.println("Username     :" + dataUser.get(i).getUsername());
                        System.out.println("Password     :" + dataUser.get(i).getPassword());
                        System.out.println("Nama Tiket   :" + dataUser.get(i).getTiket());
                        System.out.println("Jumlah Tiket : " + dataUser.get(i).getJumlah());
                    }
                }
                case 3 -> {
                    System.out.println("------------------------------");
                    System.out.println("--    Ubah Data Username    --");
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Username : ");
                    String username = br.readLine();
                    
                    for (int i = 0; i < dataUser.size(); i++){
                        if(dataUser.get(i).getUsername().equals(username)){
                            dataUser.get(i).setUsername(username);
                        }
                        
                    }
                    
                    for (User setuser : dataUser) {
                        if (setuser.getUsername().equals(username)){
                            System.out.println("Ganti Username :");
                            setuser.setUsername(br.readLine());
                            System.out.println("------------------------------");
                            System.out.println("Data Berhasil Diubah");
                            break;
                        }
                    }
                }
                case 4 -> {
                    for(int i = 0; i < dataUser.size(); i++){
                        System.out.println(i+1 + ". " + dataUser.get(i).getUsername());
                    }
                    System.out.println("------------------------------");
                    System.out.println("--      Hapus Pesanan       --");
                    System.out.println("------------------------------");
                    System.out.println("\nMasukan Nama User Yang Mau Dihapus : ");
                    String findNama = br.readLine();
                    
                    for(int i = 0; i < dataUser.size(); i ++){
                        if(dataUser.get(i).getUsername().equals(findNama)){
                            dataUser.remove(i);
                            System.out.println("------------------------------");
                            System.out.println("Data Berhasil Dihapus!");
                        }
                    }
                }
                case 5 -> System.exit(0);
            }
        }
    }
    
}
