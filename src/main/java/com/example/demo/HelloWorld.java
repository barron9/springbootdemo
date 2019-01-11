package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorld {

  //  @RequestMapping("/")
 //   public String index(){
  //      return "testing";
   // }
    @RequestMapping("/")
    public HashMap<String, Object> get() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("productname", "lebron");
        map.put("imageuri", "require('./mocksource/lebron.jpg')");
        map.put("price", 120);

        return map;
    }

    @RequestMapping(value = "/getString", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String method9(@RequestParam("id") String id){
        return "method9 with id= "+id;
    }


    @RequestMapping(value = "/getString2", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map getString() {
        return Collections.singletonMap("response", "Hello World");
    }
}
