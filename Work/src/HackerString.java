
public class HackerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "raja ram";
		String[] st = s.split(" ");

		StringBuilder sb = new StringBuilder();
		for (String k : st) {
			sb.append(Character.toUpperCase(k.charAt(0))).append(k.substring(1)).append(" ");
		}
		String fi = sb.toString();
        System.out.println(fi);
	}

}
