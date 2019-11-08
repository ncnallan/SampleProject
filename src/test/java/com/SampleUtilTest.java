package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleUtilTest {
@Test
public void testAdd(){
	Integer a=15;
	Integer b=15;
	Integer expectedResult=30;
	Integer result=SampleUtil.add(a, b);
	assertEquals(expectedResult,result);
	assertEquals(null,SampleUtil.add(null, b));

	assertEquals(null,SampleUtil.add(a, null));

	assertEquals(null,SampleUtil.add(null, null));

}
}
