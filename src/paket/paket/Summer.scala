package paket.paket

import paket.paket.WithPrintWriter.withPringWriter
import java.io.File

object Summer {

  def main(args: Array[String]) {

    val file = new File("aaa.aaa")

    withPringWriter(file) {
      writer => writer.println("Nesto tek toliko da pise2")
    }
  }


}