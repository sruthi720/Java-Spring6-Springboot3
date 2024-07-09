package com.telusko.SpringBootWeb1;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("language   ")
    public String courseName(){
        return "Java";
    }

    @RequestMapping("/home")
    public String home(){
        System.out.println("Hello world");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int var, int num2 , ModelAndView mv){
        System.out.println("In add");

        int result =var+num2;

        mv.addObject("result",result);
        mv.setViewName("result");

        return mv;
    }
    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute("alien44") Alien alien){

        return "result";
    }


}


/*
@RequestMapping("addAlien")
    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname , ModelAndView mv){

        Alien alien = new Alien();
        alien.setAid(aid);
        alien.setAname(aname);

        mv.addObject("alien",alien);
        mv.setViewName("result");

        return mv;
    }
 */

//<%= session.getAttribute("result")%> or ${result}

/*   selvlet way of doing this----
public String add(HttpServletRequest req , HttpSession session){
    System.out.println("In add");
    int num1 = Integer.parseInt(req.getParameter("num1"));
    int num2 = Integer.parseInt(req.getParameter("num2"));
    int result =num1+num2;

    session.setAttribute("result",result);

    return "result.jsp";

    */

/*
    public String add(@RequestParam("num1") int var, int num2 , Model model){
        System.out.println("In add");

        int result =var+num2;

//        session.setAttribute("result",result);
        model.addAttribute("result",result);

        return "result";
    }
*/
