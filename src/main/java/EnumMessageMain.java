import example.enumerations.EnumMessageOuterClass.EnumMessage;
import example.enumerations.EnumMessageOuterClass.EyeColor;

public class EnumMessageMain {

	public static void main(String[] args) {
		EnumMessage someEnumMessage = EnumMessage.newBuilder()
				.setEyeColor(EyeColor.EYE_COLOR_BLUE)
				.build();

		System.out.println(someEnumMessage);
	}
}
