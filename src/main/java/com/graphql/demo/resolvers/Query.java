package com.graphql.demo.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.demo.model.Person;
import com.graphql.demo.service.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLResolver {
    private PersonRepository personRepository;

    @Autowired
    public Query (PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> getPersons(){
        return personRepository.getPersons();
    }
}
