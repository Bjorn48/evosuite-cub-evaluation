/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 05:45:16 GMT 2019
 */

package com.soops.CEN4010.JMCA.JParser.parseTest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.parseTest.JMCAParserTestFrame;
import java.awt.HeadlessException;
import javax.swing.tree.DefaultMutableTreeNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JMCAParserTestFrame_ESTest extends JMCAParserTestFrame_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JMCAParserTestFrame jMCAParserTestFrame0 = null;
      try {
        jMCAParserTestFrame0 = new JMCAParserTestFrame((DefaultMutableTreeNode) null, "Ow^Ht`2?ypynB~o");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
