package com.nttdata.yanki.repository;

import com.nttdata.yanki.entity.Yanki;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IYankiRepository extends ReactiveMongoRepository<Yanki, String> {
}
