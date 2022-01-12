package com.exemple.apitestput.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "lawyer")
public class Lawyer implements Serializable {
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String code;

    @ManyToOne
    @JoinColumn(name = "proccess_id")
    private Proccess proccess;
}
