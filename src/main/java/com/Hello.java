package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by arvin.villaruz on 1/24/2017.
 */

@RestController
public class Hello {
  @RequestMapping("/")
  public String welcome(@RequestParam(value="name", defaultValue="World") String name) {
    return "Welcome " + name;
  }
}
