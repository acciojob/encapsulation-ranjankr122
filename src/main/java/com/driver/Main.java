package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj=new RWOnly();
    //obj.name= "Tannu";

    //System.out.println(obj.name);
    //java: name has private access in com.driver.RWOnly
    obj.setName("Tannu");
    System.out.println(obj.getName());
  }

}