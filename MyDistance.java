class Distance {
    private int feet;
    private int inches;

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public Distance addDistance(Distance d) {
        int totalFeet = this.feet + d.feet;
        int totalInches = this.inches + d.inches;

        if (totalInches >= 12) {
            totalFeet++;
            totalInches -= 12;
        }

        return new Distance(totalFeet, totalInches);
    }

    public Distance subtractDistance(Distance d) {
        int totalFeet = this.feet - d.feet;
        int totalInches = this.inches - d.inches;

        if (totalInches < 0) {
            totalFeet--;
            totalInches += 12;
        }

        return new Distance(totalFeet, totalInches);
    }

    public void displayDistance() {
        System.out.println("Feet: " + feet + ", Inches: " + inches);
    }
}

public class MyDistance {
    public static void main(String[] args) {
        Distance distance1 = new Distance(5, 8);
        Distance distance2 = new Distance(3, 10);
        Distance sum = distance1.addDistance(distance2);
        System.out.println("Sum of distances:");
        sum.displayDistance();
        Distance difference = distance1.subtractDistance(distance2);
        System.out.println("Difference of distances:");
        difference.displayDistance();
    }
}
