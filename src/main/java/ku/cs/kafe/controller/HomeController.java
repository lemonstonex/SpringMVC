package ku.cs.kafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Sawaddee");
        return "home";
    }

    // เรียก model.addAttribute() เพื่อส่งค่าของตัวแปร greeting ไปให้ไฟล์ home.html
    // ตัวแปร greeting จะต้องมีชื่อที่ตรงกับไฟล์ home.html

}
