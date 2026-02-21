package com.talentotech.energia.service;

import java.util.List;
import java.util.Optional; //No sabe que tipo de dato llega 

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.talentotech.energia.dto.LoginRequest;
import com.talentotech.energia.model.User;
import com.talentotech.energia.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User crearUsuario(User user) {
        user.setPassaword(passwordEncoder.encode(user.getPassaword()));
        return userRepository.save(user);
    }
    
    public List<User> finalAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public User update(Long id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("Usuario no encontrado"));
       if(userDetails.getUsername()!=null && !userDetails.getUsername().trim().isEmpty()){
            user.setUsername(userDetails.getUsername());      
       }
       if(userDetails.getEmail()!=null && !userDetails.getEmail().trim().isEmpty()){
            user.setEmail(userDetails.getEmail());      
       }
       if(userDetails.getPassaword()!=null && !userDetails.getPassaword().trim().isEmpty()){
            user.setPassaword(passwordEncoder.encode(userDetails.getPassaword()));      
       }
       if(userDetails.getRole()!=null){
            user.setRole(userDetails.getRole());
       }

        
       
       return userRepository.save(user);
        
    }

    public String login(LoginRequest request){
        Optional<User> OptionalUser = userRepository.findByUsername(request.getUsernsme());
        if(OptionalUser.isEmpty()){
            throw new RuntimeException("Usuario no encontrado");

        }
        User user = OptionalUser.get();
        if(!passwordEncoder.matches(request.getPassword(), user.getUsername())){
            throw new RuntimeException("Contraseña incorrecta");
        }

        return "Login correcto";

    }

}
