# Java-day-1-to-day-last

##-----------Day 1----------8 feb 2026
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

---------#DAY2------
-------------09-feb-2026-----------
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


