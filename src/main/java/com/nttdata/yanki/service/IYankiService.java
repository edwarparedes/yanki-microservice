package com.nttdata.yanki.service;

import com.nttdata.yanki.entity.Yanki;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IYankiService {

    Flux<Yanki> getAll();

    Mono<Yanki> getYankiById(String id);

    Mono<Yanki> getYankiByPhoneNumber(String phone);

    Mono<Yanki> save(Yanki yanki);

    Mono<Yanki> update(Yanki yanki);

    void delete(String id);
}
