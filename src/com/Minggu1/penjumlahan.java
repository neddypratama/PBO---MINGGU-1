package com.Minggu1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class penjumlahan {
    public static void main(String[] args) {
        String fileName = "src/number.txt";
        int jumlah = 0;
        int number;

        try {
            //membaca file
            File myFile = new File(fileName);
            Scanner readFile = new Scanner(myFile);

            //penjumlahan isi file
            while(readFile.hasNextLine()) {
                String data = readFile.nextLine();
                number = Integer.parseInt(data);
                jumlah += number;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Jumlah NIM adalah " + jumlah);
    }
}
