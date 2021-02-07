package CoreBasics;

import java.beans.Statement;

public class Main {
  public static void main(String[] args) {
	Student st = new Student();
	st.setCity("Mumbai");
	System.out.println(st.getCity());
	
	Teacher t = new Teacher();
	t.setCity("Delhi");
	System.out.println(t.getCity());
	System.out.println(st.getCity());
	
	t.name="asia";
	
  }
}
