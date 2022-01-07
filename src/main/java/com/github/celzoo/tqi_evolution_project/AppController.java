package com.github.celzoo.tqi_evolution_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import java.util.List;

@Controller
public class AppController {

    @Autowired
    private UserRepository repo;
    @GetMapping("")
    public String viewHomePage(){
        return  "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        model.addAttribute("user", new User());
        return "register_form";
    }

    @PostMapping("/process_register")
    public String registration(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        repo.save(user);

        return "end_register";


    }

  @GetMapping("/success_login")
    public String  userOptions(){

        return "userpage";
  }

  @GetMapping("/installment")
        public String makeLoan(Model model){
       model.addAttribute("user" ,new User());



     return "newloan";

      }


    @PostMapping("/loan_register")
    public String userLoan(User user){
    repo.save(user);




      return "userpage";
    }

    @GetMapping("/viewloan")
    public String viewLoan(Model model){
        List<User> userdata = repo.findAll();
        model.addAttribute("userdata",userdata);


        return "loanpage";

    }
    @GetMapping("/detailedloan")
    public String detailedloan(Model model){
        List<User> userdata = repo.findAll();
        model.addAttribute("userdata",userdata);


        return "detailedloan";

    }
    @GetMapping("/back")
    public String mainpage(){

        return "userpage";

    }



}
