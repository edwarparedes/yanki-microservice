package com.nttdata.yanki.controller;

import com.nttdata.yanki.entity.Yanki;
import com.nttdata.yanki.service.IYankiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/yanki")
public class YankiController {

    @Autowired
    IYankiService service;

    @GetMapping
    public Flux<Yanki> getYankis(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Yanki>> getYankiById(@PathVariable("id") String id){
        return service.getYankiById(id)
                .map(savedMessage -> ResponseEntity.ok(savedMessage))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping("/phone/{phone}")
    public Mono<ResponseEntity<Yanki>> findByPhoneNumberId(@PathVariable("phone") String phone){
        return service.getYankiByPhoneNumber(phone)
                .map(savedMessage -> ResponseEntity.ok(savedMessage))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    Mono<Yanki> postYanki(@RequestBody Yanki yanki){
        return service.save(yanki);
    }

    @PutMapping
    Mono<Yanki> updYanki(@RequestBody Yanki yanki){
        return service.update(yanki);
    }

    @DeleteMapping("/{id}")
    void dltYanki(@PathVariable("id") String id){
        service.delete(id);
    }

}
