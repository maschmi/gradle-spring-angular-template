package de.maschmi.template.reactive.example.persistence.postgres.example;

import de.maschmi.template.reactive.example.domain.example.api.model.ExampleData;
import de.maschmi.template.reactive.example.domain.example.core.persistence.ExampleRepository;
import reactor.core.publisher.Flux;

public class ExampleRepositoryImpl implements ExampleRepository {

    private ExampleReactiveRepository repository;

    public ExampleRepositoryImpl(ExampleReactiveRepository repository) {
        this.repository = repository;
    }

    @Override
    public Flux<ExampleData> findAll() {
        return repository
                .findAll()
                .map(this::toModel);
    }

    @Override
    public Flux<ExampleData> findNEntries(int count) {
        return repository
                .findEntriesWithLimit(count)
                .map(this::toModel);
    }

    private ExampleData toModel(ExampleEntity exampleEntity) {
        return new ExampleData(exampleEntity.getNumber(), exampleEntity.getText());
    }

}
