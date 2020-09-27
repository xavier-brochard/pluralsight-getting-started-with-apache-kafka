import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;

public class KafkaProducerApp {
  /**
   * Main.
   * 
   * @param args Arguments on the method
   */
  public static void main(String[] args) {
    Properties props = new Properties();
    props.put("bootstrap.servers", "BROKER-1:9092, BROKER-2:9093");
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

    KafkaProducer myfProducer = new KafkaProducer(props);
  }

}
