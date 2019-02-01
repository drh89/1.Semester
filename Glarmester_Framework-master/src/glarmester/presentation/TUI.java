package glarmester.presentation;

import glarmester.data.DataAccessor;
import glarmester.data.DataAccessorHardCodedValues;
import glarmester.logic.Controller;
import glarmester.logic.ControllerImpl;
import glarmester.logic.PriceCalculator;
import java.util.List;
import java.util.Scanner;

public class TUI {
    private Controller c;
    private Scanner scanner = new Scanner(System.in);
    
    public TUI(){
        DataAccessor data = new DataAccessorHardCodedValues();
        PriceCalculator logic = new PriceCalculator();
        c = new ControllerImpl(data, logic);
    }
    
    public void go(){
        while(true){
            // input dimensions
            int height = inputHeight();
            int width = inputWidth();

            // select frame type
            List<String> frames = c.getFrameNames();
            String selectedFrame = selectFrame(frames);

            // calculate price
            double price = c.getTotalPrice(height, width, selectedFrame);

            // display result
            displayPrice(price);
            
            System.out.println("");
        }
    }

    private int inputHeight() {
        System.out.print("Enter height in cm: ");
        return getInt();
    }
    private int inputWidth() {
        System.out.print("Enter width in cm: ");
        return getInt();
    }
    private int getInt(){
        while(true){
            String input = scanner.nextLine().trim();
            try{
                int value = Integer.parseInt(input);
                return value;
            }catch(NumberFormatException e){
                // Ignored
            }
            System.out.print("Bad input - try again? ");
        }
    }
    private String selectFrame(List<String> frames) {
        for (int i = 0; i < frames.size(); i++) {
            String frame = frames.get(i);
            System.out.println((i+1) + " " + frame);
        }
        System.out.print("Choose a frame: ");
        while(true){
            int value = getInt();
            if(value >= 1 && value <= frames.size())
            return frames.get(value-1);
        }
    }
    private void displayPrice(double price) {
        System.out.println("========================================"); // length 40
        System.out.println(String.format("===%19.2f%15s===", price, ""));
        System.out.println("========================================");
    }

}
