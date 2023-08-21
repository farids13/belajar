public class Jawaban1 {
    public static long toMilesPerHour(double kiloMetersPerHour) {
      return (long) (Math.round(kiloMetersPerHour * 0.621371)); // rumus 1km = 0,621371 mil dibulatkan
    }
    public static void printConversion(double kiloMetersPerHour){
        if (kiloMetersPerHour > 0){
        long bulatkanKiloMeters = Math.round(kiloMetersPerHour); // pembulatan angka terdekat
        System.out.println("====== Proses Konversi Dimulai ========");
        long toMilesPerHour = toMilesPerHour( kiloMetersPerHour );
        String tampil = String.format("   Jarak %s KM/h = %s Mil/h", bulatkanKiloMeters, toMilesPerHour);
        System.out.println(tampil);
        System.out.println("============= Proses Done ===========");
        // berfungsi mencetak nilai sebelum dan sesudah di konversi
        }
        else{
            System.out.println("Invalid Value");
        }
    } 
    public static void main(String[] args) {
    double jarakMotorSaya = 45.4;
    printConversion(jarakMotorSaya);
    }
}

