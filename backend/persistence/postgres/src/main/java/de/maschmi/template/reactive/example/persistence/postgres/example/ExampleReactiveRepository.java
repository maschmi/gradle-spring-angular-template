package de.maschmi.template.reactive.example.persistence.postgres.example;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ExampleReactiveRepository extends ReactiveCrudRepository<ExampleEntity, Long> {
    @Query("select * from example_domain.example limit :count")
    Flux<ExampleEntity> findEntriesWithLimit(@Param("count") int count);
}
