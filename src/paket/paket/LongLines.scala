package paket.paket

import scala.io.Source

object LongLines {

  def processFile(filename: String, width: Int) {

    def processLine(line: String) {

    if (line.length() > width)
      println(filename + ": " + line.trim)
    }

    val soruce = Source.fromFile(filename)
    for(line <- soruce.getLines)
      processLine(line)
  }
}