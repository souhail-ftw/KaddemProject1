package tn.ey.dev.kaddemproject.Aspects;

public class Logging {import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

    @Component
    @Aspect
    @Slf4j
    public class Logging {
        @Before("execution(* tn.ey.dev.KaddemProject..*.*(..))")
        public void logMethodEntry(JoinPoint joinPoint){
            String name = joinPoint.getSignature().getName();
            String type = joinPoint.getSignature().getDeclaringTypeName();
            if(name.startsWith("get")){
                log.info("entre to method "+name);
            }
        }
        @After("execution(* tn.ey.dev.KaddemProject..*.*(..))")
        public void logMethodExit(JoinPoint joinPoint){
            String name = joinPoint.getSignature().getName();
            String type = joinPoint.getSignature().getDeclaringTypeName();

            log.info("out of method "+name);

        }












    }

}
