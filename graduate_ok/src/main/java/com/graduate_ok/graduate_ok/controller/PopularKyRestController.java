package com.graduate_ok.graduate_ok.controller;

import com.graduate_ok.graduate_ok.dto.KyListDto;
import com.graduate_ok.graduate_ok.service.serviceImpl.PopularKyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/KyRecommend")
@RequiredArgsConstructor
public class PopularKyRestController {
    private final PopularKyServiceImpl popularKyService;

    @GetMapping("/list")
    public List<KyListDto> selectKyList(){
        return popularKyService.selectKyList();
    }
}
