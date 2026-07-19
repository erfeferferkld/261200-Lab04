public class HealthRecord {
    private double height;
    private static int counter = 0;
    private static double averageHeight = (double)0.0F;
    private static final double MIN_PERMITTED_HEIGHT = (double)30.0F;
    private static final double MAX_PERMITTED_HEIGHT = (double)275.0F;
    private static final double DEFAULT_HEIGHT = (double)165.0F;
    private static double tallestHeight = (double)30.0F;
    private static double shortestHeight = (double)275.0F;

    public HealthRecord(double height) {
        ++counter; //Count every new HealthRecord object
        this.setHeight(height);
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        //Validate the input height
        if (height > MIN_PERMITTED_HEIGHT && height < MAX_PERMITTED_HEIGHT) {
            this.height = height;
        } else {
            this.height = DEFAULT_HEIGHT;
        }

        //Update the tallest recorded height
        if (this.height > tallestHeight && this.height != DEFAULT_HEIGHT) {
            tallestHeight = this.height;
        }

        if (this.height < shortestHeight) {
            shortestHeight = this.height;
        }

        //Update the average height of all students
        if (counter == 1) {
            averageHeight = this.height;
        } else {
            averageHeight = (averageHeight * (double)(counter - 1) + this.height) / (double)counter;
        }

    }

    public static double getTallestHeight() {
        return tallestHeight;
    }

    public static double getShortestHeight() {
        return shortestHeight;
    }

    public static double getAverageHeight() {
        return averageHeight;
    }

    public void displayDetails() {
        System.out.println("Height (cm): " + this.getHeight());
    }

    //Display class statistics
    public static void displayClassDetails() {
        System.out.println("The tallest height (cm): " + getTallestHeight());
        System.out.println("The shortest height (cm): " + getShortestHeight());
        System.out.println("The average height (cm) : " + getAverageHeight());
    }

    public String getDetails() {
        return "Height (cm): " + this.getHeight();
    }

    public static String getClassDetails() {
        double var10000 = getTallestHeight();
        return "Tallest: " + var10000 + ", Shortest: " + getShortestHeight() + ", Average: " + getAverageHeight();
    }
}
