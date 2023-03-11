package de.maschmi.template.reactive.example.app.web;

import de.maschmi.template.reactive.example.app.web.api.example.ExampleQueryApiDelegate;
import de.maschmi.template.reactive.example.app.web.api.example.model.ExampleResponseDTO;
import de.maschmi.template.reactive.example.domain.example.api.ExampleQueryService;
import de.maschmi.template.reactive.example.domain.example.api.model.ExampleData;
import de.maschmi.template.reactive.example.domain.example.api.query.GetExamplesQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public class ExampleResource implements ExampleQueryApiDelegate {

    private final ExampleQueryService queryService;

    public ExampleResource(ExampleQueryService queryService) {
        this.queryService = queryService;
    }


    @Override
    public Mono<ResponseEntity<ExampleResponseDTO>> getSomething(ServerWebExchange exchange) {
        return queryExampleData()
                .collectList()
                .map(l -> new ExampleResponseDTO().values(l))
                .map(ResponseEntity::ok);
    }

    private Flux<String> queryExampleData() {
        return queryService.handleGetExampleQuery(new GetExamplesQuery(Optional.empty()))
                .map(ExampleData::text);
    }

}
