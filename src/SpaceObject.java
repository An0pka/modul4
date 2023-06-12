class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();

        //Should be 10
        System.out.println(firTest.test(firNum, 10));
    }
}

class FirNum {
    public int calc(int n) {
        return n;

    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int count = 0;
        while (n > 0) {
            count += n;
            n--;
        }
        return count;
    }
}

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int count = 1;
        int fact = n - 1;
        if (n == 0 || n == 1) {
            return 1;
        } else if (n > 0) {
            while (n > 0) {
                count *= n;
                n--;
            }
        }
        return count;
    }
}

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int count = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else if (n > 0) {
            while (n > 0) {
                if (n % 2 != 0) {
                    count *= n;

                }
                n--;
            }
        }
        return count;
    }

}
class FirNumFizzBuzz extends FirNum{
    @Override
    public int calc(int n) {
        int count = 0;
        if (n == 0 || n == 1){
            return 0;
        }

        while (n > 0) {
            if (n % 3 == 0 && n % 5 ==0){
                n--;
            }
            if (n % 3 == 0 || n % 5 ==0){
                count += n;
            }
            n--;
        }
        return count;
}

    public static void main(String[] args) {
        FirNumFizzBuzz fb = new FirNumFizzBuzz();
        System.out.println(fb.calc(15));
    }
}