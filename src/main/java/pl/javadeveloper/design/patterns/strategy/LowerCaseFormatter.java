package pl.javadeveloper.design.patterns.strategy;

public class LowerCaseFormatter implements TextFormatterStrategy {

	public String format(String text) {
		return text.toLowerCase();
	}

}
