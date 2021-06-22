 package com.makotojava.learn.hellospringboot;

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        @RestController
        public class HelloRestController {

          @RequestMapping("/hola")
          public String hello() {
            return "Hello. My name is Moises Casaverde and I work with Spring boot and REST Services :-)";
          }
        }
