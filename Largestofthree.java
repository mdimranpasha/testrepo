import java.util.*;
class Largestofthree
{
public static void main(String [] args){
int a = 8;
int b = 45;
int c = 89;//declaration and intialization of variables
int largest = ((a>b)&&(a>c))?a:((b>c)?b:c);
System.out.println("largest of two numbers is  "+   largest);
}
}