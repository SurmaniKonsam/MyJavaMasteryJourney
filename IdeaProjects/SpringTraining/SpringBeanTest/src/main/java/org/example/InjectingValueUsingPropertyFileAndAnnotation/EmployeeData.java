package org.example.InjectingValueUsingPropertyFileAndAnnotation;

import org.example.Service.BioData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("injectingValues")
public class EmployeeData implements BioData {

    @Value("${employee.name}")
    private String name;
    @Value("${employee.age}")
    private int age;

    @Value("${employee.designation}")
    private String designation;

    @Value("${employee.gender}")
    private String gender;

    @Value("${employee.workLocation}")
    private String workLocation;

    @Value("${employee.companyName}")
    private String companyName;

    @Override
    public String getData(){
        return "Employee name: "+this.name+" age: "+this.age+" designation:"+this.designation+" workLocation:"+this.workLocation+
                " companyName:"+this.companyName;
    }

}
