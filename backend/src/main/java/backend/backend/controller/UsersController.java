package backend.backend.controller;

import org.springframework.web.bind.annotation.RestController;

import backend.backend.entity.Users;
import backend.backend.ropository.UsersRepository;


import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api")
public class UsersController {
    private final UsersRepository repository;

    public UsersController(UsersRepository repository){
        this.repository = repository;
    }

    @GetMapping("/users")
    List<Users> all(){
        return repository.findAll();
    }
    
    @PostMapping("/users")
    Users newUsers(@RequestBody Users newUsers){
        return repository.save(newUsers);
    }

    @GetMapping("/users/{id}")
    Users one(@PathVariable long id) {
        
        return repository.findById(id).orElseThrow();
    }
    
    @PutMapping("/users/{id}")
    Users replaceUsers(@RequestBody Users newUsers, @PathVariable Long id) {
        
        return repository.findById(id).map(user->{
            user.setName(newUsers.getName());
            return repository.save(user);
        }).orElseGet(()->{
            newUsers.setID(id);
            return repository.save(newUsers);
        });
    }

    @DeleteMapping("/users/{id}")
    void deleteUsers(@PathVariable Long id){
            repository.deleteById(id);
    }
}
