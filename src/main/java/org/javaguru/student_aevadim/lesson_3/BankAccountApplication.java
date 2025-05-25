package org.javaguru.student_aevadim.lesson_3;

import java.util.Scanner;

class BankAccountApplication {

    public static void main(String[] args){
        BancAccount bancAccount1 = new BancAccount("Vasja", 1);
        BancAccount bancAccount2 = new BancAccount("Petja", 2);
        BancAccount bancAccount3 = new BancAccount("Tanja", 3);

        BancAccount bancAccount4 = new BancAccount("Sanita");
        BancAccount bancAccount5 = new BancAccount("Didzis");

        BancAccount bancAccount6 = new BancAccount(100);
        BancAccount bancAccount7 = new BancAccount(200);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter owner: ");
        String owner = scanner.nextLine();

        System.out.println("Enter money: ");
        int money = scanner.nextInt();

        BancAccount bancAccount8 = new BancAccount(owner, money);

        String owner1 = bancAccount8.getOwner();
        System.out.println("BA 8 Owner: " + owner1);

        System.out.println("BA 1 Owner: " + bancAccount1.getOwner());
        System.out.println("BA 2 Owner: " + bancAccount2.getOwner());
        System.out.println("BA 3 Owner: " + bancAccount3.getOwner());

        System.out.println("BA 3 Money: " + bancAccount3.getMoney());
        System.out.println("BA 2 Money: " + bancAccount2.getMoney());
        System.out.println("BA 1 Money: " + bancAccount1.getMoney());

        bancAccount3.setMoney(187765);
        bancAccount5.setMoney(999999);

        System.out.println("BA 3 Money: " + bancAccount3.getOwner());
        System.out.println("BA 5 Money: " + bancAccount5.getOwner());


    }


}
