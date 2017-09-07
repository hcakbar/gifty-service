package controller;

import domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.UsersRepository;

import java.util.List;

/**
 * Created by hcakb on 8/20/2017.
 */

//@RestController
@RequestMapping("/users")
public class UsersController {

    private UsersRepository usersRepository;

    @Autowired
    public UsersController(UsersRepository usersRepository) {

        this.usersRepository = usersRepository;
    }

    @GetMapping("/all")
    public List<Users> getUsers() {

        List<Users> usersList = this.usersRepository.findAll();
        return usersList;
    }

    @PutMapping
    public void insert(
        @RequestBody
            Users users) {

        this.usersRepository.insert(users);
    }

    @PostMapping
    public void update(
        @RequestBody
            Users users) {

        this.usersRepository.save(users);
    }

    @DeleteMapping("/{fName}")
    public void delete(
        @PathVariable("fName")
            String fName) {

        this.usersRepository.delete(fName);
    }
}
