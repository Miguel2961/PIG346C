package com.talentotech.energia.repository;
import com.talentotech.energia.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUsername(String username);

// PARA CREAR UN USUARIO, SE HACE DESDE EL CONTROLADOR, PERO SE USA EL SERVICIO PARA ENCRIPTAR LA CONTRASEÑA ANTES DE GUARDARLA EN LA BASE DE DATOS. EL REPOSITORIO SOLO SE ENCARGA DE GUARDAR LOS DATOS EN LA BASE DE DATOS, NO DE PROCESARLOS.

}
