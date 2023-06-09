package lllogic;
class GooSearchResult {
    private final String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        if (url.contains("https://")) {
            return url.replace("https://", "");
        } else {
            return url.replace("http://", "");
        }
    }

    static class GooSearchResultTest {
        public static void main(String[] args) {
            //test.com
            System.out.println(new GooSearchResult("https://test.com").parseDomain());

            //apple.in.mars
            System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
        }
    }
}