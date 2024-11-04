/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/*Nama :veri ajie saputra
 *KELAS:pbo
 *NIM  :23215017
 * 
 */
import java.util.Scanner;

public class Latihan_19_SaldoTabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan saldo awal: Rp. ");
        double saldoAwal = input.nextDouble();
        
        System.out.print("Masukkan bunga per bulan (%): ");
        double bunga = input.nextDouble();
        
        System.out.print("Masukkan lama (bulan): ");
        int lama = input.nextInt();

        // Menghitung saldo setiap bulan
        double saldo = saldoAwal;
        for (int i = 1; i <= lama; i++) {
            saldo += saldo * (bunga / 100);
            System.out.printf("Saldo di bulan ke-%d: Rp.%.0f\n", i, saldo);
        }
    }
}

