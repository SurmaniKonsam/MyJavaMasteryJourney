package org.example.ComponentScanningUsingConfigFile;

import org.example.Service.CompetitiveProgramming;
import org.springframework.stereotype.Component;


@Component("codingPractice")
public class CodingMaster implements CompetitiveProgramming {
    @Override
    public String codingPractice(){
        return "practice competitive programming everyday for 2 hrs at max at code chef";
    }
}
