package main.java;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.platform.suite.api.IncludeClassNamePatterns;

/**
 * Test Suite for ProductStock class
 * Organizes and runs all ProductStock tests as a cohesive suite
 */
@Suite
@SuiteDisplayName("ProductStock Test Suite")
@SelectClasses({ProductStockTest.class})
public class ProductStockTestSuite {
}
