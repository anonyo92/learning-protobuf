package basics;

import example.oneofs.OneOfMessageOuterClass.OneOfMessage;

public class OneOfMessageMain {

	public static void main(String[] args) {
		OneOfMessage message1 = OneOfMessage.newBuilder()
				.setId(53)
				.build();
		System.out.println("has field: " + message1.getOneOfTheseCase());
		System.out.println(message1);


		OneOfMessage message2 = OneOfMessage.newBuilder()
				.setName("Ananya")
				.build();
		System.out.println("has field: " + message2.getOneOfTheseCase());
		System.out.println(message2);


		// Build message off another message and Overwrite
		OneOfMessage message3 = OneOfMessage.newBuilder(message1)
				.setName("Palit")
				.build();
		System.out.println("has field: " + message3.getOneOfTheseCase());
		System.out.println(message3);


		// Overwrite oneof fields
		OneOfMessage message4 = OneOfMessage.newBuilder()
				.setName("Anonyo")
				.setId(25)
				.build();
		System.out.println("has field: " + message4.getOneOfTheseCase());
		System.out.println(message4);
	}
}
