public class SpamAnalyzerAbstract extends AbstractKeywordAnalyzer {

    private final String [] keywords;

    public SpamAnalyzerAbstract(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

}
