/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:39:41 GMT 2019
 */

package org.sat4j.minisat.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.restarts.Glucose21Restarts;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PureOrder_ESTest extends PureOrder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      lits0.getFromPool(1500);
      pureOrder0.setLits(lits0);
      // Undeclared exception!
      try { 
        pureOrder0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.PureOrder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(0);
      ActiveLearning<CardinalityDataStructureYanMax> activeLearning0 = new ActiveLearning<CardinalityDataStructureYanMax>(578.685135306829);
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(activeLearning0, cardinalityDataStructureYanMax0, pureOrder0, glucose21Restarts0);
      solver0.registerLiteral(1);
      pureOrder0.init();
      int int0 = pureOrder0.select();
      assertEquals(3, int0);
      assertEquals(0, pureOrder0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      pureOrder0.setPeriod(0);
      int int0 = pureOrder0.getPeriod();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      int int0 = pureOrder0.getPeriod();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      lits0.satisfies(2);
      lits0.ensurePool(2);
      pureOrder0.setLits(lits0);
      // Undeclared exception!
      try { 
        pureOrder0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.PureOrder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(0);
      String string0 = pureOrder0.toString();
      assertEquals(0, pureOrder0.getPeriod());
      assertEquals("tries to first branch on a single phase watched unassigned variable (pure literal if using a CB data structure) else VSIDS from MiniSAT", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      pureOrder0.lits = (ILits) lits0;
      pureOrder0.init();
      pureOrder0.select();
      pureOrder0.select();
      assertEquals(20, pureOrder0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder((-1405));
      int int0 = pureOrder0.getPeriod();
      assertEquals((-1405), int0);
  }
}
