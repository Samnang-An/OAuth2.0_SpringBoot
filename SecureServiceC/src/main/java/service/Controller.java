package service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


  @GetMapping("/phone")
  public String getGetSalary() {
    return "+1641451828272";
  }

}

