name := "tokeniser"

initialCommands in console := """
  import tokeniser._
"""
libraryDependencies += "org.apache.opennlp" % "opennlp-tools" % "1.8.4"