package com.exemple.apitestput.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@EqualsAndHashCode
@Entity
public class Cause implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cause;

    @ManyToOne
    @JoinColumn(name = "proccess_id")
    private Proccess proccess;
}

