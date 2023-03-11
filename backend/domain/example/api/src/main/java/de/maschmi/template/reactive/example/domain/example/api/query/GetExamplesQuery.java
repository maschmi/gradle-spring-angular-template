package de.maschmi.template.reactive.example.domain.example.api.query;

import java.util.Optional;

public record GetExamplesQuery(Optional<Integer> count) {
}
