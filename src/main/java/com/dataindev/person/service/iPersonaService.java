package com.dataindev.person.service;

import com.dataindev.person.model.Persona;

import java.util.List;

public interface iPersonaService {

    public List<Persona> getPersonas();

    public void savePersona (Persona perso);

    public void deletePersona(Long id);

    public Persona findPersona(Long id);
}
