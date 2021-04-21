package org.iesfm.company.composition;

import java.util.Objects;
import java.util.Set;

public class ProjectManager implements Position {
    private String team;
    private Set<String> projects;

    public ProjectManager(String team, Set<String> projects) {
        this.team = team;
        this.projects = projects;
    }

    @Override
    public String name() {
        return "Jefe de proyecto";
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Set<String> getProjects() {
        return projects;
    }

    public void setProjects(Set<String> projects) {
        this.projects = projects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectManager that = (ProjectManager) o;
        return Objects.equals(getTeam(), that.getTeam()) && Objects.equals(getProjects(), that.getProjects());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTeam(), getProjects());
    }
}
