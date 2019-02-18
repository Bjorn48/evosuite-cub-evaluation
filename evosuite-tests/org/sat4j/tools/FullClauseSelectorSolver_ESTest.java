/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:53:06 GMT 2019
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
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.IteratorInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FullClauseSelectorSolver_ESTest extends FullClauseSelectorSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FullClauseSelectorSolver<AbstractMinimalModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<AbstractMinimalModel>((AbstractMinimalModel) null, false);
      boolean boolean0 = fullClauseSelectorSolver0.isSkipDuplicatedEntries();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(iSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      ModelIterator modelIterator0 = new ModelIterator(iSolver0);
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIterator>(modelIterator0, false);
      VecInt vecInt0 = new VecInt();
      IConstr iConstr0 = fullClauseSelectorSolver0.addNonControlableClause(vecInt0);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null, true);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(maxSatDecorator0, (SolutionFoundListener) null);
      FullClauseSelectorSolver<OptToSatAdapter> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<OptToSatAdapter>(optToSatAdapter0, true);
      VecInt vecInt0 = new VecInt(472, 472);
      vecInt0.clear();
      IConstr iConstr0 = fullClauseSelectorSolver0.addClause(vecInt0);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      FullClauseSelectorSolver<DimacsStringSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsStringSolver>(dimacsStringSolver0, false);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.model();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FullClauseSelectorSolver<ManyCore<GateTranslator>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ManyCore<GateTranslator>>((ManyCore<GateTranslator>) null, false);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.model();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ASolverFactory<GateTranslator> aSolverFactory0 = (ASolverFactory<GateTranslator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<GateTranslator> manyCore0 = new ManyCore<GateTranslator>(aSolverFactory0, stringArray0);
      FullClauseSelectorSolver<ManyCore<GateTranslator>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ManyCore<GateTranslator>>(manyCore0, false);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.model();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(dimacsOutputSolver0, checkMUSSolutionListener0);
      FullClauseSelectorSolver<ModelIteratorToSATAdapter> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0, true);
      VecInt vecInt0 = new VecInt(472, 472);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.addControlableClause(vecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FullClauseSelectorSolver<LexicoDecorator<AbstractMinimalModel>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<LexicoDecorator<AbstractMinimalModel>>((LexicoDecorator<AbstractMinimalModel>) null, true);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.addClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.FullClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(iSolver0).modelWithInternalVariables();
      ModelIterator modelIterator0 = new ModelIterator(iSolver0);
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(modelIterator0, 0L, checkMUSSolutionListener0);
      FullClauseSelectorSolver<ModelIteratorToSATAdapter> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0, false);
      fullClauseSelectorSolver0.model();
      assertFalse(fullClauseSelectorSolver0.isSkipDuplicatedEntries());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[9];
      ManyCore<GateTranslator> manyCore0 = (ManyCore<GateTranslator>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(intArray0).when(manyCore0).modelWithInternalVariables();
      FullClauseSelectorSolver<ManyCore<GateTranslator>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ManyCore<GateTranslator>>(manyCore0, false);
      int[] intArray1 = fullClauseSelectorSolver0.model();
      assertNotSame(intArray1, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray1);
      assertFalse(fullClauseSelectorSolver0.isSkipDuplicatedEntries());
      assertNotNull(intArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constr constr0 = Constr.TAUTOLOGY;
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, constr0).when(iSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn((-1524)).when(iSolver0).nextFreeVarId(anyBoolean());
      ModelIterator modelIterator0 = new ModelIterator(iSolver0);
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      modelIterator0.addClause(iVecInt0);
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIterator>(modelIterator0, false);
      GateTranslator gateTranslator0 = new GateTranslator(fullClauseSelectorSolver0);
      VecInt vecInt0 = new VecInt();
      gateTranslator0.addClause(vecInt0);
      assertFalse(vecInt0.isEmpty());
      assertEquals((-1524), vecInt0.last());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn((IteratorInt) null).when(iVecInt0).iterator();
      FullClauseSelectorSolver<ModelIteratorToSATAdapter> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIteratorToSATAdapter>((ModelIteratorToSATAdapter) null, true);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.addControlableClause(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, false);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(fullClauseSelectorSolver0, checkMUSSolutionListener0);
      FullClauseSelectorSolver<ModelIteratorToSATAdapter> fullClauseSelectorSolver1 = new FullClauseSelectorSolver<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0, true);
      fullClauseSelectorSolver1.addControlableClause(iVecInt0);
      assertTrue(iVecInt0.isEmpty());
      assertEquals(0, dimacsOutputSolver0.nVars());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(3393);
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      SolutionFoundListener solutionFoundListener0 = mock(SolutionFoundListener.class, new ViolatedAssumptionAnswer());
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(lexicoDecorator0, solutionFoundListener0);
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(abstractMinimalModel0);
      FullClauseSelectorSolver<Minimal4InclusionModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Minimal4InclusionModel>(minimal4InclusionModel0, false);
      fullClauseSelectorSolver0.getConstraints();
      assertFalse(fullClauseSelectorSolver0.isSkipDuplicatedEntries());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VecInt vecInt0 = new VecInt(472, 472);
      FullClauseSelectorSolver<AbstractMinimalModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<AbstractMinimalModel>((AbstractMinimalModel) null, true);
      // Undeclared exception!
      try { 
        fullClauseSelectorSolver0.addNonControlableClause(vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      FullClauseSelectorSolver<DimacsStringSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsStringSolver>(dimacsStringSolver0, true);
      fullClauseSelectorSolver0.getAddedVars();
      assertTrue(fullClauseSelectorSolver0.isSkipDuplicatedEntries());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FullClauseSelectorSolver<AbstractMinimalModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<AbstractMinimalModel>((AbstractMinimalModel) null, true);
      boolean boolean0 = fullClauseSelectorSolver0.isSkipDuplicatedEntries();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      FullClauseSelectorSolver<StatisticsSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<StatisticsSolver>(statisticsSolver0, false);
      fullClauseSelectorSolver0.getConstrs();
      assertFalse(fullClauseSelectorSolver0.isSkipDuplicatedEntries());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FullClauseSelectorSolver<Minimal4CardinalityModel> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Minimal4CardinalityModel>((Minimal4CardinalityModel) null, false);
      fullClauseSelectorSolver0.getLastConstr();
      assertFalse(fullClauseSelectorSolver0.isSkipDuplicatedEntries());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, false);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(fullClauseSelectorSolver0, checkMUSSolutionListener0);
      FullClauseSelectorSolver<ModelIteratorToSATAdapter> fullClauseSelectorSolver1 = new FullClauseSelectorSolver<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0, false);
      fullClauseSelectorSolver1.addControlableClause(iVecInt0);
      assertFalse(iVecInt0.isEmpty());
      assertEquals(2, iVecInt0.last());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(148);
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      ModelIterator modelIterator0 = new ModelIterator(iSolver0);
      FullClauseSelectorSolver<ModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<ModelIterator>(modelIterator0, true);
      fullClauseSelectorSolver0.setLastConstr(unitClause0);
      assertTrue(fullClauseSelectorSolver0.isSkipDuplicatedEntries());
  }
}