import java.util.ArrayList;
import java.util.List;

public class TampilData{
    List<Barang> tampung;
    public TampilData(){
         tampung = new ArrayList<Barang>();
    }
    public void isiData (int id, String kodeBarang, String namaBarang){
        tampung.add(new Barang(id,kodeBarang,namaBarang));
    }
    public void showData(){
        for(Barang baru : tampung)
        System.out.printf("No %s kode %s nama %s", baru.getId(), baru.getKodeBarang(), baru.getNamaBarang() );
    }

    public static void main(String[] args) {
        TampilData td = new TampilData();
        td.isiData(01, "001", "Sepeda");
        td.showData();
    }
}

class Barang {
    int id;
    String kodeBarang, NamaBarang;

    public Barang(int id, String kodeBarang, String namaBarang){
        this.id = id;
        this.kodeBarang = kodeBarang;
        this.NamaBarang = namaBarang;
    }
    public int getId(){
        return id;
    }
    public String getKodeBarang(){
        return kodeBarang;
    }
    public String getNamaBarang(){
        return NamaBarang;
    }
}


