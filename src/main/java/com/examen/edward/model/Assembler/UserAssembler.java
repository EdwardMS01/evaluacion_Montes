package com.examen.edward.model.Assembler;

import com.examen.edward.model.DTO.UserRequestDTO;
import com.examen.edward.model.DTO.UserResponseDTO;
import com.examen.edward.model.Entity.User;

public class UserAssembler{
    public static UserResponseDTO mapUserToResponse(User user){
        return UserResponseDTO.builder()
                .id(user.getId())
                .nombres(user.getNombres())
                .apellidos(user.getApellidos())
                .celular(user.getCelular())
                .contraseña(user.getContraseña())
                .build();
    }

    public static User mapRequestToUser (UserRequestDTO user){
        return User.builder()
                .nombres(user.getNombres())
                .apellidos(user.getApellidos())
                .celular(user.getCelular())
                .contraseña(user.getContraseña())
                .build();
    }
    public static User mapRequestToUser2 (Long id, UserRequestDTO user){
        return User.builder()
                .id(id)
                .nombres(user.getNombres())
                .apellidos(user.getApellidos())
                .celular(user.getCelular())
                .contraseña(user.getContraseña())
                .build();
    }
}
