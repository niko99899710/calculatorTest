package com.example.calculatortest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ServiceCalculator;
@RestController
public class Controller {
        private final ServiceCalculator calculateService;
        private final ServiceCalculator serviceCalculator;
        private final ServiceCalculator service12;

    public Controller() {
            this(null, null, null);
        }

    public Controller(ServiceCalculator calculateService, ServiceCalculator serviceCalculator, ServiceCalculator service12) {
        this.calculateService = calculateService;
        this.serviceCalculator = serviceCalculator;
        this.service12 = service12;
    }


    @GetMapping
        public String Calculator () {
            return calculateService.calculator();
        }

        @GetMapping(path = "/calculator/")
        public String writeCalculator () {
            return calculateService.writeCalculator();
        }
        @GetMapping (path = "/calculator/plus")
        public Integer plus(@RequestParam Integer num1, @RequestParam Integer num2) {
            return calculateService.plus(num1, num2);
        }

        @GetMapping (path = "/calculator/minus")
        public Integer minus(@RequestParam Integer num1, @RequestParam Integer num2) {
            return calculateService.minus(num1, num2);
        }

        @GetMapping (path = "/calculator/multiply")
        public Integer multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
            return calculateService.multiply(num1, num2);
        }

        @GetMapping (path = "/calculator/divide")
        public Integer divide(@RequestParam Integer num1, @RequestParam Integer num2) {
            return calculateService.divide(num1, num2);
        }
    }

