public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 5.0;
        double dripCoffeePrice = 3.5;
        double lattePrice = 4.0;
        double cappuccinoPrice = 3.0;

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);
        
        if (isReadyOrder4 == true){
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        // Sam just ordered 2 lattes, print the message to display their total.
        // Next, use an if statement to print the appropriate order status message.
        // Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).
        System.out.println(customer2 + displayTotalMessage + (lattePrice * 2));
        if (isReadyOrder2 == true){
            isReadyOrder2 = false;
            System.out.println(pendingMessage);
        } else {
            isReadyOrder2 = true;
            System.out.println(readyMessage);
        }
        // Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total message with 
        // the new calculated total (what he owes) to make up the difference.
        System.out.println(customer3 + displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}
