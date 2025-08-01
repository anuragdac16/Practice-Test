package com.app.test;

import java.util.ArrayList;
import java.util.List;

public final class Immutable {
    private String id;
    private List<String> value;


    public Immutable(String id , List<String> value){
        this.id = id;
        List<String> copyValue = new ArrayList<>();
        for(String str : value){
            copyValue.add(str);
        }
        this.value= copyValue;
    }

    public String getId() {
        return id;
    }

    public List<String> getValue() {
        List<String> copyValue = new ArrayList<>();
        for(String str : value){
            copyValue.add(str);
        }
        return copyValue;
    }

}
