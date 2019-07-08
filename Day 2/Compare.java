public class Compare {

	public static void main(String[] args) {
		String s1=new String("manushi");
		String s2=new String("varini");
		String s3=new String("manushi");
		System.out.println(s1.equals(s2)); //false because content is different
		System.out.println(s1.equals(s3)); //true because content is same
		System.out.println(s1==s2); //false because reference is different
		System.out.println(s1==s3); //false because reference is different
	}

}