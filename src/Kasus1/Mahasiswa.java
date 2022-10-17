package Kasus1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Mahasiswa extends Manusia{
    private String nim;
    private float ipk;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
    
    //overloading dibedakan dari tipe data, jumlah dan urutan parameter
    //method belajar tanpa parameter
    public void belajar(){
        this.ipk += 0.1;
        System.out.println("IPK " + this.nama + " meningkat 0.1 menjadi " + this.ipk);
    }
    
    //method belajar dengan 1 parameter 
    public void belajar(float lama){
        this.ipk += (lama/50);
        System.out.println(this.nama + " belajar selama " + lama + " jam.");
    }
    
    //method belajar dengan 2 parameter
    public void belajar(float lama, String pengajar){
        this.ipk += (lama/20);
        System.out.println(this.nama + " diajar oleh " + pengajar + " selama " + lama + " jam.");
    }
    
    //overriding isi method berbeda
    public void rename (String nama){
        System.out.println(this.nama + " berganti nama menjadi MAHASISWA " + nama);
        this.nama = nama;
    }
    
    //Mainnya disini
    public static void main(String[] args) {
        Manusia tata = new Manusia();
        
        Mahasiswa dina = new Mahasiswa();
        
        //tes atribut
        tata.setNama("Tata");
        tata.setUmur(19);
        
        dina.setNama("Dina");
        dina.setNim("20210040006");
        dina.setUmur(21);
        dina.setIpk((float)3.4);
        
        //gunakan metod belajar hasil overloading
        dina.belajar();
        System.out.println(dina.getNama() + " memiliki  IPK " + dina.getIpk());
        System.out.println("===============================================\n");
        
        dina.belajar(5);
        System.out.println(dina.getNama() + " memiliki  IPK " + dina.getIpk());
        System.out.println("===============================================\n");
        
        dina.belajar(4, "Restu");
        System.out.println(dina.getNama() + " memiliki  IPK " + dina.getIpk());
        System.out.println("===============================================\n");
        
        //overriding
        dina.rename("Ai Dina Agustin");
        System.out.println("===============================================\n");
        tata.rename("Rere Bumi");
    }
}
