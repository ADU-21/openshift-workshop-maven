package adu.openshift.maven.spring.boot.workshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yidong
 * @date 2019/2/17
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "hello, world!";
    }
}
