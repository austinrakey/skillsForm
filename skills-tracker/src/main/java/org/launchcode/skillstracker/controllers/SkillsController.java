package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
public String SkillsTracker(){return "<html><body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Languages:</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>C++</li>" +
                "</ol>" +
                "</body></html>";
    }


    @GetMapping("/form")
    @ResponseBody
    public String skillForm() {
        return "<html><body>" +
                "<form action='/form' method='post'>" +
                "Name: <input type='text' name='name'><br>" +
                "Favorite Language: <select name='favorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br>" +
                "Second Favorite Language: <select name='secondFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br>" +
                "Third Favorite Language: <select name='thirdFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body></html>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String processForm(@RequestParam String name,
                              @RequestParam String favorite,
                              @RequestParam String secondFavorite,
                              @RequestParam String thirdFavorite) {
        return "<html><body>" +
                "<h1>Hello, " + name + "</h1>" +
                "<ol>" +
                "<li>" + favorite + "</li>" +
                "<li>" + secondFavorite + "</li>" +
                "<li>" + thirdFavorite + "</li>" +
                "</ol>" +
                "</body></html>";
    }
}