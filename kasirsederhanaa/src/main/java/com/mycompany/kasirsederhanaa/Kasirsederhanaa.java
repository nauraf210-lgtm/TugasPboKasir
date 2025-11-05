package com.mycompany.kasirsederhanaa;

import java.util.Scanner;

public class Kasirsederhanaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalBelanja = 0;
        double totalDiskon = 0;
        String struk = "\n=== Struk Pembayaran ===\n";
        boolean belanjaLagi = true;

        System.out.println("=== Program Kasir Sederhana ===");

        while (belanjaLagi) {
            System.out.println("\nPilih barang:");
            System.out.println("1. Shampoo - 20000");
            System.out.println("2. Sabun - 5000");
            System.out.println("3. Parfume - 3000");
            System.out.println("4. Pepsodent - 10000");

            System.out.print("Nomor barang: ");
            int pilih = input.nextInt();

            String nama = "";
            int harga = 0;

            if (pilih == 1) { nama="Shampoo"; harga=20000; }
            else if (pilih == 2) { nama="Sabun"; harga=5000; }
            else if (pilih == 3) { nama="Parfume"; harga=3000; }
            else if (pilih == 4) { nama="Pepsodent"; harga=10000; }
            else { System.out.println("Pilihan salah!"); continue; }

            System.out.print("Jumlah: ");
            int jumlah = input.nextInt();

            int total = harga * jumlah;
            double diskon = 0;

            if (total >= 100000) diskon = 0.10;
            else if (total >= 50000) diskon = 0.05;

            double bayarBarang = total - (total * diskon);

            struk += nama + " x " + jumlah + " = " + total + 
                     " | Diskon: " + (diskon*100) + "% | Bayar: " + bayarBarang + "\n";

            totalBelanja += total;
            totalDiskon += total * diskon;

            System.out.print("Beli barang lain? (y/n): ");
            char lagi = input.next().charAt(0);
            if (lagi != 'y' && lagi != 'Y') belanjaLagi = false;
        }

        double totalBayar = totalBelanja - totalDiskon;

        System.out.println(struk);
        System.out.println("Total Belanja: " + totalBelanja);
        System.out.println("Total Diskon : " + totalDiskon);
        System.out.println("Total Bayar  : " + totalBayar);

        System.out.print("Uang bayar: ");
        int bayar = input.nextInt();
        System.out.println("Kembalian   : " + (bayar - totalBayar));
        System.out.println("=== Terima Kasih Telah Berbelanja! ===");

        input.close();
    }
}