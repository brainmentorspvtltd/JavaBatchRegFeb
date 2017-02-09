class IfElseDemo{
public static void main(String args[]){
boolean t = false;
if(t=true){
System.out.println("Inside if ");
}
else
{
System.out.println("Inside Else ");
}

// Equality Compare + Fall + int , byte, char
// Java 7 String
final int MIC = 1;
final int SHOCK= 2;
//int order = MIC;
String order = "Mic";
switch(order){
case "Mic":
//case MIC:
System.out.println("MIc by SOny , Smasung....");
case "Shock":
//case SHOCK:
System.out.println("Shocks ");
/*case 3:
System.out.println(" Boom Stand ");
case 4:
System.out.println("Pop Filter");
*/
default:
System.out.println("Invalid...");
}
}
}