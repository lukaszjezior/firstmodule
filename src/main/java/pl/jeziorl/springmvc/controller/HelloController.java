package pl.jeziorl.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.jeziorl.springmvc.service.HelloService;

@Controller
@RequestMapping(value = "/hellocontroller")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return helloService.hello();
    }

}