package de.maschmi.template.reactive.example.persistence.autoconfiguration;

import de.maschmi.template.reactive.example.domain.example.core.persistence.ExampleRepository;
import de.maschmi.template.reactive.example.persistence.postgres.example.ExampleReactiveRepository;
import de.maschmi.template.reactive.example.persistence.postgres.example.ExampleRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@Configuration
@EnableR2dbcRepositories(basePackages = "de.maschmi.template.reactive.example.persistence.postgres")
public class ExamplePersistenceConfiguration {

    @Bean
    public ExampleRepository exampleRepository(ExampleReactiveRepository repository) {
        return new ExampleRepositoryImpl(repository);
    }
}
