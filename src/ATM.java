public class ATM {
    public int countBanknotes(int sum){
        int [] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int i = 0;
            while (i < banknotes.length){
                if (banknotes[i] > sum){
                    i++;
                    continue;

                }
                while (sum >= banknotes[i]){
                    sum = sum - banknotes[i];
                    count++;
            }
        }return count;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(501));
    }
}
