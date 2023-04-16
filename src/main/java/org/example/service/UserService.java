package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.User;
import org.example.exception.BusinessException;
import org.example.mapper.UserMapper;
import org.example.model.UserRequest;
import org.example.model.UserResponse;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    public List<UserResponse> findAll() {
        return userMapper.map(userRepository.findAll());
    }

    public UserResponse findById(Integer id) {
        User user = userRepository.findById(id).orElseThrow(()
                -> new BusinessException("Cannot find the user with ID: " + id));
        return userMapper.map(user);
    }
    public UserResponse save(UserRequest technicalInfoRequest) {
        User user=userMapper.map(technicalInfoRequest);
        return userMapper.map(userRepository.save(user));
    }


    public List<UserResponse> findByName(String name) {
        List<User> byName = userRepository.findByName(name);
        return userMapper.map(byName);
    }

    public void deleteById(Integer id) {
        User user = userRepository.findById(id).orElseThrow(()
                -> new BusinessException("Cannot find with Id " + id));
        userRepository.deleteById(user.getId());
    }

    public UserResponse updateById(UserRequest technicalInfoRequest, Integer id) {
       User user=userRepository.findById(id).orElseThrow(()
                -> new BusinessException("Cannot find the company with ID: " + id));
        user.setName(technicalInfoRequest.getName());
        return userMapper.map(userRepository.save(user));
    }
}
