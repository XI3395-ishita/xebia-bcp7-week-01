import java.util.Scanner;

class Calc{
public static void main(String[] args){
char operator;
Double number1,number2, answer;
Scanner sc=new Scanner(System.in);

System.out.println("Choose an operator: *, +, /, -");
operator=sc.next().charAt(0);

System.out.println("Enter first number");
number1=sc.nextDouble();

System.out.println("Enter second number");
number2=sc.nextDouble();

switch(operator){

case '*':
answer=number1*number2;
System.out.println(number1+" * "+number2+" = "+answer);
break;

case '+':
answer=number1+number2;
System.out.println(number1+" + "+number2+" = "+answer);
break;

case '/':
answer=number1/number2;
System.out.println(number1+" / "+number2+" = "+answer);
break;

case '-':
answer=number1-number2;
System.out.println(number1+" - "+number2+" = "+answer);
break;

default:
System.out.println("Invalid Choice");
break;
}
}
}
