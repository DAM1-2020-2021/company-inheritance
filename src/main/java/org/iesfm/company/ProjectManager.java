package org.iesfm.company;

import java.util.Objects;
import java.util.Set;

public class ProjectManager extends Employee {
    private String team;
    private Set<String> projects;

    public ProjectManager(int id, String name, String surname, int workedHours, String team, Set<String> projects) {
        super(id, name, surname, workedHours);
        this.team = team;
        this.projects = projects;
    }

    @Override
    protected void showSpecificInfo() {
        System.out.println("Equipo: " + team);
        System.out.println("Proyectos: ");
        for(String proyect: projects){
            System.out.println(proyect);
        }
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
        if (!super.equals(o)) return false;
        ProjectManager that = (ProjectManager) o;
        return Objects.equals(getTeam(), that.getTeam()) && Objects.equals(getProjects(), that.getProjects());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTeam(), getProjects());
    }
}
