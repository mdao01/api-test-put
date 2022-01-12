package com.exemple.apitestput.dto;

import com.exemple.apitestput.models.Authors;
import com.exemple.apitestput.models.Proccess;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AuthorDTO {

    private Long id;
    private String name;
    private String maritalStatus;

    private Proccess proccess;
    private Authors authors;
}
