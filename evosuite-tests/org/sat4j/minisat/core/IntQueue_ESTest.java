/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:47:28 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.minisat.core.IntQueue;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IntQueue_ESTest extends IntQueue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IntQueue intQueue0 = new IntQueue();
      intQueue0.insert(0);
      intQueue0.ensure(1942);
      assertEquals(1, intQueue0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IntQueue intQueue0 = new IntQueue();
      intQueue0.ensure(1959);
      intQueue0.ensure(1959);
      assertEquals(0, intQueue0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntQueue intQueue0 = new IntQueue();
      intQueue0.insert((-1031));
      intQueue0.dequeue();
      int int0 = intQueue0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IntQueue intQueue0 = new IntQueue();
      intQueue0.insert((-1031));
      int int0 = intQueue0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IntQueue intQueue0 = new IntQueue();
      intQueue0.insert(1089);
      int int0 = intQueue0.dequeue();
      assertEquals(0, intQueue0.size());
      assertEquals(1089, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IntQueue intQueue0 = new IntQueue();
      intQueue0.insert((-1031));
      intQueue0.insert(1089);
      intQueue0.toString();
      assertEquals(2, intQueue0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IntQueue intQueue0 = new IntQueue();
      String string0 = intQueue0.toString();
      assertEquals("><", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntQueue intQueue0 = new IntQueue();
      intQueue0.ensure((-2917));
      assertEquals(0, intQueue0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IntQueue intQueue0 = new IntQueue();
      intQueue0.insert((-1031));
      intQueue0.dequeue();
      intQueue0.insert(0);
      assertEquals(1, intQueue0.size());
      
      int int0 = intQueue0.dequeue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IntQueue intQueue0 = new IntQueue();
      // Undeclared exception!
      try { 
        intQueue0.dequeue();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IntQueue intQueue0 = new IntQueue();
      intQueue0.insert((-1031));
      intQueue0.insert(1089);
      intQueue0.insert(969);
      intQueue0.insert(0);
      intQueue0.insert(0);
      intQueue0.insert(0);
      intQueue0.insert((-1));
      intQueue0.insert((-1031));
      intQueue0.insert((-2917));
      intQueue0.insert(2073);
      // Undeclared exception!
      try { 
        intQueue0.insert(0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IntQueue intQueue0 = new IntQueue();
      intQueue0.clear();
      assertEquals(0, intQueue0.size());
  }
}
