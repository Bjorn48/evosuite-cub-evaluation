/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 16:40:55 GMT 2019
 */

package org.sat4j.tools.xplain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.constraints.cnf.OriginalWLClause;
import org.sat4j.minisat.core.ILits;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.IVisualizationTool;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.xplain.InsertionStrategy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InsertionStrategy_ESTest extends InsertionStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      VecInt vecInt0 = new VecInt(24, 24);
      Lits lits0 = new Lits();
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, false, false).when(dimacsOutputSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false).when(dimacsOutputSolver0).isVerbose();
      doReturn(vecInt0, (IVecInt) null).when(dimacsOutputSolver0).unsatExplanation();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      IVecInt iVecInt0 = insertionStrategy0.explain(dimacsOutputSolver0, hashMap0, vecInt0);
      vecInt0.pop();
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(dimacsOutputSolver0, hashMap0, iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.xplain.InsertionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      VecInt vecInt0 = new VecInt(46, 46);
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dimacsOutputSolver0).getLogPrefix();
      doReturn(true).when(dimacsOutputSolver0).isVerbose();
      doReturn(vecInt0).when(dimacsOutputSolver0).unsatExplanation();
      GroupClauseSelectorSolver<DimacsOutputSolver> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0);
      Map<Integer, Integer> map0 = groupClauseSelectorSolver0.getVarToHighLevel();
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(groupClauseSelectorSolver0, map0, vecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      VecInt vecInt0 = new VecInt(46, 46);
      Lits lits0 = new Lits();
      OriginalWLClause originalWLClause0 = new OriginalWLClause(vecInt0, lits0);
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(iLits0).isFalsified(anyInt());
      OriginalBinaryClause originalBinaryClause0 = new OriginalBinaryClause(vecInt0, iLits0);
      originalBinaryClause0.calcReason((-97), vecInt0);
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(vecInt0).when(dimacsOutputSolver0).unsatExplanation();
      VecInt vecInt1 = new VecInt();
      HashMap<Integer, DimacsOutputSolver> hashMap0 = new HashMap<Integer, DimacsOutputSolver>();
      IVecInt iVecInt0 = insertionStrategy0.explain(dimacsOutputSolver0, hashMap0, vecInt1);
      assertEquals(1, vecInt0.size());
      assertFalse(iVecInt0.equals((Object)vecInt1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 24;
      VecInt vecInt0 = new VecInt(24, 24);
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(dimacsOutputSolver0).isVerbose();
      doReturn(vecInt0).when(dimacsOutputSolver0).unsatExplanation();
      doReturn(2379, 2379, 0).when(dimacsOutputSolver0).nVars();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(dimacsOutputSolver0);
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(dimacsOutputSolver0, hashMap0, iVecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VecInt vecInt0 = new VecInt(24, 24);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(dimacsOutputSolver0, hashMap0, vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn((-563)).when(iVecInt0).size();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(dimacsOutputSolver0, hashMap0, iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      ASolverFactory<DimacsOutputSolver> aSolverFactory0 = (ASolverFactory<DimacsOutputSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<DimacsOutputSolver> manyCore0 = new ManyCore<DimacsOutputSolver>(aSolverFactory0, false, stringArray0);
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(manyCore0, hashMap0, vecInt0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VecInt vecInt0 = new VecInt(24, 24);
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn("COMMANDER").when(dimacsOutputSolver0).getLogPrefix();
      doReturn(true, false, true).when(dimacsOutputSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(true).when(dimacsOutputSolver0).isVerbose();
      doReturn(vecInt0).when(dimacsOutputSolver0).unsatExplanation();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(dimacsOutputSolver0, hashMap0, vecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "f");
      DimacsOutputSolver[] dimacsOutputSolverArray0 = new DimacsOutputSolver[6];
      VecInt vecInt0 = new VecInt(46, 46);
      Lits lits0 = new Lits();
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, false, false).when(dimacsOutputSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false).when(dimacsOutputSolver0).isVerbose();
      doReturn(vecInt0, (IVecInt) null).when(dimacsOutputSolver0).unsatExplanation();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = Integer.valueOf(46);
      insertionStrategy0.explain(dimacsOutputSolver0, hashMap0, vecInt0);
      hashMap0.put(integer0, insertionStrategy0);
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(dimacsOutputSolver0, hashMap0, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.xplain.InsertionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      VecInt vecInt0 = new VecInt(46, 46);
      VecInt vecInt1 = new VecInt(46, (-1136));
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(dimacsOutputSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false).when(dimacsOutputSolver0).isVerbose();
      doReturn(vecInt0, vecInt1).when(dimacsOutputSolver0).unsatExplanation();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      insertionStrategy0.explain(dimacsOutputSolver0, hashMap0, vecInt0);
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(dimacsOutputSolver0, hashMap0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VecInt vecInt0 = new VecInt(24, 24);
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn("+|").when(dimacsOutputSolver0).getLogPrefix();
      doReturn(true, true, false, false, true).when(dimacsOutputSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(true, false).when(dimacsOutputSolver0).isVerbose();
      doReturn(vecInt0).when(dimacsOutputSolver0).unsatExplanation();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = IVisualizationTool.NOTGOOD;
      hashMap0.put(integer0, "+|");
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      // Undeclared exception!
      try { 
        insertionStrategy0.explain(dimacsOutputSolver0, hashMap0, vecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VecInt vecInt0 = new VecInt(24, 24);
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn("sD~;g").when(dimacsOutputSolver0).getLogPrefix();
      doReturn(true, true, true, true, false).when(dimacsOutputSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(true, false).when(dimacsOutputSolver0).isVerbose();
      doReturn(vecInt0).when(dimacsOutputSolver0).unsatExplanation();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      insertionStrategy0.explain(dimacsOutputSolver0, hashMap0, vecInt0);
      assertEquals(0, vecInt0.size());
      assertTrue(vecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      String string0 = insertionStrategy0.toString();
      assertEquals("Replay (Insertion-based) minimization strategy", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InsertionStrategy insertionStrategy0 = new InsertionStrategy();
      insertionStrategy0.cancelExplanationComputation();
      assertEquals("Replay (Insertion-based) minimization strategy", insertionStrategy0.toString());
  }
}
