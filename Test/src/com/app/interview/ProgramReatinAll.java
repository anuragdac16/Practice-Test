package com.app.interview;

import java.util.List;

public class ProgramReatinAll {

    public static void main(String[] args) {
        List<String> addString = new java.util.ArrayList<>(List.of("Anu", "rag"));
        List<String> removeString = List.of("Anu", "gupta");
        System.out.println(addString.retainAll(removeString));

        System.out.println(addString);
        System.out.println(removeString);

    }

}
