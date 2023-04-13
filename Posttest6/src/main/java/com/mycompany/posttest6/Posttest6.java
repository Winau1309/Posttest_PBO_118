package com.mycompany.posttest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Posttest6 {
        static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        static ArrayList<KonserKpop> listkp = new ArrayList<>();
        static ArrayList<KonserRock> listrk = new ArrayList<>();
        
        public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    
    static final void display() { // final method
        System.out.println("Terima kasih telah menggunakan program ini!");
    }
    
    public static void tambahdata() throws IOException {
        System.out.println("\n------------------------------");
        System.out.println("--      Tambah Pesanan      --");
        System.out.println("------------------------------");
        System.out.println("|      1. Konser Kpop        |");
        System.out.println("|      2. Konser Rock        |");
        System.out.println("------------------------------");
        System.out.print("Pilih Menu : ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("\n----  Masukkan Data Kpop  ----");
            System.out.print("Masukkan Nama Konser   : ");
            String namaKonser = input.readLine();
            System.out.print("Masukkan alamat        : ");
            String alamat = input.readLine();
            System.out.print("Masukkan Tanggal       : ");
            String tanggal = input.readLine();
            System.out.print("Masukkan Group         : ");
            String band = input.readLine();
            System.out.print("Masukkan Harga Tiket   : ");
            int harga = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama Artis      : ");
            String namaArtis = input.readLine();
            System.out.print("Masukkan Lokasi Konser    : ");
            String lokasiKonser = input.readLine();
            System.out.println("------------------------------");
            KonserKpop kpop = new KonserKpop(namaKonser, alamat, tanggal, band, harga,namaArtis,lokasiKonser);
            listkp.add(kpop);
            kpop.info(namaKonser);

        }else if(pil == 2){
            System.out.println("\n----  Masukkan Data Rock  ----");
            System.out.print("Masukkan Nama konser    : ");
            String namaKonser = input.readLine();
            System.out.print("Masukkan Alamat         : ");
            String alamat = input.readLine();
            System.out.print("Masukkan Tanggal        : ");
            String tanggal = input.readLine();
            System.out.print("Masukkan Band           : ");
            String band = input.readLine();
            System.out.print("Masukkan Harga Tiket    : ");
            int harga = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama Artis      : ");
            String namaArtis = input.readLine();
            System.out.print("Masukkan Lokasi Konser    : ");
            String lokasiKonser = input.readLine();
            System.out.println("------------------------------");
            KonserRock rock = new KonserRock(namaKonser, alamat, tanggal, band, harga,namaArtis,lokasiKonser);
            listrk.add(rock);
            rock.info(namaKonser);
            
        }else{
            System.out.println("Pilihan Salah");
        }
    }
    
    public static void tampil() throws IOException{
        System.out.println("\n------------------------------");
        System.out.println("--        Read Pesanan      --");
        System.out.println("------------------------------");
        System.out.println("|      1. Konser Kpop        |");
        System.out.println("|      2. Konser Rock        |");
        System.out.println("------------------------------");
        System.out.print("Pilih Menu: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("\n---- List Data Konser KPOP ----");
            if (listkp.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listkp.size();i++){
                    System.out.println("Data indeks ke-" + (i + 1));
                    listkp.get(i).tampil();
                    }
                }
                System.out.println("------------------------------");
        }else if(pil == 2){
            System.out.println("\n---- List Data Konser Rock ----");
            if (listrk.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listrk.size();i++){
                    System.out.println("Data indeks ke-" + (i + 1));
                    listrk.get(i).tampil();
                }
            }
                System.out.println("------------------------------");
        }else{
            System.out.println("Pilihan salah");

        }
       } 
    
    public static void ubahdata() throws IOException{
        System.out.println("\n------------------------------");
        System.out.println("--       Ubah Pesanan       --");
        System.out.println("------------------------------");
        System.out.println("|      1. Konser Kpop        |");
        System.out.println("|      2. Konser Rock        |");
        System.out.println("------------------------------");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listkp.isEmpty()) {
                System.out.println("\n---------------------------------");
                System.out.println("- Belum ada data yang tersimpan! - ");
                System.out.println("----------------------------------");
            } else {
                for(int i = 0; i < listkp.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listkp.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data kpop yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                
                if(index <= listkp.size() || index > 0){
                    System.out.println("\n---- Masukkan Data Baru ----");
                    System.out.print("\nMasukkan Nama Konser   : ");
                    String namaKonser = input.readLine();
                    listkp.get(index-1).setNamaKonser(namaKonser);

                    System.out.print("Masukkan Alamat        : ");
                    String alamat = input.readLine();
                    listkp.get(index-1).setAlamat(alamat);

                    System.out.print("Masukkan Tanggal       : ");
                    String tanggal = input.readLine();
                    listkp.get(index-1).setTanggal(tanggal);

                    System.out.print("Masukkan Group         : ");
                    String band = input.readLine();
                    listkp.get(index-1).setBand(band);
                    
                    System.out.print("Masukkan Harga Tiket   : ");
                    int harga = Integer.parseInt(input.readLine());
                    listkp.get(index-1).setHarga(harga);
                    
                    System.out.print("Masukkan Nama Artis       : ");
                    String namaArtis = input.readLine();
                    listkp.get(index-1).setTanggal(namaArtis);

                    System.out.print("Masukkan Lokasi Konser         : ");
                    String lokasiKonser = input.readLine();
                    listkp.get(index-1).setLokasiKonser(lokasiKonser);
                    
                    listkp.get(index-1).info(namaKonser);
                    System.out.println("------------------------------");
                }else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }  
        }else if(pil == 2){
            if (listrk.isEmpty()) {
                System.out.println("\n---------------------------------");
                System.out.println("- Belum ada data yang tersimpan! - ");
                System.out.println("----------------------------------");
            } else {
                for(int i = 0; i < listrk.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listrk.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data rock yang ingin diubah : ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listrk.size() || index > 0){
                    System.out.println("\n---- Masukkan Data Baru ----");
                    System.out.print("\nMasukkan Nama Konser   : ");
                    String namaKonser = input.readLine();
                    listrk.get(index-1).setNamaKonser(namaKonser);

                    System.out.print("Masukkan Alamat        : ");
                    String alamat = input.readLine();
                    listrk.get(index-1).setAlamat(alamat);

                    System.out.print("Masukkan Tanggal       : ");
                    String tanggal = input.readLine();
                    listrk.get(index-1).setTanggal(tanggal);

                    System.out.print("Masukkan Band          : ");
                    String band = input.readLine();
                    listrk.get(index-1).setBand(band);
                    
                    System.out.print("Masukkan harga tiket   : ");
                    int harga = Integer.parseInt(input.readLine());
                    listrk.get(index-1).setHarga(harga);
                    
                    System.out.print("Masukkan Nama Artis       : ");
                    String namaArtis = input.readLine();
                    listkp.get(index-1).setTanggal(namaArtis);

                    System.out.print("Masukkan Lokasi Konser         : ");
                    String lokasiKonser = input.readLine();
                    listkp.get(index-1).setLokasiKonser(lokasiKonser);
                    
                    listrk.get(index-1).info(namaKonser);
                    System.out.println(  "------------------------------");
                    }else
                    {
                        System.out.println("Indeks tidak ditemukan!");
                    }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
        public static void hapus() throws IOException{
        System.out.println("\n------------------------------");
        System.out.println("--      Delete Pesanan      --");
        System.out.println("------------------------------");
        System.out.println("|      1. Konser KPOP        |");
        System.out.println("|      2. Konser Rock        |");
        System.out.println("------------------------------");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){ 
        if (listkp.isEmpty()) {
                System.out.println("\n---------------------------------");
                System.out.println("- Belum ada data yang tersimpan! - ");
                System.out.println("----------------------------------");
            } else {
            for(int i = 0; i < listkp.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listkp.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data kpop yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listkp.size() || index > 0) 
                {
                    listkp.remove(index-1);
                    System.out.println("Data dengan indeks " + index + " berhasil dihapus");
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else if(pil == 2){
            if (listrk.isEmpty()) {
                System.out.println("\n---------------------------------");
                System.out.println("- Belum ada data yang tersimpan! - ");
                System.out.println("----------------------------------");
            } else {
                for(int i = 0; i < listrk.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listrk.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data rock yang ingin dihapus : ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listrk.size() || index > 0) 
                {
                    listrk.remove(index-1);
                    System.out.println("Data dengan indeks " + index + " berhasil dihapus");
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
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
                display();
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