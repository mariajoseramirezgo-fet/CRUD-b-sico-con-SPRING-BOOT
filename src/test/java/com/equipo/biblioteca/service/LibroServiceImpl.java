package com.equipo.biblioteca.service;

import com.equipo.biblioteca.model.Libro;
import com.equipo.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public Libro crearLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }

    @Override
    public Optional<Libro> obtenerLibroPorId(Long id) {
        return libroRepository.findById(id);
    }

    @Override
    public Libro actualizarLibro(Long id, Libro libro) {
        Optional<Libro> libroExistente = libroRepository.findById(id);
        if (libroExistente.isPresent()) {
            Libro l = libroExistente.get();
            l.setTitulo(libro.getTitulo());
            l.setAutor(libro.getAutor());
            l.setAnioPublicacion(libro.getAnioPublicacion());
            l.setDisponible(libro.isDisponible());
            return libroRepository.save(l);
        } else {
            return null;
        }
    }

    @Override
    public void eliminarLibro(Long id) {
        libroRepository.deleteById(id);
    }
}