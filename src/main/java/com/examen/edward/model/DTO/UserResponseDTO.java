package com.examen.edward.model.DTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;



@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
    private Long id;  // queremos una respuesta por medio de un Id
    private String nombres;
    private String apellidos;
    private Long celular;
    private String contraseña;
}
