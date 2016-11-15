//>int to string
int num=38;
String numStr=Integer.toString(num);//**NEED TO BE STORED
System.out.println(numStr.length());

// >Convert one integer into list
* java is annoyting. u could not really manipulate the string. 
* so u have to convert int into string, then split them into list

int num =38;
String[] numStr = Integer.toString(num).split("");
int result=0;
result+=Integer.parseInt(numStr[1]);

//declare int array
int[] intArray = new int[] {4,5,6,7,8};

//sort method
public static void main(String[] args) {
    Main m=new Main();
    int[] num= new int[] {2,2,1,1,3};
    Arrays.sort(num);//***
    System.out.println(Arrays.toString(num));//***
  }
  
//the difference of s.length() and array.length
String s ="hello";
System.out.println(s.length()); //* notice "()" for String s
String[] array=s.split("");
System.out.println(array.length);//* no "()" for String[] array

//different print out
String s ="hello";
System.out.println(s);

String[] array=s.split("");
System.out.println(Arrays.toString(array));
