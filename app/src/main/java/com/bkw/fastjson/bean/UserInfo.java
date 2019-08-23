package com.bkw.fastjson.bean;

public class UserInfo {

    private int age;
    private String name;
    private boolean superme;
    private double money;

    @Override
    public String toString() {
        return "UserInfo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", superme=" + superme +
                ", money=" + money +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSuperme() {
        return superme;
    }

    public void setSuperme(boolean superme) {
        this.superme = superme;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
