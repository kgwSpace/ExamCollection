import java.util.*;

public class ExamCollection {
	public static void main(String[] args) 
	{
		//컬렉션에서 제공해주는 알고리즘을 이용해보자.
		//sort algorithm.
		//TreeSet 처럼 기본적으로 정렬이 제공되는 게 아니라 
		//기본 정렬이 없는 ArrayList를 sorting 해보려고 한다.
		
		// 1. ArrayList 생성
		List<String> list = new ArrayList<>();
		list.add("a1");
		list.add("b2");
		list.add("c3");
		list.add("a4");
		list.add("b5"); 
		
		// 3. ArrayList sort
		// 이탤릭체로 나온 함수는 static 함수이다.
		Collections.sort(list);
			
		// 4. 출력 ( 소트 후 결과물)
		for(String s : list)
		{
			System.out.println(s);// 결과 : a1,a4,b2,b5,c3
		}
		//원래 결과는 입력한 순서대로 출력된다.
	}
}
