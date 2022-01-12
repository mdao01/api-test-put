package com.exemple.apitestput.models;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Error implements Serializable {
    private static final long serialVersionUID = 1L;

    private String code;
    private String message;
    private String nativeMessage;
    private String trackId;
}
