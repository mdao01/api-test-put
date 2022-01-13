package com.exemple.apitestput.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "proccess")
public class Proccess implements Serializable {
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String dateOfCourtService;
    private String distributionDate;
    private String eventDate;
    private String typeCourt;
    private String codeCourt;
    private String nameCourt;
    private String numberCourt;
    private Integer codeClassification;
    private String maritalStatus;
    private String processOwner;
    private Boolean auction;
    private Boolean negative;
    private String dateNegative;
    private String irregularity;
    private Boolean compensation;
    private String mAction;
    private String subMAction;
    private Boolean answeredQuestionnaire;
    private String type;
    private String lostRisk;
    private Boolean isSentence;
    private String grau;
    private String phaseProc;
    private String sentenceFirstGrau;
    private String sentenceSecondGrau;
    private String finalDecision;
    private String reasonOper;
    private String tesAutDefe;
    private String evidence;
    private String liminal;
    private String textLiminar;
    private Boolean agreement;
    private Boolean assistant;
    private Boolean denunLide;
    private String numAccident;
    private Number valueRiskIni;

    @OneToMany(mappedBy = "proccess")
    private List<Action> actionList = new ArrayList<>();

    @OneToMany(mappedBy = "proccess")
    private List<Author> authorList = new ArrayList<>();

    @OneToMany(mappedBy = "proccess")
    private List<Cause> causeList = new ArrayList<>();

    @OneToMany(mappedBy = "proccess")
    private List<Defendant> defendantList = new ArrayList<>();

    @OneToMany(mappedBy = "proccess")
    private List<Injuction> injuctionList = new ArrayList<>();

    @OneToMany(mappedBy = "proccess")
    private List<Judge> judgeList = new ArrayList<>();

    @OneToMany(mappedBy = "proccess")
    private List<Lawyer> lawyerList = new ArrayList<>();

    @OneToMany(mappedBy = "proccess")
    private List<Procedure> procedureList = new ArrayList<>();

    @OneToMany(mappedBy = "proccess")
    private List<Provider> providerList = new ArrayList<>();


}
