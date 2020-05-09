package com.uca.capas.controller;


import com.uca.capas.domain.Producto;
import com.uca.capas.domain.Robot;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class MainController {


    @RequestMapping("/producto")
    public ModelAndView main(){
        Producto producto = new Producto();
        ModelAndView mav = new ModelAndView();
        mav.addObject("producto",producto);
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("/formproducto")
    public ModelAndView formProducto(@Valid @ModelAttribute Producto producto, BindingResult result){
        ModelAndView mav = new ModelAndView();
        if(result.hasErrors()){
            mav.setViewName("index");
        }else {
            Robot robot = new Robot();
            mav.addObject("robot",robot);
            mav.setViewName("robot");
        }
        return mav;
    }

    @RequestMapping("/seguridad")
    public ModelAndView formseguridad(@Valid @ModelAttribute Robot robot, BindingResult result){
        ModelAndView mav = new ModelAndView();
        if(result.hasErrors()){
            mav.setViewName("robot");
        }else {
            mav.setViewName("exito");
        }
        return mav;
    }
}
