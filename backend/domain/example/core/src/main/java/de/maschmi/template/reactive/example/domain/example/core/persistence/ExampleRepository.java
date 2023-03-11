package de.maschmi.template.reactive.example.domain.example.core.persistence;

import de.maschmi.template.reactive.example.domain.example.api.model.ExampleData;
import reactor.core.publisher.Flux;

import java.util.List;

public interface ExampleRepository {
    Flux<ExampleData> findAll();
    Flux<ExampleData> findNEntries(int count);
}
