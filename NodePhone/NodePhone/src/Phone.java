/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lmnhn
 */
public class Phone {
     int ID;
     String Name;
     double price;
    int amount;
     int year; //year of production

    public Phone() {
    }

    public Phone(int ID, String Name, double price, int amount, int year) {
        this.ID = ID;
        this.Name = Name;
        this.price = price;
        this.amount = amount;
        this.year = year;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" + "ID=" + ID + ", Name=" + Name + ", price=" + price + ", amount=" + amount + ", year=" + year + '}';
    }
    
}

