# SpringSecurity-OAuth2

Google, Naver Oauth2 사용

<br><br>

## OAuth2 작동원리

(A) (앱→사용자) 사용자 데이터에 접근하기 위한 권한을 요청합니다. 개념상 앱이 사용자에게 요청하지만, 실제 구현은 앱과 사용자 사이에 권한 제공기관이 중개 역할을 하는 경우가 일반적입니다.

(B) (사용자→앱) 접근에 동의함을 증명하는 권한 부여 동의서(Authorization Grant)를 발급합니다. RFC 6749에서는 4가지 유형의 권한 부여 동의서를 정의하고 있는데 앱의 유형 및 권한 제공기관의 지원 여부에 따라 사용할 권한 부여 동의서의 유형이 결정됩니다

(C) (앱→권한 제공기관) 권한 부여 동의서를 제출하여 접근 토큰을 요청합니다. 접근 토큰은 사용자 데이터를 잠근 자물쇠를 여는 열쇠입니다

(D) (권한 제공기관→앱) 권한 부여 동의서를 확인하여 사용자가 동의한 데이터 항목, 범위 및 기간 등에 대한 정보가 담긴 접근 토큰을 제공합니다
즉, 사용자 데이터에 접근할 때 사용할 열쇠를 제공하는 셈입니다

(E) (앱→데이터 제공기관) 접근 토큰을 제출하여 사용자 데이터를 요청합니다

(F) (데이터 제공기관→앱) 사용자 데이터를 제공합니다. 이때 앱이 제출한 접근 토큰이 유효함을 확인하고, 접근 토큰의 정보를 확인하여 제공할 데이터 항목, 범위 및 유효기간이 정해집니다.

출처:http://www.2e.co.kr/news/articleView.html?idxno=208594
