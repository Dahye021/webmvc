package com.ssg.webmvc.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

//DTO는 여러개의 데이터를 묶어서 하나의 객체로 구성하는 용도로 사용
//서비스 객체의 메소드들의 파라미터나 리턴 타입으로 사용된다
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoDTO {
    private Long tno; //할일 고유값 (pk)
    private String title;
    private LocalDate dueDate; //등록시간
    private boolean finished; //할일 체크
}
