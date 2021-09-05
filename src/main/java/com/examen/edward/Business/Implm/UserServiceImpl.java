package com.examen.edward.Business.Implm;

import com.examen.edward.Business.UserService;
import com.examen.edward.Repository.UserRepository;
import com.examen.edward.model.Assembler.UserAssembler;
import com.examen.edward.model.DTO.UserRequestDTO;
import com.examen.edward.model.DTO.UserResponseDTO;
import com.examen.edward.model.Entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    //listar
    @Override
    public List<UserResponseDTO> listar() {
        return repository.findAll().stream().map(list -> UserAssembler.mapUserToResponse(list)).collect(Collectors.toList());
    }

    //buscar un usuario por medio del código
    @Override
    public UserResponseDTO consultar(Long id) {
        return repository.findById(id).map(user -> UserAssembler.mapUserToResponse(user)).get();
    }

    @Override
    public String update(Long id, UserRequestDTO user) throws Exception{
        //User user1 = repository.findById(id).orElse(null);
        User user1 = UserAssembler.mapRequestToUser2(id,user); //funciona
        repository.save(user1);  //funciona
        return "Se actualizo el usuario"; //funciona
        //if(user1 != null){
        //User user2 = UserAssembler.mapRequestToUser2(id, user);
        //repository.save(user2);
        //}
        //throw new Exception("No existe el id");
    }

    @Override
    public String delete(Long id) {
        try {
            repository.deleteById(id);
            return "Se elimino el usuario";
        } catch (Exception e){
        return "Hubo un fallo al eliminar";}
    }
         //User user1 = repository.findById(id).orElse(null);
        //if( user1 != null){
         //   repository.deleteById(id);
        //}
        //throw new Exception ("no existe el usuario");

    //registrar
    @Override
    public UserResponseDTO registrar(UserRequestDTO request) {
        return UserAssembler.mapUserToResponse(repository.save(UserAssembler.mapRequestToUser(request)));
        //}

    }

}
