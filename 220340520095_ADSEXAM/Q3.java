
//tewo stack in array

class Q3{
	int top1;
	int top2;
	int max;
	int s1[];
	
	 Q3(int s){
		 top1=-1;
		 top2=s;
		 max=s;
		 s1= new int[max];	
	}
	
	
	void push1(int x){
		if(top1<top2-1){
			top1++;
			s1[top1]=x;
		}
		else{
			System.out.println("Stack overflow");
			System.exit(1);
		}
	}
	
	void push2(int x){
		if(top1<top2-1){
			top2--;
			s1[top2]=x;
		}
		else{
			System.out.println("Stack overflow");
			System.exit(1);
		}
	}
	
	int pop1(){
		if(top1>=0){
			int x =s1[top1];
			top1--;
			return x;
		}
		else{
			System.out.println("Stack underflow");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2(){
		if(top2<max){
			int x =s1[top2];
			top2++;
			return x;
		}
		else{
			System.out.println("Stack underflow");
			System.exit(1);
		}
		return 0;
	}
	
public static void  main(String[] args){
	
	Q3 st= new Q3(5);
	
	st.push1(5);
	st.push2(10);
	st.push2(15);
	st.push1(11);
	st.push2(7);
	st.push1(40);
	System.out.println();
	
}
	

}