package com.oauth2.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)  //어노테이션을 어디에 쓸지 -> 파라미터 값에 사용할것
@Retention(RetentionPolicy.RUNTIME) //어떤 시점까지 어노테이션이 영향을 미칠지 -> 런타임시에 정보를 얻어 사용할 수 있음
public @interface LoginMember {
    
}
