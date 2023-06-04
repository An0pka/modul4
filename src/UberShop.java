import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                result++;
            }
        }

        return result;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int[] numbers = {1, 2, 3, 4, 5};
        for(int i = 1; i < numbers.length; i += 2) {
            System.out.println(numbers[i]); //Выведет 2, 4
        }

        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == toRemove) {
                count++;
            }
        }
        int prise[] = new int[prices.length - count];
        int index = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                prise[index] = prices[i];
                index++;
            }

        }
        return prise;
    }



    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [150, 200]
        int[] prices = new int[]{150, 100, 200};
        int toRemove = 100;
        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));
    }
}
