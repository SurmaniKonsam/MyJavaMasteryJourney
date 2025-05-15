package com.aem.test.mockitotest;

import org.springframework.beans.factory.annotation.Autowired;

public class MyService {


    @Autowired
    private MyRepository myRepository;

    public String processedData(){
        return "Processed data : "+myRepository.getData();
    }
}
