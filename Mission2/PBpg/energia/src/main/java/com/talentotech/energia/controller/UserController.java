package com.talentotech.energia.controller;
import com.talentotech.energia.model.User;
import com.talentotech.energia.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
// Propiedad de java para majar las listas
import java.util.List;


// import org.springframework.web.server.ResponseStatusException;
// import org.springframework.http.HttpStatus;
 

@RestController //Permite controlar las peticiones 
@RequestMapping("/api/users")

public class UserController {
    private final UserRepository userRepository;
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        //TODO: process POST request
        return userRepository.save(user);
    }
    
    @GetMapping
    public List<User>  findAll() {
        return userRepository.findAll();
    }

     @GetMapping("/{id}")
    public User findByID(@PathVariable Long id){
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("Usuario no encontrado"));
    }
    /*  //READ BY ID
    @GetMapping("/{id}")
    public User findByID(@PathVariable Long id){
        return userRepository.findById(id)
        .orElseThrow(()-> new ResponseStatusException(
            HttpStatus.NOT_FOUND,
            "Usuario no encontrado"));
    } */

    /*@RequestBody es una anotación de Spring Boot (Spring MVC) que se usa para decirle al servidor:
      👉 “Toma los datos que vienen en el cuerpo de la petición HTTP y conviértelos en un objeto Java.
      
      @PathVariable es una anotación de Spring Boot que se usa para obtener valores que vienen en la URL (en la ruta) y guardarlos en variables del método.
      👉 Sirve para capturar datos directamente desde la dirección del endpoint.”
      Se usa principalmente cuando el cliente envía datos en JSON desde frontend, Postman, Angular, etc. */
    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User userDetails) {
        //TODO: process PUT request
       User user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("Usuario no encontrado"));
       user.setUsername(userDetails.getUsername());
       user.setEmail(userDetails.getEmail());
       return userRepository.save(user);
    
    }
}
