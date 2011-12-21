import sbt._
import Keys._

object SbtExtras extends Build {
  // This build creates a SBT plugin with handy features *and* bundles the SBT script for distribution.
  val root = Project("sbt-extras", file(".")) settings(Packaging.settings:_*)
}
