 import coop.rchain.rspace._
 import coop.rchain.rspace.util._

object Main extends App {

case class Name(first: String, last: String)
case class Address(street: String, city: String, state: String, zip: String)
case class Entry(name: Name, address: Address, email: String, phone: String)

class Printer extends ((List[Entry]) => Unit) with Serializable {

  def apply(entries: List[Entry]): Unit =
    entries.foreach {
      case Entry(name, address, email, phone) =>
        val nameStr = s"${name.last}, ${name.first}"
        val addrStr = s"${address.street}, ${address.city}, ${address.state} ${address.zip}"
        Console.printf(s"""|
                           |=== ENTRY ===
                           |name:    $nameStr
                           |address: $addrStr
                           |email:   $email
                           |phone:   $phone
                           |""".stripMargin)
    }






























}














}
