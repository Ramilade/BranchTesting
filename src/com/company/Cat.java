package com.company;

public class Cat extends Animal {

  protected String speak;
  public String name;

  public Cat(String name, String speak) {
    super(name, speak);
    this.speak = speak;

  }
}
