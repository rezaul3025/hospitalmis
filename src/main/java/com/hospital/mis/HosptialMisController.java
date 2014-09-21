/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.mis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author unixmac
 */
@Controller
public class HosptialMisController
{
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String initHMis(Model model)
    {
        
        return "home";
    }
}
