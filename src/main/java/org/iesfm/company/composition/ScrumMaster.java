package org.iesfm.company.composition;

import java.util.Objects;
import java.util.Set;

public class ScrumMaster implements Position {
    private Set<String> teams;

    public ScrumMaster(Set<String> teams) {
        this.teams = teams;
    }

    @Override
    public String name() {
        return "Scrum master";
    }

    public Set<String> getTeams() {
        return teams;
    }

    public void setTeams(Set<String> teams) {
        this.teams = teams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScrumMaster that = (ScrumMaster) o;
        return Objects.equals(getTeams(), that.getTeams());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTeams());
    }
}
