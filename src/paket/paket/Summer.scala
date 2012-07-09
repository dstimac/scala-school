package paket.paket

import paket.paket.ChecksumAccumulator.calculate

object Summer {

  def main(args: Array[String]) {

    for(arg <- args)
      println(arg + ": " + calculate(arg))

  }
}