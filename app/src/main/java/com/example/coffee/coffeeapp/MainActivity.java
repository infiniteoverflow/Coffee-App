package com.example.coffee.coffeeapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends Activity {

    int quantity=0;
    int price=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementPrice(View view)
    {
        price++;
        displayCoffeePrice(price);
    }

    public void decrementPrice(View view)
    {
        if(price==0)
            return;
        price--;
        displayCoffeePrice(price);
    }

    public void increment(View view)
    {
        quantity++;
        display(quantity);
    }

    public void decrement(View view)
    {
        if(quantity==0)
            return;
        quantity--;
        display(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(quantity);
        displayPrice(quantity*price);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_value);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.total_price);
        quantityTextView.setText("Total:₹" + number);
    }

    private void displayCoffeePrice(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.coffeePrice);
        quantityTextView.setText(number+" ₹");
    }
}