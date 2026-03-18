class Product{
int pcode;
String pname;
double price;

Product(int pcode,String pname,double price){
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
void display(){
System.out.println(pcode+" "+pname+" "+price);
}
}
public class program1{
public static void main(String[]args){
Product p1=new Product(101,"pen",10);
Product p2=new Product(102,"pencil",5);
Product p3=new Product(103,"nottebook",20);

Product lowest=p1;
if(p2.price<lowest.price)
lowest=p2;
if(p3.price<lowest.price)
lowest=p3;
System.out.println("Prouct withh lowest  price: ");
lowest.display();
}
}
