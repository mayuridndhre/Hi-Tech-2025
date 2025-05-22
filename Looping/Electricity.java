/*Write a program to input electricity unit charges and calculate total electricity bill according to the given condition: 
for first 50units Rs. 0.50/unit
for next 150 units Rs. 0.75/unit
for next 250 units Rs. 1.20/unit
for unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is add to the bill using ladder if*/

class Electricity
{

public static void main(String args[])
{
int unit=250;
double bill;
double subcharge;
if(unit <= 50)
{
bill=unit*0.50;
subcharge=bill*0.20;
}
else if(unit>=51 && unit<=200)
{
bill=unit*0.75;
subcharge=bill*0.20;
}
else if(unit>=201 && unit<=450)
{
bill=unit*0.20;
subcharge=bill*0.20;
}
else if(unit>=451)
{
bill=unit*1.50;
subcharge=bill*0.20;
}
}
}