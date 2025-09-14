package com.app.java21;

public class RecordTest {

    public static void main(String[] args) {
        PersonRecord personRecord = new PersonRecord("Anurag" , "Hyderabad");
        PersonRecord personRecord1 = new PersonRecord("Anurag" , "Hyderabad");
        System.out.println(personRecord.equals(personRecord1));
        System.out.println(personRecord.hashCode());
        System.out.println(personRecord1.hashCode());

    }
}
