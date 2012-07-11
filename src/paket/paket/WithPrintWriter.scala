package paket.paket

import java.io.File
import java.io.PrintWriter

object WithPrintWriter {

  def withPringWriter(file: File)(op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try{
      op(writer)
    } finally {
      writer.close()
    }

  }

}