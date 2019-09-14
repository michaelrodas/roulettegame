package com.jumbo.hackathon.roulettegame.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WheelGameController {
    @Value("${spring.application.name}")
    String appName;
    @Value("${application.page.wheel}")
    String wheelPage;
    @Value("${application.prizes.1}")
    String prize1;
    @Value("${application.prizes.2}")
    String prize2;
    @Value("${application.prizes.3}")
    String prize3;
    @Value("${application.prizes.4}")
    String prize4;
    @Value("${application.prizes.5}")
    String prize5;
    @Value("${application.prizes.6}")
    String prize6;
    @Value("${application.prizes.7}")
    String prize7;
    @Value("${application.prizes.8}")
    String prize8;

    @GetMapping("/game")
    public String wheelGamePage(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("prize1", prize1);
        model.addAttribute("prize2", prize2);
        model.addAttribute("prize3", prize3);
        model.addAttribute("prize4", prize4);
        model.addAttribute("prize5", prize5);
        model.addAttribute("prize6", prize6);
        model.addAttribute("prize7", prize7);
        model.addAttribute("prize8", prize8);

        return wheelPage;
    }
}