package br.edu.ifsul.controller;

import br.edu.ifsul.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();

        System.out.println(person1.getName() + " " + person1.getAge());

        person1.setName("lucas");
        person1.setAge(10);

        System.out.println(person1.getName() + " " + person1.getAge());

        Person person2 = new Person("carlos", 15);
        System.out.println(person2);

        Person person3 = new Person("valter");
        System.out.println(person3);
    }
}

