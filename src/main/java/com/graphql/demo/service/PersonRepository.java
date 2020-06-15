package com.graphql.demo.service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.demo.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonRepository implements GraphQLResolver<Person> {

    public List<Person> getPersons() {
        Person person = new Person();
        person.setName("R");

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        return personList;
    }
}
