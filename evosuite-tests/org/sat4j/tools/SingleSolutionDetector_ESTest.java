/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:47:08 GMT 2019
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
import org.sat4j.minisat.constraints.MixedDataStructureSingleWL;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.MiniSATLearning;
import org.sat4j.minisat.orders.NaturalStaticOrder;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.encoding.Ladder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingleSolutionDetector_ESTest extends SingleSolutionDetector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[3];
      GroupClauseSelectorSolver<OptToSatAdapter> groupClauseSelectorSolver0 = (GroupClauseSelectorSolver<OptToSatAdapter>) mock(GroupClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(groupClauseSelectorSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(intArray0).when(groupClauseSelectorSolver0).model();
      doReturn((IConstr) null).when(groupClauseSelectorSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(true).when(groupClauseSelectorSolver0).removeConstr(any(org.sat4j.specs.IConstr.class));
      Ladder ladder0 = new Ladder();
      ClausalCardinalitiesDecorator<GroupClauseSelectorSolver<OptToSatAdapter>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<GroupClauseSelectorSolver<OptToSatAdapter>>(groupClauseSelectorSolver0, ladder0);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(clausalCardinalitiesDecorator0);
      boolean boolean0 = singleSolutionDetector0.hasASingleSolution();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution((IVecInt) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector((ISolver) null);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DimacsStringSolver[] dimacsStringSolverArray0 = new DimacsStringSolver[0];
      ManyCore<DimacsStringSolver> manyCore0 = new ManyCore<DimacsStringSolver>(dimacsStringSolverArray0);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(manyCore0);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution((IVecInt) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(262);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector((ISolver) null);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[8];
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = mock(ModelIteratorToSATAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(modelIteratorToSATAdapter0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(intArray0).when(modelIteratorToSATAdapter0).model();
      doReturn((IConstr) null).when(modelIteratorToSATAdapter0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(modelIteratorToSATAdapter0).removeConstr(any(org.sat4j.specs.IConstr.class));
      MiniSATLearning<MixedDataStructureSingleWL> miniSATLearning0 = new MiniSATLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts((-2));
      ILogAble iLogAble0 = mock(ILogAble.class, new ViolatedAssumptionAnswer());
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(miniSATLearning0, mixedDataStructureSingleWL0, searchParams0, naturalStaticOrder0, lubyRestarts0, iLogAble0);
      IVecInt iVecInt0 = solver0.createBlockingClauseForCurrentModel();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(modelIteratorToSATAdapter0);
      boolean boolean0 = singleSolutionDetector0.hasASingleSolution(iVecInt0);
      assertTrue(boolean0);
      assertTrue(iVecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GateTranslator gateTranslator0 = mock(GateTranslator.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(gateTranslator0).model();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(gateTranslator0);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution((IVecInt) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int[] intArray0 = new int[8];
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(262, 262).when(iVecInt0).get(anyInt());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      OriginalBinaryClause originalBinaryClause0 = new OriginalBinaryClause(iVecInt0, iLits0);
      GateTranslator gateTranslator0 = mock(GateTranslator.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, originalBinaryClause0).when(gateTranslator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, true).when(gateTranslator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn((Object) intArray0, (Object) intArray0).when(gateTranslator0).model();
      doReturn(false, true).when(gateTranslator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(gateTranslator0);
      boolean boolean0 = singleSolutionDetector0.hasASingleSolution();
      assertTrue(boolean0);
      
      VecInt vecInt0 = new VecInt(1293, 262);
      boolean boolean1 = singleSolutionDetector0.hasASingleSolution((IVecInt) vecInt0);
      assertFalse(boolean1);
      assertEquals(262, vecInt0.last());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      GateTranslator gateTranslator0 = mock(GateTranslator.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(gateTranslator0).model();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(gateTranslator0);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
