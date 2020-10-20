package org.example.model;

import java.util.List;

public class Person {

    private int id;
    private String name;
    private Address address;

    public List<String> getSports() {
        return sports;
    }

    public void setSports(List<String> sports) {
        this.sports = sports;
    }

    private List<String> sports;

    public Person(int id, String name, Address address, List<String> sports ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.sports = sports;
    }
    Person(){}

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }




    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + " "+
                " sports = [ " + String.join(",", sports) + "] " +
                address + "\n"+
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
