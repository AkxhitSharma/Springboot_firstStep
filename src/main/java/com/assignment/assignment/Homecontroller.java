package com.assignment.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homecontroller {

    @Autowired
    userrepo repo;

    @RequestMapping("/status")
    @ResponseBody
    public String home(){
        return "Ok";
    }
    
    @PostMapping("/register")
    @ResponseBody
    public userModel Register(@RequestBody userModel user){

        userModel userInfo = user;
        repo.save(user);
        userModel users= repo.findByemail(userInfo.email);
        return users;
    }

    @GetMapping("/login")
    @ResponseBody
    public userModel Login(@RequestBody logIn email){

        logIn userlog = email;
        userModel user= repo.findByemail(userlog.email);
        return user;
        
        
    }


}
