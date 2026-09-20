package com.web.java_dsa.javalearn.oop.firstLevel;

public class Product {
    private final int id;
    private final String name;
    private double price;
    private int quantity;

    public Product(int id,String name,double price,int quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price){
        if (price>0){
            this.price=price;
        } else {
            System.out.println("Narx manfiy bo'lishi mumkin emas");
        }
    }
    public void addStock(int amount){
        if (amount > 0){
            this.quantity += amount;
            System.out.println(amount + " ta mahsulot qo'shildi. Jami stock: " + this.quantity);
        } else {
            System.out.println("Qo'shilayotgan miqdor noldan katta bo'lishi kerak.");
        }
    }
    public void sellStock(int amount){
        if (amount > 0 && amount <= this.quantity){
            this.quantity -= amount;
            System.out.println(amount + " ta mahsulot sotildi. Qolgan stock: " + this.quantity);
        } else if (amount > this.quantity) {
            System.out.println("Omborda yetarli mahsulot yo'q! Hozirgi stock: " + this.quantity);
        } else {
            System.out.println("Sotilayotgan mahsulot xato kiritildi.");
        }
    }
    public double getTotalValue(){
        return this.price * this.quantity;
    }

    @Override
    public String toString(){
        return "Product={" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", totalValue=" + getTotalValue() + '}';
    }

    public static void main(String[] args) {
        // 3. Product
        //
        //Online shop uchun Product klassini yarating.
        //
        //id
        //name
        //price
        //quantity
        //
        //Quyidagi operatsiyalarni qo‘llab-quvvatlang:
        //
        //mahsulot narxini o‘zgartirish
        //stock qo‘shish
        //stockdan mahsulot sotish
        //umumiy stock qiymatini hisoblash
    }
}
