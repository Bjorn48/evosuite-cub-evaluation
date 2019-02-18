/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:41:46 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.card.AtLeast;
import org.sat4j.minisat.constraints.cnf.CBClause;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.SizeComparator;
import org.sat4j.specs.Constr;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SizeComparator_ESTest extends SizeComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SizeComparator sizeComparator0 = new SizeComparator();
      Constr constr0 = mock(Constr.class, new ViolatedAssumptionAnswer());
      doReturn((-2320.727068282288), (-2320.727068282288)).when(constr0).getActivity();
      doReturn((-1104), (-1104)).when(constr0).size();
      int int0 = sizeComparator0.compare(constr0, constr0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SizeComparator sizeComparator0 = new SizeComparator();
      Constr constr0 = Constr.TAUTOLOGY;
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt(intArray0);
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      AtLeast atLeast0 = new AtLeast((ILits) null, vecInt0, 779);
      int int0 = sizeComparator0.compare(constr0, (Constr) atLeast0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SizeComparator sizeComparator0 = new SizeComparator();
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      Constr constr0 = Constr.TAUTOLOGY;
      int int0 = sizeComparator0.compare((Constr) cBClause0, constr0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SizeComparator sizeComparator0 = new SizeComparator();
      Constr constr0 = Constr.TAUTOLOGY;
      VecInt vecInt0 = new VecInt(0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      Constr constr1 = cardinalityDataStructure0.createCardinalityConstraint(vecInt0, 0);
      // Undeclared exception!
      try { 
        sizeComparator0.compare(constr0, constr1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SizeComparator sizeComparator0 = new SizeComparator();
      // Undeclared exception!
      try { 
        sizeComparator0.compare((Constr) null, (Constr) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.SizeComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SizeComparator sizeComparator0 = new SizeComparator();
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      Constr constr0 = Constr.TAUTOLOGY;
      int int0 = sizeComparator0.compare(constr0, (Constr) cBClause0);
      assertEquals((-3), int0);
  }
}