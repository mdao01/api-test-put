package com.exemple.apitestput.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProccessDTO {

    private int id;
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
    private int numAccident;
    private Number valueRiskIni;
}
