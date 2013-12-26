val NGSNexus     = "NGS Nexus"     at "http://ngs.hr/nexus/content/groups/public/"
val NGSReleases  = "NGS Releases"  at "http://ngs.hr/nexus/content/repositories/releases/"
val NGSSnapshots = "NGS Snapshots" at "http://ngs.hr/nexus/content/repositories/snapshots/"

// ### BASIC SETTINGS ### //

organization := "com.dslplatform"

name := "DSL-OCD"

version := "0.0.0-SNAPSHOT"

unmanagedSourceDirectories in Compile :=
  Seq("interfaces", "services", "types", "impl").map {
    baseDirectory.value / "src" / _ / "scala"
  } :+ (scalaSource in Compile).value

unmanagedSourceDirectories in Test := (scalaSource in Test).value :: Nil


// ### DEPENDENCIES ### //

libraryDependencies ++= Seq(
  "com.dslplatform" % "dsl-compiler-client-cmdline" % "0.8.10"
, "hr.element.etb" %% "etb-util" % "0.2.20"
, "ch.qos.logback" % "logback-classic" % "1.0.13" % "compile->default"
, "hr.ngs" %% "ngs-core" % "0.3.19"
, "junit" % "junit" % "4.11" % "test"
, "org.scalatest" %% "scalatest" % "2.0.RC1" % "test"
)

// ### RESOLVERS ### //

resolvers := Seq(NGSNexus)

externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)

publishTo := Some(
  if (version.value endsWith "SNAPSHOT") NGSSnapshots else NGSReleases
)

credentials += Credentials(Path.userHome / ".config" / "DSL-OCD" / "nexus.config")

publishArtifact in (Compile, packageDoc) := false


// ### COMPILE SETTINGS ### //

crossScalaVersions := Seq("2.10.3")

scalaVersion := crossScalaVersions.value.head

scalacOptions := Seq(
  "-unchecked"
, "-deprecation"
, "-optimise"
, "-encoding", "UTF-8"
, "-Xcheckinit"
, "-Yclosure-elim"
, "-Ydead-code"
, "-Yinline"
, "-Xmax-classfile-name", "72"
, "-Yrepl-sync"
, "-Xlint"
, "-Xverify"
, "-Ywarn-all"
, "-feature"
, "-language:postfixOps"
, "-language:implicitConversions"
, "-language:existentials"
, "-language:dynamics"
)

javaHome := sys.env.get("JDK16_HOME").map(file(_))

javacOptions := Seq(
  "-deprecation"
, "-encoding", "UTF-8"
, "-Xlint:unchecked"
, "-source", "1.6"
, "-target", "1.6"
)


// ### ECLIPSE ### //

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.eclipseOutput := Some(".target")
