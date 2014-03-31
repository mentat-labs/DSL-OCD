val NGSNexus            = "NGS Nexus"             at "http://ngs.hr/nexus/content/groups/public/"
val NGSPrivateReleases  = "NGS Private Releases"  at "http://ngs.hr/nexus/content/repositories/releases-private/"
val NGSPrivateSnapshots = "NGS Private Snapshots" at "http://ngs.hr/nexus/content/repositories/snapshots-private/"

// ### BASIC SETTINGS ### //

organization := "com.dslplatform.ocd"

name := "DSL-OCD-Model-Java-Asserts"

version := "0.0.0-SNAPSHOT"

unmanagedSourceDirectories in Compile := Seq(
  sourceDirectory.value / "generated" / "java"
)

unmanagedSourceDirectories in Test := Nil

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.3"
, "junit" % "junit" % "4.11"
)

// ### RESOLVERS ### //

resolvers := Seq(NGSNexus, NGSPrivateReleases, NGSPrivateSnapshots)

externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)

publishTo := Some(
  if (version.value endsWith "SNAPSHOT") NGSPrivateSnapshots else NGSPrivateReleases
)

credentials in ThisBuild ++= {
  val creds = Path.userHome / ".config" / "DSL-OCD" / "nexus.config"
  if (creds.exists) Some(Credentials(creds)) else None
}.toSeq

publishArtifact in (Compile, packageDoc) := false

// ### COMPILE SETTINGS ### //

scalaVersion := "2.10.4-RC3"

javacOptions in doc := Seq(
  "-encoding", "UTF-8"
, "-source", "1.6"
) ++ (sys.env.get("JDK16_HOME") match {
  case Some(jdk16Home) => Seq("-bootclasspath", jdk16Home + "/jre/lib/rt.jar")
  case _ => Nil
})

javacOptions := Seq(
  "-deprecation"
, "-Xlint"
, "-target", "1.6"
) ++ (javacOptions in doc).value

crossPaths := false

autoScalaLibrary := false

net.virtualvoid.sbt.graph.Plugin.graphSettings

// ### ECLIPSE ### //

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE16)

EclipseKeys.eclipseOutput := Some(".target")

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java
