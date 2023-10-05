package com.aditya.motorcrud.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "motors")
public class Motors {
    // define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "Depth")
    private String Depth;

    @Column(name = "Type")
    private String Type;

    //define constructors

    public Motors(){

    }

    public Motors(String firstName, String lastName, String depth, String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        Depth = depth;
        Type = type;
    }


    //define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepth() {
        return Depth;
    }

    public void setDepth(String depth) {
        Depth = depth;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }


    //define toString


    @Override
    public String toString() {
        return "Motors{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Depth='" + Depth + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
