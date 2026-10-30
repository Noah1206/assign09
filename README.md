# ① 프로젝트 소개
주제 및 주요 기능
: 상품 CRUD 관리 프로그램 및 상품 추가, 상품 전체 읽기, 특정 상품 읽기, 상품 업데이트 기능, 상품 삭제

Entity 필드 구조 : 
id : Long
name : String
description : String
category : String
date : Integer
price : Integer

프로젝트 구조 및 개발환경 

src/
    main/
        java/
            com.example.demo/
                            controller/
                                        ProductController
                            dto/
                                ProductRequest
                                ProductResponse
                            entity/
                                    Product
                            repository/
                                        ProductRepository
                            service/
                                    ProductService
                            DemoApplication

개발환경 : JDK 17 이상, Gradle, Spring Boot

GitHub Repository URL : https://github.com/2026-2-WebService/assign09-c01-22500698
Render Deployment URL : 
② Database SQL Practice

기존 Table 조회 및 데이터 추가 결과
새 Table 생성 SQL
INSERT / UPDATE / DELETE / SELECT SQL과 실행 결과
DBeaver 실행 화면 또는 결과
③ Spring Data JPA 구현

Entity 및 JpaRepository 설명
사용한 Annotation의 역할
REST API Endpoint 목록 및 요청·응답 JSON
JPA Entity와 MariaDB Table 비교
④ JPA와 SQL 비교

save(), findAll(), findById(), deleteById() 사용 결과
실제 Hibernate SQL 확인
SQL을 직접 작성하는 방식과 JPA 방식의 차이
⑤ 배포 및 환경 설정

IntelliJ 및 Render 환경변수 설정 방법(변수명만 기록)
Render 배포 과정
배포 URL의 CRUD 테스트 결과
MariaDB 데이터 저장 확인
발생한 문제와 해결 방법
⑥ Weekly Report

Key Learning: 새롭게 이해한 내용 3가지
Problem & Solution: 문제 1개 이상과 해결 과정
Code Review: 중요한 코드 1개와 동작 설명
AI Usage: AI 활용 내용 및 직접 수정·검증한 부분, 자신이 생각하는 AI사용률(%)
Reflection: 추가로 공부하고 싶은 내용