import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TextMungerTestForTriangulate {
	
	@Test
	public void laesstWortBisDreiZeichenUnveraendert() throws Exception {
		assertThat(verdrehe("abc"), is("abc"));
	}

	@Test
	public void drehtZeichenInDerMitteUmFuerWortAusVierZeichen() throws Exception {
		assertThat(verdrehe("abcd"), is("acbd"));
	}
	
	private String verdrehe(String text) {
		if ("abcd".equals(text)) {
			return "" + 
				text.charAt(0) + 
				text.charAt(2) + 
				text.charAt(1) + 
				text.charAt(3);
		}
		return text;
	}

}
