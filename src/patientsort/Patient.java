/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientsort;

/**
 *
 * @author 92020362
 */
public class Patient {
    String name;
    int daysSpentInHospital;
    String departmentName;
    
    public Patient(String patientName, int hospitalDays, String deptName){
        this.name = patientName;
        this.daysSpentInHospital = hospitalDays;
        this.departmentName = deptName;
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getDaysSpentInHospital() {
        return daysSpentInHospital;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }
    
    public String toString(){
        return "Name: " + name + ", Days in Hospital: " + daysSpentInHospital + ", Department Name: " + departmentName;
    }
    
    
}
