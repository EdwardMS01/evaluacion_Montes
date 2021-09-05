package com.examen.edward.model.Entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Table
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="El nombre es obligatorio")
    private String nombres;
    @NotBlank(message="Los apellidos son obligatorios")
    private String apellidos;
    private Long celular;
    @NotBlank(message="La contraseña es obligatoria")
    private String contraseña;

}
