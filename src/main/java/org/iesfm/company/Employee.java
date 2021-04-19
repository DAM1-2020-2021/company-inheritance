package org.iesfm.company;

import java.util.Objects;

public abstract class Employee {
    private int id;
    private String name;
    private String surname;
    private int workedHours;

    public Employee(int id, String name, String surname, int workedHours) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.workedHours = workedHours;
    }

    public void logWork(int hours) {
        workedHours += hours;
    }

    public void info() {
        System.out.println("Datos del empleado:");
        System.out.println("Id de empleado: " + id);
        System.out.println("Nombre y apellidos: " + name + " " + surname);
        System.out.println("Horas trabajadas: " + workedHours);
        showSpecificInfo();
    }

    protected abstract void showSpecificInfo();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() && getWorkedHours() == employee.getWorkedHours() && Objects.equals(getName(), employee.getName()) && Objects.equals(getSurname(), employee.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getWorkedHours());
    }
}
