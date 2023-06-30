package com.example.javatestdto.controller;

import com.example.javatestdto.model.Book;
import com.example.javatestdto.model.User;
import com.example.javatestdto.service.BookServiceImpl;
import com.example.javatestdto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private BookServiceImpl bookService;


    @GetMapping("/api/user/{id}")
    public User findUserBydid(@PathVariable("id")Long id){
        return  this.userService.getUserById(id);
    }

    @PostMapping("/api/book/{id}")
    public void addBook(@PathVariable("id")int userId, @RequestBody Book book){
          User user=this.userService.getUserById((long) userId);

          //
          book.addAuteur(user);
          book=this.bookService.addBook(book);

          user.addBook(book);
          this.userService.createUser(user);
    }

    @GetMapping("/api/users")
   public List<User>getUsers(){
        return  this.userService.getAllUsers();
   }

   @CrossOrigin("*")
   @PostMapping("/api/post/user")
   public  User saveUser(@RequestBody User user){
        return this.userService.createUser(user);
   }
   @DeleteMapping("/api/delete/{id}")
   public  void deleteUser(@PathVariable("id") Long userId){
        this.userService.deleteUser(userId);
   }

}
