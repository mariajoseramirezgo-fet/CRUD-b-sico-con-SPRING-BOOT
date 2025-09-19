package com.equipo.biblioteca.service;

import com.equipo.biblioteca.model.Libro;
import java.util.List;
import java.util.Optional;

public interface LibroService {
    Libro crearLibro(Libro libro);
    List<Libro> listarLibros();
    Optional<Libro> obtenerLibroPorId(Long id);
    Libro actualizarLibro(Long id, Libro libro);
    void eliminarLibro(Long id);
}