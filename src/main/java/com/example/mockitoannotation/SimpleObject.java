package com.example.mockitoannotation;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SimpleObject {

    private final String name="";

    public String name(){
        return name;
    }
}
