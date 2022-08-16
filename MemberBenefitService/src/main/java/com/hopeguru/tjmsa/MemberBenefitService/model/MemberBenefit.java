package com.hopeguru.tjmsa.MemberBenefitService.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class MemberBenefit {
    String memberid = ""  ;
    int qpoint  = 0 ;
    int qcash  = 0 ;
}
