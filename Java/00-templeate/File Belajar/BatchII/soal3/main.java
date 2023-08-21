package BatchII.soal3;

class palindrom {
    static void cekPalindromDuaKata(String kata1, String kata2){
        String pali = "", kataAwal; 
        char c;      
        int jumKata1 = kata1.length();
        int jumKata2 = kata2.length();
        kataAwal = kata1+kata2;
        for(int i = jumKata2 ; i > 0; i--){
            c = kata2.charAt(i - 1);
            pali += String.valueOf(c);
        }
        for(int i = jumKata1; i > 0 ;i--){
            c = kata1.charAt(i-1);
            pali += String.valueOf(c);
        }
        if (kataAwal.equalsIgnoreCase(pali)){
            System.out.println("Kata '"+kata1+" "+kata2+"' merupakan Palindrom");
        }else{
            System.out.println("Kata '"+kata1+" "+kata2+"' bukan Palindrom");
        }
    }
    public static void main(String[] args) {
        String kata1 = "Kasur Rusak";
        String kata2 = "Rusak Kasur";
        String kata3 = "Marah";
        String kata4 = "Haram";
        cekPalindromDuaKata(kata1, kata2);
        cekPalindromDuaKata(kata3, kata4);
    }
}
