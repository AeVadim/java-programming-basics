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

    }


}
