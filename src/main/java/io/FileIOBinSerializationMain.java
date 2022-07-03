package io;

import example.simple.SimpleMessageOuterClass.SimpleMessage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOBinSerializationMain {

	private static void writeToFile(SimpleMessage message, String filepath){
		try (FileOutputStream fos = new FileOutputStream(filepath)) {
			message.writeTo(fos);
			System.out.println("Wrote this message to file: " + message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static SimpleMessage readFromFile(String filepath){
		try (FileInputStream fis = new FileInputStream(filepath)) {
			return SimpleMessage.parseFrom(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SimpleMessage.newBuilder().build();
	}

	public static void main(String[] args) {
		SimpleMessage message = SimpleMessage.newBuilder()
				.setId(14)
				.setName("Anonyo")
				.build();

		final String filepath = "./src/main/resources/somefile.bin";
		writeToFile(message, filepath);

		System.out.println("Read the following message from file:\n"
				+ readFromFile(filepath));
	}
}
