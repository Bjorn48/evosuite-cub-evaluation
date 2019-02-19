/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Feb 19 15:56:57 GMT 2019
 */

package org.ow2.proactive.scripting;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class TaskScript_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.ow2.proactive.scripting.TaskScript"; 
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
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TaskScript_ESTest_scaffolding.class.getClassLoader() ,
      "org.ow2.proactive.scripting.SelectionScript",
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.http.cookie.MalformedCookieException",
      "org.ow2.proactive.scripting.TaskScript",
      "org.apache.http.conn.ConnectionRequest",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.DateTimeDateFormat",
      "org.ow2.proactive.scripting.Script",
      "org.apache.http.config.SocketConfig$Builder",
      "org.apache.log4j.pattern.DatePatternConverter$DefaultZoneDateFormat",
      "org.apache.commons.io.filefilter.TrueFileFilter",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.ConsoleAppender$SystemOutStream",
      "org.apache.commons.io.filefilter.AgeFileFilter",
      "org.ow2.proactive.scripting.helper.forkenvironment.ForkEnvironmentScriptResultExtractor",
      "org.apache.log4j.helpers.ISO8601DateFormat",
      "org.apache.http.conn.HttpClientConnectionManager",
      "org.apache.log4j.spi.Filter",
      "org.apache.log4j.pattern.PatternParser",
      "org.apache.http.HttpException",
      "org.apache.http.cookie.CookieSpec",
      "org.apache.commons.io.filefilter.SuffixFileFilter",
      "org.apache.http.conn.ssl.AllowAllHostnameVerifier",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "org.apache.log4j.pattern.FormattingInfo",
      "org.apache.log4j.Layout",
      "org.apache.http.client.CredentialsProvider",
      "org.apache.http.client.ClientProtocolException",
      "org.apache.http.client.methods.Configurable",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "org.ow2.proactive.scripting.ScriptException",
      "org.apache.log4j.pattern.LiteralPatternConverter",
      "org.apache.log4j.pattern.NDCPatternConverter",
      "org.apache.log4j.jmx.LoggerDynamicMBean",
      "org.apache.log4j.pattern.FullLocationPatternConverter",
      "org.apache.log4j.Hierarchy",
      "org.apache.http.conn.ssl.AbstractVerifier",
      "org.apache.http.conn.ssl.SSLContextBuilder$TrustManagerDelegate",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "org.ow2.proactive.http.CommonHttpResourceDownloader$UrlContent",
      "org.apache.http.auth.Credentials",
      "org.apache.commons.io.filefilter.NameFileFilter",
      "org.apache.http.HttpConnectionMetrics",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.http.HttpClientConnection",
      "org.apache.http.conn.ConnectionPoolTimeoutException",
      "com.google.common.base.Throwables",
      "org.apache.http.protocol.HttpProcessor",
      "org.apache.http.auth.AuthProtocolState",
      "org.apache.http.client.RedirectStrategy",
      "org.apache.http.protocol.HttpContext",
      "org.apache.http.params.HttpParams",
      "org.apache.log4j.pattern.LoggerPatternConverter",
      "org.apache.http.HttpResponse",
      "org.apache.log4j.RollingFileAppender",
      "org.apache.http.impl.client.HttpClientBuilder",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.FormattingInfo",
      "org.apache.commons.io.filefilter.IOFileFilter",
      "org.apache.commons.io.filefilter.MagicNumberFileFilter",
      "org.apache.log4j.pattern.ThrowableInformationPatternConverter",
      "org.apache.log4j.pattern.NameAbbreviator$MaxElementAbbreviator",
      "org.apache.log4j.EnhancedPatternLayout",
      "org.apache.log4j.pattern.SequenceNumberPatternConverter",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.http.config.MessageConstraints",
      "org.apache.http.Header",
      "org.apache.http.conn.ConnectionKeepAliveStrategy",
      "org.apache.log4j.helpers.PatternParser$ClassNamePatternConverter",
      "org.apache.http.conn.ssl.X509HostnameVerifier",
      "org.apache.log4j.helpers.PatternParser",
      "org.ow2.proactive.scripting.Script$1",
      "org.apache.log4j.Category",
      "org.apache.log4j.pattern.RelativeTimePatternConverter",
      "org.apache.log4j.jmx.LayoutDynamicMBean",
      "org.apache.http.cookie.CookieOrigin",
      "org.apache.http.conn.util.PublicSuffixListParser",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "org.apache.http.HttpEntity",
      "org.apache.log4j.pattern.DatePatternConverter",
      "org.ow2.proactive.utils.BoundedStringWriter",
      "org.apache.http.conn.ssl.SSLContextBuilder",
      "org.apache.log4j.helpers.RelativeTimeDateFormat",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.log4j.spi.Configurator",
      "org.apache.http.conn.scheme.SocketFactory",
      "org.apache.http.impl.execchain.ClientExecChain",
      "org.apache.commons.io.FilenameUtils",
      "org.apache.log4j.pattern.LevelPatternConverter",
      "org.apache.log4j.spi.LocationInfo",
      "org.apache.log4j.pattern.FileDatePatternConverter",
      "org.apache.http.HttpVersion",
      "org.apache.http.config.ConnectionConfig$Builder",
      "org.apache.http.conn.SchemePortResolver",
      "org.apache.log4j.TTCCLayout",
      "org.apache.http.conn.DnsResolver",
      "org.apache.log4j.varia.StringMatchFilter",
      "org.ow2.proactive.scripting.InvalidScriptException",
      "org.apache.log4j.pattern.MessagePatternConverter",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "org.apache.commons.io.filefilter.OrFileFilter",
      "org.apache.http.auth.AuthScheme",
      "org.apache.http.message.AbstractHttpMessage",
      "org.apache.log4j.pattern.PatternConverter",
      "org.apache.http.auth.MalformedChallengeException",
      "org.apache.http.HttpEntityEnclosingRequest",
      "org.apache.log4j.jmx.AppenderDynamicMBean",
      "org.apache.http.conn.routing.RouteInfo$TunnelType",
      "org.apache.http.conn.ssl.PrivateKeyStrategy",
      "org.ow2.proactive.scripting.ScriptTest",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.http.client.UserTokenHandler",
      "org.apache.log4j.helpers.PatternParser$DatePatternConverter",
      "org.apache.log4j.helpers.PatternParser$MDCPatternConverter",
      "org.apache.log4j.pattern.LineSeparatorPatternConverter",
      "org.apache.http.conn.HttpRoutedConnection",
      "org.apache.log4j.Priority",
      "org.apache.log4j.pattern.PatternParser$ReadOnlyMap",
      "org.apache.http.ConnectionReuseStrategy",
      "org.apache.log4j.pattern.LoggingEventPatternConverter",
      "org.apache.log4j.FileAppender",
      "org.apache.http.conn.ConnectionReleaseTrigger",
      "org.apache.log4j.LogManager",
      "org.apache.http.conn.ManagedHttpClientConnection",
      "org.apache.log4j.pattern.ThreadPatternConverter",
      "org.ow2.proactive.scripting.ScriptResult",
      "org.apache.http.config.SocketConfig",
      "org.apache.log4j.pattern.BridgePatternConverter",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.http.client.config.RequestConfig",
      "org.apache.log4j.or.RendererMap",
      "org.apache.http.StatusLine",
      "org.apache.log4j.pattern.MethodLocationPatternConverter",
      "org.apache.log4j.ConsoleAppender$SystemErrStream",
      "org.apache.http.RequestLine",
      "org.apache.log4j.pattern.BridgePatternParser",
      "org.apache.log4j.pattern.ClassNamePatternConverter",
      "org.apache.http.config.Lookup",
      "org.apache.http.HttpMessage",
      "org.apache.http.HttpRequestInterceptor",
      "org.apache.http.client.AuthCache",
      "org.apache.log4j.jmx.AbstractDynamicMBean",
      "org.apache.http.HeaderIterator",
      "org.apache.http.conn.ClientConnectionManager",
      "org.apache.http.conn.scheme.SchemeSocketFactory",
      "org.apache.http.HttpInetConnection",
      "org.apache.commons.io.filefilter.ConditionalFileFilter",
      "org.apache.log4j.pattern.IntegerPatternConverter",
      "org.apache.http.HttpRequest",
      "org.apache.http.client.BackoffManager",
      "org.ow2.proactive.scripting.SimpleScript",
      "org.apache.http.client.AuthenticationStrategy",
      "org.apache.log4j.helpers.PatternParser$LocationPatternConverter",
      "org.apache.log4j.RollingCalendar",
      "org.apache.log4j.CategoryKey",
      "org.apache.http.conn.socket.ConnectionSocketFactory",
      "org.apache.log4j.WriterAppender",
      "org.apache.http.conn.util.PublicSuffixMatcher",
      "org.apache.http.conn.routing.RouteInfo$LayerType",
      "org.apache.log4j.varia.DenyAllFilter",
      "org.apache.log4j.helpers.DateLayout",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "org.apache.commons.io.filefilter.DelegateFileFilter",
      "org.apache.http.client.methods.HttpUriRequest",
      "org.apache.http.protocol.HttpRequestExecutor",
      "org.apache.log4j.helpers.Loader",
      "org.apache.http.client.methods.HttpRequestWrapper",
      "org.apache.log4j.spi.NOPLoggerRepository",
      "org.apache.log4j.ProvisionNode",
      "org.apache.http.conn.util.PublicSuffixList",
      "org.apache.log4j.pattern.PropertiesPatternConverter",
      "org.apache.http.conn.ConnectTimeoutException",
      "org.apache.http.client.HttpClient",
      "org.apache.log4j.pattern.LineLocationPatternConverter",
      "org.apache.http.cookie.Cookie",
      "org.ow2.proactive.utils.FileUtils",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.spi.ErrorHandler",
      "org.ow2.proactive.scripting.Script$ScriptContentAndEngineName",
      "org.apache.http.protocol.HttpCoreContext",
      "org.apache.http.client.methods.HttpRequestWrapper$HttpEntityEnclosingRequestWrapper",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.log4j.pattern.NameAbbreviator$PatternAbbreviator",
      "org.apache.http.ProtocolVersion",
      "org.apache.log4j.pattern.FileLocationPatternConverter",
      "org.apache.http.auth.AuthScope",
      "org.ow2.proactive.scripting.ScriptTest$ScriptForTests",
      "org.apache.commons.io.filefilter.WildcardFileFilter",
      "org.objectweb.proactive.annotation.PublicAPI",
      "org.apache.http.HttpHost",
      "org.apache.http.conn.UnsupportedSchemeException",
      "org.apache.http.ProtocolException",
      "org.apache.http.client.protocol.HttpClientContext",
      "org.ow2.proactive.http.CommonHttpClientBuilder",
      "org.apache.log4j.helpers.AbsoluteTimeDateFormat",
      "org.apache.log4j.varia.LevelRangeFilter",
      "org.apache.http.conn.ssl.StrictHostnameVerifier",
      "org.apache.log4j.Logger",
      "org.apache.http.conn.ssl.SSLContextBuilder$KeyManagerDelegate",
      "org.apache.http.concurrent.Cancellable",
      "org.apache.log4j.jmx.HierarchyDynamicMBean",
      "org.apache.http.conn.routing.HttpRoutePlanner",
      "org.apache.http.Consts",
      "org.apache.http.conn.ssl.SSLConnectionSocketFactory",
      "org.apache.log4j.helpers.LogLog",
      "org.ow2.proactive.http.AllowAllTrustStrategy",
      "org.apache.http.conn.ssl.SSLInitializationException",
      "org.apache.http.util.Args",
      "org.ow2.proactive.http.CommonHttpResourceDownloader",
      "org.apache.http.conn.util.PublicSuffixMatcherLoader",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.commons.io.filefilter.FileFileFilter",
      "org.apache.http.config.ConnectionConfig",
      "org.apache.http.conn.socket.LayeredConnectionSocketFactory",
      "org.apache.log4j.DailyRollingFileAppender",
      "org.apache.http.conn.scheme.Scheme",
      "org.apache.http.HttpResponseInterceptor",
      "org.apache.http.conn.ssl.BrowserCompatHostnameVerifier",
      "org.apache.log4j.pattern.NameAbbreviator$PatternAbbreviatorFragment",
      "org.apache.http.config.MessageConstraints$Builder",
      "org.apache.http.client.config.RequestConfig$Builder",
      "org.apache.http.auth.AuthenticationException",
      "org.apache.http.auth.AuthState",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.http.NameValuePair",
      "org.apache.http.ssl.TrustStrategy",
      "org.apache.commons.io.IOCase",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.http.conn.ClientConnectionRequest",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.http.conn.routing.HttpRoute",
      "org.apache.log4j.spi.ThrowableRenderer",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Appender",
      "org.apache.http.client.CookieStore",
      "org.apache.log4j.spi.NOPLogger",
      "org.apache.http.client.methods.CloseableHttpResponse",
      "org.apache.log4j.filter.LevelRangeFilter",
      "org.apache.log4j.pattern.NameAbbreviator",
      "org.apache.log4j.pattern.NameAbbreviator$DropElementAbbreviator",
      "org.apache.http.client.HttpRequestRetryHandler",
      "org.apache.commons.io.filefilter.RegexFileFilter",
      "org.apache.log4j.helpers.CountingQuietWriter",
      "org.apache.http.conn.scheme.SchemeRegistry",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.apache.http.impl.client.CloseableHttpClient",
      "org.apache.log4j.pattern.NamePatternConverter",
      "org.apache.http.ParseException",
      "org.apache.http.conn.ssl.TrustStrategy",
      "org.apache.log4j.spi.LoggingEvent",
      "org.apache.http.client.ServiceUnavailableRetryStrategy",
      "org.apache.http.impl.client.InternalHttpClient",
      "org.apache.http.client.methods.HttpExecutionAware",
      "org.apache.http.HeaderElement",
      "org.apache.http.conn.ManagedClientConnection",
      "org.apache.http.client.ConnectionBackoffStrategy",
      "org.apache.commons.io.filefilter.PrefixFileFilter",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.apache.http.conn.util.DomainType",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.PatternLayout",
      "org.apache.http.conn.routing.RouteInfo",
      "org.apache.http.HttpConnection",
      "org.apache.http.client.ResponseHandler",
      "org.apache.log4j.pattern.NameAbbreviator$NOPAbbreviator"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.ow2.proactive.scripting.Script", false, TaskScript_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TaskScript_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.ow2.proactive.scripting.Script",
      "org.ow2.proactive.scripting.TaskScript",
      "org.ow2.proactive.scripting.SimpleScript",
      "org.ow2.proactive.scripting.ScriptResult",
      "org.ow2.proactive.scripting.SelectionScript",
      "org.ow2.proactive.scripting.ScriptTest",
      "org.ow2.proactive.scripting.ScriptTest$ScriptForTests",
      "org.ow2.proactive.utils.FileUtils",
      "org.ow2.proactive.scripting.InvalidScriptException",
      "org.apache.log4j.spi.LocationInfo",
      "org.apache.log4j.jmx.AbstractDynamicMBean",
      "org.apache.log4j.jmx.HierarchyDynamicMBean",
      "org.apache.commons.io.FilenameUtils",
      "org.apache.commons.io.IOCase",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "org.apache.commons.io.filefilter.PrefixFileFilter",
      "org.apache.log4j.spi.Filter",
      "org.apache.log4j.varia.LevelRangeFilter",
      "org.apache.commons.io.filefilter.NameFileFilter",
      "org.apache.log4j.varia.DenyAllFilter",
      "org.apache.commons.io.filefilter.AgeFileFilter",
      "org.apache.commons.io.filefilter.SuffixFileFilter",
      "org.apache.commons.io.filefilter.MagicNumberFileFilter",
      "org.apache.log4j.filter.LevelRangeFilter",
      "org.ow2.proactive.scripting.helper.forkenvironment.ForkEnvironmentScriptResultExtractor",
      "org.ow2.proactive.http.CommonHttpResourceDownloader",
      "org.ow2.proactive.http.AllowAllTrustStrategy",
      "org.ow2.proactive.http.CommonHttpClientBuilder",
      "org.apache.http.impl.client.HttpClientBuilder",
      "org.apache.http.conn.ssl.SSLContextBuilder",
      "org.apache.http.conn.ssl.SSLContextBuilder$TrustManagerDelegate",
      "org.apache.http.conn.ssl.AbstractVerifier",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.http.conn.ssl.AllowAllHostnameVerifier",
      "org.apache.http.conn.ssl.BrowserCompatHostnameVerifier",
      "org.apache.http.conn.ssl.StrictHostnameVerifier",
      "org.apache.http.conn.ssl.SSLConnectionSocketFactory",
      "org.apache.http.conn.util.PublicSuffixMatcherLoader",
      "org.apache.http.util.Args",
      "org.apache.http.conn.util.PublicSuffixListParser",
      "org.apache.http.Consts",
      "org.apache.http.conn.util.DomainType",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.apache.log4j.spi.LoggingEvent",
      "org.apache.commons.io.filefilter.WildcardFileFilter",
      "org.apache.commons.io.filefilter.RegexFileFilter",
      "org.apache.commons.io.filefilter.OrFileFilter",
      "org.apache.commons.io.filefilter.TrueFileFilter",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "org.apache.commons.io.filefilter.DelegateFileFilter",
      "org.apache.log4j.spi.NOPLoggerRepository",
      "org.apache.log4j.spi.NOPLogger",
      "org.apache.log4j.jmx.LoggerDynamicMBean",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.WriterAppender",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "org.apache.log4j.FileAppender",
      "org.apache.log4j.varia.StringMatchFilter",
      "org.apache.log4j.DailyRollingFileAppender",
      "org.apache.log4j.RollingCalendar",
      "org.apache.log4j.Layout",
      "org.apache.log4j.EnhancedPatternLayout",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.pattern.BridgePatternParser",
      "org.apache.log4j.helpers.FormattingInfo",
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.pattern.BridgePatternConverter",
      "org.apache.log4j.pattern.PatternConverter",
      "org.apache.log4j.pattern.LoggingEventPatternConverter",
      "org.apache.log4j.pattern.NamePatternConverter",
      "org.apache.log4j.pattern.NameAbbreviator$NOPAbbreviator",
      "org.apache.log4j.pattern.NameAbbreviator",
      "org.apache.log4j.pattern.LoggerPatternConverter",
      "org.apache.log4j.pattern.ClassNamePatternConverter",
      "org.apache.log4j.pattern.DatePatternConverter",
      "org.apache.log4j.pattern.FileLocationPatternConverter",
      "org.apache.log4j.pattern.FullLocationPatternConverter",
      "org.apache.log4j.pattern.LineLocationPatternConverter",
      "org.apache.log4j.pattern.MessagePatternConverter",
      "org.apache.log4j.pattern.LineSeparatorPatternConverter",
      "org.apache.log4j.pattern.MethodLocationPatternConverter",
      "org.apache.log4j.pattern.LevelPatternConverter",
      "org.apache.log4j.pattern.RelativeTimePatternConverter",
      "org.apache.log4j.pattern.ThreadPatternConverter",
      "org.apache.log4j.pattern.NDCPatternConverter",
      "org.apache.log4j.pattern.PropertiesPatternConverter",
      "org.apache.log4j.pattern.SequenceNumberPatternConverter",
      "org.apache.log4j.pattern.ThrowableInformationPatternConverter",
      "org.apache.log4j.pattern.PatternParser$ReadOnlyMap",
      "org.apache.log4j.pattern.FileDatePatternConverter",
      "org.apache.log4j.pattern.IntegerPatternConverter",
      "org.apache.log4j.pattern.PatternParser",
      "org.apache.log4j.pattern.FormattingInfo",
      "org.apache.log4j.pattern.LiteralPatternConverter",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.commons.io.filefilter.FileFileFilter",
      "com.google.common.base.Throwables",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.RollingFileAppender",
      "org.apache.log4j.helpers.CountingQuietWriter",
      "org.apache.log4j.helpers.DateLayout",
      "org.apache.log4j.TTCCLayout"
    );
  }
}
