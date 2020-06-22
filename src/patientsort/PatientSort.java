/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientsort;

import java.util.ArrayList;

/**
 *
 * @author 92020362
 */
public class PatientSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Name: Joe, Days In Hospital: 5, Department Name: Ortho
        Name: Jane, Days In Hospital: 3, Department Name: Paediatrics
        Name: Harry, Days In Hospital: 6, Department Name: Paediatrics
        Name: Keizer, Days In Hospital: 2, Department Name: Paediatrics
        Name: Keith, Days In Hospital: 1, Department Name: Ortho
        Name: Ben, Days In Hospital: 1, Department Name: Ortho
        Name: Sara, Days In Hospital: 5, Department Name: Paediatrics
         */
        
        
        //Write an optimised bubble sort that outputs the names of patients in ascending order of days spent in hospital.

        PatientSort patSort = new PatientSort();
        
        //ArrayList<Patient> patients = new ArrayList<>();
        
        Patient patients[] = {
            new Patient("Joe", 5, "Ortho"),
            new Patient("Jane", 3, "Paediatrics"),
            new Patient("Harry", 6, "Paediatrics"),
            new Patient("Keizer", 2, "Paediatrics"),
            new Patient("Keith", 1, "Ortho"),
            new Patient("Ben", 1, "Ortho"),
            new Patient("Sara", 5, "Paediatrics")
        };
        
        System.out.println("The unsorted list of Patients:");
        patSort.doPrintArray(patients);
        
        patSort.doPatientSort(patients);
        System.out.println("The sorted list of Patients:");
        patSort.doPrintArray(patients);
        
    }
    
    public void doPatientSort(Patient list[]){
        
        int lastSwap = list.length - 1;

        for (int i = 1; i < list.length; i++) {
            boolean is_sorted = true;
            int currentSwap = -1;

            for (int j = 0; j < lastSwap; j++) {

                if (list[j].getDaysSpentInHospital() > list[j + 1].getDaysSpentInHospital()) {
                    Patient temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    is_sorted = false;
                    currentSwap = j;

                }
            }

            if (is_sorted) {
                return;
            }
            lastSwap = currentSwap;
        }
        
    }
    
    public void doPrintArray(Patient list[]){
        for (Object each : list) {
            System.out.println(each);
        }
        System.out.println();
        System.out.println();
    }
    
}
