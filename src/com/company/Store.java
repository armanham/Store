package com.company;

import java.util.Scanner;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private int productNumber;

    public Store(int countOfWorkers, String name, String phoneNumber, int productNumber) {
        setCountOfWorkers(countOfWorkers);
        setName(name);
        setPhoneNumber(phoneNumber);
        setProductNumber(productNumber);
    }

    public Store() {

    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers >= 2 && countOfWorkers <= 50) {
            this.countOfWorkers = countOfWorkers;
        } else {
            System.out.println("Invalid count of workers!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number!");
        }
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        if (productNumber >= 0) {
            this.productNumber = productNumber;
        } else {
            System.out.println("Invalid number of product!");
        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "countOfWorkers=" + countOfWorkers +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", productNumber=" + productNumber +
                '}';
    }

    private void sellProduct() {

    }

    public void display() {
        int press = checkOrder();
        if (press == 1) {
            int countOfProductAfterSale = countOfProductAfterSale();
            if (countOfProductAfterSale >= 0) {
                System.out.println("Number of product after sale is: " + countOfProductAfterSale);
            } else {
                System.out.println("We do not have product");
            }
        }
    }

    private int checkOrder() {
        System.out.print("If you want to buy press 1, if you do not want to buy press any bottom: ");
        Scanner scanner = new Scanner(System.in);
        int press = scanner.nextInt();
        return press;
    }

    private int countOfProductAfterSale() {
        int countOfProductAfterSale = productNumber - 1;
        this.productNumber = countOfProductAfterSale;
        return countOfProductAfterSale;
    }
}
