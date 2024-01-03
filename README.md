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


