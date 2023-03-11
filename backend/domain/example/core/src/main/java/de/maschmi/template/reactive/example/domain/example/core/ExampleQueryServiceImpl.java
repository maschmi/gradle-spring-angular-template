package de.maschmi.template.reactive.example.domain.example.core;

import de.maschmi.template.reactive.example.domain.example.api.model.ExampleData;
import de.maschmi.template.reactive.example.domain.example.api.ExampleQueryService;
import de.maschmi.template.reactive.example.domain.example.api.query.GetExamplesQuery;
import de.maschmi.template.reactive.example.domain.example.core.persistence.ExampleRepository;
import reactor.core.publisher.Flux;

import java.util.List;

public class ExampleQueryServiceImpl implements ExampleQueryService {

    private final ExampleRepository repository;

    public ExampleQueryServiceImpl(ExampleRepository repository) {
        this.repository = repository;
    }


    @Override
    public Flux<ExampleData> handleGetExampleQuery(GetExamplesQuery query) {
        return query.count()
                .map(repository::findNEntries)
                .orElse(repository.findAll());
    }
}
