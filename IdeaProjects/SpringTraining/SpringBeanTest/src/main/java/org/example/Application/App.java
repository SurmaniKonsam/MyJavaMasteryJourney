package org.example.Application;

import org.example.InjectingValueUsingPropertyFileAndAnnotation.EmployeeData;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConfigFile/injectingValueUsingProperty.xml");
        EmployeeData employeeData = context.getBean("injectingValues", EmployeeData.class);
        System.out.println(employeeData.getData());
    }
}
