package org.example.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "mandatory field")
    private String name;

    @OneToMany(cascade = {CascadeType.ALL},mappedBy = "company")
    @Builder.Default
    private final List<User> users=new ArrayList<>();
}
