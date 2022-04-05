package com.company;

public class Dog extends Animal {
  protected String speak;
  public String name;

  public Dog(String name, String speak){
    super(name, speak);
    this.speak = speak;

  }

  @Override
  public boolean foodType() {
    return false;
  }
}
