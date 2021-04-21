package org.iesfm.company.composition;

import java.util.Objects;
import java.util.Set;

public class Programmer implements Position {
    public static final String PROGRAMMER = "Programador";
    private String team;
    private Set<String> languages;

    public Programmer(String team, Set<String> languages) {
        this.team = team;
        this.languages = languages;
    }

    @Override
    public String name() {
        return PROGRAMMER;
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
        Programmer that = (Programmer) o;
        return Objects.equals(getTeam(), that.getTeam()) && Objects.equals(getLanguages(), that.getLanguages());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTeam(), getLanguages());
    }
}
