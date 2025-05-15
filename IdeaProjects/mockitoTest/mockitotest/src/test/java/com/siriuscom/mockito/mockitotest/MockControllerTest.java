package com.siriuscom.mockito.mockitotest;

import com.siriuscom.mockito.mockitotest.controller.MockitoController;
import com.siriuscom.mockito.mockitotest.entity.Movies;
import com.siriuscom.mockito.mockitotest.service.MovieServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;



@ExtendWith(MockitoExtension.class)
public class MockControllerTest {


    @Mock
    MovieServiceImpl movieService;

    @InjectMocks
    MockitoController mockitoController;


    //initialized all the mocked annotated variable implicitly
    @Before
    public void setMockitoInitialization(){
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void firstTest() throws Exception{
       List<Movies> mockResponse = new ArrayList<>();


       //stubbed result.
       mockResponse.add(new Movies("URI","Action"));

       when(movieService.getAllMovies()).thenReturn(mockResponse);
       List<Movies> fetchedMovies = mockitoController.getAllMovies();
       assertEquals(fetchedMovies.get(0).getMovieName(),mockResponse.get(0).getMovieName());
       assertEquals(mockResponse,fetchedMovies);
       assertEquals(fetchedMovies.get(0).getGenre(),"URI");
    }


}
