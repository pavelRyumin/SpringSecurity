package com.ryumin.spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getInfoForAllEmps() {
        return "view_for_all_employees";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyOfHR() {
        return "view_for_hr";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyManagers() {
        return "view_for_managers";
    }
}
