@Component
SortingAlgorithm 사용

@Primary
우선순위 주는것
SortingAlgorithm 사용 할 때

@Qualifier
지정된 빈을 실행하게 하는것.
우선순위가 primary 보다 우선 순위가 높음

@Autowired
의존성 주입
주입을 할 때 생성자 기반 주입
setter 메소드 사용

@ComponentScan
component 찾기

@Autowired
spring이 자동으로 주입한다.

의존성 주입 방법
constructor 생성자기반 주입 (@Autowired되어있으므로 생략가능)
setter getter,setter
field @Autowired

spring에서는 생성자 주입방식을 권장함 WHy?
모든 초기화가 하나의 메소드에서 초기화 되기 때문에.

중요한 용어 이해하기.
@Component
특정 클래스가 컴포넌트 스캔에 있다면 스프링 빈에 의해 생성되고 관리된다.

Dependency
Dependency Injection : inversion of control 제어 반전

@ComponentScan
정의한 적은 없던거 같은데... 어디서 자동되는듯 아마 @Controller 일듯.

@Component @Bean 차이점
Component 방식을 추천한다. spring이 쉽게 bean 생성 관리 해줌
@bean 을 선택한다면. 여러 체크 해야 할 부분들이 있음.
라이브러리에 있는 Bean 을 생성할 때 사용하면 좋다?? 헐 !!!!

빈 생성 전에 비지니스 로직이 많거나 제3자 라이브러리를 사용해야 할때.

우리는 왜 의존성을 가지고 있을까.
애플리케이션 레이어가 web, bussiness, data 레이어 들로 나누어 있고 서로 의존성이 있다.
스프링프레임워크가 객체의 생명주기를 관리해준다.
@Component, @Autowired 같은 것들로 해줌.


