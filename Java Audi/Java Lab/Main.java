import java.util.Scanner;

class Resistor {
    String band1;
    String band2;
    String band3;
    int resistance;

    public Resistor(String band1, String band2, String band3) {
        this.band1 = band1.toLowerCase();
        this.band2 = band2.toLowerCase();
        this.band3 = band3.toLowerCase();
        this.resistance = calculateResistance();
    }

    int getColorValue(String color) {
        switch (color) {
            case "black": return 0;
            case "brown": return 1;
            case "red": return 2;
            case "orange": return 3;
            case "yellow": return 4;
            case "green": return 5;
            case "blue": return 6;
            case "violet": return 7;
            case "gray": return 8;
            case "white": return 9;
            default: return -1; 
        }
    }

    int calculateResistance() {
        int firstDigit = getColorValue(band1);
        int secondDigit = getColorValue(band2);
        int multiplier = getColorValue(band3);

        return (firstDigit * 10 + secondDigit) * (int) Math.pow(10, multiplier);
    }

    int getResistance() {
        return resistance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter resistor colors:");
        System.out.print("First band: ");
        String band1 = scanner.nextLine();
        System.out.print("Second band: ");
        String band2 = scanner.nextLine();
        System.out.print("Third band: ");
        String band3 = scanner.nextLine();

        Resistor resistor = new Resistor(band1, band2, band3);
        
        int resistanceValue = resistor.getResistance();
        if (resistanceValue != -1) {
            System.out.println("Resistance = " + resistanceValue + " ohms");
        } else {
            System.out.println("Failed to calculate resistance.");
        }

        scanner.close();
    }
}


