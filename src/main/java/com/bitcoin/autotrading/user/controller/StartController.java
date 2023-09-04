package com.bitcoin.autotrading.user.controller;

import com.bitcoin.autotrading.candle.service.GetRsiByDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.text.ParseException;

@Controller
@Slf4j
public class StartController {

    @Autowired
    public GetRsiByDay getRsiByDay;


    @RequestMapping("/")
    public String index(Model model) throws IOException, JSONException, ParseException {
//        log.info("index탔어");
//        double rsi = getRsiByDay.GetRsiBy();
//        model.addAttribute("rsi",rsi);
        return "index";
    }

    @RequestMapping("/test")
    public String accountInfo(Model model) throws IOException {
        return "test";
    }
}
