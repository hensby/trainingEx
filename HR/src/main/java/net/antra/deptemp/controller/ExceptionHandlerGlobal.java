package net.antra.deptemp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerGlobal {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandlerGlobal.class);
    @ExceptionHandler(Exception.class)
    public String error(Exception e){
        logger.error("Exception ",e);
        return "redirect:/server_error";
    }

}
