class Cryptor {


  private def caesar(k: Int)(c: Char) = c match {
    case c if c isLower => ('a' + ((c - 'a' + k) % 26)).toChar
    case c if c isUpper => ('A' + ((c - 'A' + k) % 26)).toChar
    case _ => c // _ is a wildcard pattern
  }

  def encrypt(s: String, k: Int) = s map caesar(k) _

  def decrypt(s: String, k: Int) = encrypt(s, 26 - k)

}
