name := "nlp"

val scalaVer = "2.11.12"
val sparkScalaVer = "2.10.6"

val scalacOpts = Seq(
  "-unchecked",
  "-deprecation",
  "-feature",
  "-Xmax-classfile-name", "140", // 140 characters is the maximum Linux encrypted filesystems can support
  "-encoding", "UTF-8")

val scalacOpts211 = Seq(
  "-target:jvm-1.8",
  // "-Ywarn-unused-import", // If you really feel like satisfying your OCD.
  "-Xlint",
  "-Xfatal-warnings",
  "-Yno-adapted-args",
  "-Ywarn-numeric-widen",
  "-Ywarn-dead-code")

val jvmGCSettings = Seq("-J-XX:+UseG1GC", "-J-XX:+UseStringDeduplication", "-J-XshowSettings:vm")
val jvmGeneralSettings = jvmGCSettings ++ Seq("-J-XX:+IgnoreUnrecognizedVMOptions")
// https://mvnrepository.com/artifact/org.apache.opennlp/opennlp-tools
val commonSettings =libraryDependencies += "org.apache.opennlp" % "opennlp-tools" % "1.8.4"

lazy val tokeniser = (project in file("modules/tokeniser")).settings(commonSettings)
lazy val root = (project in file("."))
  .aggregate(
    tokeniser
  )
