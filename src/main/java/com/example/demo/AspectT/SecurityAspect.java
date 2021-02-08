package com.example.demo.AspectT;

import com.example.demo.Context.ApplicationContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class SecurityAspect {

    @Around("@annotation(secured)")
    public void Secured(ProceedingJoinPoint pjp , Secured secured) throws Throwable {
        for(String role : secured.roles()){
            if(ApplicationContext.hasRole(role)){
                pjp.proceed();
                return;
            }
        }
        System.out.println("vous avez pas le droit necessaire!!");
    }
}

