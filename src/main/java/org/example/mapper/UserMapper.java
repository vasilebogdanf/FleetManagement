package org.example.mapper;

import org.example.entity.User;
import org.example.model.UserRequest;
import org.example.model.UserResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponse map(User user);
    User map(UserRequest technicalInfoRequest);

    List<UserResponse> map(List<User> all);
}
