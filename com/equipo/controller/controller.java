package com.equipo.controller;

import com.equipo.biblioteca.model.Libro;
import com.equipo.biblioteca.service.LibroService; // Importar la interfaz
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping
    public ResponseEntity<Libro> crearLibro(@RequestBody Libro libro) {
        try {
            Libro nuevoLibro = libroService.guardarLibro(libro);
            return new ResponseEntity<>(nuevoLibro, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public List<Libro> obtenerTodosLosLibros() {
        return libroService.obtenerTodosLosLibros();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtenerLibroPorId(@PathVariable Long id) {
        Optional<Libro> libro = libroService.obtenerLibroPorId(id);
        return libro.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Libro> actualizarLibro(@PathVariable Long id, @RequestBody Libro libro) {
        try {
            Libro libroActualizado = libroService.actualizarLibro(id, libro);
            return new ResponseEntity<>(libroActualizado, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarLibro(@PathVariable Long id) {
        try {
            libroService.eliminarLibro(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(params = "autor")
    public List<Libro> obtenerLibrosPorAutor(@RequestParam String autor) {
        return libroService.buscarPorAutor(autor);
    }
}