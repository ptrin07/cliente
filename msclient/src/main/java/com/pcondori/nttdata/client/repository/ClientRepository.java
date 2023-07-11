package com.pcondori.nttdata.client.repository;

import com.pcondori.nttdata.client.model.dao.ClientDao;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<ClientDao,String> {
    Mono<ClientDao> findByNroDocument(String nroDocument);
}
