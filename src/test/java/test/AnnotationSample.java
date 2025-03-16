package test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class AnnotationSample {

@BeforeSuite	

public void BeforeSuite()
{
	System.out.println("BeforeSuite");
}

@BeforeTest
public void Beforetest()
{
	System.out.println("BeforeTest");
}

@BeforeClass
public void BeforeClass()
{
	System.out.println("BeforeClass");
}

@BeforeMethod
public void BeforeMethod()
{
	System.out.println("BeforeMethod");
}

@Test
public void testMethod()
{
	System.out.println("TestMethod");
}
@AfterMethod
public void afterMethod()
{
	System.out.println("AfterMethod");
}
@AfterClass
public void afterClass()
{
	System.out.println("AfterClass");
}
@AfterTest
public void aftertest()
{
	System.out.println("AfterTest");
}


@AfterSuite
public void afterSuite()
{
	System.out.println("AfterSuite");
}
}
