public class LevelLoader {
    private static LevelLoader instance;
    LevelLoader(){

    }
    public static LevelLoader getInstance() {
        if (instance == null) {
            instance = new LevelLoader();
        }
        return instance;
    }
    public String load(String levelName){
        return "Loading level " + levelName + " ...";
    }

}

class LevelLoaderTest {
    public static void main(String[] args) {
        LevelLoader levelLoader = new LevelLoader();

        //Loading level Startlevel ...
        System.out.println(levelLoader.load("StartLevel"));
    }
}