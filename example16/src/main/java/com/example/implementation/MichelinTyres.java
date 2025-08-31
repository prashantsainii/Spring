package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {

    public String rotate() {
        return "Vehicle moving via Michelin Tyres";
    }

    @Override
    public String toString() {
        return "Hi I am Michelin Tyre";
    }
}
