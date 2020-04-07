package chapter_3_core_java_api;

public class StringBulider {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); //unlike String, StringBilder is mutability
		sb.append("a").append("b"); //append method 
		//the same methods like String : charAt(), indexOf(), length(), substring(), delete()
		//Other methods
		System.out.println(sb.insert(1, "-")); //insert something in StringBuilder, without delete anything
		System.out.println(sb.delete(1, 2)); //delete one part of StringBuilder
		System.out.println(sb.reverse()); //reverse of letters
		String s = sb.toString(); //transformation StringBuilder to String
		System.out.println("String : " + s);
		
		StringBuffer sbf = new StringBuffer(); //slower and older than StringBuilder; better not to use
		System.out.println(sbf.append("StringBuffer better not to use"));
	}

}
