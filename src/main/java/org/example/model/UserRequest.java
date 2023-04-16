package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    @Id
    private Integer id;

    @NotBlank(message = "name is mandatory")
    private String name;

    @NotBlank(message = "password is mandatory")
    private String password;
}
