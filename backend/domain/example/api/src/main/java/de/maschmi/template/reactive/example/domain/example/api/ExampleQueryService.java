package de.maschmi.template.reactive.example.domain.example.api;

import de.maschmi.template.reactive.example.domain.example.api.model.ExampleData;
import de.maschmi.template.reactive.example.domain.example.api.query.GetExamplesQuery;
import reactor.core.publisher.Flux;

import java.util.List;

public interface ExampleQueryService {

    Flux<ExampleData> handleGetExampleQuery(GetExamplesQuery query);
}
