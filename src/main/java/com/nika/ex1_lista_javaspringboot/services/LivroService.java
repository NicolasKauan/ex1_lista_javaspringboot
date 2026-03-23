package com.nika.ex1_lista_javaspringboot.services;

import com.nika.ex1_lista_javaspringboot.models.Livro;
import com.nika.ex1_lista_javaspringboot.repositories.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public Livro salvar(Livro livro) {
        return repository.save(livro);
    }

    public List<Livro> listar() {
        return repository.findAll();
    }

    public Livro buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}