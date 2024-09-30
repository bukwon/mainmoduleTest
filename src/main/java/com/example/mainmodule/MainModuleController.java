package com.example.mainmodule;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.submodule.submodule.SubModule;


@RestController
public class MainModuleController {

    @GetMapping("/sub")
    @ResponseBody
    public String getMethodName() {
        SubModule subModule = new SubModule();
        String tmp = String.valueOf(subModule.calc(3, 5));
        
        return tmp;
    }
}
