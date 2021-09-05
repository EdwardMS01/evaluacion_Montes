package com.examen.edward.Web;

import com.examen.edward.Business.UserService;
import com.examen.edward.model.DTO.UserRequestDTO;
import com.examen.edward.model.DTO.UserResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping (value="/demo")
@RequiredArgsConstructor
public class Controller {

    private final UserService service;

    //Listar
    @GetMapping (value ="/listar", produces = (MediaType.APPLICATION_JSON_VALUE))
        public List<UserResponseDTO> listar(){
        return service.listar();
    }
    //Registrar
    @PostMapping (value ="/registro", produces = (MediaType.APPLICATION_JSON_VALUE))
    public UserResponseDTO registrarUser(@Validated @RequestBody UserRequestDTO request){
        return service.registrar(request);
    }
    //Consultar usuario

    @GetMapping (value="/{id}", produces = (MediaType.APPLICATION_JSON_VALUE))
        public UserResponseDTO listarUser(@PathVariable Long id){
        return service.consultar(id);
    }
    //update
    @PutMapping (value="/update/{id}", produces = (MediaType.APPLICATION_JSON_VALUE))
        public String updateUser (@PathVariable Long id, @RequestBody UserRequestDTO user) throws Exception {
        return service.update(id, user);
    }

    @DeleteMapping (value="/delete/{id}", produces = (MediaType.APPLICATION_JSON_VALUE))
        public String deleteuser(@PathVariable Long id){
        return service.delete(id);
    }
}



