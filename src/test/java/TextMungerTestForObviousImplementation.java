import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Ignore;
import org.junit.Test;

public class TextMungerTestForObviousImplementation {
	
	@Test
	public void laesstWortBisDreiZeichenUnveraendert() throws Exception {
		assertThat(verdrehe("abc"), is("abc"));
	}
	
	@Test
	@Ignore
	public void drehtZeichenInDerMitteUmFuerWortAusVierZeichen() throws Exception {
		assertThat(verdrehe("abcd"), is("acbd"));
	}

	private String verdrehe(String text) {
		return text;
	}

}
