package json;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import example.simple.SimpleMessageOuterClass.SimpleMessage;

public class JsonConverterMain {
	private static String toJson(SimpleMessage message) throws InvalidProtocolBufferException {
		return JsonFormat.printer()
				.omittingInsignificantWhitespace()
				.includingDefaultValueFields()
				.print(message);
	}

	private static SimpleMessage fromJson(String jsonMessage) throws InvalidProtocolBufferException {
		SimpleMessage.Builder messageBuilder = SimpleMessage.newBuilder();
		JsonFormat.parser()
				.ignoringUnknownFields()
				.merge(jsonMessage, messageBuilder);

		return messageBuilder.build();
	}

	public static void main(String[] args) {
		SimpleMessage message = SimpleMessage.newBuilder()
				.setId(26)
				.setName("Palit")
				.build();

		try {
			String jsonMessage = toJson(message);
			System.out.println("JSON formatted message is:\n" + jsonMessage);
			System.out.println("Message deserialized from JSON is:\n" + fromJson(jsonMessage));
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}
