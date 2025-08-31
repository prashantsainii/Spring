package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    public String rotate() {
        return "vehicle moving via BridgeStone Tyres";
    }

    @Override
    public String toString() {
        return "Hi I am Bridgestone Tyre";
    }
}
