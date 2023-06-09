package com.codecrafters.hackacode.controllers;

import com.codecrafters.hackacode.models.Persona;
import com.codecrafters.hackacode.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/personas")
public class PersonaController {
    @Autowired
    PersonaService personaService;
    @GetMapping
    public ArrayList<Persona> obtenerPersonas(){
        return personaService.obtenerPersonas();
    }
    @PostMapping
    public Persona guardarPersona(@RequestBody Persona persona){
        return this.personaService.guardarPersona(persona);
    }

    @GetMapping(value = "/{idPersona}")
    public Optional<Persona> obtenerPersonaPorId(@PathVariable Long idPersona){
        return personaService.obtenerPersonaPorId(idPersona);
    }

    @DeleteMapping(value = "/{idPersona}")
    public boolean eliminarPersona(@PathVariable Long idPersona){
        return personaService.eliminarPersona(idPersona);
    }

}
