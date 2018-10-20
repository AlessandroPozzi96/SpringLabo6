package com.spring.henallux.demo.service;

import com.spring.henallux.demo.model.Hobby;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HobbiesService {
    private ArrayList<Hobby> hobbies;

    public HobbiesService() {
        hobbies = new ArrayList<>();
        hobbies.add(new Hobby("sport", "Sport"));
        hobbies.add(new Hobby("reading", "Read some books"));
        hobbies.add(new Hobby("tv", "Watching TV"));
    }

    public ArrayList<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<Hobby> hobbies) {
        this.hobbies = hobbies;
    }
}
