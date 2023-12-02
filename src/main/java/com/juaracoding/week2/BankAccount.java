package com.juaracoding.week2;
import java.util.Scanner;


public class BankAccount {

    int acc_no;
    String name;
    double amount;

    public void setAccount(int a, String n, double amt) {
        this.acc_no = a;
        this.name = n;
        this.amount = amt;
    }


    public double deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
        return amount;
    }

    public double withdraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
        return amount;
    }

    public double checkBalance() {
        System.out.println("Balance is: " + amount);
        return amount;
    }

    public String display() {
        System.out.println("Account information: " +
                "\nAccount Number: " + acc_no +
                "\nName: " + name +
                "\nAmount: " + amount);
        return acc_no + " " + name + " " + amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter Account Number: ");
        int accNo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Initial Amount: ");
        double initialAmount = scanner.nextDouble();

        account.setAccount(accNo, name, initialAmount);

        account.display();

        System.out.print("Enter Deposit Amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        account.checkBalance();

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);
        account.checkBalance();

        scanner.close();
    }
}
