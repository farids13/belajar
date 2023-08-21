package BatchII.soal1;

class HitungLuasLingkaran {
    // ini rumus untuk menghitung luas lingkaran menggunakan r
    static double diameterLingkaran(double d){
       double r;
        r = d / 2;
        return 3.14 * r * r;
    }
    public static void main(String[] args) {
        // inisialiasi input diameter
        int lingkaran1, lingkaran2, lingkaran3;
        // value setiap lingkaran
        lingkaran1 = 10;
        lingkaran2 = 15;
        lingkaran3 = 17;
        // tampilkan dan eksekusi
        System.out.println("Luas Lingkaran dari diameter "+lingkaran1+" cm = "+diameterLingkaran(lingkaran1)+" cm^2");
        System.out.println("Luas Lingkaran dari diameter "+lingkaran2+"cm = "+diameterLingkaran(lingkaran2)+"cm^2");
        System.out.println("Luas Lingkaran dari diameter "+lingkaran3+"cm = "+diameterLingkaran(lingkaran3)+"cm^2");
    }
}
