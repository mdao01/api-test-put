package com.exemple.apitestput.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "AUTHOR")
public class Author implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String maritalStatus;

    /*
    @OneToMany(mappedBy = "author")
    private List<Document> documentList = new ArrayList<>();
     */

    @ManyToOne
    @JoinColumn(name = "proccess_id")
    private Proccess proccess;

    @ManyToOne
    @JoinColumn(name = "authors_id")
    private Authors authors;
}
