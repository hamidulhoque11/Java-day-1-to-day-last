# Java-day-1-to-day-last

<div style="overflow-x:auto;">
<pre>
<code>
    //print
class Main {
    public static void main(String[] args) {
        System.out.println("Hamidul");
    }
}
</code>
</pre>
</div>
Escape sequence-

         1. \b - Backspace
            
            2. \t - Tab
            
            3. \n - New Line
            
            4. \r - Carriage Return 
            
            5. \' - Single Quote 
            
            6. \" - Double quote
            
            7. \\ - Backslash 
<div style="overflow-x:auto;">
<pre>
<code>
   // Escape sequence
class Main {
    public static void main(String[] args) {
        System.out.println("id:\t101");// \t
        System.out.println("title:\tiphone 1\b5");// \b
        System.out.println("price:\t1895 euros");
        System.out.println("Description:\tproduct with best quality \ncategory :\tphone");//n
         }
}
</code>
</pre>
</div>

**Data Type And Variable**
<div style="overflow-x:auto;">
<pre>
<code>
//Datatype & Variable
public class Datatype {
    public static void main(String []args){
        boolean b;
        b= true;
        System.out.println("Boolean = "+b);
        int i;
        i=100;
        System.out.println("Int = "+i);
        short s;
        s=10;
        System.out.println("Short = "+s);
        char c='H';
        System.out.println("Character = "+c);
        float f=10.10f;
        System.out.println("Float ="+2f);
        double d=3.55;
        System.out.println("Double = "+d);
        String str="hamidul Hoque Masum";
        System.out.println("String = "+str);
    }
}
</code>
</pre>
</div>
         Format Specifier-



<div style="overflow-x:auto;">
<pre>
<code>
class FormatSpecifier {
    public static void main(String[] args) {
        int i=100;
        System.out.printf("Integer i= %d\n",i);
        short s=200;
        System.out.printf("Short s= %d\n",s);
        char c='H';
        System.out.printf("Character c= %c\n",c);
        float f=10f;
        System.out.printf("Float f= %.2f\n",f);
        double d=30;
        System.out.printf("Double d= %.2f\n",d);
         boolean b=false;
        System.out.printf("Boolean b= %b\n",b);
      }
}
</code>
</pre>
</div>
Input From use -Scanner

<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class inputFromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.println("welcome "+name);
    }
}
</code>
</pre>
</div>
Arithmetic Operator-
<div style="overflow-x:auto;">
<pre>
<code>
public class arithmaticOperator {
   public static void main(String[]args) {
 int num1=20, num2=10, result;
        result = num1+num2 ;
        System.out.println("+ operator ="+result);
       result = num1-num2 ;
       System.out.println("- operator ="+result);
       result = num1*num2 ;
       System.out.println("* operator ="+result);
       result = num1/num2 ;
       System.out.println("/ operator ="+result);
       result = num1%num2 ;
       System.out.println("% operator ="+result);
   }
}
</code>
</pre>
</div>
Assignment Operators--
<div style="overflow-x:auto;">
<pre>
<code>


class AssignmentOperator {
    public static void main(String[] args) {
          int x=5;
         System.out.println("Assignment | Resutls");
         System.out.println(" Operators |");
         System.out.println("---------------------");
            x+=5; // x = x+5, x=10
            System.out.println("x+=5 or x+5 = "+x);//x=10
            x -=5; //x= x-5,
            System.out.println("x-=5 or x-5 = "+x); //x=5
            x *=5; //x= x*5,
            System.out.println("x*=5 or x*5 = "+x); //x=25
            x /=5; //x= x/5,
            System.out.println("x/=5 or x/5 = "+x); //x=5
            x %=5; //x= x%5,
            System.out.println("x%=5 or x%5 = "+x); //x=0
    }
}
</code>
</pre>
</div>
The Area of triangle - 

<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      double area, base,height;
      System.out.print("Enter the triangle height:");
      height=sc.nextDouble();
      System.out.print("Enter the triangle base:" );
      base=sc.nextDouble();
       area=0.5*height*base;
      System.out.printf("the area of triangle is =%.2f",area);
    }
}
</code>
</pre>
</div>
Celcius to Fahrenheit--
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class FindFahrenheit {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      double celsius, fahrenheit;
      System.out.print("Enter the Celsius:");
      celsius=sc.nextDouble();
       fahrenheit=1.8*celsius+32;
      System.out.printf("The Fahrenheit is =%.2f",fahrenheit);
    }
}
</code>
</pre>
</div>
Unary operator-
<div style="overflow-x:auto;">
<pre>
<code>
//Unary operator
class unaryOpetator {
    public static void main(String[] args) {
        int a =10;
        int result;
    result= a++;//increament
    System.out.println(result);//10
    result=--a;// decrement
        System.out.println(result);//10
        result = -a;// -operator
        System.out.println(result);//-10
        result = +a;// +operator
        System.out.println(result);//10
        result = ++a;
        System.out.println(result);//11
        result = -a;
        System.out.println(result);//-11
        result = +a;
        System.out.println(result);//11
    }
}
</code>
</pre>
</div>
#Relational Operator:
     
 ##Contro Statement(if Else):-
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class controlStatement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Check the vlue:");
        int i =sc.nextInt();
        if(i>0){
            System.out.println(i+" is greater then Zero");
        }else if (i<0){
            System.out.println(i+" is less then zero");
        }else{
            System.out.println(i+" is Equal to Zero");
        }
    }
}
</code>
</pre>
</div>

Find Even and Odd value-
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("--Chack the Even and odd value--");
        System.out.print("Enter any value:");
        int i=sc.nextInt();
        if(i%2==0){
            System.out.printf("%d Even value",i);
        }else if(i%2 !=0) {
            System.out.printf("%d is odd value",i);
        }
    }
}
</code>
</pre>
</div>
Vawel or Consonant
<div style="overflow-x:auto;">
<pre>
<code>

import java.util.Scanner;
class vowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Chack a Character Vowel or consonant ");
        System.out.print("Enter any charater: ");
        char c=sc.next().charAt(0);
        if(c == 'a' ||c=='e'||c=='i'|| c=='o'|| c=='u' || c=='A' || c== 'E' ||c=='I'|| c=='O' ||c=='U'  ){
            System.out.printf("%c is Vowel",c);
        }else {
             System.out.printf("%c is Consonant",c);
        }
    }
}
</code>
</pre>
</div>
Capital and Small letter
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class scallCapital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Chack a Character Small or Capital ");
        System.out.print("Enter a charater: ");
        char c=sc.next().charAt(0);
        if (c >= 'a' && c<='z'){
            System.out.println("Small");
        }else if(c>='A' && c<='Z'){
            System.out.println("Capital");
        }else{
            System.out.println("Enter a Character");
        }
    }
}
</code>
</pre>
</div>
##Relational Operator

  ##Control Statement-
            ##Switch 
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class switchCase{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Check digit to character:");
        String digit=sc.nextLine();
        switch(digit){
            case "0":System.out.println("zero");
            break;
            case "1":System.out.println("one");
            break;
            case "2":System.out.println("Two");
            break;
            case "3":System.out.println("Three");
            break;
            case "4":System.out.println("Four");
            break;
            case "5":System.out.println("Five");
            break;
            case "6":System.out.println("Six");
            break;
            case "7":System.out.println("Seven");
            break;
            case "8":System.out.println("Eight");
            break;
            case "9":System.out.println("Nine");
            break;
            default:
            System.out.println("Enter a digit 0-9");
        }
    }
}
</code>
</pre>
</div>
##Conditional Operator-
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class conditionalOperator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a first Value:");
        int i=sc.nextInt();
        System.out.print("Enter a Second Value:");
        int j=sc.nextInt();
         int large=i>j?i:j;
        System.out.println("Large value is = "+large);  
    }
}
</code>
</pre>
</div>
##Bitwise Operator-
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class bitwiseOperator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a first Value:");
        int i=sc.nextInt();
        System.out.print("Enter a Second Value:");
        int j=sc.nextInt();
        int result=i&j;
        System.out.printf("%d Binary AND %d = %d\n",i,j,result);
         result=i|j;
        System.out.printf("%d Binary OR %d = %d\n",i,j,result);
         result=i^j;
        System.out.printf("%d Binary EXOr %d = %d\n",i,j,result);
         result=i>>j;
        System.out.printf("%d >> Right shift %d = %d\n",i,j,result);
             result=i << j;
        System.out.printf("%d << left shift %d = %d\n",i,j,result);
            }
            }
</code>
</pre>
</div>
## Math Class--
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
public class mathClass {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Enter a Value:");
        x=sc.nextInt();
        System.out.print("Enter a Value:");
        y=sc.nextInt();
        double pi=Math.PI;
        System.out.printf("pi = %.4f \n",pi);
    int abs= Math.abs(x);
        System.out.println("Absulate value ="+abs);
    System.out.println("Addition= "+Math.addExact(x,y));
        System.out.println("Multiply= "+Math.multiplyExact(x,y));
    }
}
</code>
</pre>
</div>
##Control Statement 
            
For Loop
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class forLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write Hamidul 10 times increament:");
   for( int i=1; i<=10; i++){
        System.out.println(i+". Hamidul");
    }
    System.out.println("Write Hamidul 10 times decreament:");
    for( int j=10; j>=1; j--){
        System.out.println(j+". Hamidul");
    }
    }
}
</code>
</pre>
</div>
##While Loop
<div style="overflow-x:auto;">
<pre>
<code>
class whileLoop{
    public static void main(String[]args){
        System.out.println("Write hamidul 10 times by while loop(increament)");
        int i=1;
        while (i<=10){
            System.out.println(i+"hamidul");
            i++;//Increament
        }
        System.out.println("Write hamidul 10 times by while loop(Decreament)");
        int j=10;//intialization
        while (j>=1){//Condition
            System.out.println(j+"hamidul");
            j--;//decreament
        }
         }
}
</code>
</pre>
</div>
Do while Loop-
<div style="overflow-x:auto;">
<pre>
<code>
class doWhileLoop {
    public static void main(String[] args) {
       int i=50;
       do{
           System.out.println(i);
          i--;
       }while(i>=1);
    }
}
</code>
</pre>
</div>

Control Statement-Jump: Break
<div style="overflow-x:auto;">
<pre>
<code>
class jumpBreak {
    public static void main(String[] args) {
       for (int i=0;i<=100;i++){
           if(i==10){
               break;
           }
           System.out.println(i);
       }
    }
}
</code>
</pre>
</div>
Control Statement-Jump: Continue
<div style="overflow-x:auto;">
<pre>
<code>
class jumpContinue {
    public static void main(String[] args) {
       for (int i=0;i<=100;i++){
           if(i==10){
               continue;// if condition is true Back to loop
           }
           System.out.println(i);//when if condition is true, dosent work that
       }
    }
}
</code>
</pre>
</div>
Problem solved using loop
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class newProb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        int result=0;
        System.out.print("Enter a Strting value:");
        m=sc.nextInt();
        System.out.print("Enter a ending value:");
        n=sc.nextInt();
    for (int i=m;i<=n;i++){
        int mul=i*i;
        System.out.print(i+"x"+i+"="+mul+" ");
           result=result+mul;
        } 
         System.out.println();
      System.out.println("sum of square value is= "+result);
       }
    }
</code>
</pre>
</div>
Series:
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result=1;
        System.out.print("Enter any value:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){//distance is 1
            System.out.println(i);
            result=result*i;//1*2*3*...n
        }
        System.out.println("total value is= "+result);
    }
}
</code>
</pre>
</div>
Multiplication Table:
<div style="overflow-x:auto;">
<pre>
<code>
    import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("which Multiplication table you want to see?");
        System.out.print("Enter you fast table: ");
        int f =sc.nextInt();
        System.out.print("Enter you last : ");
        int n =sc.nextInt();
        System.out.println("your multi table "+f+" to "+n);
        for(int i=f;i<=n;i++){
            System.out.println("Multiplication table for "+i);
            for(int j=1;j<=10;j++){
                int result=i*j;
                System.out.println(i+" X "+j+" = "+result);
            }
            System.out.println();
        }
    }
}
</code>
</pre>
</div>
 Prime and Composite value-2,3,5,7,11..n  
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class primeComposite{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any value:");
        int n=sc.nextInt();
        System.out.println("your n number is :"+n);
        int count=0;
        int countOne=0;
        for (int i=1;i<=n;i++){
            if(i==0||i==1){
                countOne++;
            }
            for(int j=2;j < i //;j++)//remove doubble slash
                             {
                             if (i%j==0){
                  count++;
              } 
           } if ( countOne > 0){
                System.out.println(i+" Composite Number");
            }
            else if(count==0){
                System.out.println(i+" prime number");
            }else{
                System.out.println(i+" Composite number");
            }
            count=0;
            countOne=0;
        }
    }
}
</code>
</pre>
</div>

Fibonacci Series-0,1,1,2,3,5,8...n
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class fibonacciSeries{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any fibonacci value:");
        int n=sc.nextInt();
        int fast=0;
        int sec=1;
        int fibo;
        System.out.print(fast+" "+sec);
        for (int i=3;i<=n;i++){
           fibo= fast+sec;
           System.out.print(" "+fibo+" ");
           fast=sec;
           sec=fibo;
        }
    }
}
</code>
</pre>
</div>
problem solved Sum of Digit:
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class SumofDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Find the sum of digit");
        System.out.println("Enter any digit :");
        int n=sc.nextInt();
        int sum=0;
        int r;
        int temp=n;
        while(temp!=0){
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println(n+" Sum = "+sum);
    }
}
</code>
</pre>
</div>
Problem solved Reversed:
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class reversed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Find the Reverse value");
        System.out.println("Enter any value you want to reverse :");
        int n=sc.nextInt();
        int sum=0;
        int r,temp;
        temp=n;
    while (temp!=0){
        r=temp%10;
        sum=sum*10+r;
        temp=temp/10;
    }
    System.out.println(sum);
    }
}
</code>
</pre>
</div>
Problem : find out Palindrome value.
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class Palindrome{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Check palindrome or not");
        System.out.println("Enter any digit:");
        int n=sc.nextInt();
        int temp,r;
        int sum=0;
        temp=n;
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
             }
        if(n==sum){
            System.out.println(n+" is Plindrom value");
        }else{
            System.out.println(n+" is not Plindrom value");
        }
    }
}
</code>
</pre>
</div>
Pattern-
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of pattern:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1 ;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
</code>
</pre>
</div>
Array-
<div style="overflow-x:auto;">
<pre>
<code>

class Main {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=7;
        arr[1]=55;
        arr[2]=2;
        arr[3]=5;
        arr[4]=1;
         System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
      //  System.out.println(arr[5]); error
        
 int len=arr.length;
        System.out.println("array size="+len);
    }
}
</code>
</pre>
</div>
Find min and maximum value from elements using arry and loop
<div style="overflow-x:auto;">
<pre>
<code>
    
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double[] arr=new double[5];
        double sum=0,max,min;
        System.out.print("Enter 5 element:");
       for (int i=0;i<arr.length; i++){
           arr[i]=sc.nextDouble();
       }for (int i=0;i<arr.length;i++){
           sum=sum+arr[i];  
       }max=arr[0];
       for (int i=1;i<arr.length;i++ ){
           if(max<arr[i]){
               max=arr[i];
           }
       }
       min=arr[0];
       for (int i=1;i<arr.length;i++ ){
           if(min>arr[i]){
               min=arr[i];
           }
       } System.out.println("Sum of 5 elements:"+sum); 
      System.out.println("maximum value is :"+max);
      System.out.println("minimum value is :"+min);
     System.out.println("length is :"+arr.length);     
    }
}
</code>
</pre>
</div>
For Each loop:
<div style="overflow-x:auto;">
<pre>
<code>

class Main {
    public static void main(String[] args) {
        int[] names={10,20,30,40};
        int sum=0;
        for (int x :names){
            sum=sum+x;
            System.out.println(x);
        }
        System.out.println("Length : "+names.length);
        System.out.println("sum of no: "+sum);
    }
}
</code>
</pre>
</div>
**2D Array/Matrix Array.
<div style="overflow-x:auto;">
<pre>
<code>

class Main {
    public static void main(String[] args) {
        int [][]arr=new int[2][3];
        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;
        arr[1][0]=40;
        arr[1][1]=50;
        arr[1][2]=60;
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
</code>
</pre>
</div>
**Matrix Take from user-
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[2][3];
        int[][] b=new int[2][3];
         System.out.println("Take matrix for A");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.printf("A[%d][%d] = ",i,j);
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Take matrix for B");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.printf("B[%d][%d] = ",i,j);
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("A=");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
        System.out.println("B=");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+b[i][j]);
            }
            System.out.println();
        }
    }
}
</code>
</pre>
</div>
Multiplication Matrix A+b
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] b=new int[2][3];
        int [][] a=new int[2][3];
        int [][] c=new int[2][3];
        System.out.println("--Matrix multiplication A+B--");
        System.out.println("Take Matrix for A:");
        for (int row=0;row<2;row++){
            for(int column=0;column<3;column++){
                System.out.printf("A[%d][%d] = ",row, column);
                a[row][column]=sc.nextInt();  
            }
        }
        System.out.println("Take Matrix for B:");
        for (int row=0;row<2;row++){
            for(int column=0;column<3;column++){
                System.out.printf("B[%d][%d] = ",row, column);
                b[row][column]=sc.nextInt();  
            }
        } 
        for(char set='A';set<'C';set++){
            System.out.println(set+" = ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                if(set=='A'){
                System.out.print("  "+a[i][j]);
                }else{
                    System.out.print("  "+b[i][j]);
                }
            }
            System.out.println();
        }
        }
        System.out.println("A + B =");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
</code>
</pre>
</div>
**Matrix find the sum of diagonal ,Upper And lower
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][3];
        int[][] b=new int[3][3];
        int sumofdiagonal=0;
        int sumofUpper=0;
        int sumoflower=0;
        System.out.println("Enter A Mtrix:");
        for(int row=0;row<3;row++){
            for(int column=0;column<3;column++){
                System.out.printf("A[%d][%d] =",row,column);
                a[row][column]=sc.nextInt();
            }
        }
        for(int row=0;row<3;row++){
            for(int column=0;column<3;column++){
                System.out.print(a[row][column]+"\t");
                 sumofdiagonal=a[0][0]+a[1][1]+a[2][2];
                 sumofUpper=a[0][1]+a[0][2]+a[1][2];
                 sumoflower=a[1][0]+a[2][0]+a[2][1];
            }
            System.out.println();
        }
        System.out.println("Sum of diagoal is: "+sumofdiagonal);
        System.out.println("Sum of Uper triangle is: "+sumofUpper);
        System.out.println("Sum of Lower triangle is: "+sumoflower);
    }
}
</code>
</pre>
</div>
Sorting Arrays-
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] Sort=new int[5];
        System.out.println("Enter 5 Element:");
        for(int i=0;i<5;i++){
        Sort[i]=sc.nextInt();
    }
        System.out.println("BEFORE SORTING");
    for(int i=0;i<5;i++){
        System.out.print(Sort[i]+" ");
    }
    System.out.println();
    System.out.println("AFTER SORTING");
    Arrays.sort(Sort);
    for(int i=0;i<5;i++){
        System.out.print(Sort[i]+" ");
    }
    }
}
</code>
</pre>
</div>
Array List- Add, Remove,Iterator
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.ArrayList;
import java.util.Iterator;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> elem=new ArrayList<Integer>();
        elem.add(10);
        elem.add(20);
        elem.add(5);
        elem.add(1,2);
        System.out.println("Size of array- "+elem.size());
        for(int x:elem){
           System.out.print(x+" ");
        }
        System.out.println();
        elem.remove(2);
        Iterator itr=elem.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println("Size of array- "+elem.size()); 
    }
}
</code>
</pre>
</div>
isEmpty Method,contains method,Indexof method, set method, Get Method,size method of Array List:
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> numb=new ArrayList<Integer>();
        System.out.println("Enter 5 Element");
            numb.add(10);
            numb.add(20);
            numb.add(30);
            numb.add(40);
            numb.add(0,50);
        System.out.print("Elements are - ");
        for(int x:numb){
        System.out.print(x+" ");
        } 
        System.out.println();
         System.out.println("find 40 ,constains Method : "+numb.contains(40));
        System.out.println("isEmpty Method : "+numb.isEmpty());
        System.out.println("IndexOf Method(50) : "+numb.indexOf(50)+" NO of index");
        System.out.println("After set Methos 2no index 20 replaice to 25");
            numb.set(2,25);
            for(int x:numb){
        System.out.print(x+" ");
        } 
         System.out.println();
        int x =numb.get(3);
        System.out.println("Get Method = "+x);
        int sizeOfArray=numb.size();
       System.out.println("size of array = "+sizeOfArray);
    }
}
</code>
</pre>
</div>
Add All Method, Equals Method-
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.ArrayList;
class main{
    public static void main(String[]args){
        ArrayList<Integer>Arr1=new ArrayList<Integer>();
        ArrayList<Integer>Arr3=new ArrayList<Integer>();
        ArrayList<Integer>Arr2=new ArrayList<Integer>();
        Arr1.add(10);
        Arr1.add(15);
        Arr1.add(25);
        Arr1.add(20);
        Arr1.add(9);
        System.out.print("Array1 :"+Arr1);
        System.out.println();
        Arr2.add(12);
        Arr2.add(70);
        Arr2.add(3);
        Arr2.add(11);
        Arr2.add(90);
        System.out.print("Array2 :"+Arr2);
        System.out.println();
        Arr3.addAll(Arr2);
        System.out.println("Applaying Addall Method in Array3 :");
        System.out.print("Array3 :"+Arr3);
        System.out.println();
        System.out.println("Applaying Equal Method Method  :");
        boolean check=Arr1.equals(Arr2);
        System.out.println("Array1==Array2 ? : "+check);
        check=Arr2.equals(Arr3);
        System.out.println("Array2==Array3 ? : "+check);
    }
}
</code>
</pre>
</div>
Array List-Sort Method(Ascending,Descending)
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("Enter 5 element:");
        for(int i=0;i<5;i++){
            arr.add(sc.nextInt());
        }
        System.out.print("Before sorting ArrayList : ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        Collections.sort(arr);
        System.out.print("After sorting ArrayList(Ascending) : ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        Collections.sort(arr,Collections.reverseOrder());
        System.out.print("After sorting ArrayList(Descending) : ");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
</code>
</pre>
</div>
Method of String -concat(),toUpperCase(),toLowerCase,starstWith,endsWith
<div style="overflow-x:auto;">
<pre>
<code>

class Main {
    public static void main(String[] args) {
        String fastName="Hamidul ";
        String lastName="Hoque Masum";
        System.out.println("First name = "+fastName);
        System.out.println("Last Name = "+lastName);
        String fullName=fastName.concat(lastName);
        System.out.println("concat Mathod: "+fullName);
        String upercase=fullName.toUpperCase();
        System.out.println("toUpperCase: "+upercase);
        String lowercase=fullName.toLowerCase();
        System.out.println("toLowerCase: "+lowercase);
        boolean start=fullName.startsWith("H");
        System.out.println("startsWith(H) : "+start);
        boolean end=fullName.endsWith("l");
        System.out.println("endsWith(l) :"+end);
        }
}
</code>
</pre>
</div>
Method of-chatAt(index value),indexOf,lastIndexOf(),indexof(),trim()-
<div style="overflow-x:auto;">
<pre>
<code>

class Main {
    public static void main(String[] args) {
        String country="Bangladesh is my country and";
        String countryOne="  Bangladesh is my    country and  ";
        System.out.println(country);
        System.out.println(countryOne);
        System.out.println();
        String removeSpace=countryOne.trim();
        System.out.println("trim() Method(remove all fast and last space from String) :"+removeSpace);
        int indexof = country.indexOf("my");
        System.out.println("indexOf Method(find 'my' index): "+indexof);
        int lastindexof=country.lastIndexOf("n");
        System.out.println("lastIndexOf Method(Find last 'n') :"+lastindexof);
        char charat=country.charAt(3);
        System.out.println("charAt(3) Method(find 3 index character) : " +charat);
    }
}
</code>
</pre>
</div>
Method of split,replace(char,char)
<div style="overflow-x:auto;">
<pre>
<code>

class Main {
    public static void main(String[] args) {
       String country="I lobe my country";
       System.out.println(country);
        String replace=country.replace('b','v');
        System.out.println("replace Method(b to v) : "+replace);
        System.out.println("Split Method(Space)-");
       String[] split=replace.split(" ");
       for(String x: split){
           System.out.print(x);
       }
    }
}
</code>
</pre>
</div>
StringBuffer-Method of append,reverse,delete,setLength.
<div style="overflow-x:auto;">
<pre>
<code>

class Main {
    public static void main(String[] args) {
        StringBuffer name=new StringBuffer("Hamidul");
        System.out.println(name);
    name.append(" Hoque");
    System.out.println("append( hoque) :"+name);
    name.append(" Masum");
    System.out.println("append( Masum) :"+name);
    name.reverse();
    System.out.println("reverse: "+name);
    name.reverse();
    name.delete(0,3);
    System.out.println("delete 3 index: "+name);
    name.setLength(12);
    System.out.println("setLength(12) : "+name);
    }
}
</code>
</pre>
</div>
String Buffer-Solve a Palindrome problem
<div style="overflow-x:auto;">
<pre>
<code>
//Stirng Pelindrome
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any value/string : ");
        String check=sc.nextLine();
        StringBuffer palindrome=new StringBuffer(check);
       String reverse = palindrome.reverse().toString();
       if(check.equals(reverse)){
           System.out.println("its Palindrome");
       }else{
           System.out.println("not pelindrom");
       }
    }
}
</code>
</pre>
</div>
Convert pemeting to String or String to premeting data type-
<div style="overflow-x:auto;">
<pre>
<code>
class Main {
    public static void main(String[] args) {
      int i=510;
      String str=Integer.toString(i);
      System.out.println("int to String :"+str);
      double d=Double.parseDouble(str);
      System.out.println("String to Double : "+d);
      String v="5.3";
      float s=Float.parseFloat(v);
      System.out.println("String to Float : "+s);
    String g="7.9";
      float f=Float.valueOf(g);
      System.out.println("String to Float : "+f);
    }
}
</code>
</pre>
</div>
Binary,octal,Hexa to Decimal value-
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any binary value: ");
        String str=sc.nextLine();
        Integer binary=Integer.parseInt(str,2);
        System.out.println("Binary to Decimal : "+binary);
        Integer Octal =Integer.parseInt(str,8);
        System.out.println("Octal to Decimal :"+Octal);
        Integer hexa=Integer.parseInt(str,16);
        System.out.println("Hexa to Decimal :"+hexa);
    }
}
</code>
</pre>
</div>
Decimal To binary, Octal, Hexa-
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal;
        System.out.print("Enter a decimal value: ");
        decimal =sc.nextInt();
     System.out.println();
     String binary=Integer.toBinaryString(decimal);
     System.out.println("Binary : "+binary);
     String octal=Integer.toOctalString(decimal);
     System.out.println("Octal : "+octal);
     String hexa=Integer.toHexString(decimal);
     System.out.println("Hexa : "+hexa);
    }
}
</code>
</pre>
</div>
Date class-
<div style="overflow-x:auto;">
<pre>
<code>
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
class main{
    public static void main(String[]args){
        Date date=new Date();
        System.out.println("Date : "+date);
        DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        String dt=df.format(date);
        System.out.println("Current Date : "+dt); 
    }
}
</code>
</pre>
</div>
Time Class-
<div style="overflow-x:auto;">
<pre>
<code>
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class main{
    public static void main(String []args){
        LocalTime lt= LocalTime.now();
        System.out.println(lt);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
        String currentTime=dtf.format(lt);
        System.out.println(currentTime);
    }
}
</code>
</pre>
</div>
OOP -class, object:
<div style="overflow-x:auto;">
<pre>
<code>
class Teacher{
    String name,gender;
    int age,phone;
}
class Main {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        System.out.println("1.");
        teacher.name="Hamidul Hoque Masum";
        teacher.age=24;
        teacher.gender="Male";
        teacher.phone=1956644483;
        System.out.println("Name : "+teacher.name);
        System.out.println("Age : "+teacher.age);
        System.out.println("Gender : "+teacher.gender);
        System.out.println("Phone : "+teacher.phone);
         Teacher teacherOne=new Teacher();
          System.out.println("2.");
        teacherOne.name="Mufassir Mahmud";
        teacherOne.age=24;
        teacherOne.gender="Male";
        teacherOne.phone=15439542;
        System.out.println("Name : "+teacherOne.name);
        System.out.println("Age : "+teacherOne.age);
        System.out.println("Gender : "+teacherOne.gender);
        System.out.println("Phone : "+teacherOne.phone);
    }
}
</code>
</pre>
</div>
Display Information Method inside a class
<div style="overflow-x:auto;">
<pre>
<code>
class Teacher{
    String name,gender;
    int age,phone;
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println();
    } 
}
class Main {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        System.out.println("1.");
        teacher.name="Hamidul Hoque Masum";
        teacher.age=24;
        teacher.gender="Male";
        teacher.phone=1956644483;
       teacher.displayInformation();
         Teacher teacherOne=new Teacher();
          System.out.println("2.");
        teacherOne.name="Mufassir Mahmud";
        teacherOne.age=24;
        teacherOne.gender="Male";
        teacherOne.phone=15439542;
        teacherOne.displayInformation();
    }
}
</code>
</pre>
</div>
SetInformation : Parametrised Method
<div style="overflow-x:auto;">
<pre>
<code>
class Teacher{
    String name,gender;
    int age,phone;
    void setInformation(String nam,int ag,String gen,int ph){
        name=nam;
        gender=gen;
        age=ag;
        phone=ph;
    }
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println();
    } 
}
class Main {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.setInformation("Hamidul Hoque Masum",24,"Male",1956644483);
        System.out.println("1.");
       teacher.displayInformation();
       System.out.println();
         Teacher teacherOne=new Teacher();
        teacherOne.setInformation("Mufassir mahmud",24,"Male",1776364390);
         System.out.println("2.");
        teacherOne.displayInformation();
    }
}
</code>
</pre>
</div>
Constructor
<div style="overflow-x:auto;">
<pre>
<code>
class Student{
    String name,program,blood,dob;
    int batch;
  Student(String nam,String dpt,int btc,String bld,String d){
        name=nam;
        program=dpt;
        batch=btc;
        blood=bld;
        dob=d;
    }
    void displayInformation(){
        System.out.println("      "+name+"          ");
        System.out.println("Program       : "+program);
        System.out.println("Batch         : "+batch);
        System.out.println("Date of birth : "+dob);
    }
}
class Main {
    public static void main(String[] args) {
       Student student=new Student("Hamidul Hoque Masum","CSE",19,"O-","24/8/2002");
       student.displayInformation();
       System.out.println();
       Student studentOne=new Student("Ahsan Habib","CSE",20,"AB+","5/3/2000");
       studentOne.displayInformation();
    }
}
</code>
</pre>
</div>
Constructor OverLoading
<div style="overflow-x:auto;">
<pre>
<code>
class Student{
    String name,dept;
    int batch,id;
    Student(){
        System.out.println("No Data");
    }
    Student(String nam,String dep ){
        name=nam;
        dept=dep;
    }
    Student(String nam,String dep,int bat, int d){
        name=nam;
        dept=dep;
        batch=bat;
        id=d;
    }
    void displayInformation(){
        System.out.println("     "+name+"    ");
        System.out.println("Id     : "+id);
        System.out.println("Dep    : " +dept);
        System.out.println("Batch  : "+batch);
        System.out.println();
    }
}
class Main {
    public static void main(String[] args) {
       Student student=new Student();
       student.displayInformation();
       Student studentOne=new Student("Hamidul hoque Masum","CSE");
       studentOne.displayInformation();
       Student studentTwo=new Student("Mufassir mahmud","CSE",19,42541);
       studentTwo.displayInformation();    
    }
}
</code>
</pre>
</div>
static Variable--
<div style="overflow-x:auto;">
<pre>
<code>
class Student{
    String name,id;
    static String university="Southeast University";
   void setData (String nm,String idn){
        name=nm;
        id=idn;
    }
    void displayInformation (){
        System.out.println("     "+university+"      ");
        System.out.println("Name    = "+name);
        System.out.println("Id      = "+id);
        System.out.println();
    }
}
class Main {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setData("Hamidul Hoque Masum","2024000010005");
        stu1.displayInformation();
        Student stu2=new Student();
        stu2.setData("Mufassir Mahmud","2024000010025");
        stu2.displayInformation();
    }
}
</code>
</pre>
</div>
Static variable without object-
<div style="overflow-x:auto;">
<pre>
<code>
class Student{
     static String university="southeast university";
}
class Main {
    public static void main(String[] args) {
        System.out.println("Varsity Name : "+Student.university);
    }
}
</code>
</pre>
</div>
Count The object by static variable
<div style="overflow-x:auto;">
<pre>
<code>
class Student{
     static int count=0;
    Student(){
        count++;
    }
    }
class Main {
    public static void main(String[] args) {
        Student st=new Student();
        Student st2=new Student();
        Student st3=new Student();
        Student st5=new Student();
        int n=st5.count;
        System.out.println("total student: "+n);
    }
}
</code>
</pre>
</div>
Static method--
<div style="overflow-x:auto;">
<pre>
<code>
class Student{
    void display (){
        System.out.println(" not Static method");
    }
    static void display2 (){
        System.out.println("Static method");
    }
}
class Main {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.display();
        Student.display2();
    }
}
</code>
</pre>
</div>
Hiding instance variable-
<div style="overflow-x:auto;">
<pre>
<code>
class Box{
    int count=1;
    double height,width,depth;
     Box (double height,double width,double depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
    void displayvol (){
        double vol=height*width*depth;
        System.out.println("Box : "+count);
        System.out.println("Height : "+height);
        System.out.println("Width : "+width);
        System.out.println("Depth : "+depth);
        System.out.println("Total vol is:"+vol);
        System.out.println();
      count ++;
    }
}
class Main {
    public static void main(String[] args) {
        Box box=new Box(10,10,10);
        Box box1=new Box(20,30,10);
        box.displayvol();
        box1.displayvol();
    }
}
</code>
</pre>
</div>
Math class-
<div style="overflow-x:auto;">
<pre>
<code>
class main{
    public static void main(String[]args){
        System.out.println(Math.abs(-70));
         System.out.println(Math.sqrt(9));
         System.out.println(Math.PI);
         System.out.println(Math.log(2.0));
         System.out.println(Math.max(5,15));
         System.out.println(Math.min(10,16));
         System.out.println(Math.ceil(7.1));
         System.out.println(Math.floor(7.1));
    }
}
</code>
</pre>
</div>
