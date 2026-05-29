package model;

public class Transaction {
    private double amount;
    private String type;
    private String date;
    private String category;
    private String description;

    public Transaction(double amount, String type, String date, String category, String description){
        if(amount < 0){
            throw new IllegalArgumentException("amount cannot be less than 0");
        }
        this.amount = amount;
        this.type =type;
        this.date = date;
        this.category = category;
        this.description = description;
    }

//    public Transaction() {
//
//    }

    //GETTERS - these allow us to access the fields since they are private
    public double getAmount(){
        return amount;
    }

    public String getType(){
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getCategory(){
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(double amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("amount cannot be less than 0");
        }
        this.amount = amount;
    }

    @Override
    public String toString() {
        return getDate() + " | " + getType() + " | " + getCategory() + " | " + getAmount() + " | " + getDescription();
    }



}