package th.co.GarageBack.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
// @RequestMapping(value = "screen")
public class WelcomeCtrl {
    @GetMapping(value = "/Test")
    public String getAllMenuScreen() throws Exception {
        System.out.println(" TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT ");
        return "HELLO WORLD";
    }
}
