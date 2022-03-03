package com.nttdata.yanki.repository;

import com.nttdata.yanki.entity.Yanki;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface IYankiRepository extends ReactiveMongoRepository<Yanki, String> {
    Mono<Yanki> findByPhoneNumber(String phone);
}
