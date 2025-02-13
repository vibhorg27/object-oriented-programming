package com.bridgelabz.inheritance;

// Creating an interface
interface Worker{

//    Create an abstract method
    public void performDuties();
}

// Parent class
class Persons{
    protected String name;
    protected String id;


    public Persons(String name, String id){
        this.name = name;
        this.id = id;
    }
}

// Chef subclass that extends parents and implements worker interface
class Chef extends Persons implements Worker {
    private String dish;
    public Chef(String name, String id, String dish){
        super(name, id);
        this.dish = dish;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Cooks " + dish);
    }
}

// Waiter subclass that extends parents and implements worker interface
class Waiter extends Persons implements Worker{
    private int tableNumber;
    public Waiter(String name, String id, int tableNumber){
        super(name, id);
        this.tableNumber = tableNumber;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter serves on table " + tableNumber);
    }
}

// Main class
public class RestaurantSystem {
    public static void main(String[] args) {
        Persons persons = new Persons("Arnav", "C001");

        Chef chef = new Chef("Vibhor", "R004", "Butter Chicken");
        chef.performDuties();

        Waiter waiter = new Waiter("Mayank", "RT60", 3 );
        waiter.performDuties();
    }
}
