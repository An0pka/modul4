public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        while (count > 0) {
            if (count >= 1000) {
                count = count - 1000;
                result.append("X");
                continue;


            }
            if (count >= 100) {
                count = count - 100;
                result.append("Y");
                continue;

            }
            if (count >= 10) {
                count = count - 10;
                result.append("Z");
                continue;

            }
            count = count - 1;
            result.append("*");


        }
        return result.toString();
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
    }
}
