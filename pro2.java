import java.util.scanner;
class sample
{
public static void main(String args[])
{
System.out.println("enter the value");
int palin=new Scanner(System.in).nextInt();
if(ispalin(palin))
{
System.out.println("number:"+palin+"is  palin);
{
else
{
System.out.println("number:"+palin+"is not palin);
}
}
public static boolean is palindrome(int number)
{
int palin=number;
int reverse=0;
while(palindrome!=0)
{
int remainder=palin%10;
reverse=reverse*10+remainder;
palin=plain/10;
}
if(number==reverse)
{
return true;
}
return false;
}
}
