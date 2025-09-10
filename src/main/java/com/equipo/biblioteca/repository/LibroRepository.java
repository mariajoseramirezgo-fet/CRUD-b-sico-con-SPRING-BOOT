package com.equipo.biblioteca.repository;

import com.equipo.biblioteca.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    // Extra: buscar libros por autor
    List<Libro> findByAutor(String autor);
}
