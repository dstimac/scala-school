package paket.paket

import paket.paket.FileMatcher

object Summer {

  def main(args: Array[String]) {

    //for(file <- FileMatcher.filesContaining("it")) println(file)

    for(file <- FileMatcher.filesMatchingScala4()) println(file)

  }


}