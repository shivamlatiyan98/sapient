package thread.level2;
import java.util.*;




public class QuestionRunner {
	public static int count=0;
  public static void main(String[] args) {
	  List<Question> lisQuestion=new Vector<Question>();
	  
	            
		  Question q0=new Question("1.Which of the following is java machine name?", "a.jvm", "b.oracle ", "c.linux","d.bytecode", "a");
		  lisQuestion.add(q0);
		  

		  Question q3=new Question("2.what is full form of Ip", "a.Internet Binding", "b.Internet bus", "c.internet Protocol", "d.internet bios", "c");
		  lisQuestion.add(q3);
		 
		  
		  
		  
		  Question q9=new Question("3.what is full form of OT", "a.Operation Theatre", "b.Open Terminal", "c.Operation Task", "d.open tail", "a");
		  lisQuestion.add(q9);
		 
		  Question q10=new Question("4.In which jdk 9 is released", "a.1990", "b.2015", "c.2018", "d.2017", "d");
		  lisQuestion.add(q10);
		  
		  Question q2=new Question("5.In which year java launched", "a.1997", "b.1998", "c.1990", "d.1996", "d");
		  lisQuestion.add(q2);
	 
	  
	  Question q4=new Question("6.In which year linux launched", "a.1992", "b.1991", "c.1998", "d.1980", "b");
	  lisQuestion.add(q4);
	  
	  
	  Question q5=new Question("7.In which year python came in use", "a.1998", "b.1985", "c.1989", "d.1982", "c");
	  lisQuestion.add(q5);
	  
	  
	  Question q6=new Question("8.In which year python came in use", "a.1998", "b.1985", "c.1989", "d.1982", "c");
	  lisQuestion.add(q6);
	  
	  
	  Question q7=new Question("9.In which year scala came in use", "a.2010", "b.2004", "c.2006", "d.2003", "b");
	  lisQuestion.add(q7);
	  
	  
	  Question q8=new Question("10.In which year oracle is founded", "a.1978", "b.1987", "c.1977", "d.1982", "c");
	  lisQuestion.add(q8);
	  
	  MyThread [] listhreaList={new MyThread(),new MyThread(),new MyThread(),new MyThread(),new MyThread(),new MyThread(),
			  new MyThread(),new MyThread(),new MyThread(),new MyThread()};
	  
	  int i=0;
	  int k=0;
	  // daemon thread collection
	  for(Thread t1: listhreaList) {
		  t1.setDaemon(true);
		  t1.setName("thread"+k);
		  k++;
	  }
	  
	  for( Question q1 : lisQuestion) {
		  System.out.println(q1.getQuestionString());
	    	System.out.println(q1.getOption1());
	    	System.out.println(q1.getOption2());
	    	System.out.println(q1.getOption3());
	    	System.out.println(q1.getOption4());
	    	System.out.println("enter the correct option"); 
	    	listhreaList[i].start();
	    	//System.out.println(listhreaList[i].getName());
	    	  String anString=null;
	    	while(anString==null) {
	    		Scanner objScanner=new Scanner(System.in);
	    		anString=objScanner.nextLine();
	    		if(anString!=null) {
	    			break;
	    		}
	    		
	    	}
	    listhreaList[i].stop1();
	         i++;
	    	if(anString.equals(q1.getCorrectoption())) {
	    		continue;
	    	}
	    	else {
	    		System.out.println("wrong answer");
	    	}
	    	
	    	
	    	
	  }
	  
	  
	  
	  System.out.println("out of loop");
	
}
	
}
