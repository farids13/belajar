package Animal;

public class AuditAnimal {
    int jumlah;
    String lokasi;
    int biayaPerBulan;
    int jumlahStaff;

    public AuditAnimal(){

    }



    // ++++++++ setter and getter ++++++++
    public int setJumlah(Integer jumlah){
        return this.jumlah = jumlah;
    }
    public Integer getJumlah(){
        return jumlah;
    }
    public String setLokasi(String lokasi){
        return this.lokasi = lokasi;
    }
    public String getLokasi(){
        return lokasi;
    }
    public int setBiayaPerBulan(Integer biayaPerBulan){
        return this.biayaPerBulan = biayaPerBulan;
    }
    public int getBiayaPerBulan(){
        return biayaPerBulan;
    }
    public int setJumlahStaff(Integer jumlahStaff){
        return this.jumlahStaff = jumlahStaff;
    }
    public int getJumlahStaff(){
        return this.jumlahStaff;
    }
}
