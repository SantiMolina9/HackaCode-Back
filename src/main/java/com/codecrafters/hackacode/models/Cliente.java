package com.codecrafters.hackacode.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="clientes")
public class Cliente extends Persona {

    @Id
    @Getter @Setter @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private Integer idCliente;

    @Getter @Setter
    private Integer edad;

    @Getter @Setter
    private Long altura;

    @Getter @Setter
    @OneToMany(mappedBy = "cliente")
    private Entrada entradas[];
}