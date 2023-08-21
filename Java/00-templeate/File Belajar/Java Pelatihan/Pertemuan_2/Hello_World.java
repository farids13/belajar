public class Hello_World{
    // public artinya modifier ingat MODIFIER
    // class ini menandakan si Hello_Wolrd (Nama Classnya)
    public static void main(String[] args) {
        // void = artinya tidak me return apapun.
        //(String[] args) itu sebuah argumen yang pasti disitu dan gak bisa seali itu
        System.out.println("Hello_world");
        // System jalankan out terus print kan stringnya

        // variable, data type numeric()
        int myNumber = 20;
        System.out.println("Nomor Saya Adalah : " + myNumber);
        
        //========= Primitive type ===================
        //ingat String Bukan primitive type kenapa
        // karena primitive type adalah tipe data paling dasar
        
        // byte, Byte, short, int, long = bilangan bulat
        // java tidak bisa di unsigned
        // cara mengatahui berapa bit dari setiap tipe data (size)nya yaitu menggunakan dibawah ini
        System.out.println(Short.MAX_VALUE);

        // casting itu merubah atau menconvert tipe data
        long myCastedLong = 123123;
        int myCastingInt = (int) myCastedLong; //bisa gini
        int myCastingInt1 = (byte) 100L;// bisa gini L artinya itu maksa nilai untuk tipe data Long
        System.out.println(myCastingInt1);

        // char tidak sama dengan string

        // null itu bukan 0 null itu kosong tidak berisi
        Integer myIntegerNull = null;
        if (myIntegerNull == null){
            myIntegerNull = 10;
        }

        //  ================== Tenary operator ================================
        // Tenary Operator Logika sederhana yang bisa jalan satu perintah saja

        myIntegerNull = myIntegerNull > 10 ? 10 : myIntegerNull;
        // nama variable = perintah 1 logic perintah2 ?(apakah) true : false ;
    }
    
}