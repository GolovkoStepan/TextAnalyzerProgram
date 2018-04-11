public abstract class AbstractKeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {

        for (String key: getKeywords()) {

            if (text.contains(key)) return getLabel();

        }

        return Label.OK;

    }

}
