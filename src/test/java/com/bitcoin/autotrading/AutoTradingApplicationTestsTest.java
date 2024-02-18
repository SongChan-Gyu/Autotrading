package com.bitcoin.autotrading;

import lombok.extern.slf4j.Slf4j;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

@Slf4j
public class AutoTradingApplicationTestsTest {
    private LocalDateTime srtDttm;

    @org.junit.Test
    public void test1() {
        for(int i=0; i<3; i++) {
        log.info("테스트 ㅋ_ㅋ");
            String str = "2023-12-18T22:32;";
            String format = str.format(String.valueOf(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            log.info("테스트 ㅇ_ㅇ" + format);

        }
    }
}