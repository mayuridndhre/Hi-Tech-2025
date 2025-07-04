//substring
//public String substring(int startIndex);
//public String substring(int startIndex,int endIndex);
class subStringDemo
{
public static void main(String args[])
{
String s="SachinTendulkar";
String s1="   Mayuri   ";
int a=10;
System.out.println("Original String :"+s);

System.out.println("substring Starts from :"+s.substring(6));
System.out.println("substring Starts from :"+s.substring(8));
System.out.println("substring Starts from :"+s.substring(0,6));
System.out.println("substring Starts from :"+s.substring(2,5));
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s1);
System.out.println(s1.trim());
System.out.println(s1.charAt(1));
System.out.println(s1.charAt(3));
System.out.println(s1.length());
String replaceString=s1.replace("   ","Java");
System.out.println(replaceString);
String x=String.valueOf(a);
System.out.println(x+10);
}
}
//startIndex:inclusive
//endIndex:exclusive