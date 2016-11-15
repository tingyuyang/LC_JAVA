class Main {
  public static void main(String[] args) {
    int num=38;
    String[] numStr=Integer.toString(num).split("");
    int len =numStr.length();
    int result=0;
    while (len!=1){
    	for (int i=0;i<len;i++){
    		result+=Integer.parseInt(numStr[i]);
    	}
    	System.out.parseInt(result);
    	numStr=Integer.toString(result).split("");
		len=numStr.length
    }
    
  }
}
