package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound() {
        return "Sound from Bose Speakers";
    }
}
