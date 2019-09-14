package com.jumbo.hackathon.roulettegame.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Controller
public class CustomExperienceController {
    @Value("${spring.application.name}")
    String appName;
    @Value("${application.page.custom}")
    String customPage;

    @GetMapping("/custom")
    public String customPage(Model model,
                                @RequestParam(name = "customername", required = false) String customerName,
                                @RequestParam(name = "shoppingdate", required = false) String shoppingDate) {
        model.addAttribute("appName", appName);
        model.addAttribute("customerName", customerName);//LocalDate.now(ZoneId.of("CET")).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
        model.addAttribute("lastShoppingDate", shoppingDate);
        return customPage;
    }
}
