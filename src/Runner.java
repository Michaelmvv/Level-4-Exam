import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Runner {
	public static void main(String[] args) {
		Anagram a = new Anagram();
		System.out.println("Must be an anagram on the list: Bit.ly/Words-List");
		JOptionPane.showMessageDialog(null, "Must be an anagram on the list: Bit.ly/Words-List");
		for (int i = 0; i < 10; i++) {
			ArrayList<String> b = a.GetAnagrams(JOptionPane.showInputDialog("Word?"));
			for (int j = 0; j < b.size(); j++) {
				System.out.println(b.get(j));
			}
		}
	}
}
