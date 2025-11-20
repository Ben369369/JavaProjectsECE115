package demos;

public class RunLengthCoding {

	public static String encode(String input) {
		String encoded = "";
		int count = 1;
		char current = input.charAt(0);
		for (int i = 1; i < input.length(); i++) {
			if (current == input.charAt(i)) {
				count++;
			} else {
				encoded += current + String.valueOf(count);
				current = input.charAt(i);
				count = 1;
			}
		}
		encoded += current + String.valueOf(count);
		return encoded;
	}

	public static String decode(String encoded) {
		String decoded = "";
		
		for (int i = 0; i < encoded.length(); i += 2) {
			for (int j = 0; j < (int) (encoded.charAt(i + 1) - '0'); j++) {
				decoded += encoded.charAt(i);
			}
		}
		return decoded;
	}

	public static void main(String[] args) {
		String input = "AAAAABBBCCCDD";
		String encoded = encode(input);
		System.out.println(encoded);
		String decoded = decode(encoded);
		System.out.println(decoded);
	}
}