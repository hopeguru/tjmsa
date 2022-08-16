package com.hopeguru.tjmsa.MemberBenefitService.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hopeguru.tjmsa.MemberBenefitService.model.MemberBenefit;
import com.hopeguru.tjmsa.MemberBenefitService.service.MemberBenefitService;


@RestController
@RequestMapping(value="member-benefit-service/v1/member-benefit")
@Slf4j
public class MemberBenefitServiceController {

    @Autowired
    private MemberBenefitService service ;

    @GetMapping(value="/{memberid}")
    public ResponseEntity<MemberBenefit> getMember(@PathVariable("memberid") String memberid ) {
        log.debug("[member-benefit-service][controller]getMember:" + memberid );

        return ResponseEntity.ok(service.findBenefitById(memberid));
    }
}
