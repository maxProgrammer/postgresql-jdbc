package com.maxprogrammer.model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

    private static  final long serialVersionUID = 1L;

    private Integer departmentID;
    private String name;

    public Department() {
    }

    public Department(Integer departmentID, String name) {
        this.departmentID = departmentID;
        this.name = name;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentID, that.departmentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentID);
    }

    @Override
    public String toString() {
        return "Departments {" +
                "id=" + departmentID +
                ", name='" + name + '\'' +
                '}';
    }
}
