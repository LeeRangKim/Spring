package com.example.diary.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value="/main", method = RequestMethod.GET)
    public ModelAndView main(){
        logger.info("main() called...");
        return new ModelAndView("main");
    }

    @RequestMapping(value = "diary/create", method = RequestMethod.GET)
    public ModelAndView create() {
        return new ModelAndView("/diary/create");
    }


}
