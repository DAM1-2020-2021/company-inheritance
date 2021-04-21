package org.iesfm.company.inheritance;

import java.util.Objects;
import java.util.Set;

public class Programmer extends Employee {
    private String team;
    private Set<String> languages;

    public Programmer(int id, String name, String surname, int workedHours, String team, Set<String> languages) {
        super(id, name, surname, workedHours);
        this.team = team;
        this.languages = languages;
    }

    @Override
    protected void showSpecificInfo() {
        System.out.println("Equipo: " + team);
        System.out.println("Lenguajes de programación: ");
        for (String language: languages) {
            System.out.println(language);
        }
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Set<String> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<String> languages) {
        this.languages = languages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programmer that = (Programmer) o;
        return Objects.equals(getTeam(), that.getTeam()) && Objects.equals(getLanguages(), that.getLanguages());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTeam(), getLanguages());
    }
}
