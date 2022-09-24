package com.example.obspringEjercicios4_5_6.controllers;

import com.example.obspringEjercicios4_5_6.entities.Laptop;
import com.example.obspringEjercicios4_5_6.repositories.LaptopRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private final Logger log = LoggerFactory.getLogger(LaptopController.class);

    private LaptopRepository laptopRepository;


    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }


    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }


    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id){
        Optional<Laptop>optionalLaptop =laptopRepository.findById(id);

        if(optionalLaptop.isPresent()){
            return ResponseEntity.ok(optionalLaptop.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/api/laptops")
    public ResponseEntity<Laptop> create (@RequestBody Laptop laptop){

        if(laptop.getId()!=null){
            log.warn("No se puede crear un articulo con id.");
            return ResponseEntity.badRequest().build();
        }

        Laptop result = laptopRepository.save(laptop);

        return ResponseEntity.ok(result);
    }

    @PutMapping("/api/laptops")
    public ResponseEntity<Laptop>update(@RequestBody Laptop laptop){
        if(laptop.getId()==null){
            log.warn("Estas intentando actualizar un articulo que no existe.");
            return ResponseEntity.notFound().build();
        }
        if(laptopRepository.existsById(laptop.getId())){
            log.warn("Estas intentando actualizar un articulo que no existe.");
            return ResponseEntity.notFound().build();
        }

        Laptop result = laptopRepository.save(laptop);

        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop>delete(@PathVariable Long id){

        if(!laptopRepository.existsById(id)){
            log.warn("Estas intentando borrar un articulo que no existe");
            ResponseEntity.notFound().build();
        }
        laptopRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/api/laptops")
    public ResponseEntity<Laptop>deleteAll(){

        log.info("Borrando todos los articulos");
        laptopRepository.deleteAll();
        return ResponseEntity.noContent().build();

    }


}
