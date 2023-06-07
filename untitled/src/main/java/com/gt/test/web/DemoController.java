package com.gt.test.web;

import com.gt.test.bean.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangguangtao
 * @date 2023/6/7
 * @apiNote
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    /**
     * 返回 demo 数据:
     * 请求地址：http://127.0.0.1:8080/demo/getDemo
     * @return
     */
    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("zhangsan");
        return demo;
    }
}
