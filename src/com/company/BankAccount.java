package com.company;

public class BankAccount {
    private double amount;
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public void Deposit (double sum) throws LimitException {
        amount += sum;
        System.out.println("Вы пополнили счет на " + (int) getAmount() + "com");
    }
    public void WithDraw (int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("операция недоступна, недос средств на счету", amount);
        }else {
            amount -= sum;
        }
        System.out.println("Вы сняли: " + sum + " Сом" + " Остаток на счету: " + amount);
    }


}
