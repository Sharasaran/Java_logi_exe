package Exercise2;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method for creating array
		
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		float total_num = 0;
		float average_num = 0;
		
		
		for(int i=0;i<num.length; i++) {
		total_num =total_num + num[i];
		
		
		}
		System.out.println(total_num);
	//average equation
		average_num =total_num/num.length;
		System.out.println(average_num);
	}

}
