package tasca4Testing.n2;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class LongitudStringMatcher extends FeatureMatcher<String, Integer> {


    public LongitudStringMatcher(Matcher<? super Integer> subMatcher, String featureDescription, String featureName) {
        super(subMatcher, featureDescription, featureName);
    }

    @Override
    protected Integer featureValueOf(String s) {
        return s.length();
    }
}
