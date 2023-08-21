package BatchII.soal2;

class hitungJumlahKarakter {
    static void bandingkan (String kata1, String kata2){
        int jumKata1, jumKata2; 
        String nilai, hasil;
        jumKata1 = kata1.length();
        jumKata2 = kata2.length();
        if (jumKata1 > jumKata2){
            nilai = " Lebih Besar (>) dari ";
            hasil = kata1;
        }else if (jumKata1 < jumKata2){
            nilai = " Lebih Kecil (<) dari ";
            hasil = kata2;
        }
        else{
            nilai = " Sama dengan (=) ";
            hasil = " Tidak Ada ";
        }
        System.out.println("Perbandingan Jumlah Karakter pada Kata "+kata1+" dengan "+kata2);
        System.out.println(kata1+ nilai + kata2);
        System.out.println("Maka Jumlah karakter yang lebih besar pada dua kata di atas adalah " +hasil);
        System.out.println("------------------------------------------------------------");;
    }
    public static void main(String[] args) {
        String kata1 = "Saya";
        String kata2 = "Kalian";
        String kata3 = "Ikan";
        String kata4 = "Burung";
        bandingkan(kata1, kata2);
        bandingkan(kata3, kata4);
    }
}
