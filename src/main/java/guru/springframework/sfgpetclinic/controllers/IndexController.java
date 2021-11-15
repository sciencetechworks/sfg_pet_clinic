/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Usuario
 */
@Controller
public class IndexController {
    
    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }
    
    @RequestMapping("/oups")
    public String oupsHandler(){
        return "notimplemented";
    }
    
    
}
