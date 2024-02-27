FROM openjdk:11

RUN mkdir /MyCashBackApp

COPY bin/ /MyCashBackApp

WORKDIR /MyCashBackApp

CMD  java com.simplilearn.demo.MyApp