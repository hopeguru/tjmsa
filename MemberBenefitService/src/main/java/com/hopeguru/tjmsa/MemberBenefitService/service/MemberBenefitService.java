package com.hopeguru.tjmsa.MemberBenefitService.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

// import  classes
import com.hopeguru.tjmsa.MemberBenefitService.model.MemberBenefit;


@Service
@RequiredArgsConstructor
@Slf4j
public class MemberBenefitService {

        public MemberBenefit findBenefitById(String memberid){
            log.debug("[member-benefit-service][service]findBenfitById:" + memberid );
            return new MemberBenefit(memberid , 0, 0 );
        }

        public MemberBenefit createMemberBenefit(String memberid , int qpoint , int qcash ){
            log.debug("[member-benefit-service][service]createMemberBenefit:" + memberid );
            MemberBenefit benefit = new MemberBenefit(memberid , qpoint , qcash );
            return benefit ;
        }
}
