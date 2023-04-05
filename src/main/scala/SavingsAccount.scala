import scala.io.StdIn.readInt

class SavingsAccount extends Account {

  var interest : Double = 2

  // Method used to calculate interest
  def interest_amount(): Unit = {
    println("Enter the account number " +
      "to see the interest amount: ")

    val acc_num3 = readInt()
    val index3 = account_number.indexOf(acc_num3)
    interest =  (balance_current(index3) * 2) / 100
    println("The interest amount is: "+interest)
  }

  override def details(): Unit = {
    println("Enter the account_number to see its details: ")
    val acc_num4 = readInt()
    val index4 = account_number.indexOf(acc_num4)

    println("Details of this account is\n" +
      "Name of customer is: " + name(index4) +
      "\nAccount number is: " + account_number(index4) +
      "\nPhone number is: " + phone_number(index4)  +
      "\nAccount balance is: " + balance_current(index4))
  }

}
