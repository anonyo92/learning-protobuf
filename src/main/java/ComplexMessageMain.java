import example.complex.ComplexMessageOuterClass.ComplexMessage;
import example.complex.ComplexMessageOuterClass.SimpleMessage;

import java.util.Arrays;

public class ComplexMessageMain {

	private static SimpleMessage newSmpleMessage(int id, String name) {
		return SimpleMessage.newBuilder()
				.setId(id)
				.setName(name)
				.build();
	}

	public static void main(String[] args) {
		ComplexMessage complexMessage = ComplexMessage.newBuilder()
				.setOneSimpleMessage(newSmpleMessage(21, "message1"))
				.addAllSimpleMessage(
						Arrays.asList(
								newSmpleMessage(23, "message2"),
								newSmpleMessage(37, "message3"),
								newSmpleMessage(71, "message4")
						)
				)
				.build();

		System.out.println(complexMessage);
	}
}
