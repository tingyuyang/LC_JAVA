// java inconvinience sample practice: https://github.com/tingyuyang/LC_JAVA/blob/master/Easy/258.%20Add%20Digits.java
//declare int array
int[] intArray = new int[] {4,5,6,7,8};
//or easier:
int[] intArray = {4,5,6,7,8};

//power/square
int r=(int)Math.pow(2,2); //if no "(int)", it will return 4.0

//>int to string
int num=38;
String numStr=Integer.toString(num);//**NEED TO BE STORED
System.out.println(numStr.length());

// >Convert one integer into list
// java is annoyting. u could not really manipulate the string. 
// so u have to convert int into string, then split them into list
int num =38;
String[] numStr = Integer.toString(num).split("");  //**
int result=0;
result+=Integer.parseInt(numStr[1]); //***manipulate string array with int."parseInt"
//WOW, isnt this annoying



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
