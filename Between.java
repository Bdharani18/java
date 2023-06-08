public class Between
{

public static void main(String args[])
{
int a[]={7,18,32,90,78,21};
int counter=0;
for(int i=0; i<a.length; i=i+1)
{
if(a[i]>17&&a[i]<77)
{
counter=counter+1;
}
}
System.out.println(counter);
}
}
