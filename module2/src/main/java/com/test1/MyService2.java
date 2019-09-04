package com.test1;


import com.test2.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Qualifier("myService2")
@RequestMapping(value ={"/web"} ,method = RequestMethod.POST,consumes="text/plain",headers="sign")
public class MyService2 {

    @Autowired
    private MyService myService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public void test(){

//        MyService userPoJpaRepository = SpringUtils.getBean(MyService.class);
        myService.test();
        System.out.println("============"+myService);
    }
}
