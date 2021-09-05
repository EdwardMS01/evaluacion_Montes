package com.examen.edward.Repository;

import com.examen.edward.model.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {  // <Clase, llave primaria>

}
