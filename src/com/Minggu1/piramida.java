package com.Minggu1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class piramida {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\WINDOWS 10\\Java\\Tutorial\\src\\nim.txt");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            int[] nim = {2, 1, 4, 1, 7, 6, 2, 1, 0, 1};
            int a = 0, b = 4;
            
            int i = 1;
            do {
                int j = 4;
                do {
                    bw.write(" ");
                    System.out.print(" ");
                    j--;
                } while (j >= i);

                int k = 1;
                do {
                    String num = String.valueOf(nim[a]);
                    bw.write(num + " ");
                    System.out.print(nim[a] + " ");
                    a++;
                    k++;
                } while (k <= i);

                bw.newLine();
                System.out.println();
                i++;
            } while (i <= b);
            
        }catch(FileNotFoundException ex){
            //Menampilkan pesan jika file tidak ditemukan
            System.out.println("File "+file.getName()+" Tidak Ditemukan"); 
        }catch(IOException ex){
            //Menampilkan pesan jika terjadi error atau file tidak dapat dibaca
            System.out.println("File "+file.getName()+" Tidak Dapat DIbaca");
        }
    }
}
