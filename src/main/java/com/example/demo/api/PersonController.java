package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//for defining the path
@RequestMapping("api/v1/person")
@RestController
//@RestController to make PersonController class a rest-controller and define which code will perform HTTP methods
//now we can some methods, and expose some end points that clients can consume
public class PersonController {
//     REFERENCE TO ACTUAL SERVICE
    private final PersonService personService;

//    using @Autowired below, spring boot injects the actual service into PersonController constructor
    @Autowired
    public PersonController(PersonService personService){
        this.personService=personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }
}

//GET : for retrieving data from server
//POST: adding resource to server
//PUT: for modifying resources
//DELETE: deleting resources