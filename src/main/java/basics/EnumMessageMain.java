package basics;

import com.example.enumerations.EnumMessage;
import com.example.enumerations.EyeColor;

public class EnumMessageMain {

	public static void main(String[] args) {
		EnumMessage someEnumMessage = EnumMessage.newBuilder()
				.setEyeColor(EyeColor.EYE_COLOR_BLUE)
				.build();

		System.out.println(someEnumMessage);
	}
}
