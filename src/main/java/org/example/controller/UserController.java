package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.UserRequest;
import org.example.model.UserResponse;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserResponse> findAll(){
     return userService.findAll();
    }

    @GetMapping("{id}")
    public UserResponse findById(@PathVariable Integer id){
        return userService.findById(id);
    }

    @PostMapping
    public UserResponse save(@RequestBody UserRequest technicalInfoRequest){
        return userService.save(technicalInfoRequest);
    }

    @GetMapping("search/{name}")
    public List<UserResponse> findByName(@PathVariable("name") String name) {
        return userService.findByName(name);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        userService.deleteById(id);
    }
    @PatchMapping("{id}")
    public UserResponse updateById(@RequestBody UserRequest technicalInfoRequest, @PathVariable("id") Integer id) {
        return userService.updateById(technicalInfoRequest,id);
    }
}
