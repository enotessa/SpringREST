package com.epam.SpringREST;

import com.epam.exceptions.DivisionByZero;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/calculator")
    public Calculator calculator(@RequestParam(value="expression", defaultValue="") String expression) throws DivisionByZero {
        return new Calculator(expression);
    }
}
