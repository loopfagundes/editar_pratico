package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testcases.RunTestCase;

@RunWith(Suite.class)
@SuiteClasses({
        RunTestCase.class,
        RunTestCase.class
})
public class AllTests {
}