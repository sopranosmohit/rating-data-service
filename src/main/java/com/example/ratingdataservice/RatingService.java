package com.example.ratingdataservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingService {

    @RequestMapping(value = "/{movieId}",method = RequestMethod.GET)
    public Rating getRating(@PathVariable("movieId") String movieID)
    {
        return new Rating("123",1);

    }
}
