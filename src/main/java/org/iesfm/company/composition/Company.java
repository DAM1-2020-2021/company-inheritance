package org.iesfm.company.composition;


import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public List<Employee> getProgrammers() {
        List<Employee> programmers = new LinkedList<>();
        for(Employee employee: employees) {
            if(employee.getPosition() instanceof  Programmer){
//          if(employee.getPosition().name().equals(Programmer.PROGRAMMER)){
                programmers.add(employee);
            }
        }
        return programmers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(getName(), company.getName()) && Objects.equals(getEmployees(), company.getEmployees());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmployees());
    }
}
