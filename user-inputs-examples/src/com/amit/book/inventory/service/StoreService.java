package com.amit.book.inventory.service;

import com.amit.book.inventory.model.BookInfo;
import com.amit.book.inventory.model.StoreInfo;

import java.util.Scanner;

public class StoreService {

    public StoreInfo acceptingStoreInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter store id");
        int storeID = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter store name");
        String storeName = scanner.nextLine();

        System.out.println("Enter shelf location");
        String shelfLocation = scanner.nextLine();

        System.out.println("Enter shelf number");
        int shelfNo = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter rack number");
        int rackNo = Integer.parseInt(scanner.nextLine());


        // initialize entities
        StoreInfo store = new StoreInfo();

        store.storeID = storeID;
        store.storeName = storeName;
        store.shelfLocation = shelfLocation;
        store.shelfNo = shelfNo;
        store.rackNo = rackNo;

        return store;
    }
}
