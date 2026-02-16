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





