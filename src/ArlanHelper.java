public class ArlanHelper {
    //Test output
    public String drawQuad(int n){
        int fuck = n;
        String horizont = "";
        String result = "";
        while(fuck > 0) {
            horizont += "*";
            fuck--;
        }
        fuck = n;
        while (fuck > 0) {
            result += horizont + "\n";
            fuck--;
        }
        return result;

    }
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));
    }
}