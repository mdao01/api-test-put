package com.exemple.apitestput.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "judge")
public class Judge implements Serializable {
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String county;
    private String documents;

    @OneToMany(mappedBy = "judge")
    private List<Document> documentList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "proccess_id")
    private Proccess proccess;
}
