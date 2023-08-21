import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Animal.Animal;

public class Zoo_Main {
    public static Scanner scanner = new Scanner(System.in); // karena ini object jadi bisa di panggil methodnya
    public static StafList staf = new StafList();
    public static void main(String[] args) {
        List<Karnivora> karnivoras = new ArrayList<>();
        List<Herbivora> herbivoras = new ArrayList<>();
        List<Omnivora> omnivoras = new ArrayList<>();
        List<Beruang> beruanglist = new ArrayList<>();
        
        Harimau harimau = new Harimau();
        Komodo komodo = new Komodo();
        Beruang beruang = new Beruang();
        Landak landak = new Landak();
        Jerapah jerapah = new Jerapah();
        Zebra zebra = new Zebra();
        System.out.println(zebra);
       

        while(true){
            System.out.print("Kebun_Binatang >> " );
            String[] listHewan = {"Harimau", "Komodo", "Beruang", "Landak", "Jerapah", "Zebra"};
            String input = scanner.nextLine(); // ini medthod class next line nya
            String[] inputs = input.split(" ");
            if (inputs.length <= 1 ){
            } else {
                if (inputs[0].equalsIgnoreCase("hewan")){
                    if (inputs[1].equalsIgnoreCase("set")){
                        int varNumber = Integer.parseInt(inputs[3]);
                        switch(inputs[2].toLowerCase()) {
                            case "harimau":
                                harimau.setJumlah(varNumber);
                                System.out.println("Berhasil Merubah Menjadi " + harimau.getJumlah());
                                break;
                            case "komodo":
                                komodo.setJumlah(varNumber);
                                System.out.println("Berhasil Merubah Menjadi " + komodo.getJumlah());
                                break;
                            case "beruang":
                                beruang.setJumlah(varNumber);
                                System.out.println("Berhasil Merubah Menjadi " + beruang.getJumlah());
                            case "landak":
                                landak.setJumlah(varNumber);
                                System.out.println("Berhasil Merubah Menjadi " + landak.getJumlah());
                            case "jerapah":
                                jerapah.setJumlah(varNumber);
                                System.out.println("Berhasil Merubah Menjadi " + jerapah.getJumlah());
                            case "zebra":
                                zebra.setJumlah(varNumber);
                                System.out.println("Berhasil Merubah Menjadi " + zebra.getJumlah());
                            default:
                            System.out.println("Nama hewan yang ada di kebun binatang ini: harimau, komodo, beruang,landak,jerpah,zebra");
                        }
                    }
                    if (inputs[1].equalsIgnoreCase("tambah")){
                        int varNumber = Integer.parseInt(inputs[3]);
                        int sumNumber;
                        switch(inputs[2].toLowerCase()) {
                            case "harimau":
                                sumNumber = (harimau.getJumlah() + harimau.setJumlah(varNumber));
                                harimau.setJumlah(sumNumber);
                                System.out.println("Berhasil Menambah " + varNumber +" Total Sekarang " + harimau.getJumlah());
                                break;
                            case "komodo":
                                sumNumber = (komodo.getJumlah() + komodo.setJumlah(varNumber));
                                komodo.setJumlah(sumNumber);
                                System.out.println("Berhasil Menambah " + varNumber +" Total Sekarang " + komodo.getJumlah());
                                break;
                            case "beruang":
                                sumNumber = (beruang.getJumlah() + beruang.setJumlah(varNumber));
                                beruang.setJumlah(sumNumber);
                                System.out.println("Berhasil Menambah " + varNumber +" Total Sekarang " + beruang.getJumlah());
                                break;
                            case "landak":
                                sumNumber = (landak.getJumlah() + landak.setJumlah(varNumber));
                                landak.setJumlah(sumNumber);
                                System.out.println("Berhasil Menambah " + varNumber +" Total Sekarang " + landak.getJumlah());
                                break;
                            case "jerapah":
                                sumNumber = (jerapah.getJumlah() + jerapah.setJumlah(varNumber));
                                jerapah.setJumlah(sumNumber);
                                System.out.println("Berhasil Menambah " + varNumber +" Total Sekarang " + jerapah.getJumlah());
                                break;
                            case "zebra":
                                sumNumber = (zebra.getJumlah() + zebra.setJumlah(varNumber));
                                zebra.setJumlah(sumNumber);
                                System.out.println("Berhasil Menambah " + varNumber +" Total Sekarang " + zebra.getJumlah());
                                break;
                            default:
                            System.out.println("Nama hewan yang ada di kebun binatang ini: harimau, komodo, beruang,landak,jerpah,zebra");
                        }
                    }
                } // end if hewan

                if (inputs[0].equalsIgnoreCase("info")){
                    if (inputs[2].equalsIgnoreCase("hewan")){
                        switch(inputs[3].toLowerCase()){
                            case "harimau":
                                switch(inputs[1].toLowerCase()){
                                    case "jumlah": System.out.println("Jumlah Hewan " + harimau.getJumlah()); break;
                                    case "masahidup": System.out.println("Masa Hidup " + harimau.getMaxUmur()); break;
                                    case "lokasi": System.out.println("Lokasi Berada di Kandang " + harimau.getLokasi()); break;
                                    case "biayaperbulan": System.out.println("Biaya per Bulan yang dibutuhkan " + harimau.getBiayaPerBulan()); break;
                                    case "jumlahstaff": System.out.println("Staff yang menjaga sejumlah "+ harimau.getJumlahStaff()); break;
                                    default: System.out.println("Masukkan input ke 2 dengan benar: Jumlah, Masahidup, lokasi, BiayaPerBulan, JumlahStaff"); break;
                            }
                            break;
                            case "komodo":
                                switch(inputs[1].toLowerCase()){
                                    case "jumlah": System.out.println("Jumlah Hewan " + komodo.getJumlah()); break;
                                    case "masahidup": System.out.println("Masa Hidup " + komodo.getMaxUmur()+ " Tahun") ; break;
                                    case "lokasi": System.out.println("Lokasi Berada di Kandang " + komodo.getLokasi()); break;
                                    case "biayaperbulan": System.out.println("Biaya per Bulan yang dibutuhkan " + komodo.getBiayaPerBulan()); break;
                                    case "jumlahstaff": System.out.println("Staff yang menjaga sejumlah "+ komodo.getJumlahStaff()); break;
                                    default: System.out.println("Masukkan input ke 2 dengan benar: Jumlah, Masahidup, lokasi, BiayaPerBulan, JumlahStaff"); break;
                                }
                            break;
                            case "beruang":
                                switch(inputs[1].toLowerCase()){
                                    case "jumlah": System.out.println("Jumlah Hewan " + beruang.getJumlah()); break;
                                    case "masahidup": System.out.println("Masa Hidup " + beruang.getMaxUmur()); break;
                                    case "lokasi": System.out.println("Lokasi Berada di Kandang " + beruang.getLokasi()); break;
                                    case "biayaperbulan": System.out.println("Biaya per Bulan yang dibutuhkan " + beruang.getBiayaPerBulan()); break;
                                    case "jumlahstaff": System.out.println("Staff yang menjaga sejumlah "+ beruang.getJumlahStaff()); break;
                                    default: System.out.println("Masukkan input ke 2 dengan benar: Jumlah, Masahidup, lokasi, BiayaPerBulan, JumlahStaff"); break;
                                }
                            break;
                            case "landak":
                                switch(inputs[1].toLowerCase()){
                                    case "jumlah": System.out.println("Jumlah Hewan " + landak.getJumlah());break;
                                    case "masahidup": System.out.println("Masa Hidup " + landak.getMaxUmur());break;
                                    case "lokasi": System.out.println("Lokasi Berada di Kandang " + landak.getLokasi()); break;
                                    case "biayaperbulan": System.out.println("Biaya per Bulan yang dibutuhkan " + landak.getBiayaPerBulan()); break;
                                    case "jumlahstaff": System.out.println("Staff yang menjaga sejumlah "+ landak.getJumlahStaff()); break;
                                    default: System.out.println("Masukkan input ke 2 dengan benar: Jumlah, Masahidup, lokasi, BiayaPerBulan, JumlahStaff");break;
                                }
                            break;
                            case "jerapah":
                                switch(inputs[1].toLowerCase()){
                                    case "jumlah":System.out.println("Jumlah Hewan " + jerapah.getJumlah());break;
                                    case "masahidup":System.out.println("Masa Hidup " + jerapah.getMaxUmur());break;
                                    case "lokasi":System.out.println("Lokasi Berada di Kandang " + jerapah.getLokasi()); break;
                                    case "biayaperbulan": System.out.println("Biaya per Bulan yang dibutuhkan " + jerapah.getBiayaPerBulan()); break;
                                    case "jumlahstaff": System.out.println("Staff yang menjaga sejumlah "+ jerapah.getJumlahStaff()); break;
                                    default: System.out.println("Masukkan input ke 2 dengan benar: Jumlah, Masahidup, lokasi, BiayaPerBulan, JumlahStaff"); break;
                                }
                            break;
                            case "zebra":
                                switch(inputs[1].toLowerCase()){
                                    case "jumlah": System.out.println("Jumlah Hewan " + zebra.getJumlah()); break;
                                    case "masahidup": System.out.println("Masa Hidup " + zebra.getMaxUmur()); break;
                                    case "lokasi":System.out.println("Lokasi Berada di Kandang " + zebra.getLokasi());break;
                                    case "biayaperbulan":System.out.println("Biaya per Bulan yang dibutuhkan " + zebra.getBiayaPerBulan());break;
                                    case "jumlahstaff": System.out.println("Staff yang menjaga sejumlah "+ zebra.getJumlahStaff()); break;
                                    default: System.out.println("Masukkan input ke 2 dengan benar: Jumlah, Masahidup, lokasi, BiayaPerBulan, JumlahStaff");break;
                                }
                            break;
                            default: System.out.println("Nama hewan yang ada di kebun binatang ini: harimau, komodo, beruang,landak,jerpah,zebra"); break;
                        }
                                
                    }
                    if (inputs[2].equalsIgnoreCase("hewan")){
                        switch(inputs[3].toLowerCase()){
                            case "harimau":
                                switch (inputs[1].toLowerCase()){
                                    case "habitat":System.out.println("Habitatnya di " + harimau.getHabitat());break;
                                    case "kelompok":System.out.println("Termasuk Kelompok Karnivora");break;
                                    case "cara berburu":System.out.println("Cara Berburu "+ harimau.getCaraBerburu());break;
                                    default:System.out.println("Masukkan Perintah: Habitat, Kelompok, Cara Berburu");break;
                                }
                            break;
                            case "komodo":
                            switch (inputs[0].toLowerCase()){
                                case "habitat": System.out.println("Habitatnya di " + komodo.getHabitat());break;
                                case "kelompok": System.out.println("Termasuk Kelompok Karnivora");break;
                                case "cara berburu":System.out.println("Cara Berburu "+ komodo.getCaraBerburu());break;
                                default:System.out.println("Masukkan Perintah: Habitat, Kelompok, Cara Berburu");break;
                            }
                            break;
                            case "beruang":
                            switch (inputs[0].toLowerCase()){
                                case "habitat":System.out.println("Habitatnya di " + beruang.getHabitat());break;
                                case "kelompok":System.out.println("Termasuk Kelompok Omnivora");break;
                                default:System.out.println("Masukkan Perintah: Habitat, Kelompok");break;
                            }
                            break;
                            case "landak":
                            switch (inputs[0].toLowerCase()){
                                case "habitat":
                                System.out.println("Habitatnya di " + landak.getHabitat());
                                break;
                                case "kelompok":
                                System.out.println("Termasuk Kelompok Omnivra");
                                break;
                                default:
                                System.out.println("Masukkan Perintah: Habitat, Kelompok");
                                break;
                            }
                            break;
                            case "jerapah":
                            switch (inputs[0].toLowerCase()){
                                case "habitat":
                                System.out.println("Habitatnya di " + jerapah.getHabitat());
                                break;
                                case "kelompok":
                                System.out.println("Termasuk Kelompok Herbivora");
                                break;
                                case "cara berlindung":
                                System.out.println("Cara Berlindung "+ jerapah.getCaraBerlindung());
                                break;
                                default:
                                System.out.println("Masukkan Perintah: Habitat, Kelompok, Cara berlindung ");
                                break;
                            }
                            break;
                            case "zebra":
                            switch (inputs[0].toLowerCase()){
                                case "habitat":
                                System.out.println("Habitatnya di " + zebra.getHabitat());
                                break;
                                case "kelompok":
                                System.out.println("Termasuk Kelompok Herbivora");
                                break;
                                case "cara berlindung":
                                System.out.println("Cara Berlindung "+ zebra.getCaraBerlindung());
                                break;
                                default:
                                System.out.println("Masukkan Perintah: Habitat, Kelompok, Cara berlindung ");
                                break;
                            }
                            break;
                        }
                    }
                } // end if info
              
                if (inputs[0].equalsIgnoreCase("Cara")){
                    if (inputs[1].equalsIgnoreCase("berburu")){
                        switch(inputs[3].toLowerCase()){
                            case "harimau": System.out.println("Cara Berburu " + harimau.getCaraBerburu()); break;
                            case "komodo": System.out.println("Cara Berburu " + komodo.getCaraBerburu());break;
                            default: System.out.println("Yang berburu hanya Harimau dan komodo");break;
                        }
                    }
                    if (inputs[1].equalsIgnoreCase("berlindung")){
                        switch(inputs[3].toLowerCase()){
                            case "jerapah": System.out.println("Cara Berlindung " + jerapah.getCaraBerlindung()); break;
                            case "zebra": System.out.println("Cara Berlindung " + zebra.getCaraBerlindung()); break;
                            default:System.out.println("Hanya Hewan Herbivora saja yang memiliki cara berlindung! \n");break;
                        }
                    }
                }
                if (inputs[0].equalsIgnoreCase("Kelompok")){
                    switch(inputs[2].toLowerCase()){
                        case "harimau": System.out.println("Harimau Termasuk Ke dalam Kelompok Karnivora");break;
                        case "komodo": System.out.println("Harimau Termasuk Ke dalam Kelompok Karnivora");break;
                        case "beruang": System.out.println("Harimau Termasuk Ke dalam Kelompok Herbivora");break;
                        case "landak": System.out.println("Harimau Termasuk Ke dalam Kelompok Herbivora");break;
                        case "jerapah": System.out.println("Harimau Termasuk Ke dalam Kelompok Omnivora");break;
                        case "zebra": System.out.println("Harimau Termasuk Ke dalam Kelompok Omnivora");break;
                        default:
                        break;
                    }
                }
                if (inputs[0].equalsIgnoreCase("Habitat")){
                    switch(inputs[2].toLowerCase()){
                        case "harimau": System.out.println("Habitatnya di " + harimau.getHabitat()); break;
                        case "komodo": System.out.println("Habitatnya di " + komodo.getHabitat()); break;
                        case "beruang": System.out.println("Habitatnya di " + beruang.getHabitat()); break;
                        case "landak": System.out.println("Habitatnya di " + landak.getHabitat()); break;
                        case "jerapah": System.out.println("Habitatnya di " + jerapah.getHabitat()); break;
                        case "zebra": System.out.println("Habitatnya di " + zebra.getHabitat()); break;
                        default:
                        break;
                    }
                }
            }

            if (inputs[0].equalsIgnoreCase("Daftar")){
                    if (inputs[1].equalsIgnoreCase("hewan")){
                        System.out.println(
                            "Nama       Hewan       Jumlah\n"+
                            "Harimau    Karnivora   "+harimau.getJumlah()+"\n"+
                            "Komodo     Karnivora   "+komodo.getJumlah()+"\n"+
                            "Beruang    Omnivora    "+beruang.getJumlah()+"\n"+
                            "Landak     Omnivora    "+landak.getJumlah()+"\n"+
                            "Jerapah    Herbivora   "+jerapah.getJumlah()+"\n"+
                            "Zebra      Herbivora   "+zebra.getJumlah()+"\n"
                        );
                    }
                }
  
            if (inputs[0].equalsIgnoreCase("Bantuan")){
                System.out.println(
                "=========== Selamat Datang Di Menu Bantuan Kebun Binatang  ============ \n"+
                "===== Anda mengetik perintah Seperti yang ditetapkan di bawah ini ===== \n"+
                "=========================== Daftar Perintah hewan ===================== \n"+
                "hewan set {hewan} {total}          => Ubah Jumlah Hewan yang sudah ada\n"+
                "hewan tambah {hewan} {total}       => Tambah Jumlah Hewan yang sudah ada\n"+
                "Info Jumlah Hewan {hewan}          => Menampilkan Jumlah Hewan yang ada\n"+
                "Info MasaHidup Hewan {hewan}       => Menampilkan Masa Hidup hewan rata rata\n"+
                "Info Lokasi Hewan {hewan}          => Menampilkan Lokasi Kandang Hewan di Kebun Binatang\n"+
                "Info BiayaPerBulan Hewan {hewan}   => Menampilakan Info Biaya yang dihabiskan per bulan\n"+
                "Info JumlahStaff Hewan {Hewan}     => Untuk menampilkan jumlah staff yang bertugas untuk si hewan\n"+
                "Habitat hewan {hewan}              => Menampilkan Habitat Asli Dari hewan tersebut\n"+
                "Kelompok hewan {hewan}             => Menampilkan Kelompok hewan\n"+
                "CaraBerburu hewan  {hewan}         => Memberikan informasi cara berburu hewan\n"+
                "CaraBerlindung hewan  {hewan}      => Memberikan Informasi cara berlindung hewan khusus Herbivora\n"+
                "Daftar Hewan (Semua)               => Menampilkan semua Informasi Hewan di Kebun Binatang \n"+
                "=============================== Daftar Perintah Untuk Staff ===========================================\n"+
                "Tambah Staf                        => Menambah Staf baru\n"+
                "Daftar Staf                        => Menampilkan daftar staff\n"+
                "informasi Staff {nama staf}        => Menampilkan info staf secara detail\n"+
                "informasi Gaji Staff Bulan         => Menampilkan Jumlah Gaji perbulan Staf\n"+
                "======================================== Terimakasih ================================================ \n"
                );
            }
            
            if (inputs[0].equalsIgnoreCase("Tambah")){
                if(inputs[1].equalsIgnoreCase("Staf")) tambahDataStaff();
            }
           
            if (inputs[0].equalsIgnoreCase("Daftar")){
                if(inputs[1].equalsIgnoreCase("Staf")) listOrang();
            }
            
            if(inputs[0].equalsIgnoreCase("informasi")){
                if (inputs[1].equalsIgnoreCase("Staf")){
                    String value = "";
                    value = inputs[2];
                    Integer hasil = staf.cariStaffNama(value);
                    Orang panggil = staf.listOrang.get(hasil);
                    Staff kerjaan = staf.listStaff.get(hasil);
                    System.out.printf(
                        "Nama       : %s\n"+
                        "Umur       : %s\n"+
                        "Gender     : %s\n"+
                        "Jabatan    : %s\n"+
                        "Jobdesk    : %s\n"+
                        "Gaji       : %s\n"+
                        "Awal Kerja : %s\n"+
                        "Akhir Kerja: %s\n"+
                        "Status     : %s\n",
                        panggil.getNama(),
                        panggil.getUmur(),
                        panggil.getGender(),
                        kerjaan.getJabatan(),
                        kerjaan.getJobdesk(),
                        kerjaan.getGaji(),
                        kerjaan.getAwalKerja(),
                        kerjaan.getAkhirKerja(),
                        kerjaan.getStatus()
                    );
                } // if [1]staff
                if(inputs[1].equalsIgnoreCase("Gaji")){
                    if (inputs[2].equalsIgnoreCase("Staf")){
                        System.out.println("Informasi Gaji:\n");
                        for(int i = 0; i < staf.listOrang.size(); i++ ){
                            System.out.printf(
                                "%s. %s     %s\n",
                                i ,
                                staf.listOrang.get(i).getNama(),
                                staf.listStaff.get(i).getGaji()
                            );
                        }
                    }
                }

            }
        }// while kondisi
    }// main
    public static <T extends Animal> List<T> tambah(T object, List<T> list){
        list.add(object);
        return list;
    }

    public static void tambahDataStaff(){
        System.out.println("Silahakan Masukkan List dibawah ini:");
        System.out.print("Masukkan Nama anda: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan gender: ");
        String gender = scanner.nextLine();
        System.out.print( "Masukkan umur: ");
        String umurString = scanner.nextLine();
        Integer umur = Integer.parseInt(umurString);
            Orang orangbaru = Orang.tambahOrang(nama, umur, gender);
            staf.tambahOrang(orangbaru);
        System.out.println("++++++ Stafff ++++");
        System.out.print("Masukkan Jabatan: ");
        String jabatan = scanner.nextLine();
        System.out.print("Masukkan Jobdesk: ");
        String jobdesk = scanner.nextLine();
        System.out.print("Tanggal Awal Kerja DD-MM-YY: ");
        String awalKerja = scanner.nextLine();
        System.out.print("Tanggal Akhir Kerja DD-MM-YY: ");
        String akhirKerja = scanner.nextLine();
        System.out.print("Status saat ini 'aktif/nonaktif': ");
        String status = scanner.nextLine();
        System.out.print("Masukkan Nominal Gaji: Rp.");
        String gajiString = scanner.nextLine();
        Integer gaji = Integer.parseInt(gajiString);
            Staff staffbaru = Staff.buatStaff(jabatan, jobdesk, gaji, awalKerja, akhirKerja, status);
            staf.tambahStaff(staffbaru);
    }
    public static void listOrang(){
        staf.tampilkanSemua();
    }

}// class zoo

class StafList{
    public ArrayList<Staff> listStaff;
    public ArrayList<Orang> listOrang;
    public StafList (){
        this.listOrang = new ArrayList<Orang>();
        this.listStaff = new ArrayList<Staff>();
    }
    public boolean tambahOrang(Orang orang){
        listOrang.add(orang);
        return true;
    }
    public boolean tambahStaff (Staff staff) {
        listStaff.add(staff);
        return true;
    }
    public int cariStaffId(Staff staff){
        return this.listStaff.indexOf(staff);
    }
    public int cariStaffNama(String nama){
        for (int i = 0; i < listOrang.size(); i++){
            Orang orangs = this.listOrang.get(i);
            if (orangs.getNama().equals(nama)) return i;
        }
        return -1;
    }
    public void tampilkanSemua(){
        int i = 0;
        System.out.println("Staff List : ");
        for (Orang orang : listOrang) {
            i++;
            System.out.printf(
                "%s . %s %s %s\n", i , orang.getNama(),orang.getGender(), orang.getUmur()
            );
            
        }
    }
    
}






// ======================== Kelas Karnivora =========================
class Karnivora extends Animal {
    String caraBerburu;
    public Karnivora(String caraBerburu){
        this.caraBerburu = caraBerburu;
    }
    public String getCaraBerburu(){
        return caraBerburu;
    }
}
class Harimau extends Karnivora{
    public Harimau (){
        super("Mengejar");
        setJumlah(10);
        setLokasi("Kandang Harimau");
        setBiayaPerBulan(120000);
        setJumlahStaff(2);
        setHabitat("Alam Liar");
        setMaxUmur(10);
    }

    // Setter And Getter 
    // Audit Animal
    //1 . Jumlah 2. Lokasi 3. Biaya Per bulan 4. Jumlah Staff
}
class Komodo extends Karnivora{
    public Komodo(){
        super("Merayap");
        setJumlah(20);
        setLokasi("Kandang B");
        setBiayaPerBulan(200000);
        setJumlahStaff(3);
        setHabitat("Alam Liar");
        setMaxUmur(50);
    }

}
// ======================= end of class Karnivora ========================

class Omnivora extends Animal{
    String caraBernafas;
    public Omnivora (String caraBernafas){
        this.caraBernafas = caraBernafas;
    }
}

class Beruang extends Herbivora{
    public Beruang(){
        super("Paru-Paru Beruang");
        setJumlah(3);
        setLokasi("Kandang C");
        setBiayaPerBulan(2100000);
        setJumlahStaff(5);
        setHabitat("Alam Liar");
        setMaxUmur(10);
    }

}
class Landak extends Omnivora{
    public Landak(){
        super("Paru-Paru Landak");
        setJumlah(40);
        setLokasi("Kandang D");
        setBiayaPerBulan(400000);
        setJumlahStaff(6);
        setHabitat("Alam Liar");
        setMaxUmur(10);
    }
}
// ===================== End Of Class Omnivora =====================

class Herbivora extends Animal{
    String caraBerlindung;
    public Herbivora (String caraBerlindung){
        this.caraBerlindung = caraBerlindung;
    }
    public String getCaraBerlindung (){
        return caraBerlindung;
    }
}
class Jerapah extends Herbivora{
    public Jerapah (){
        super("Menggunakan Leher");
        setJumlah(15);
        setLokasi("Kandang E");
        setBiayaPerBulan(700000);
        setJumlahStaff(3);
        setHabitat("Alam Liar");
        setMaxUmur(10);
    }
}
class Zebra extends Herbivora{
    public Zebra () {
        super("Berlari");
        setJumlah(2);
        setLokasi("Kandang F");
        setBiayaPerBulan(700000);
        setJumlahStaff(3);
        setHabitat("Alam Liar");
        setMaxUmur(10);
    }

}


// ============================== Staff ===================================

class Staff {
    String jabatan;
    String jobdesk;
    int gaji;
    String awalKerja;
    String akhirKerja;
    String Status;

    public Staff (String jabatan, String jobdesk, int gaji, String awalKerja, String akhirKerja, String status) {
        this.jabatan = jabatan;
        this.jobdesk = jobdesk;
        this.gaji = gaji;
        this.awalKerja = awalKerja;
        this.akhirKerja = akhirKerja;
        this.Status = status;

    }
    public static Staff buatStaff(String jabatan, String jobdesk, int gaji, String awalKerja, String akhirKerja, String status){
        return new Staff(jabatan, jobdesk, gaji, awalKerja, akhirKerja, status);
    }

   

    public String getJabatan() {
        return this.jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJobdesk() {
        return this.jobdesk;
    }

    public void setJobdesk(String jobdesk) {
        this.jobdesk = jobdesk;
    }

    public int getGaji() {
        return this.gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getAwalKerja() {
        return this.awalKerja;
    }

    public void setAwalKerja(String awalKerja) {
        this.awalKerja = awalKerja;
    }

    public String getAkhirKerja() {
        return this.akhirKerja;
    }

    public void setAkhirKerja(String akhirKerja) {
        this.akhirKerja = akhirKerja;
    }

    public String getStatus() {
        return this.Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
}
class Orang{
    String gender;
    int umur;
    String nama;
    
    public Orang(String nama, int umur, String gender){
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
    }
    public static Orang tambahOrang(String nama, int umur, String gender){
        return new Orang(nama, umur, gender);
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getUmur() {
        return this.umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
class Shift{

    String jamKerja;
    String HariKerja;

    public String getJamKerja() {
        return this.jamKerja;
    }

    public void setJamKerja(String jamKerja) {
        this.jamKerja = jamKerja;
    }

    public String getHariKerja() {
        return this.HariKerja;
    }

    public void setHariKerja(String HariKerja) {
        this.HariKerja = HariKerja;
    }

}
class Presensi{

    String presence;
    String Date;

    public String getPresence() {
        return this.presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public String getDate() {
        return this.Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

}

