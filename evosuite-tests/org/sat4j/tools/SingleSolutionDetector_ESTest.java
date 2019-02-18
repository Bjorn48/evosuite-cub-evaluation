/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:57:48 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.core.ILits;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.UnitPropagationListener;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionFoundListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingleSolutionDetector_ESTest extends SingleSolutionDetector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(iSolver0);
      singleSolutionDetector0.isSatisfiable();
      boolean boolean0 = singleSolutionDetector0.hasASingleSolution();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[3];
      UnitPropagationListener unitPropagationListener0 = mock(UnitPropagationListener.class, new ViolatedAssumptionAnswer());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      VecInt vecInt0 = new VecInt();
      OriginalBinaryClause originalBinaryClause0 = OriginalBinaryClause.brandNewClause(unitPropagationListener0, iLits0, vecInt0);
      LexicoDecorator<SingleSolutionDetector> lexicoDecorator0 = (LexicoDecorator<SingleSolutionDetector>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((Object) intArray0, (Object) intArray0, (Object) intArray0, (Object) intArray0, (Object) intArray0).when(lexicoDecorator0).modelWithInternalVariables();
      doReturn(originalBinaryClause0, originalBinaryClause0, (IConstr) null, (IConstr) null, originalBinaryClause0).when(lexicoDecorator0).addAtMost(any(org.sat4j.specs.IVecInt.class) , anyInt());
      doReturn((IConstr) null).when(lexicoDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false, true, true, true).when(lexicoDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(1, 0).when(lexicoDecorator0).nVars();
      doReturn(false, false).when(lexicoDecorator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      GroupClauseSelectorSolver<LexicoDecorator<SingleSolutionDetector>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<LexicoDecorator<SingleSolutionDetector>>(lexicoDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(groupClauseSelectorSolver0, (SolutionFoundListener) null);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(minimal4CardinalityModel0);
      singleSolutionDetector0.hasASingleSolution((IVecInt) vecInt0);
      // Undeclared exception!
      singleSolutionDetector0.hasASingleSolution((IVecInt) vecInt0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PrintWriter printWriter0 = new PrintWriter(stringWriter0);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver(printWriter0);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsOutputSolver0);
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
  public void test03()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector((ISolver) null);
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution((IVecInt) vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0, true);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(maxSatDecorator0);
      optToSatAdapter0.isSatisfiable();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(maxSatDecorator0);
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution((IVecInt) vecInt0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.sat4j.core.ConstrGroup cannot be cast to org.sat4j.specs.Constr
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[3];
      LexicoDecorator<SingleSolutionDetector> lexicoDecorator0 = (LexicoDecorator<SingleSolutionDetector>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(intArray0).when(lexicoDecorator0).modelWithInternalVariables();
      doReturn((IConstr) null).when(lexicoDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      GroupClauseSelectorSolver<LexicoDecorator<SingleSolutionDetector>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<LexicoDecorator<SingleSolutionDetector>>(lexicoDecorator0);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(groupClauseSelectorSolver0);
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink(1);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution((IVecInt) vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[3];
      UnitPropagationListener unitPropagationListener0 = mock(UnitPropagationListener.class, new ViolatedAssumptionAnswer());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(5, 0).when(iVecInt0).get(anyInt());
      OriginalBinaryClause originalBinaryClause0 = OriginalBinaryClause.brandNewClause(unitPropagationListener0, iLits0, iVecInt0);
      LexicoDecorator<SingleSolutionDetector> lexicoDecorator0 = (LexicoDecorator<SingleSolutionDetector>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((Object) intArray0, (Object) intArray0, (Object) intArray0, (Object) intArray0, (Object) intArray0).when(lexicoDecorator0).modelWithInternalVariables();
      doReturn(originalBinaryClause0, originalBinaryClause0, (IConstr) null, (IConstr) null, originalBinaryClause0).when(lexicoDecorator0).addAtMost(any(org.sat4j.specs.IVecInt.class) , anyInt());
      doReturn((IConstr) null).when(lexicoDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false, true, true, true).when(lexicoDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(1, 0).when(lexicoDecorator0).nVars();
      doReturn(false, false).when(lexicoDecorator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      GroupClauseSelectorSolver<LexicoDecorator<SingleSolutionDetector>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<LexicoDecorator<SingleSolutionDetector>>(lexicoDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(groupClauseSelectorSolver0, (SolutionFoundListener) null);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(minimal4CardinalityModel0);
      VecInt vecInt0 = new VecInt();
      singleSolutionDetector0.hasASingleSolution((IVecInt) vecInt0);
      // Undeclared exception!
      singleSolutionDetector0.hasASingleSolution();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsOutputSolver0);
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      Minimal4InclusionModel[] minimal4InclusionModelArray0 = new Minimal4InclusionModel[0];
      ManyCore<Minimal4InclusionModel> manyCore0 = new ManyCore<Minimal4InclusionModel>(minimal4InclusionModelArray0);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(manyCore0);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0, true);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(maxSatDecorator0);
      optToSatAdapter0.isSatisfiable();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(maxSatDecorator0);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.sat4j.core.ConstrGroup cannot be cast to org.sat4j.specs.Constr
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[5];
      LexicoDecorator<SingleSolutionDetector> lexicoDecorator0 = (LexicoDecorator<SingleSolutionDetector>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((Object) intArray0, (Object) null).when(lexicoDecorator0).model();
      doReturn((IConstr) null).when(lexicoDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(lexicoDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(lexicoDecorator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(lexicoDecorator0);
      singleSolutionDetector0.hasASingleSolution();
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

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[3];
      LexicoDecorator<SingleSolutionDetector> lexicoDecorator0 = (LexicoDecorator<SingleSolutionDetector>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(intArray0).when(lexicoDecorator0).modelWithInternalVariables();
      doReturn((IConstr) null).when(lexicoDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, true).when(lexicoDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(true).when(lexicoDecorator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      GroupClauseSelectorSolver<LexicoDecorator<SingleSolutionDetector>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<LexicoDecorator<SingleSolutionDetector>>(lexicoDecorator0);
      groupClauseSelectorSolver0.isSatisfiable();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(groupClauseSelectorSolver0);
      VecInt vecInt0 = new VecInt();
      boolean boolean0 = singleSolutionDetector0.hasASingleSolution((IVecInt) vecInt0);
      assertEquals(0, vecInt0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[3];
      LexicoDecorator<SingleSolutionDetector> lexicoDecorator0 = (LexicoDecorator<SingleSolutionDetector>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(intArray0).when(lexicoDecorator0).modelWithInternalVariables();
      doReturn((IConstr) null).when(lexicoDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, true).when(lexicoDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(true).when(lexicoDecorator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      GroupClauseSelectorSolver<LexicoDecorator<SingleSolutionDetector>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<LexicoDecorator<SingleSolutionDetector>>(lexicoDecorator0);
      groupClauseSelectorSolver0.isSatisfiable();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(groupClauseSelectorSolver0);
      boolean boolean0 = singleSolutionDetector0.hasASingleSolution();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[5];
      LexicoDecorator<SingleSolutionDetector> lexicoDecorator0 = (LexicoDecorator<SingleSolutionDetector>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      doReturn((Object) intArray0, (Object) null).when(lexicoDecorator0).model();
      doReturn((IConstr) null).when(lexicoDecorator0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(lexicoDecorator0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(lexicoDecorator0).removeConstr(any(org.sat4j.specs.IConstr.class));
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(lexicoDecorator0);
      singleSolutionDetector0.hasASingleSolution();
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
}