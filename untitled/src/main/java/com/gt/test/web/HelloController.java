package com.gt.test.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangguangtao
 * @date 2023/6/7
 * @apiNote
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return	"Hello	world!";
    }


}
