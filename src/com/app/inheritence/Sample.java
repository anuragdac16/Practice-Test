package com.app.inheritence;

public class Sample {
    public static void main(java.lang.String[] args) {
        Test t = new Test();
        t.display();
        Sample sample = new Sample();
        sample.show("Hello");
        sample.show(1);

        String str = new String();
        System.out.println(str.num);
    }

    public void show(String str){
        System.out.println("Show String");
    }

    public void show(Object str){
        System.out.println("Show Object");
    }
}

class String {
    int num = 10;
}

