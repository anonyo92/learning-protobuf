import example.maps.MapMessageOuterClass.MapMessage;
import example.maps.MapMessageOuterClass.ValueMessage;

import java.util.Map;

public class MapMessageMain {

	private static ValueMessage newValue(int id) {
		return ValueMessage.newBuilder()
				.setId(id)
				.build();
	}

	public static void main(String[] args) {
		MapMessage mapMessage = MapMessage.newBuilder()
				.putIds("key1", newValue(45))
				.putIds("key2", newValue(36))
				.putAllIds(Map.of(
						"key3", newValue(25),
						"key4", newValue(16)
				))
				.build();

		System.out.println(mapMessage);
	}
}
