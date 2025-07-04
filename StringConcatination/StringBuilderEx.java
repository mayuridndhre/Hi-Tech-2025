/*Task 3: Concatenate Using StringBuilder
Objective: Use StringBuilder to concatenate strings inside a loop.
📌 Task:
Join all words in an array: {"Learn", "DevOps", "with", "Linux"}
Expected Output: LearnDevOpswithLinux*/

class StringBuilderEx
{
public static void main(String args[])
{
String words[]={"Learn","DevOps","with","Linux"};
StringBuilder st=new StringBuilder();

for(String word:words)
{
	st.append(word);
}

String result=st.toString();
System.out.println(result);
}
}