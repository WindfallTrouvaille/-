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
	
	//��дһ����������¼���ַ������ֵĴ���
	public static int countString(String source,String sun)
	{
		int count = 0;
		
		//�Ը��ӷ������б���
		while(source.indexOf(sun) != -1)//��¼���ַ�����һ�γ��ֵĴ���
		{
			count++;
			source = source.substring(sun.length());//����¼����ַ���ȡ��ȥ��������ʣ�µ��ַ�
		}
		return count;
	}
}
