import java.util.ArrayList;


public class SimpleMobilePhone_Answer_2 {
      public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("000 456 996");
        Contacts contact = Contacts.createContact("farid", "0895358496255");
        mobilePhone.addNewContact(contact);
        
        mobilePhone.printContacts();
    }
}

class MobilePhone {
    public  String myNumber;
    public ArrayList<Contacts> myContacts;
    
    // constructor
    public MobilePhone(String mynumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }
    public boolean addNewContact(Contacts contact){
        // sebelum itu kita cek terlebih dahulu kontak tersedia apa tidak
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Kontak sudah ada");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateNewContact(Contacts oldContact, Contacts newContact){
        int temukanPosisi = findContact(oldContact);
        if (temukanPosisi <= 0){
            System.out.println(oldContact.getName()+ "Tidak Ditemukan");
            return false;
        }
        this.myContacts.set(temukanPosisi, newContact);
        System.out.println(oldContact.getName() + "Sudah digantikan dengan" + newContact.getName());
        return true;
    }
    public boolean removeContact(Contacts contact) {
        int temukanPosisi = findContact(contact);
        if(temukanPosisi <= 0){
            System.out.println(contact.getName() + "Tidak Ditemukan");
            return false;
        }
        this.myContacts.remove(temukanPosisi);
        System.out.println(contact.getName() + "Siap Boss sudah terhapus");
        return true;
    }
    public int findContact(Contacts contacts){
        return this.myContacts.indexOf(contacts);
    }
    public int findContact(String contactName){
        for(int i = 0; i < myContacts.size(); i++){
            // membuat object sementara dan bandingkan
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contactName)); return i;
        }
        return -1;
    }
    public String queryContact(Contacts contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }
    public Contacts queryContact(String name) {
        int posisi = findContact(name);
        if (posisi >= 0){
            return this.myContacts.get(posisi);
        }
        return null;
    }
    
    public void printContacts(){
        System.out.println("Contact List: ");
        for(int i = 0; i < this.myContacts.size(); i++){
            System.out.println((i+1)+ " ." + this.myContacts.get(i).getName()+ " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}

class Contacts{
    String name;
    String phoneNumber;

    public Contacts (String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    // memanggil constructor di dalam method ini
    public static Contacts createContact(String name, String phoneNumber){
        return new Contacts(name, phoneNumber);
    }
}