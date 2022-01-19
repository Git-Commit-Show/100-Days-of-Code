import java.util.HashMap;
import java.util.Arrays;

public class UtilCustom{
	public HashMap<String, String> splitTo3(String fullname){
		HashMap<String, String> mapperName = new HashMap();
		mapperName.put("FIRST", "");
		mapperName.put("MID", "");
		mapperName.put("LAST", "");

		String[] split = fullname.trim().split(" ");
		switch(split.length){
			case 1:
				mapperName.put("FIRST", split[0]);
				break;
			case 2:
				mapperName.put("FIRST", split[0]);
				mapperName.put("LAST", split[1]);
				break;
			default:
				mapperName.put("FIRST", split[0]);
				mapperName.put("MID", split[1]);
				mapperName.put("LAST", String.join(" ", Arrays.copyOfRange(split, 2, split.length)));
		}
		return mapperName;
	}

	public static void main(String[] args) {
		UtilCustom u = new UtilCustom();
		System.out.println(u.splitTo3(""));
		System.out.println(u.splitTo3("JOHN"));
		System.out.println(u.splitTo3("JOHN DOE RAKAS"));
		System.out.println(u.splitTo3("JOHN DOE RAKAS BITUNG"));
	}
}