
// // this loads the current development version of ensime, which is the
// // one you want. really, it is so don't worry about it.
// ensimeRepositoryUrls in ThisBuild += "https://oss.sonatype.org/content/repositories/snapshots/"
// ensimeProjectServerVersion in ThisBuild := "3.0.0-SNAPSHOT"

// // if this isn't set then ensime will create 2.11 and 2.12 specific
// // directories for you in your tree :(


import org.ensime.EnsimeKeys._
import org.ensime.EnsimeCoursierKeys._

ensimeServerVersion in ThisBuild := "2.0.0-M1"
ensimeIgnoreMissingDirectories in ThisBuild := true
