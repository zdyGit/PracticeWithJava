package springaop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AspectTest {

    @Pointcut("execution(* springaop.ActionTest.*())")
    public void pointCut(){};

    @Before("pointCut()")
    public void doBefore(JoinPoint jp){
        System.out.println("do before");
    }

    @AfterReturning(pointcut = "pointCut()",returning="result")
    public void doAfterReturning(JoinPoint jp,String result){
        System.out.println("do after returning");
    }

    @After("pointCut()")
    public void doAfter(JoinPoint jp){
        System.out.println("do after");
    }

    @Around("pointCut()")
    public Object doAround(ProceedingJoinPoint jp) throws Throwable{

        System.out.println("======执行环绕通知开始=========");

        Object result=jp.proceed();

        System.out.println("======执行环绕通知结束=========");
        return result;
    }

    @AfterThrowing(pointcut = "pointCut()",throwing="ex")
    public void doAfterThrowing(JoinPoint jp,Exception ex) {
        System.out.println("=doAfterThrowing");
    }

}
