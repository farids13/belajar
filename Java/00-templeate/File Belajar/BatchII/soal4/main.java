package BatchII.soal4;

import java.util.Scanner;

class kota {
    public static void cekListKota(String data){
        String [][] kotaTerdaftar = {
            {"Bandung",     "Gemah Ripah Wibawa Mukti"},
            {"Tanggerang",  "Bhakti Karya Abdhi Kertaraharja"},
            {"Solo",        "The Spirit of Java"},
            {"Padang",      "Padang Kota Tercinta"}
        };
        String tampung = "";
        int i, a = 0;
        tampung = data;
        for(i=0 ; i<kotaTerdaftar.length ; i++){
            if(tampung.equalsIgnoreCase(kotaTerdaftar[i][0])){
                tampung = "Kota " +kotaTerdaftar[i][0] +" Mempunyai Motto "+ kotaTerdaftar[i][1];
                a = 1;
                break;
            }
        }
        if (a == 1) System.out.println(tampung);
        else System.out.println("Mohon Maaf Untuk Kota Lain Belum Ditambahkan");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan masukkan nama Kota yang akan di cek:");
        String kota = input.nextLine();
        cekListKota(kota);
    }
}
