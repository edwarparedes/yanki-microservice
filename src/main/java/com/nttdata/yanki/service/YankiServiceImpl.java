package com.nttdata.yanki.service;

import com.nttdata.yanki.entity.Yanki;
import com.nttdata.yanki.repository.IYankiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class YankiServiceImpl implements IYankiService {

    @Autowired
    IYankiRepository repository;

    @Override
    public Flux<Yanki> getAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Yanki> getYankiById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Yanki> save(Yanki yanki) {
        return repository.save(yanki);
    }

    @Override
    public Mono<Yanki> update(Yanki yanki) {
        return repository.save(yanki);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();
    }
}
