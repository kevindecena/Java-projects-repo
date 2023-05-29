package com.AopSample.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    //Pointcut - when?
    //execution(* PACKAGE.*.*(..))
    // BusinessService1.java
    @Before("execution(* business.*.*(..))") //when
    public void logMethodCall(JoinPoint joinPoint){//logic
        logger.info("Before Aspect - Method is called - {}", joinPoint); //what
    }

    // ASPECT IS THE COMBINATION OF ADVICE AND POINTCUT, WHAT AND WHERE TO DO ACROSS ALL LAYERS
    //ADVICE IS THE "WHAT" E.G. WHAT TO DO OR CODE TO EXECUTE, LOGGING, AUTHENTICATION, PERFORMANCE, ETC.
    //POINTCUT IS THE "WHEN" E.G. @BEFORE @AFTER @AROUND, @AFTERRETURNING, ETC.
}
