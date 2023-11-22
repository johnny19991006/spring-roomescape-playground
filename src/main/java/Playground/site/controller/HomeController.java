package Playground.site.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequiredArgsConstructor
public class HomeController {
    @RequestMapping("/")
    public String siteList(){
        return "home";
    }
}
