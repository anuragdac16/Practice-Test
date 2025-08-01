package com.app.test1;

public class Program {

    // 1.GetTime
    public static void main(String[] args) throws InterruptedException {

      PrintClass print = new PrintClass();
      for(int i =0; i < 10; i++) {
        Thread.sleep(150);
        print.printMethod();
      }
      Thread.sleep(5000);
      System.out.println("------");
      for(int i =0; i < 10; i++) {

            print.printMethod();
        }
    }


}
