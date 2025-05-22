/*Task 1: Basic Interface Implementation
Create two interfaces Readable and Writable each with one method. Create a class File that implements both and provides method definitions.*/
interface Readable
{
void read();
}
interface Writable
{
void write();
}
class File implements Readable,Writable
{
public void read()
{
System.out.println("Readable file..");
}
public void write()
{
System.out.println("Writable file..");
}
public static void main(String args[])
{
File f=new File();
f.read();
f.write();
}
}
