public class HarekDataMaker {
    public String aggregateSingle(String name, String age, String planet) {
        return "name - " + name + "," + " age - " + age + "," + " planet - " + planet;
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        String[] result = new String[3];
        result[0] = aggregateSingle(names[0], String.valueOf(ages[0]), planets[0]);
        result[1] = aggregateSingle(names[1], String.valueOf(ages[1]), planets[1]);
        result[2] = aggregateSingle(names[2], String.valueOf(ages[2]), planets[2]);
        return result;

    }


}
