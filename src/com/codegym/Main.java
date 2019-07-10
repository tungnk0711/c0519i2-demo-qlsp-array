package com.codegym;

import com.codegym.controller.ProductController;
import com.codegym.model.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int choice;
        do {
            menu();
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap vao lua chon:");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    ProductController productController = new ProductController();
                    Product[] listProduct = productController.findAll();
                    for (int i = 0; i < listProduct.length; i++) {
                        if (listProduct[i] != null) {
                            System.out.println("ID: " + listProduct[i].getId() + " NAME: " + listProduct[i].getName());
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Them moi");
                    break;
                }

            }
        } while (choice != 0);
    }


    public static void menu() {
        System.out.println("\n");
        System.out.println("-----Quan ly san pham-----");
        System.out.println("1. Hien thi san pham");
        System.out.println("2. Them san pham");
        System.out.println("0. Thoat");
    }
}
