package paket.paket

import java.io.File

object FileMatcher {

  private def filesHere = (new File(".")).listFiles

//  def filesEnding1(querry: String) =
//    for(file <- filesHere; if file.getName.endsWith(querry))
//      yield file
//
//  def filesContaining1(querry: String) =
//    for(file <- filesHere; if file.getName.contains(querry))
//      yield file
//
//  def filesRegex1(querry: String) =
//    for (file <- filesHere; if file.getName.matches(querry))
//      yield file
//

  def filesMatching(matcher: (String) => Boolean): Array[File] = {
    for(file <- filesHere; if matcher(file.getName))
      yield file
  }

  def filesEnding(querry: String) = filesMatching(_.endsWith(querry))

  def filesContaining(querry: String) = filesMatching(_.contains(querry))

  def filesRegex(querry: String) = filesMatching(_.matches(querry))

  def filesMatchingScala1() = {
    val p: (String) => Boolean =
      (fileName) => fileName.contains("it")
    filesMatching(p)
  }

  def filesMatchingScala2() = filesMatching((s: String) => s.contains("it"))

  def filesMatchingScala3() = filesMatching(s => s.contains("it"))

  def filesMatchingScala4() = filesMatching(_.contains("it"))

}