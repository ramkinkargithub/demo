package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

//configuring actual service after having a repository , this will pretty much annotate the actual data access service
@Service
public class PersonService {

    private final PersonDao personDao;

//    here below we are injecting into the actual constructor using Autowired
//    we are auto wiring into PersonDao interface
    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao){
        this.personDao=personDao;
    }
//    above @Qualifier is ued to distinguish between different implementations of PersonDao

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.selectAllPeople();
    }

}
