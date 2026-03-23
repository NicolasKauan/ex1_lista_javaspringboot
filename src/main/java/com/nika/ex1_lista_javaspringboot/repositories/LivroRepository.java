package com.nika.ex1_lista_javaspringboot.repositories;


import com.nika.ex1_lista_javaspringboot.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
