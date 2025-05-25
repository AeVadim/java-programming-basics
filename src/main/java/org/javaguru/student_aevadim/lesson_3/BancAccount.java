package org.javaguru.student_aevadim.lesson_3;

class BancAccount {

    private String owner;
    private int money;

    public BancAccount(int money) {
        this.money = money;
    }

    public BancAccount(String owner) {
        this.owner = owner;
        this.money = 0;
    }

    public BancAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money){
        this.money = money;
    }
}
