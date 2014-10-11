import java.io.{File, FileWriter}

import scala.io.Source.fromFile


object CaesarCipher {

  def main(args: Array[String]) {
    val inputFile = args(0)
    val outputFile = args(1)
    val key = args(2).toInt
    val typ = args(3)
    val fw = new FileWriter(new File(outputFile))
    val clearText = fromFile(inputFile).mkString
    val cryp = new Cryptor()
    val cipherText = typ match {
      case "encrypt" => cryp.encrypt(clearText, key)
      case "decrypt" => cryp.decrypt(clearText, key)
    }

    fw.write(cipherText)
    fw.close()
  }

}
