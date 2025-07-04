/*Task 4: Product Inventory
Create a Product class:
Private: productId, productName, quantity, price
Add:
Getters and setters.
Method to update quantity (add/remove stock), ensuring quantity doesn’t go negative.*/

public class Product
{
private int productId;
private int quantity;
private int price;

public int getProductId()
{
return productId;
}
public void setProductId(int productId)
{
this.productId=productId;
}

public int getquantity()
{
return quantity;
}
public void setquantity(int quantity)
{
this.quantity=quantity;
}

public int getPrice()
{
return price;
}
public void setPrice(int price)
{
this.price=price;
}

public void add(int add)
{
quantity+=add;
}

public void remove(int remove)
{
if(remove<=quantity)
{
quantity-=remove;
}
else
{
System.out.println("Invalid data");
}
}

public static void main(String args[])
{
Product p=new Product();
p.setProductId(1);
p.setquantity(5);
p.setPrice(500);

System.out.println("Product Id of Product is : "+p.getProductId());
System.out.println("Quantity of Product is : "+p.getquantity());
System.out.println("Price of Product is : "+p.getPrice());
p.add(50);
System.out.println("After adding quantity is  : "+p.getquantity());
p.remove(20);
System.out.println("After removing quantity is : "+p.getquantity());
}
}