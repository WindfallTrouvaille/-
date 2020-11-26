package javaSE.JavaAPI;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countString("abcabcabcabc", "ab"));
		
		String s = "Hello, world, hello,java!";
		String t = "lo";
		s = s.substring(t.length());
		System.out.println(s);
	}
	
	//编写一个函数，记录子字符串出现的次数
	public static int countString(String source,String sun)
	{
		int count = 0;
		
		//对父子符串进行遍历
		while(source.indexOf(sun) != -1)//记录子字符串第一次出现的次数
		{
			count++;
			source = source.substring(sun.length());//将记录后的字符截取（去），留下剩下的字符
		}
		return count;
	}
}
