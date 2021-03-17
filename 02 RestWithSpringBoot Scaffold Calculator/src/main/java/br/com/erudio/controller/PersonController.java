package br.com.erudio.controller;

import br.com.erudio.converter.NumberConverter;
import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.model.Person;
import br.com.erudio.service.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonServices services;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll() {
        return services.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable("id") String id) {
        return services.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person) {
        return services.create(person);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person update(@RequestBody Person person) {
        return services.create(person);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
         services.delete(id);
    }







}
