import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class KafkaConsumerApp {

  /**
   * Main.
   * 
   * @param args Arguments on the method
   */
  public static void main(String[] args) {
    Properties props = new Properties();
    props.put("bootstrap.servers", "localhost:9092");
    props.put("acks", "all");
    props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
    props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

    Consumer<String, String> myConsumer = new KafkaConsumer<>(props);
    ArrayList<String> topics = new ArrayList<>();
    topics.add("lordoftherings");

    try (myConsumer) {
      myConsumer.subscribe(topics);
      while (true) {
        ConsumerRecords<String, String> records = myConsumer.poll(Duration.ofSeconds(100));
        for (ConsumerRecord<String, String> record : records) {
          System.out.println(String.format("Topic: %s, Partiion: %d, Offset: %d, Key: %s, Value: %s", record.topic(),
              record.partition(), record.offset(), record.value()));
        }
      }
    } catch (Exception e) {
      System.out.println(e.getStackTrace());
    }
  }

}
