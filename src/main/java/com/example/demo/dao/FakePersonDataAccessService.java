package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
//CLASS IMPLEMENTING THE INTERFACE (INTERFACE THAT DEFINES OPERATIONS ALLOWED ON THE MODEL I.E., PERSON HERE)

//using annotations to instantiate beans
//telling beans that this class needs to be instantiated so that we can inject it in all classes using @Repository that tells that this class serves as repository
@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao{
    private static List<Person> DB = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id,person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

}

