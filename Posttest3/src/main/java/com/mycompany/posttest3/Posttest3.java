package com.mycompany.posttest3;

/**
 *
 * @author Swift 3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Posttest3 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        ArrayList <festival> dataftv = new ArrayList<>();
        ArrayList <user> datausr = new ArrayList<>();
        
        while (true){
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
            int menu = Integer.parseInt(br.readLine());
            
            switch (menu) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("--      Tambah Pesanan      --");
                    System.out.println("------------------------------");
                    System.out.println("|      1. Data Festival      |");
                    System.out.println("|      2. Data User          |");
                    System.out.println("------------------------------");
                    int pilih = Integer.parseInt(br.readLine());
                    switch(pilih){
                        case 1 : 
                            System.out.print("Masukkan Nama Festival : ");
                            String nama = br.readLine();
                            System.out.print("Masukkan Nomor Booking : ");
                            int tanggal = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan Kouta Tiket : ");
                            int tiket = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan Nama Artis : ");
                            String artis = br.readLine();
                            festival baru = new festival(nama, tanggal, tiket, artis);
                            dataftv.add(baru);
                            break;
                            
                        case 2 :
                            System.out.println("Masukan Nama  : ");
                            String usrname = br.readLine();
                            System.out.println("Masukkan Nomor Booking : ");
                            int pass = Integer.parseInt(br.readLine());
                            System.out.println("Nama Festival   : ");
                            String jmlh = (br.readLine());
                            System.out.println("Masukan Jumlah Tiket : ");
                            int tkt = Integer.parseInt(br.readLine());
                            user usrbaru = new user(usrname, pass, tkt,jmlh);
                            datausr.add(usrbaru);
                            break;
                    }
                    break;
                    
                case 2:
                    System.out.println("------------------------------");
                    System.out.println("--        Read Pesanan      --");
                    System.out.println("------------------------------");
                    System.out.println("|      1. Data Festival      |");
                    System.out.println("------------------------------");
                    System.out.println("Masukkan pilihan : ");
                    int choose = Integer.parseInt(br.readLine());
                    switch (choose) {
                        case 1:
                            System.out.println("Data Festival");
                            System.out.println("1. Data Lengkap");
                            System.out.print("Masukkan pilihan : ");
                            int apa = Integer.parseInt(br.readLine());
                            if (apa == 1){
                                for (int i = 0; i < dataftv.size(); i++){
                                    dataftv.get(i).displayInfo();
                                }
                            }
                            else{
                                dataftv.get(apa).displayInfo(false);
                            }
                            break;
                            
                        case 2:
                            System.out.println("Data user");
                            for (int i = 0; i < datausr.size(); i++){
                            }
                            break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia");
                            break;
                }
                    break;
                    
                    
                case 3:
                    System.out.println("------------------------------");
                    System.out.println("--       Ubah Pesanan       --");
                    System.out.println("------------------------------");
                    System.out.println("|      1. Data Festival      |");
                    System.out.println("|      2. Data User          |");
                    System.out.println("------------------------------");
                    System.out.print("Masukkan data yang ingin diedit : ");
                    int menuEdit = Integer.parseInt(br.readLine());
                    if(menuEdit == 1){
                        System.out.println("Masukan Nama Festival : "); String findFtv = br.readLine();
                        
                        for(festival ftv : dataftv){
                            if(ftv.getNama().equals(findFtv)){
                                System.out.println("Nama Festival   : "); ftv.setNama(br.readLine());
                                System.out.println("Nama Artis      : "); ftv.setArtis(br.readLine());
                                System.out.println("Nomor Booking   : "); ftv.setTanggal(Integer.parseInt(br.readLine()));
                                System.out.println("Kouta Tiket     : "); ftv.setTiket(Integer.parseInt(br.readLine()));
                            }
                        }
                        
                   
                    }else if(menuEdit == 2){
                        System.out.println("Masukan Nama : "); String findUsr = br.readLine();
                        for(user usr : datausr){
                            if(usr.getNama().equals(findUsr)){
                                System.out.println("Nama            : "); usr.setNama(br.readLine());
                                System.out.println("Nomor Booking   : "); usr.setTanggal(Integer.parseInt(br.readLine()));
                                System.out.println("Nama Festival   : "); usr.setArtis(br.readLine());
                                System.out.println("Jumlah Tiket    : "); usr.setTkt(Integer.parseInt(br.readLine()));
                            }
                        }
                        
                    }else{
                        System.out.println("Data yang dipilih tidak tersedia");
                    }
                    break;
                    
                case 4:
                    System.out.println("------------------------------");
                    System.out.println("--      Delete Pesanan      --");
                    System.out.println("------------------------------");
                    System.out.println("|      1. Data Festival      |");
                    System.out.println("|      2. Data User          |");
                    System.out.println("------------------------------");
                    System.out.print("Masukkan data yang ingin dihapus : ");
                    int menuHapus = Integer.parseInt(br.readLine());
                    if(menuHapus == 1){
                        System.out.println("Masukan Nama festival : "); String findftv1 = br.readLine();
                        
                        for(int i = 0; i < dataftv.size(); i++){
                            if(dataftv.get(i).getNama().equals(findftv1)){
                                dataftv.remove(i);
                                System.out.println(" Data Terhapus!\n");
                            }
                        }
                                          
                    }else if(menuHapus == 2){
                        System.out.println("Masukan Nama : "); String findusr1 = br.readLine();
                        
                        for(int i = 0; i < datausr.size(); i++){
                            if(datausr.get(i).getNama().equals(findusr1)){
                                datausr.remove(i);
                                System.out.println(" Data Terhapus!\n");
                            }
                        }
                    }
                    break;
                case 5 :
                    System.out.println("----------------------------------------------");
                    System.out.println("--  Terima Kasih Telah Menggunakan Program  --");
                    System.out.println("----------------------------------------------");
                    System.exit(0);
                    break;
                default :
                    System.out.println("Pilihan Tidak Ada!");
            }
        }
    }
}