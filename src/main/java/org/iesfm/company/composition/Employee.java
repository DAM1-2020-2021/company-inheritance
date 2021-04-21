package org.iesfm.company.composition;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int workedHours;
    private Position position;

    public Employee(int id, String name, String surname, int workedHours, Position position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.workedHours = workedHours;
        this.position = position;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() && getWorkedHours() == employee.getWorkedHours() && Objects.equals(getName(), employee.getName()) && Objects.equals(getSurname(), employee.getSurname()) && Objects.equals(getPosition(), employee.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getWorkedHours(), getPosition());
    }
}
