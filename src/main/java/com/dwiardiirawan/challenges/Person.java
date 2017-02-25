package com.dwiardiirawan.challenges;

import java.util.Scanner;

public class Person {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] ages = new int[n];
    for (int i = 0; i < n; i++) {
      ages[i] = scan.nextInt();
    }
    
    for (int i = 0; i < ages.length; i++) {
      Person p = new Person(ages[i]);
      p.amIOld();
      p.yearPasses();
      System.out.println();
    }

    scan.close();
  }
  
  private int age;
  
  public Person(int initialAge){
    if(initialAge>0)
      age = initialAge;
    else
      System.out.println("Age is not valid, setting age to 0");
  }
  
  public void amIOld(){
    
    if(getAge()<13)
      System.out.println("You are young.");
    else if (getAge()>=13 && getAge()<18) {
      System.out.println("You are teenager");
    }else {
      System.out.println("You are old");
    }
  }
  
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void yearPasses(){
    setAge(getAge()+3);
    amIOld();
    
  }

  
}
