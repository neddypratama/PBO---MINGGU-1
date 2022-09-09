package com.Minggu1;

public class Jumlah {
    public static void main(String[] args) {
        int[] nim = {2, 1, 4, 1, 7, 6, 2, 1, 0, 1};

        int jumlah = 0;

        for(int i = 0; i < nim.length; i++) {
            jumlah += nim[i];
        }

        System.out.println("Jumlah NIM adalah " + jumlah);
    }
}
