class string_functions
{
public static void main(String ar[])
{
String s1="AnjaliAn";
String s2=s1.substring(2,5);
String s3=s1.substring(3);
String s4=s1.toUpperCase();
String s5=s1.toLowerCase();
String s6=s1.replace("jali","usha");
String s7=s1.replaceFirst("An","Gan");
String s8=s1.replace("j","g");
int s=s1.indexOf('l');
System.out.printf("%s,%s,%s,%s,%s,%s,%s,%s",s1,s2,s3,s4,s5,s6,s7,s8);
System.out.println();
System.out.printf("%d",s);
}
}