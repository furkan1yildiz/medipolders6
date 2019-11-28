package finalders1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBuyukHarf() {
		String deg=MetinIslemleri.buyukHarf("al");
		org.junit.Assert.assertEquals("AL", deg);
	}

}
