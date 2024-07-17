package com.telusko.spring_data_rest.AOP;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {

//	@Before("execution (* com.telusko.springbootrest.service.JobService.getJob(..)) || execution(* com.telusko.springbootrest.service.JobService.updateJob(..))")

//    @Before("execution (* com.telusko.spring_data_rest.service.JobService.getJob(..))")


    public static final Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution (* com.telusko.spring_data_rest.service.JobService.getJob(..)) || execution(* com.telusko.spring_data_rest.service.JobService.updateJob(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method Called "+jp.getSignature().getName());
    }



    @After("execution (* com.telusko.spring_data_rest.service.JobService.getJob(..)) || execution(* com.telusko.spring_data_rest.service.JobService.updateJob(..))")
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info("Method Executed "+jp.getSignature().getName());
    }


    @AfterThrowing("execution (* com.telusko.spring_data_rest.service.JobService.getJob(..)) || execution(* com.telusko.spring_data_rest.service.JobService.updateJob(..))")
    public void logMethodCrashed(JoinPoint jp) {
        LOGGER.info("Method has some issues "+jp.getSignature().getName());
    }



    @AfterReturning("execution (* com.telusko.spring_data_rest.service.JobService.getJob(..)) || execution(* com.telusko.spring_data_rest.service.JobService.updateJob(..))")
    public void logMethodExecutedSuccess(JoinPoint jp) {
        LOGGER.info("Method Executed Successfully "+jp.getSignature().getName());
    }



}