[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/XavierBrochard/kafka-samples)

<p align="center">
    <a href="https://www.hackerrank.com/xavierbrochard">
        <img width="70%" src="https://kafka.apache.org/images/logo.png">
    </a>
</p>

# Getting started with Apache Kafka

Following the Pluralsight course [Getting Started with Apache Kafka](https://app.pluralsight.com/library/courses/apache-kafka-getting-started/table-of-contents) by [Ryan Plant](https://app.pluralsight.com/profile/author/ryan-plant).

## Starting Zookeeper

```bash
/path/to/kafka/bin/zookeeper-server-start /path/to/kafka/libexec/config/zookeeper.properties
```

## Checking Zookeeper

```bash
telnet localhost 2181
srvr
```

## Starting a Kafka broker

```bash
/path/to/kafka/bin/kafka-server-start /path/to/kafka/libexec/config/server.properties
```

## Creating a Topic

```bash
/path/to/kafka/bin/kafka-topics --create --topic my_topic --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1
```

## Starting a Producer

```bash
/path/to/kafka/bin/kafka-console-producer --broker-list localhost:9092 --topic my_topic
```

## Starting a Consumer

```bash
/path/to/kafka/bin/kafka-console-consumer --bootstrap-server localhost:9092 --topic my_topic --from-beginning
```

## Viewing a Topic State

```bash
/path/to/kafka/bin/kafka-topics --describe --topic my_topic --zookeeper localhost:2181
```

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/XavierBrochard/kafka-samples)
