import java.util.LinkedList;
import java.math.BigDecimal;
//import java.lang.*;
class DataTypes
{
public static void main(String args[]){
// Primitive (Coming from C , C++) Types or Value Types
// Non - Decimal Types
byte y =10; // 1 byte - 8 bit
byte r = y;
r++;
// 1 bit is for + -
// and 7 bit is for number range
// -2 ^ 7 to 2 ^ 7 - 1
// - 128 to 127
short z = 1000; // 2 byte
int x;  // 4 byte
long t;  // 8 byte

float pp = 10.20F;  //4 Byte
float k1 =(float)90.20;
double ppp = 10.2676540;  // 8 byte

boolean t1 = true;  // 1- true and 0- false internally  ( 1 Byte , 2 Byte , 4 Byte)
char m = 'A';  //2 Byte (UNICODE)

// Reference Data Types
// Address  - Reference
//msg is a reference data type
// Literal - 1 or 0
// new String() - 2 or 1 
String msg = "Hello User".intern(); // String Literal  // 1 Object  // String is a predefine class in Java
String msg3 = "Hello User".intern();  // 0 Object
String msg4 = new String("Hello User"); // 1 Object // new Object Way
String msg5 = new String("Welcome User").intern(); // 2 Objects
String msg6 = "Welcome User"; // 0 Object
if(msg == msg4){
	System.out.println("Same Ref ");
}
else
{
System.out.println("Not Same Ref ");
}
// == v/s equals
System.out.println("String Compare "+"raj".compareTo("ram"));
if("raj".compareTo("raj")==0){
//if(msg.equalsIgnoreCase(msg4)){
System.out.println("Same Value");
}
else
{
System.out.println("Not Same Value");
}

System.out.println("**************************************");
// Wrapper Class (Near to OOPS + Java Inbuild Data Structure Only Support Objects)
LinkedList l = new LinkedList();
l.add(new Integer(100));  // Java 1.4 
l.add(100);  // Java 1.5 
int bbb = 10;
Integer bb = 128;  // 1 Byte Pool , > 1 Byte Not Pool
Integer nn = 128;
Float hh = 90.20F;
Byte vv = 10;
if(bb==nn){
System.out.println("Same Ref ");
}
else
{
System.out.println("Not Same Ref ");
}

// BigDecimal , BigInteger  (21 Digit)
BigDecimal bd = new BigDecimal("123456789.1034");
BigDecimal bd2 = new BigDecimal("123456789.4343");
BigDecimal bd3 = bd.add(bd2);
System.out.println(bd3);
//String msg2 = msg;
// String internally is treated as Char Array
// String maintain a String Pool
// String Object is created in 2 Ways
// 1. String Literal Way 2. String new Object Way
// [0] = H [1] = e and so on
// ALso String has predefine methods
// e.g toUpperCase , toLowerCase, length, indexOf, replace etc.



}
}