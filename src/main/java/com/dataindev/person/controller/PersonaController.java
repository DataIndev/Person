package com.dataindev.person.controller;

import com.dataindev.person.model.Persona;
import com.dataindev.person.service.iPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PersonaController {
    @Autowired
    private iPersonaService interPersona;

    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }

    @PostMapping ("/personas/crear")
    public String createStudent(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "Persona creada con exito!";
    }

    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        interPersona.deletePersona(id);
        return "Persona borrada con exito";
    }

    @PutMapping ("/personas/editar/{id}")

    public Persona editarPersona (@PathVariable Long id,
                                  @RequestParam ("nombre") String nuevoNombre,
                                  @RequestParam ("apellido") String nuevoApellido,
                                  @RequestParam ("edad") int nuevaEdad){
        Persona perso = interPersona.findPersona(id);

        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setEdad(nuevaEdad);

        interPersona.savePersona(perso);

        return perso;

    }



}
