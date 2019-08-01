#!/usr/bin/env bash

java -jar microservice-discovery-eureka-ha/target/microservice-discovery-eureka-ha-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar microservice-discovery-eureka-ha/target/microservice-discovery-eureka-ha-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
