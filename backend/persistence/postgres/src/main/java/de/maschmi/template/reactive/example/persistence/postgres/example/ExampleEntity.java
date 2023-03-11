package de.maschmi.template.reactive.example.persistence.postgres.example;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "example", schema = "example_domain")
public class ExampleEntity {

    @Id
    long id;

    @Column("number")
    int number;

    @Column("text")
    String text;


    public ExampleEntity() {
        // for ORM
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
