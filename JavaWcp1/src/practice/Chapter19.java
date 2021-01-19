package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Chapter19 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();

		set1.add("スイカ");
		set1.add("メロン");
		System.out.println(set1);

		System.out.println(set1.contains("スイカ"));
		System.out.println(set1.contains("なし"));

		System.out.println(set1.size());

		set1.remove("スイカ");
		set1.remove("なし");
		System.out.println(set1);
	}
}
