package com.aem.test.mockitotest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class MyServiceTest {

    @Mock
    private MyRepository myRepository;

    @InjectMocks
    private MyService myService;


    public MyServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void processedData() {
        when(myRepository.getData()).thenReturn("mocked13213_data");
        myService.processedData();
        assertEquals(myService.processedData(),"Processed data : "+myRepository.getData());

    }
}