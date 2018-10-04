/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikum.Abstract;

/**
 *
 * @author Asus
 */
public class Abstractsample {
    public static void main(String[] args){
        System.out.println("Faradila Rahmandasari / XR6 / 22");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        bangunDatar obyek1 = new bujurSangkar(10);
        
        System.out.println("Luas bujur sangkar dengan sisi 10 = " + obyek1.hitungLuas());
        System.out.println("Kelilingnya = " + obyek1.hitungKeliling());
        System.out.print("\n");
        
        bangunDatar obyek2 = new Lingkaran(7);
        
        System.out.println("Luas Lingkaran dengan jari-jari 7 = " + obyek2.hitungLuas());
        System.out.println("Kelilingnya = " + obyek2.hitungKeliling());
    }
}
