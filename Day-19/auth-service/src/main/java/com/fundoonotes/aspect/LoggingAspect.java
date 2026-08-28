package com.fundoonotes.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Around("execution(* com.fundoonotes.service..*(..))")
    public Object logMethodExecution(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().getName();

        log.info("Entering method: {}", methodName);

        try {
            Object result = joinPoint.proceed();

            log.info("Exiting method: {}", methodName);

            return result;

        } catch (Exception e) {

            log.error("Exception occurred in method: {}", methodName, e);  

            throw e;
        }
    }
}