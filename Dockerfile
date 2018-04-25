FROM anapsix/alpine-java

MAINTAINER Abhishek Srivastava <abhishek.s@fretron.com>

USER root

RUN apk upgrade --update && \
    apk add --no-cache libstdc++ &&\
    apk add --update curl bash && \
    rm -rf /var/cache/apk/*

ENV JAVA_OPTS -Xms256m -Xmx1024m

COPY ./build/libs/TestJenkin-all-1.0-SNAPSHOT.jar /TestJenkin.jar

WORKDIR /

ENTRYPOINT ["java","-jar","TestJenkin.jar"]
