import java.util.Scanner;
class Strings{
String[] arr;
int n;
void readStrings(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of srings: ");
n=sc.nextInt();
sc.nextLine();
arr=new String[n];
System.out.println("Enter the strings: ");
for(int i=0;i<n;i++){
arr[i]=sc.nextLine();
}
}
void sortStrings(){
String temp;
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(arr[i].compareTo(arr[j])>0){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
}
void display(){
System.out.println("Strings in sorted order:");
for(int i=0;i<n;i++){
System.out.println(arr[i]);
}
}
}
public class co2p1{
public static void main(String[] args){
Strings obj=new Strings();
obj.readStrings();
obj.sortStrings();
obj.display();
}
}
