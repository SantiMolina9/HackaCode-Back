package com.codecrafters.hackacode.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "usuarios")
public class Usuario extends Persona{
    
    @Id
    @Getter @Setter @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Integer idUsuario;

    @Getter @Setter
    @Column(name="nombre_usuario")
    private String nombreUsuario;

    @Getter @Setter
    private String contrasenia;
    
    @Getter @Setter
    private Rol rol;
}