/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus3;

/**
 *
 * @author ASUS
 */
public class Kucing extends Hewan{
    String nama;
    String warna;

    @Override
    public void move(){
        System.out.println("Kucing bisa berjalan dan berlari");
    }
    
    public void identitas(String nama){
        this.nama = nama;
    }
    
    public void identitas(String nama, String warna){
        this.nama = nama;
        this.warna = warna;
    }
    
    public void cetakIdentitas(){
        System.out.println("Nama : " + nama);
        System.out.println("Warna : " + warna);
    }
    
    public static void main(String[] args) {
        Kucing kucingku = new Kucing();
        
        kucingku.identitas("Kemed");
        kucingku.cetakIdentitas();
        kucingku.move();
        
        System.out.println("====================================\n");
        
        Kucing kucingkamu = new Kucing();
        kucingkamu.identitas("Kemed","Putih");
        kucingkamu.cetakIdentitas();
        kucingkamu.move();
    }
}
