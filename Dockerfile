# 애플리케이션을 빌드하기 위한 베이스 이미지
FROM openjdk:17-slim
#애플리케이션 소스 코드 복사
COPY ./build/libs/*T.jar app.jar
#자바 버전 확인
RUN ["java", "-version"]
#스프링 프로필을 위한 환경 변수 설정
ENV profiles prod
#애플리케이션 실행 명령
CMD ["java","-jar","-Dspring.profiles.active=${profiles}", "app.jar"]
#포트 8081 노출
EXPOSE 8081
