package com.example.pharmacy.service;

import com.example.pharmacy.dto.KakaoApiResponseDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KakaoAddressSearchServiceTest {
    @Autowired
    KakaoAddressSearchService kakaoAddressSearchService;

    @Autowired
    KakaoCategorySearchService kakaoCategorySearchService;

    @Test
    @DisplayName("API KEY Test")
    void test() {
        kakaoAddressSearchService.apikeyTest();
    }

    @Test
    @DisplayName("Make URI String Test")
    void uriTest() {
        KakaoApiResponseDto dto = new KakaoApiResponseDto();
        dto = kakaoAddressSearchService
                .requestAddressSearch("강남대로 405");
        System.out.println(dto);
    }

    @Test
    @DisplayName("Search Category Tset")
    void categoryTest() {
        KakaoApiResponseDto dto = new KakaoApiResponseDto();
        double x = 127.026692446306;
        double y = 37.4987750083767;
        double radius = 1000;

        dto = kakaoCategorySearchService
                .resultCategorySearch(x, y, radius);
        System.out.println(dto);

    }

}