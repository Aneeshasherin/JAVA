import java.util.Scanner;
public class program4{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter odere of the matrix(n):");
int n=sc.nextInt();
int[][]a=new int[n][n];
System.out.println("Enter matrix elements:");
for(int i=0;i<n;i++)
for(int j=0;j<n;j++)
a[i][j]=sc.nextInt();
boolean symmetric=true;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(a[i][j]!=a[i][j]){
symmetric=false;
break;
}
}
}
if(symmetric){
System.out.println("Matrix is symmtreic");
}
else{
System.out.println("Matrix is NOT symmetric");
sc.close();
}
}
}

