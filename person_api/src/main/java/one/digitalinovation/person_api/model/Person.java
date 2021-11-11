package one.digitalinovation.person_api.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Person {
    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String nome;

    public Long getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Id == person.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    public void setId(Long id) {
        Id = id;


    }
}
