FROM anapsix/alpine-java:11_server-jre_unlimited

MAINTAINER qimy(qimy0521@gmail.com)

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /opt/projects/k8s

WORKDIR /opt/projects/k8s

COPY target/k8s-demo-1.jar ./program.jar

CMD java -jar -Xms128m -Xmx128m -Xss256k -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC program.jar