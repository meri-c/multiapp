package com.meri.multiapp.h2.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stuff")
public class StuffController {

    @GetMapping
    public ResponseEntity<?> getAllStuffs(){
        System.out.println("first");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStuffById(@PathVariable("id") int id){
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
