package com.mycompany.posttest4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Posttest4 {
static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList <festival> dataftv = new ArrayList<>();
    static ArrayList <user> datausr = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    
    public static void tambahdata() throws IOException {
        System.out.println("------------------------------");
        System.out.println("--      Tambah Pesanan      --");
        System.out.println("------------------------------");
        System.out.println("|      1. Data Festival      |");
        System.out.println("|      2. Data User          |");
        System.out.println("------------------------------");
        System.out.print("Pilih Menu : ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data Festival ==========");
            System.out.print("Masukkan Nomor Booking                       : ");
            int booking = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama Festival                   : ");
            String nama = input.readLine();
            System.out.print("Masukkan Nama Artis : ");
            String artis = input.readLine();
            System.out.print("Masukkan Kouta Tiket                 : ");
            String tiket = input.readLine();
            System.out.println("=============================================");
            dataftv.add(new festival(nama, booking, artis, tiket));
            System.out.println("Data " + nama + " berhasil ditambahkan!");

        }else if(pil == 2){
            System.out.println("========== Masukkan Data User ==========");
            System.out.print("Masukkan Nomor Booking                    : ");
            int boking = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama                 : ");
            String artis = input.readLine();
            System.out.print("Masukkan Nama Festival : ");
            String nama = input.readLine();
            System.out.print("Masukkan Jumlah Tiket                 : ");
            String tiket = input.readLine();
            System.out.println("=============================================");
            datausr.add(new user(nama,  artis, tiket, boking));
            
        }else{
            System.out.println("Pilihan Salah");
        }
    }
    
    public static void tampil() throws IOException{
        System.out.println("------------------------------");
        System.out.println("--        Read Pesanan      --");
        System.out.println("------------------------------");
        System.out.println("|      1. Data Festival      |");
        System.out.println("|      2. Data User          |");
        System.out.println("------------------------------");
        System.out.print("Pilih Menu: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("\n============ List Data Festival ============");
            if (dataftv.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < dataftv.size();i++){
                    System.out.println("Data indeks ke-" + (i + 1));
                    dataftv.get(i).tampil();
                    }
                }
                System.out.println("===========================================");
        }else if(pil == 2){
            System.out.println("\n=========== List Data User ===========");
            if (datausr.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < datausr.size();i++){
                    System.out.println("Data indeks ke-" + (i + 1));
                    datausr.get(i).tampil();
                }
            }
                System.out.println("======================================");
        }else{
            System.out.println("Pilihan salah");

        }
    } 
    
                          

    public static void ubahdata() throws IOException{
        System.out.println("------------------------------");
        System.out.println("--       Ubah Pesanan       --");
        System.out.println("------------------------------");
        System.out.println("|      1. Data Festival      |");
        System.out.println("|      2. Data User          |");
        System.out.println("------------------------------");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (dataftv.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < dataftv.size();i++){
                    System.out.println("=================================================");
                    System.out.println("Data indeks ke-" + (i));
                    System.out.println("Nomor Booking   :" + dataftv.get(i).getBoking());
                    System.out.println("Nama Festival   :" + dataftv.get(i).getNama());
                    System.out.println("Nama Artis      :" + dataftv.get(i).getArtis());
                    System.out.println("Kouta Tiket     :" + dataftv.get(i).getTiket());
                    System.out.println("=================================================");
                    }
                }
                System.out.print("Masukkan indeks data festival yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                index -=1;
                if (index < 0 || index >= dataftv.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    festival ftv = dataftv.get(index);
                    System.out.println("Data festival dengan indeks " + index+1);
                    System.out.println("======= Masukkan data festival yang baru =======");
                    System.out.print("Masukkan Nomor booking                       : ");                  
                    ftv.setBoking(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Nama festival                    : ");
                    ftv.setNama(input.readLine());
                    System.out.print("Masukkan artis: ");
                    ftv.setArtis(input.readLine());
                    System.out.print("Masukkan kouta booking           : ");
                    ftv.setTiket(input.readLine());
                    System.out.println("=================================================");
                    System.out.println("Data festival berhasil diubah!");
                }
            }
        else if(pil == 2){
            if (datausr.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < datausr.size();i++){
                    System.out.println("=================================================");
                    System.out.println("Data indeks ke-" + (i + 1));
                    System.out.println("Nomor Booking   :" + datausr.get(i).getBoking());
                    System.out.println("Nama            :" + datausr.get(i).getArtis());
                    System.out.println("Nama Festival   :" + datausr.get(i).getNama());
                    System.out.println("Jumlah Tiket    :" + datausr.get(i).getTiket());
                    System.out.println("=================================================");
                    }
                }
                      
                System.out.print("Masukkan indeks data user yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                index -=1;
                if (index < 0 || index >= datausr.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    user usr = datausr.get(index);
                    System.out.println("Data dosen dengan indeks " + index + 1);
                    System.out.println("======= Masukkan data user yang baru =======");
                    System.out.print("Masukkan Nomor booking                       : ");                  
                    usr.setBoking(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Nama                      : ");
                    usr.setArtis(input.readLine());
                    System.out.print("Masukkan nama festival : ");
                    usr.setNama(input.readLine());
                    System.out.print("Masukkan Jumlah tiket             : ");
                    usr.setTiket(input.readLine());
                    System.out.println("===============================================");
                    System.out.println("Data user berhasil diubah!");
                }
            }
        else{
            System.out.println("Input Salah");
        }
    }
    
    public static void hapus() throws IOException{
        System.out.println("------------------------------");
        System.out.println("--      Delete Pesanan      --");
        System.out.println("------------------------------");
        System.out.println("|      1. Data Festival      |");
        System.out.println("|      2. Data User          |");
        System.out.println("------------------------------");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (dataftv.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < dataftv.size();i++){
                    System.out.println("=======================================");
                    System.out.println("Data indeks ke-" + (i + 1));
                    System.out.println("Nomor Booking   :" + dataftv.get(i).getBoking());
                    System.out.println("Nama Festival   :" + dataftv.get(i).getNama());
                    System.out.println("Nama Artis      :" + dataftv.get(i).getArtis());
                    System.out.println("Kouta Tiket     :" + dataftv.get(i).getTiket());
                    System.out.println("=======================================");
                    }
                }
                System.out.print("Masukkan indeks data festival yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                index -=1;
                if (index < 0 || index >= dataftv.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    festival ftv = dataftv.get(index);
                    dataftv.remove(index);
                    System.out.println("Data festival dengan indeks " + index + " berhasil dihapus:");
                }
            }
    
        else if(pil == 2){
            if (datausr.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < datausr.size();i++){
                    System.out.println("=======================================");
                    System.out.println("Data indeks ke-" + (i));
                    System.out.println("Nomor Booking   :" + datausr.get(i).getBoking());
                    System.out.println("Nama            :" + datausr.get(i).getArtis());
                    System.out.println("Nama Festival   :" + datausr.get(i).getNama());
                    System.out.println("Jumlah Tiket    :" + datausr.get(i).getTiket());
                    System.out.println("=======================================");
                }
                System.out.print("Masukkan indeks data user yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                index -=1;
                if (index < 0 || index >= datausr.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    user usr = datausr.get(index);
                    datausr.remove(index);
                    System.out.println("Data anak dengan indeks " + index + " berhasil dihapus:");
                    
                }
            }
        }else{
            System.out.println("Input Salah");
        }
        
    }
    public static void main(String[] args) throws IOException  {
        boolean menu = true;
        while(menu == true){
        System.out.println("==============================");
        System.out.println("=   Pemesanan Tiket Konser   =");
        System.out.println("==============================");
        System.out.println("------------ MENU ------------");
        System.out.println("|     1. Tambah Pesanan      |");
        System.out.println("|     2. Baca Pesanan        |");
        System.out.println("|     3. Ubah Data Pesanan   |");
        System.out.println("|     4. Hapus Pesanan       |");
        System.out.println("|     5. Exit                |");
        System.out.println("==============================");
        System.out.print("Pilih Menu : ");
        int pilih = Integer.parseInt(input.readLine());
        switch(pilih){
            case 1:
                tambahdata();
                froze();
                break;
            case 2:
                tampil();
                froze();
                break;
            case 3:
                ubahdata();
                froze();
                break;
            case 4:
                hapus();
                froze();
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan program ini!");
                menu = false;
                break;
            default:
                System.out.println("Pilihan salah!");
                froze();
                break;
            }
        }
    }  
}

