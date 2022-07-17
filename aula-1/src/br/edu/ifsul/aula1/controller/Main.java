package br.edu.ifsul.aula1.controller;
import br.edu.ifsul.aula1.model.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

//    static torna metodo membro da classe não da instancia
    public static void main(String[] args) {
        Person person1 = new Person();

        System.out.println(person1.getName() + " " + person1.getAge());

        person1.setName("lucasssss");
        person1.setAge(10);
        person1.setId(1);

        System.out.println(person1.getName() + " " + person1.getAge());

        Person person2 = new Person( 2,"carlos", 15);
        System.out.println(person2);

        Person person3 = new Person(3,"valter",  22);
        System.out.println(person3);

        System.out.println("\n\nManipulangit do coleções");

        List<Person> persons = new ArrayList<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        System.out.println(persons);

        //ordenação da List

        System.out.println("\nList ordena:");
//        :: <-- operador de resolução de escopo
        persons.sort(Comparator.comparing(Person::getName));
        System.out.println(persons);

        //pesquisa por força bruta

//        persons.forEach(p -> {
//            if(p.getName().equals("lucasssss")){
//                System.out.println(p);
//            }
//        });
///
//        for (Person p : persons) {
//            if(p.getName().equals("valter")){
//                System.out.println(p);
//            }
//        }

        //pesquiasndo list pelo metodo filter



        System.out.println();
        System.out.println("List ordenada por filter");
        Person personFind =  persons.stream()
                .filter(p-> p.getName().equals("valter"))
                .findAny()
                .orElse(null);
        System.out.println(personFind);


        //Coleção do tipo MAP
        System.out.println("\n\nMap\n\n");

        Map<Integer,  Person> personsMap = new HashMap<>();

        personsMap.put(person1.getId(), person1);
        personsMap.put(person2.getId(), person2);
        personsMap.put(person3.getId(), person3);
        System.out.println(personsMap);
        System.out.println("\nBuscando valter");
        System.out.println(personsMap.get(3));
    }
}

