import java.util.Arrays;

class Main {
  public int singleNumber(int[] number){
  	int l= number.length;
  	if (l == 1){
  		return number[0];
  	}
  	Arrays.sort(number);
  	for (int i =1; i<l-1; ++i){
  		if (number[i]!=number[i-1] && number[i]!=number[i+1]){
  			return(number[i]);
  		}
  	}
  	
  	if (number[0]!=number[1]){
  		return number[0];
  	}else{
  		return number[l-1];
  	}

  }
  
  public static void main(String[] args) {
    Main m=new Main();
    int[] num= new int[] {2,2,1,1,3};
    System.out.println(m.singleNumber(num));
  }
  
}
