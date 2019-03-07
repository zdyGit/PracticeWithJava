package springaop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@org.aspectj.lang.annotation.Aspect
public class Aspect {

    private final String aopPointCutExpress = "";
    @Before(aopPointCutExpress)
    public void doBefore(JoinPoint jp){
        System.out.println("do before");
    }

    @AfterReturning(value = aopPointCutExpress)
    public void doAfterReturning(JoinPoint jp,String Result){
        System.out.println("do after returning");
    }

    @After( aopPointCutExpress)
    public void doAfter(JoinPoint jp){
        System.out.println("do after");
    }

    @Around(aopPointCutExpress)
    public Object doAround(ProceedingJoinPoint jp) throws Throwable{

        System.out.println("======执行环绕通知开始=========");
        // 调用方法的参数
        Object[] args = jp.getArgs();
        // 调用的方法名
        String method = jp.getSignature().getName();
        // 获取目标对象
        Object target = jp.getTarget();
        // 执行完方法的返回值
        // 调用proceed()方法，就会触发切入点方法执行
        Object result=jp.proceed();
        System.out.println("输出,方法名：" + method + ";目标对象：" + target + ";返回值：" + result);
        System.out.println("======执行环绕通知结束=========");
        return result;
    }

    @AfterThrowing(value=aopPointCutExpress,throwing="ex")
    public void doAfterThrowing(JoinPoint jp,Exception ex) {
        System.out.println("=doAfterThrowing");
    }

    //https://www.cnblogs.com/xiaoxi/p/5981514.html
}
