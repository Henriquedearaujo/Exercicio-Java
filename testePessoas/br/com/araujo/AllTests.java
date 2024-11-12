package br.com.araujo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServerTest.class, ContratoServerTest.class })
public class AllTests {
}
