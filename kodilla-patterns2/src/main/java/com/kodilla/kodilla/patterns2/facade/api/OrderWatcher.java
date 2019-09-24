package com.kodilla.kodilla.patterns2.facade.api;

import com.kodilla.kodilla.patterns2.aop.calculator.Wather;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(Wather.class);

    @Before("execution(* com.kodilla.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")

        public void processLog(){

                LOGGER.info("PROCESS ORDER LOG FROM PROCESSING THE METHOD");

        }
}
