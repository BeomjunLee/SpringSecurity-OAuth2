package com.oauth2.annotation;

import com.oauth2.domain.SessionMember;
import lombok.RequiredArgsConstructor;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpSession;

@Component
@RequiredArgsConstructor
public class LoginMemberArgumentResolver implements HandlerMethodArgumentResolver {

    private final HttpSession session;

    //어노테이션을 지정한 파라미터가 여기서 지정한 파라미터랑 같으면 true를 반환해서 사용가능하게 한다
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        boolean annotation = parameter.getParameterAnnotation(LoginMember.class) != null;
        boolean equals = SessionMember.class.equals(parameter.getParameterType());
        return annotation && equals;
    }

    //내가 원하는 값을 설정해서 return
    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest,
                                  WebDataBinderFactory binderFactory) throws Exception {
        return session.getAttribute("member");
    }
}
