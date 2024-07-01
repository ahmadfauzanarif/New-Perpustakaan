/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fauzan.perpustakaan.perpustakaan;

/**
 *
 * @author D-15
 */
public class Main {
    public static void main(String[] args) {
        /*Perpustakaan perpustakaan = new PerpustakaanDigital();
        perpustakaan.pinjamBuku("Atomic Habbits");
        perpustakaan.kembalikanBuku("Psichology of money");
        perpustakaan.lihatDaftarBuku();
        */
        
        // Contoh penggunaan MemoryStorage
        DataStorage memoryStorage = new MemoryStorage1();
        memoryStorage.writeData("Data stored in memory");
        System.out.println("Memory storage: " + memoryStorage.readData());
        
        // Contoh penggunaan FileStorage
        DataStorage fileStorage = new FileStorage("data.txt");
        fileStorage.writeData("Data stored in file");
        System.out.println("File storage: " + fileStorage.readData());
        
        // Contoh penggunaan DatabaseStorage
        DataStorage databaseStorage = new DatabaseStorage("database.db");
        databaseStorage.writeData("Data stored in database");
        System.out.println("Database storage: " +databaseStorage.readData());
    }
}
