public class Replacement {

	public String replaceSpace(String iniString, int length) {
		return iniString.replaceAll(" ", "%20");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Replacement r=new Replacement();
		System.out.println(r.replaceSpace("123 sfrg dsfg 34354 ehg", 0));
	}

}
