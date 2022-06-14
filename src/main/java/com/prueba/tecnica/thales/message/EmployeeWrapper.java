package com.prueba.tecnica.thales.message;

import com.prueba.tecnica.thales.model.Employee;

import java.util.List;

public class EmployeeWrapper {

    List<Employee> data;


    public List<Employee> getData() {
        return data;
    }

    public void setData(List<Employee> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "EmployeeWrapper{" +
                "data=" + data +
                '}';
    }
}
