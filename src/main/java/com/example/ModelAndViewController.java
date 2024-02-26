package com.example;

import com.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ModelAndViewController {
    @GetMapping("/showViewPage")
    public String passParametersWithModel(Model model){
        model.addAttribute("message", "Perscholas");
        model.addAttribute("welcomeMessage", "welcome");
        int i=10;
        model.addAttribute("number",i);
        List<String> list= Arrays.asList("one","two");
        model.addAttribute("listData",list);
        return "viewPage";
    }

    @GetMapping("/goToUserViewPage")
    public ModelAndView UserModelAndView(){
        List<User> listUsers=new ArrayList<User>();
        listUsers.add(new User(1,"Zuhal","testz@gmail.com"));
        listUsers.add(new User(2,"John","testJ@gmail.com"));
        listUsers.add(new User(3,"Susan" ,"testS@gmail.com"));
        listUsers.add(new User(4,"Mario","testcat@gmail.com"));

        ModelAndView modelAndView = new ModelAndView("userdata");
        modelAndView.addObject("userlist",listUsers);
        return modelAndView;
    }
}
