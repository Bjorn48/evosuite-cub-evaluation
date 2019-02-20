/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:22:52 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMin;
import org.sat4j.minisat.core.ConflictTimer;
import org.sat4j.minisat.core.Glucose2LCDS;
import org.sat4j.minisat.core.Solver;
import org.sat4j.specs.Constr;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Glucose2LCDS_ESTest extends Glucose2LCDS_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Constr constr0 = Constr.TAUTOLOGY;
      Glucose2LCDS<CardinalityDataStructureYanMin> glucose2LCDS0 = new Glucose2LCDS<CardinalityDataStructureYanMin>((Solver<CardinalityDataStructureYanMin>) null, (ConflictTimer) null);
      glucose2LCDS0.onPropagation(constr0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Glucose2LCDS<CardinalityDataStructureYanMax> glucose2LCDS0 = new Glucose2LCDS<CardinalityDataStructureYanMax>((Solver<CardinalityDataStructureYanMax>) null, (ConflictTimer) null);
      String string0 = glucose2LCDS0.toString();
      assertEquals("Glucose 2 learned constraints deletion strategy (LBD updated on propagation) with timer null", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Glucose2LCDS<CardinalityDataStructureYanMin> glucose2LCDS0 = new Glucose2LCDS<CardinalityDataStructureYanMin>((Solver<CardinalityDataStructureYanMin>) null, (ConflictTimer) null);
      // Undeclared exception!
      try { 
        glucose2LCDS0.onPropagation((Constr) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.Glucose2LCDS", e);
      }
  }
}
