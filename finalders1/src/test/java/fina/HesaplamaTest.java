package fina;
import org.junit.*;

import finalders1.Hesaplama;
public class HesaplamaTest {

	public void testcarp() {
		int sonuc =Hesaplama.carp1(2,3);
		org.junit.Assert.assertEquals(6, sonuc);
	}
}
