package org.example;
import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Codelab1 {
    public static void main(String[] args) {
        String nama;
        String jenisKelamin;
        Scanner scan = new Scanner(System.in);

        System.out.print("Nama: ");
        nama = scan.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        jenisKelamin = scan.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String umurLahir = scan.nextLine();




        System.out.println("Nama: " + nama);

        if(jenisKelamin.equalsIgnoreCase("L")) {
            System.out.println("Jenis Kelamin : Laki-laki");
        } else if (jenisKelamin.equalsIgnoreCase("P")){
            System.out.println("Jenis Kelamin : Perempuan");
        } else {
            System.out.println("Tidak ada");
        }

        LocalDate umur = LocalDate.parse(umurLahir);

        LocalDate umurSekarang = LocalDate.now();

        Period periode = Period.between(umur, umurSekarang);

        System.out.println("Umur Anda: " + periode.getYears() + " tahun " + periode.getMonths() + " bulan ");



    }
}