I created a sandwich shop with OOP which was very difficult but i can i was able to push through
i need to create a repository to save the receipts



// One unified list for ALL toppings
private List<Topping> toppings = new ArrayList<>();

// Simple method to add any topping type
public void addTopping(Topping topping) {
toppings.add(topping);

you dont really need to seperate all the choices i made the topping into one list


@Override
public String toString() {
String output = "";

    output += size + "\" " + bread;
    if (isToasted) {
        output += " (toasted)";
    }
    output += "\n";

    for (Topping topping : toppings) {
        output += "  - " + topping.toString() + "\n";
    }

    output += "Total: $" + String.format("%.2f", getPrice());
    return output;
} i really enjoy how i formatted the receipts its very easy to read 

![sammich shop](sammich%20shop.png)



I really enjoy how i made the toppings all into 1 list. Each Topping knows its own type  like ‘meat’, ‘cheese’, or ‘topping’  and whether it’s extra.
Because of that, I’m able to loop through the entire list in just one for loop, and my pricing logic automatically applies the correct charges based on the type and the sandwich size.

// TOPPING COSTS
for (Topping topping : toppings) {

            String type = topping.getType();

            // MEAT
            if (type.equals("meat")) {
                if (size.equals("4")) price += 1.00;
                else if (size.equals("8")) price += 2.00;
                else price += 3.00;

                if (topping.isExtra()) {
                    if (size.equals("4")) price += 0.50;
                    else if (size.equals("8")) price += 1.00;
                    else price += 1.50;
                }
            }

            // CHEESE
            else if (type.equals("cheese")) {
                if (size.equals("4")) price += 0.75;
                else if (size.equals("8")) price += 1.50;
                else price += 2.25;

                if (topping.isExtra()) {
                    if (size.equals("4")) price += 0.30;
                    else if (size.equals("8")) price += 0.60;
                    else price += 0.90;
                }
            }

        }



features:
Customers are able to customize what kinda of sandwich they want
there is a receipt generator that also saves