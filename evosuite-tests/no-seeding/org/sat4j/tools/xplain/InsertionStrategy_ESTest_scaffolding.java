/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 18 01:29:46 GMT 2019
 */

package org.sat4j.tools.xplain;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class InsertionStrategy_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.sat4j.tools.xplain.InsertionStrategy"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(InsertionStrategy_ESTest_scaffolding.class.getClassLoader() ,
      "org.sat4j.minisat.core.ConflictTimerAdapter",
      "org.sat4j.tools.ManyCore",
      "org.sat4j.specs.UnitPropagationListener",
      "org.sat4j.tools.SolutionCounter",
      "org.sat4j.tools.FullClauseSelectorSolver",
      "org.sat4j.tools.AbstractClauseSelectorSolver$1",
      "org.sat4j.tools.SolverDecorator",
      "org.sat4j.reader.AIGReader",
      "org.sat4j.minisat.core.Counter",
      "org.sat4j.minisat.learning.FixedLengthLearning",
      "org.sat4j.minisat.constraints.cnf.Clauses",
      "org.sat4j.minisat.core.Undoable",
      "org.sat4j.ExitCode",
      "org.sat4j.minisat.constraints.cnf.UnitClause",
      "org.sat4j.specs.Lbool",
      "org.sat4j.minisat.constraints.AbstractDataStructureFactory",
      "org.sat4j.AbstractLauncher$2",
      "org.sat4j.tools.encoding.EncodingStrategyAdapter",
      "org.sat4j.specs.IOptimizationProblem",
      "org.sat4j.AbstractLauncher$1",
      "org.sat4j.minisat.orders.NegativeLiteralSelectionStrategy",
      "org.sat4j.specs.SearchListener",
      "org.sat4j.reader.AAGReader",
      "org.sat4j.minisat.core.SimplificationType",
      "org.sat4j.tools.AbstractClauseSelectorSolver$2",
      "org.sat4j.minisat.core.SearchParams",
      "org.sat4j.tools.Minimal4InclusionModel",
      "org.sat4j.minisat.core.Heap",
      "org.sat4j.specs.ILogAble$1",
      "org.sat4j.specs.Constr",
      "org.sat4j.specs.ISolverService",
      "org.sat4j.minisat.constraints.cnf.WLClause",
      "org.sat4j.specs.IGroupSolver",
      "org.sat4j.opt.MaxSatDecorator",
      "org.sat4j.DecisionMode",
      "org.sat4j.specs.UnitClauseProvider$1",
      "org.sat4j.minisat.constraints.cnf.HTClause",
      "org.sat4j.minisat.core.CircularBuffer",
      "org.sat4j.minisat.learning.LimitedLearning",
      "org.sat4j.minisat.core.ActivityListener",
      "org.sat4j.minisat.restarts.Glucose21Restarts",
      "org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy",
      "org.sat4j.tools.AbstractClauseSelectorSolver$SelectorState",
      "org.sat4j.minisat.constraints.card.AtLeast",
      "org.sat4j.tools.OptToSatAdapter",
      "org.sat4j.specs.ILogAble",
      "org.sat4j.reader.GroupedCNFReader",
      "org.sat4j.minisat.constraints.card.MinWatchCard",
      "org.sat4j.core.LiteralsUtils",
      "org.sat4j.specs.IVecInt",
      "org.sat4j.core.ConstrGroup",
      "org.sat4j.tools.SolutionFoundListener",
      "org.sat4j.minisat.core.Learner",
      "org.sat4j.tools.DimacsStringSolver",
      "org.sat4j.minisat.orders.ActivityBasedVariableComparator",
      "org.sat4j.minisat.core.ActivityComparator",
      "org.sat4j.minisat.constraints.card.MaxWatchCard",
      "org.sat4j.minisat.orders.RSATLastLearnedClausesPhaseSelectionStrategy",
      "org.sat4j.tools.CheckMUSSolutionListener",
      "org.sat4j.minisat.constraints.cnf.Lits",
      "org.sat4j.minisat.core.Solver$2",
      "org.sat4j.specs.UnitClauseProvider",
      "org.sat4j.minisat.core.Solver$1",
      "org.sat4j.AbstractLauncher",
      "org.sat4j.minisat.learning.AbstractLearning",
      "org.sat4j.minisat.core.Solver$4",
      "org.sat4j.minisat.core.Solver$3",
      "org.sat4j.core.VecInt$1",
      "org.sat4j.core.Vec$1",
      "org.sat4j.minisat.core.DataStructureFactory",
      "org.sat4j.minisat.core.Solver$9",
      "org.sat4j.minisat.core.Solver$6",
      "org.sat4j.minisat.core.Solver$8",
      "org.sat4j.minisat.constraints.MixedDataStructureSingleWL",
      "org.sat4j.minisat.core.IPhaseSelectionStrategy",
      "org.sat4j.minisat.orders.PhaseCachingAutoEraseStrategy",
      "org.sat4j.minisat.orders.SubsetVarOrder",
      "org.sat4j.tools.encoding.Binomial",
      "org.sat4j.tools.ModelIteratorToSATAdapter",
      "org.sat4j.tools.GroupClauseSelectorSolver",
      "org.sat4j.tools.ModelIterator",
      "org.sat4j.tools.xplain.Xplain",
      "org.sat4j.reader.ParseFormatException",
      "org.sat4j.tools.SolutionFoundListener$1",
      "org.sat4j.tools.LexicoDecorator",
      "org.sat4j.tools.AbstractClauseSelectorSolver",
      "org.sat4j.minisat.constraints.MixedDataStructureDanielWL",
      "org.sat4j.minisat.core.ActivityLCDS",
      "org.sat4j.tools.AbstractOutputSolver",
      "org.sat4j.minisat.constraints.cnf.OriginalWLClause",
      "org.sat4j.MUSLauncher",
      "org.sat4j.minisat.learning.ActiveLearning",
      "org.sat4j.minisat.orders.VarOrderHeap",
      "org.sat4j.minisat.constraints.cnf.OriginalHTClause",
      "org.sat4j.reader.EfficientScanner",
      "org.sat4j.LightFactory",
      "org.sat4j.tools.NegationDecorator",
      "org.sat4j.reader.InstanceReader",
      "org.sat4j.minisat.core.ConflictTimer",
      "org.sat4j.minisat.core.VarActivityListener",
      "org.sat4j.minisat.orders.LevelBasedVarOrderHeap",
      "org.sat4j.specs.RandomAccessModel",
      "org.sat4j.minisat.core.LBDConflictTimer",
      "org.sat4j.tools.DimacsOutputSolver",
      "org.sat4j.tools.encoding.Binary",
      "org.sat4j.minisat.constraints.cnf.BinaryClause",
      "org.sat4j.minisat.orders.TabuListDecorator",
      "org.sat4j.minisat.orders.UserFixedPhaseSelectionStrategy",
      "org.sat4j.minisat.core.AgeLCDS",
      "org.sat4j.specs.FakeConstr",
      "org.sat4j.opt.MinOneDecorator",
      "org.sat4j.core.ReadOnlyVecInt",
      "org.sat4j.minisat.core.LearnedConstraintsDeletionStrategy",
      "org.sat4j.minisat.restarts.NoRestarts",
      "org.sat4j.minisat.constraints.CardinalityDataStructure",
      "org.sat4j.tools.encoding.Policy$1",
      "org.sat4j.minisat.core.MemoryBasedConflictTimer",
      "org.sat4j.minisat.core.SizeComparator",
      "org.sat4j.reader.LecteurDimacs",
      "org.sat4j.tools.encoding.Product",
      "org.sat4j.specs.Propagatable",
      "org.sat4j.ILauncherMode",
      "org.sat4j.minisat.core.Pair",
      "org.sat4j.core.EmptyVecInt",
      "org.sat4j.minisat.constraints.AbstractCardinalityDataStructure",
      "org.sat4j.specs.IVec",
      "org.sat4j.minisat.orders.AbstractPhaserecordingSelectionStrategy",
      "org.sat4j.minisat.restarts.FixedPeriodRestarts",
      "org.sat4j.minisat.constraints.cnf.CBClause",
      "org.sat4j.tools.ClausalCardinalitiesDecorator",
      "org.sat4j.tools.Minimal4CardinalityModel",
      "org.sat4j.minisat.learning.MiniSATLearning",
      "org.sat4j.tools.AbstractMinimalModel",
      "org.sat4j.minisat.constraints.cnf.BinaryClauses",
      "org.sat4j.tools.encoding.Sequential",
      "org.sat4j.specs.TimeoutException",
      "org.sat4j.minisat.learning.NoLearningButHeuristics",
      "org.sat4j.minisat.orders.RSATPhaseSelectionStrategy",
      "org.sat4j.minisat.core.LearningStrategy",
      "org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy",
      "org.sat4j.specs.IteratorInt",
      "org.sat4j.specs.ISolver",
      "org.sat4j.minisat.orders.RandomWalkDecorator",
      "org.sat4j.minisat.core.VoidTracing",
      "org.sat4j.minisat.restarts.LubyRestarts",
      "org.sat4j.minisat.core.GlucoseLCDS",
      "org.sat4j.minisat.constraints.CardinalityDataStructureYanMin",
      "org.sat4j.tools.SubModelIterator",
      "org.sat4j.minisat.core.ILits",
      "org.sat4j.BasicLauncher",
      "org.sat4j.specs.ContradictionException",
      "org.sat4j.opt.AbstractSelectorVariablesDecorator",
      "org.sat4j.minisat.learning.PercentLengthLearning",
      "org.sat4j.tools.GateTranslator",
      "org.sat4j.specs.IConstr",
      "org.sat4j.tools.xplain.MinimizationStrategy",
      "org.sat4j.minisat.constraints.ClausalDataStructureWL",
      "org.sat4j.tools.xplain.InsertionStrategy",
      "org.sat4j.minisat.restarts.EMARestarts",
      "org.sat4j.tools.encoding.EncodingStrategy",
      "org.sat4j.minisat.core.PrimeImplicantStrategy",
      "org.sat4j.tools.encoding.Policy",
      "org.sat4j.OptimizationMode",
      "org.sat4j.specs.MandatoryLiteralListener",
      "org.sat4j.specs.IProblem",
      "org.sat4j.minisat.restarts.MiniSATRestarts",
      "org.sat4j.core.VecInt",
      "org.sat4j.minisat.core.Solver",
      "org.sat4j.tools.xplain.HighLevelXplain",
      "org.sat4j.minisat.core.LearnedConstraintsEvaluationType",
      "org.sat4j.minisat.learning.ClauseOnlyLearning",
      "org.sat4j.core.ASolverFactory",
      "org.sat4j.reader.DimacsReader",
      "org.sat4j.core.Vec",
      "org.sat4j.minisat.core.Glucose2LCDS",
      "org.sat4j.minisat.core.SolverStats",
      "org.sat4j.minisat.core.ConstrActivityListener",
      "org.sat4j.minisat.orders.RandomLiteralSelectionStrategy",
      "org.sat4j.minisat.restarts.ArminRestarts",
      "org.sat4j.specs.SearchListenerAdapter",
      "org.sat4j.minisat.constraints.cnf.UnitClauses",
      "org.sat4j.tools.StatisticsSolver",
      "org.sat4j.minisat.constraints.cnf.LearntWLClause",
      "org.sat4j.tools.OutcomeListener",
      "org.sat4j.minisat.constraints.cnf.LearntHTClause",
      "org.sat4j.tools.SingleSolutionDetector",
      "org.sat4j.minisat.constraints.xor.Xor",
      "org.sat4j.minisat.orders.NaturalStaticOrder",
      "org.sat4j.minisat.core.ISimplifier",
      "org.sat4j.tools.IVisualizationTool",
      "org.sat4j.specs.Constr$1",
      "org.sat4j.specs.VarMapper",
      "org.sat4j.minisat.SolverFactory",
      "org.sat4j.tools.encoding.Ladder",
      "org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary",
      "org.sat4j.minisat.learning.NoLearningNoHeuristics",
      "org.sat4j.minisat.orders.PureOrder",
      "org.sat4j.minisat.core.SizeLCDS",
      "org.sat4j.minisat.core.RestartStrategy",
      "org.sat4j.tools.xplain.Explainer",
      "org.sat4j.reader.Reader",
      "org.sat4j.minisat.core.IOrder",
      "org.sat4j.minisat.orders.VariableComparator",
      "org.sat4j.minisat.constraints.cnf.OriginalBinaryClause",
      "org.sat4j.minisat.core.ICDCL",
      "org.sat4j.core.EmptyVecInt$1",
      "org.sat4j.tools.encoding.Commander"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.sat4j.core.ASolverFactory", false, InsertionStrategy_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.sat4j.tools.OptToSatAdapter", false, InsertionStrategy_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(InsertionStrategy_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.sat4j.tools.xplain.InsertionStrategy",
      "org.sat4j.tools.SolverDecorator",
      "org.sat4j.tools.SingleSolutionDetector",
      "org.sat4j.tools.IVisualizationTool",
      "org.sat4j.core.EmptyVecInt",
      "org.sat4j.core.VecInt",
      "org.sat4j.tools.AbstractOutputSolver",
      "org.sat4j.tools.DimacsOutputSolver",
      "org.sat4j.tools.SolutionCounter",
      "org.sat4j.opt.AbstractSelectorVariablesDecorator",
      "org.sat4j.opt.MaxSatDecorator",
      "org.sat4j.tools.StatisticsSolver",
      "org.sat4j.minisat.learning.LimitedLearning",
      "org.sat4j.minisat.learning.PercentLengthLearning",
      "org.sat4j.minisat.learning.AbstractLearning",
      "org.sat4j.minisat.learning.NoLearningButHeuristics",
      "org.sat4j.minisat.learning.MiniSATLearning",
      "org.sat4j.minisat.orders.VarOrderHeap",
      "org.sat4j.minisat.orders.SubsetVarOrder",
      "org.sat4j.minisat.orders.AbstractPhaserecordingSelectionStrategy",
      "org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy",
      "org.sat4j.minisat.core.SearchParams",
      "org.sat4j.minisat.orders.PureOrder",
      "org.sat4j.minisat.restarts.LubyRestarts",
      "org.sat4j.AbstractLauncher",
      "org.sat4j.MUSLauncher",
      "org.sat4j.AbstractLauncher$1",
      "org.sat4j.DecisionMode",
      "org.sat4j.ExitCode",
      "org.sat4j.OptimizationMode",
      "org.sat4j.ILauncherMode",
      "org.sat4j.minisat.core.Solver$1",
      "org.sat4j.minisat.core.Solver",
      "org.sat4j.core.Vec",
      "org.sat4j.minisat.core.ActivityComparator",
      "org.sat4j.minisat.core.SolverStats",
      "org.sat4j.specs.SearchListenerAdapter",
      "org.sat4j.minisat.core.VoidTracing",
      "org.sat4j.specs.UnitClauseProvider$1",
      "org.sat4j.specs.UnitClauseProvider",
      "org.sat4j.minisat.core.Solver$2",
      "org.sat4j.minisat.core.Solver$3",
      "org.sat4j.minisat.core.Solver$4",
      "org.sat4j.minisat.core.Pair",
      "org.sat4j.minisat.core.ConflictTimerAdapter",
      "org.sat4j.minisat.core.MemoryBasedConflictTimer",
      "org.sat4j.minisat.core.ActivityLCDS",
      "org.sat4j.minisat.core.LBDConflictTimer",
      "org.sat4j.minisat.core.GlucoseLCDS",
      "org.sat4j.minisat.core.Glucose2LCDS",
      "org.sat4j.minisat.core.AgeLCDS",
      "org.sat4j.minisat.core.SizeComparator",
      "org.sat4j.minisat.core.SizeLCDS",
      "org.sat4j.minisat.core.Solver$8",
      "org.sat4j.core.ASolverFactory",
      "org.sat4j.tools.ManyCore",
      "org.sat4j.opt.MinOneDecorator",
      "org.sat4j.tools.OptToSatAdapter",
      "org.sat4j.tools.SolutionFoundListener$1",
      "org.sat4j.tools.SolutionFoundListener",
      "org.sat4j.tools.AbstractMinimalModel",
      "org.sat4j.tools.CheckMUSSolutionListener",
      "org.sat4j.minisat.constraints.AbstractDataStructureFactory",
      "org.sat4j.minisat.constraints.ClausalDataStructureWL",
      "org.sat4j.minisat.constraints.cnf.Lits",
      "org.sat4j.minisat.orders.LevelBasedVarOrderHeap",
      "org.sat4j.specs.ILogAble$1",
      "org.sat4j.specs.ILogAble",
      "org.sat4j.tools.ModelIterator",
      "org.sat4j.tools.Minimal4InclusionModel",
      "org.sat4j.core.VecInt$1",
      "org.sat4j.tools.LexicoDecorator",
      "org.sat4j.minisat.learning.FixedLengthLearning",
      "org.sat4j.tools.Minimal4CardinalityModel",
      "org.sat4j.minisat.learning.NoLearningNoHeuristics",
      "org.sat4j.minisat.learning.ClauseOnlyLearning",
      "org.sat4j.tools.AbstractClauseSelectorSolver",
      "org.sat4j.tools.FullClauseSelectorSolver",
      "org.sat4j.tools.AbstractClauseSelectorSolver$1",
      "org.sat4j.tools.AbstractClauseSelectorSolver$2",
      "org.sat4j.minisat.restarts.Glucose21Restarts",
      "org.sat4j.minisat.core.CircularBuffer",
      "org.sat4j.minisat.core.Counter",
      "org.sat4j.LightFactory",
      "org.sat4j.minisat.constraints.MixedDataStructureDanielWL",
      "org.sat4j.minisat.orders.RSATPhaseSelectionStrategy",
      "org.sat4j.minisat.restarts.ArminRestarts",
      "org.sat4j.tools.GroupClauseSelectorSolver",
      "org.sat4j.tools.DimacsStringSolver",
      "org.sat4j.tools.SubModelIterator",
      "org.sat4j.specs.TimeoutException",
      "org.sat4j.minisat.orders.PhaseCachingAutoEraseStrategy",
      "org.sat4j.minisat.learning.ActiveLearning",
      "org.sat4j.core.LiteralsUtils",
      "org.sat4j.tools.ModelIteratorToSATAdapter",
      "org.sat4j.tools.ClausalCardinalitiesDecorator",
      "org.sat4j.tools.encoding.EncodingStrategyAdapter",
      "org.sat4j.tools.encoding.Sequential",
      "org.sat4j.tools.encoding.Binary",
      "org.sat4j.tools.encoding.Product",
      "org.sat4j.tools.encoding.Commander",
      "org.sat4j.tools.encoding.Binomial",
      "org.sat4j.tools.encoding.Ladder",
      "org.sat4j.tools.encoding.Policy",
      "org.sat4j.tools.NegationDecorator",
      "org.sat4j.minisat.orders.TabuListDecorator",
      "org.sat4j.minisat.restarts.MiniSATRestarts",
      "org.sat4j.BasicLauncher",
      "org.sat4j.reader.Reader",
      "org.sat4j.reader.InstanceReader",
      "org.sat4j.reader.LecteurDimacs",
      "org.sat4j.minisat.orders.NegativeLiteralSelectionStrategy",
      "org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary",
      "org.sat4j.minisat.constraints.cnf.Clauses",
      "org.sat4j.minisat.constraints.cnf.UnitClause",
      "org.sat4j.tools.GateTranslator",
      "org.sat4j.core.ReadOnlyVecInt",
      "org.sat4j.core.EmptyVecInt$1",
      "org.sat4j.minisat.restarts.FixedPeriodRestarts",
      "org.sat4j.core.Vec$1",
      "org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy",
      "org.sat4j.minisat.orders.NaturalStaticOrder",
      "org.sat4j.minisat.restarts.NoRestarts",
      "org.sat4j.minisat.orders.RSATLastLearnedClausesPhaseSelectionStrategy",
      "org.sat4j.minisat.restarts.EMARestarts",
      "org.sat4j.minisat.orders.RandomWalkDecorator",
      "org.sat4j.core.ConstrGroup",
      "org.sat4j.minisat.constraints.cnf.CBClause",
      "org.sat4j.minisat.constraints.AbstractCardinalityDataStructure",
      "org.sat4j.minisat.constraints.CardinalityDataStructure",
      "org.sat4j.minisat.constraints.card.AtLeast",
      "org.sat4j.specs.ContradictionException",
      "org.sat4j.minisat.orders.RandomLiteralSelectionStrategy",
      "org.sat4j.minisat.constraints.cnf.WLClause",
      "org.sat4j.minisat.constraints.cnf.LearntWLClause",
      "org.sat4j.minisat.orders.UserFixedPhaseSelectionStrategy",
      "org.sat4j.minisat.constraints.cnf.HTClause",
      "org.sat4j.minisat.constraints.cnf.OriginalHTClause",
      "org.sat4j.minisat.constraints.xor.Xor",
      "org.sat4j.tools.encoding.Policy$1",
      "org.sat4j.minisat.constraints.cnf.UnitClauses",
      "org.sat4j.specs.Constr$1",
      "org.sat4j.specs.Constr",
      "org.sat4j.specs.Lbool",
      "org.sat4j.minisat.core.Heap",
      "org.sat4j.minisat.orders.ActivityBasedVariableComparator",
      "org.sat4j.minisat.core.Solver$9",
      "org.sat4j.minisat.constraints.MixedDataStructureSingleWL",
      "org.sat4j.minisat.constraints.CardinalityDataStructureYanMin",
      "org.sat4j.minisat.constraints.card.MinWatchCard",
      "org.sat4j.minisat.constraints.cnf.LearntHTClause",
      "org.sat4j.minisat.constraints.cnf.OriginalWLClause",
      "org.sat4j.minisat.constraints.card.MaxWatchCard",
      "org.sat4j.minisat.constraints.cnf.BinaryClause",
      "org.sat4j.minisat.constraints.cnf.OriginalBinaryClause",
      "org.sat4j.minisat.constraints.cnf.BinaryClauses",
      "org.sat4j.specs.FakeConstr"
    );
  }
}
