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
@Table(name = "defendant")
public class Defendant implements Serializable {
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String maritalStatus;

  //  @OneToMany(mappedBy = "defendant")
  //  private List<Document> documentList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "proccess_id")
    private Proccess proccess;
}
