import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
	ArrayList<String> wordsMessedUP = new ArrayList<>();
	ArrayList<String> words = new ArrayList<>();

	public Anagram() {
		setup();
	}

	public void setup() {
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(
					new URL("https://raw.githubusercontent.com/eneko/data-repository/master/data/words.txt")
							.openStream()));
			String Info;
			while ((Info = r.readLine()) != null) {
				words.add(Info.toLowerCase());
				char[] InfoA = Info.toLowerCase().toCharArray();
				Arrays.sort(InfoA);
				StringBuilder b = new StringBuilder();
				for (char c : InfoA) {
					b.append(c);
				}
				wordsMessedUP.add(b.toString());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<String> GetAnagrams(String Word) {
		ArrayList<String> answer = new ArrayList<>();
		char[] InfoA = Word.toLowerCase().toCharArray();
		Arrays.sort(InfoA);
		StringBuilder b = new StringBuilder();
		for (char c : InfoA) {
			b.append(c);
		}
		String thingy = b.toString();
		for (int i = 0; i < wordsMessedUP.size(); i++) {
			if (wordsMessedUP.get(i).equalsIgnoreCase(thingy)) {
				answer.add(words.get(i));
			}
		}
		return answer;
	}
}
