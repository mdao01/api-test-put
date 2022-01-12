package com.exemple.apitestput.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JudgeDTO {

    private int id;
    private String name;
    private String county;
    private String documents;
}
