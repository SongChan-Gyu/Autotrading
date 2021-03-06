package com.bitcoin.autotrading.common.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/*")
@Slf4j
@RequiredArgsConstructor
public class StartAutotrading {

    private final JobScheduler jobScheduler;

    @RequestMapping("/test")
    public String test(){
        return "test";
    }


    @RequestMapping("/start")
    public String start(){

        return "start";
    }

    @RequestMapping("/stop")
    public String stop(){

        return "stop";
    }

}
