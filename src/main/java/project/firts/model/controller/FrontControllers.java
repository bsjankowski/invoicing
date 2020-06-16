package project.firts.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import project.firts.model.Invoices;
import project.firts.repository.LettersRepository;

import java.util.List;

@Controller
public class FrontControllers {

  
    @GetMapping
    public String frontPageHome(Model model){
        model.addAttribute("invoices", new Invoices());
        return "index";
    }



}
