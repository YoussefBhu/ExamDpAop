package com.example.demo.AspectT;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LogAspect {
    private Logger logger=Logger.getLogger(LogAspect.class.getName());

    public LogAspect() throws IOException {

        logger.addHandler(new FileHandler("Cache.xml"));
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.FINEST);
    }

    @Around("@annotation(Log)")
    public Object MakeCache(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        double t1 = System.currentTimeMillis();
        logger.info("Commencement d'execution de "+proceedingJoinPoint.getSignature().getName());
        Object o = proceedingJoinPoint.proceed();
        double t2 = System.currentTimeMillis();
        logger.info("Fin d'execution de "+proceedingJoinPoint.getSignature().getName()+" dans "+(t2-t1)+"s");
        return o ;
    }
}
