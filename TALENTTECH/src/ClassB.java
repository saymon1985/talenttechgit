import com.java.talentech.ClassC;
import com.java.talentech.Constructor;
import com.java.talentech.Init;

public class ClassB {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassC c = new ClassC();
		Init i = new Init();

		Constructor cons = new Constructor();
		Constructor conss = new Constructor(1000, 2000);
		System.out.println(a.fun);
		
		int myNum = a.Sum(10, 10);
		int myNum1=a.Sum(1,2,3);
		float myNum2=a.Sum(1.5f, 1.5f);
		System.out.println("sum method output with 2 argument:"+myNum);
		System.out.println("sum method output with 3 argument:"+myNum1);
		System.out.println("sum method output with 2 argument:"+myNum2);
		c.msgFromClassC();
		i.initObject();
		System.out.println(i.a);
		System.out.println(cons.a);

	}

}
