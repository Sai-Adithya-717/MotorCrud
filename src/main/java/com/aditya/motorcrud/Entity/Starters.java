package com.aditya.motorcrud.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "starters")
public class Starters {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Brand")
    private String Brand;

    @Column(name = "Type")
    private String Type;

    public Starters(){

    }

    public Starters(String name, String brand, String type) {
        this.Name = name;
        this.Brand = brand;
        Type = type;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Starters{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Brand='" + Brand + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
