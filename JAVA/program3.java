import java.util.Scanner;
class Complex{
double real;
double imaginary;
Complex(double real,double imaginary){
this.real=real;
this.imaginary=imaginary;
}
Complex add(Complex c){
double newReal=this.real+c.real;;
double newImaginary=this.imaginary+c.imaginary;
return new Complex(newReal,newImaginary);
}
void display(){
System.out.println(real+"+"+imaginary+"i");
}
}
public class program3{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter real and imaginary part of first number: ");
double r1=sc.nextDouble();
double i1=sc.nextDouble();
System.out.print("enter real and imaginary  part of the second number: ");
double r2=sc.nextDouble();
double i2=sc.nextDouble();
Complex c1=new Complex(r1,i1);
Complex c2=new Complex(r2,i2);
Complex result=c1.add(c2);
System.out.print("Sum=");
result.display();
sc.close();
}
}

