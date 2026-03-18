class CPU{
double price;
CPU(double price){
this.price=price;
}
class Processor{
int cores;
String manufacturer;
Processor(int cores,String manufacturer){
this.cores=cores;
this.manufacturer=manufacturer;
}
void displayProcessor(){
System.out.println("Processor cores:"+cores);
System.out.println("Processor Manufacturer:"+manufacturer);
}
}
static class RAM{
int memory;
String manufacturer;
RAM(int memory,String manufacturer){
this.memory=memory;
this.manufacturer=manufacturer;
}
void displayRAM(){
System.out.println("RAM memory:"+memory+"GB");
System.out.println("RAM manufacturer:"+manufacturer);
}
}
}
public class program5{
public static void main(String[]args){
CPU cpu=new CPU(55000);
System.out.println("CPU price:"+cpu.price);
CPU.Processor processor=cpu.new Processor(8,"intel");
processor.displayProcessor();
CPU.RAM ram=new CPU.RAM(16,"corsair");
ram.displayRAM();
}
}


