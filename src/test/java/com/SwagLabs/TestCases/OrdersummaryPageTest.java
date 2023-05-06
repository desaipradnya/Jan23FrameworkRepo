package com.SwagLabs.TestCases;

import org.apache.commons.exec.OS;
import org.testng.annotations.Test;

public class OrdersummaryPageTest extends Baseclass
{


@Test(priority=1)
 public void verifySummary()
 {
	os.getsummary();
 }
 
 @Test(priority=2)
 public void verifyOrder()
 {
	  OS.completeProcess();
 }
}

