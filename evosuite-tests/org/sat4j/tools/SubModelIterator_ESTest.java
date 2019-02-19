/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 16:00:52 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.SubModelIterator;
import org.sat4j.tools.encoding.EncodingStrategyAdapter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubModelIterator_ESTest extends SubModelIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[1] = (-1073741823);
      DimacsStringSolver dimacsStringSolver0 = mock(DimacsStringSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(dimacsStringSolver0).discardCurrentModel();
      doReturn(intArray0).when(dimacsStringSolver0).model();
      ClausalCardinalitiesDecorator<DimacsStringSolver> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<DimacsStringSolver>(dimacsStringSolver0, (EncodingStrategyAdapter) null);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(clausalCardinalitiesDecorator0);
      VecInt vecInt0 = new VecInt(58, 0);
      SolutionFoundListener solutionFoundListener0 = mock(SolutionFoundListener.class, new ViolatedAssumptionAnswer());
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(singleSolutionDetector0, vecInt0, solutionFoundListener0);
      SubModelIterator subModelIterator0 = new SubModelIterator(abstractMinimalModel0, vecInt0);
      // Undeclared exception!
      try { 
        subModelIterator0.model();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.sat4j.tools.SubModelIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 782;
      DimacsStringSolver dimacsStringSolver0 = mock(DimacsStringSolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(dimacsStringSolver0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn((IConstr) null).when(dimacsStringSolver0).discardCurrentModel();
      doReturn(intArray0).when(dimacsStringSolver0).model();
      ClausalCardinalitiesDecorator<DimacsStringSolver> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<DimacsStringSolver>(dimacsStringSolver0, (EncodingStrategyAdapter) null);
      VecInt vecInt0 = new VecInt(58, 0);
      SubModelIterator subModelIterator0 = new SubModelIterator(clausalCardinalitiesDecorator0, vecInt0, 0L);
      subModelIterator0.model();
      assertEquals(2L, subModelIterator0.numberOfModelsFoundSoFar());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = new SubModelIterator(dimacsStringSolver0, vecInt0);
      // Undeclared exception!
      try { 
        subModelIterator0.model();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = new SubModelIterator((ISolver) null, vecInt0);
      // Undeclared exception!
      try { 
        subModelIterator0.model();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SubModelIterator subModelIterator0 = null;
      try {
        subModelIterator0 = new SubModelIterator((ISolver) null, (IVecInt) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SubModelIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SubModelIterator subModelIterator0 = null;
      try {
        subModelIterator0 = new SubModelIterator((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SubModelIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(154);
      SubModelIterator subModelIterator0 = null;
      try {
        subModelIterator0 = new SubModelIterator((ISolver) null, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(1447);
      int[] intArray0 = new int[10];
      DimacsStringSolver dimacsStringSolver0 = mock(DimacsStringSolver.class, new ViolatedAssumptionAnswer());
      doReturn(unitClause0).when(dimacsStringSolver0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(unitClause0).when(dimacsStringSolver0).discardCurrentModel();
      doReturn(intArray0).when(dimacsStringSolver0).model();
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = new SubModelIterator(dimacsStringSolver0, vecInt0);
      subModelIterator0.model();
      assertEquals(2L, subModelIterator0.numberOfModelsFoundSoFar());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = mock(DimacsStringSolver.class, new ViolatedAssumptionAnswer());
      ClausalCardinalitiesDecorator<DimacsStringSolver> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<DimacsStringSolver>(dimacsStringSolver0, (EncodingStrategyAdapter) null);
      VecInt vecInt0 = new VecInt(58, 0);
      SubModelIterator subModelIterator0 = new SubModelIterator(clausalCardinalitiesDecorator0, vecInt0, 0L);
      // Undeclared exception!
      try { 
        subModelIterator0.primeImplicant();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SubModelIterator", e);
      }
  }
}
