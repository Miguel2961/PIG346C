package com.talentotech.energia.controller;
import com.talentotech.energia.dto.LoginRequest;
import com.talentotech.energia.model.User;
// import com.talentotech.energia.repository.UserRepository;
import com.talentotech.energia.service.UserService;

// import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

// Propiedad de java para majar las listas
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



// import org.springframework.web.server.ResponseStatusException;
// import org.springframework.http.HttpStatus;
 

@RestController //Permite controlar las peticiones 
@RequestMapping("/api/users")

public class UserController {
    // private final UserRepository userRepository;
    private final UserService userService;
    // public UserController(UserRepository userRepository){
    //     this.userRepository = userRepository;
    // }
    public UserController(UserService userService){
        this.userService = userService;
    }

    // @PostMapping
    // public User create(@RequestBody User user) {
    //     TODO: process POST request
    //     return userService.crearUsuario(user);
    // } Servicios y repositorios se encargan de procesar los datos, el controlador solo recibe las peticiones y devuelve las respuestas, no procesa los datos, eso lo hacen los servicios y repositorios.
    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.crearUsuario(user));
    }

    @GetMapping
    public List<User>  findAll() {
        return userService.finalAll();
    }

    @GetMapping("/{id}")
    public User findByID(@PathVariable Long id){
        return userService.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Usuario no encontrado"));
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
    //    User user = userService.findById(id).orElseThrow(()-> new RuntimeException("Usuario no encontrado"));
    //    if(userDetails.getUsername()!=null && !userDetails.getUsername().trim().isEmpty()){
    //         user.setUsername(userDetails.getUsername());      
    //    }
    //    if(userDetails.getEmail()!=null && !userDetails.getEmail().trim().isEmpty()){
    //         user.setEmail(userDetails.getEmail());      
    //    }
    //    if(userDetails.getPassaword()!=null && !userDetails.getPassaword().trim().isEmpty()){
    //         user.setPassaword(userDetails.getPassaword());      
    //    }
       
    //     user.setRole(userDetails.getRole());
       
       return userService.update(id, userDetails);
    
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        String response = userService.login(request);
        return ResponseEntity.ok(response) ;
    }
    
}
