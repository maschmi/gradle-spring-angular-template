package de.maschmi.template.reactive.example.domain.autoconfiguration;

import de.maschmi.template.reactive.example.domain.example.api.ExampleQueryService;
import de.maschmi.template.reactive.example.domain.example.core.ExampleQueryServiceImpl;
import de.maschmi.template.reactive.example.domain.example.core.persistence.ExampleRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleDomainConfiguration {

    @Bean
    public ExampleQueryService exampleQueryService(ExampleRepository exampleRepository) {
        return new ExampleQueryServiceImpl(exampleRepository);
    }
}
