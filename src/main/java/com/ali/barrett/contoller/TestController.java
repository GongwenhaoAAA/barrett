package com.ali.barrett.contoller;

import com.ali.barrett.entity.Apply;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ali")
public class TestController {

    @RequestMapping("/test")
    public String test(){
        Apply apply = new Apply();
        apply.test();
        return "李雨婷是个小可爱吗？";
    }

    public static void main(String[] args) {
        System.out.println("???");
        Apply apply = new Apply();

        String property = System.getProperty("sun.boot.class.path");
        String com = System.getProperty("java.class.path");
        System.out.println(property.replaceAll(";",System.lineSeparator()));
        System.out.println("-----------------");
        System.out.println(com.replaceAll(";",System.lineSeparator()));
        System.out.println(apply.getClass().getClassLoader());
    }
}
