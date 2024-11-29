package com.amit.book.inventory;

import com.amit.book.inventory.model.BookInfo;
import com.amit.book.inventory.model.InventoryInfo;
import com.amit.book.inventory.model.StoreInfo;
import com.amit.book.inventory.service.BookService;
import com.amit.book.inventory.service.InventoryService;
import com.amit.book.inventory.service.StoreService;

public class BookStoreInventorySystem {

    public static void main(String[] args) {

        System.out.println("Welcome to the Book Store Inventory System");

        BookService bookService = new BookService();
        BookInfo books = bookService.acceptingBookInfo();

        StoreService storeService = new StoreService();
        StoreInfo store = storeService.acceptingStoreInfo();

        InventoryService invService = new InventoryService();
        InventoryInfo info = invService.acceptingInventory();

        //print the data
        System.out.println("Books Information :: " +books);
        System.out.println("Store Information :: " +store);
        System.out.println("Book Invntory Information :: " +info);


    }
}
