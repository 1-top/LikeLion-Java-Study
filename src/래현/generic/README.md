# 제네릭의 이해

## 제네릭 이전의 코드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/016d0aff-409d-48a4-84c4-5b2bf25e4c59/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c2daabe9-0b48-4ee0-9439-1c13f0579cd5/Untitled.png)

- 형 변환의 과정이 수반되고 만다

## 더불어, 제네릭 이전 코드가 갖는 문제점

- 프로그래머의 실수가 컴파일 과정에서 발견되지 않는다.
- 프로그래머의 실수가 실행 과정에서 조차 발견되지 않을 수 있다.

## 제네릭 기반의 클래스 정의하기

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/49d8b515-59a1-4228-954f-0a77bae09a38/Untitled.png)

- 인스턴스화 될 때는 그 목적을 제한하는 것이 좋은 것이다 (오히려 좋아~!)
- 그림의 `<T>` 는 인스턴스 생성시에 내가 필요에 따라 정의할께~ 라는 의미이다.
- `<T>` 로 비워두었다~ 라고 생각!

## 제네릭 클래스 기반 인스턴스 생성

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/eea8087d-29b2-405b-8c77-7b89aea53a03/Untitled.png)

## 제네릭 이후의 코드: 개선된 결과

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f5c6cbe1-a070-4481-9f8d-170b879008e5/Untitled.png)

- 제네릭 이후에는 실수가 컴파일 오류로 이어질 수 있다.
- 제네릭 이후에는 프로그래머가 명시적  형 변환을 하지 않는다.