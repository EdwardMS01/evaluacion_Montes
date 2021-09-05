package com.examen.edward.Business;

import com.examen.edward.model.DTO.UserRequestDTO;
import com.examen.edward.model.DTO.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO registrar (UserRequestDTO request);
    List<UserResponseDTO> listar();
    UserResponseDTO consultar (Long id);
    String update (Long id,UserRequestDTO user) throws Exception ;
    String delete (Long id);

}
