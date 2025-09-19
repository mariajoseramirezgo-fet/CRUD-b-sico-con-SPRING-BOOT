package com.equipo.biblioteca.service;

import com.equipo.biblioteca.model.Libro;
import java.util.List;
import java.util.Optional;

public interface LibroService {
    Libro guardarLibro(Libro libro);
    List<Libro> obtenerTodosLosLibros();
    Optional<Libro> obtenerLibroPorId(Long id);
    Libro actualizarLibro(Long id, Libro libroActualizado);
    void eliminarLibro(Long id);
    List<Libro> buscarPorAutor(String autor);
}