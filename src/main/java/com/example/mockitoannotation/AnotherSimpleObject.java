package com.example.mockitoannotation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AnotherSimpleObject {

    private final String name;

    public String name(){
        return name;
    }
}
