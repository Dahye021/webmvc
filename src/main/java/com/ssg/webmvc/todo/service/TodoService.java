package com.ssg.webmvc.todo.service;

public enum TodoService {
    INSTANCE; //객체의 개수를 결정할 때 사용한다.
    // 현재 INSTANCE가 한 개 이므로 컨트롤러가 접근할 수 있는 서비스 객체는 1개만 사용하겠다
    // 접근 방법 : TodoService.INSTENCE 로 접근
}

//enum으로 작업 시 장,단점
// 장점 : 정해진 수 만큼 객체를 생성할 수 있다
// 단점 :
