package one.digitalinovation.person_api.controller;

import one.digitalinovation.person_api.PersonRepository;
import one.digitalinovation.person_api.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> listarpessoas(){

    return personRepository.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person inserir(@RequestBody Person person){
        return personRepository.save(person);
    }
}
