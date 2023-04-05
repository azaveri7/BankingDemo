import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt

class Account {

  var name = new ListBuffer[String]()
  name += ("Anand","Neha","Aadhya")
  var balance_current = new ListBuffer[Int]()
  balance_current += (20000, 30000, 40000)
  var account_number = new ListBuffer[Int]()
  account_number += ( 1234, 5678, 9101 )
  var phone_number = new ListBuffer[Long]()
  phone_number += (9998273493L, 5569392838L, 6651299039L)

  def details() : Unit = {
    println("Details of customer is\nNames of customer: " + name +
      "\nBalance list" + "is respectively: " + balance_current +
      "\nAccount number is respectively: " + account_number +
      "\nPhone number" + "is respectively: " + phone_number)
  }

  def credit(): Unit = {
    var credit_amount = 0
    println("Enter the account number you want the amount to credit:")
    val acct_num1 = readInt()
    val index1 = account_number.indexOf(acct_num1)
    println("Enter the amount you want to credit: ")
    credit_amount = readInt()
    balance_current(index1) += credit_amount
    println("Amount added successfully\nNew Balance is: " + balance_current(index1))
  }

  def debit(): Unit = {
    var debit_amount = 0
    println("Enter the account number you want the amount to debit:")
    val acct_num2 = readInt()
    val index2 = account_number.indexOf(acct_num2)
    println("Enter the amount you want to debit: ")
    debit_amount = readInt()
    balance_current(index2) -= debit_amount
    println("Amount deducted successfully\nNew Balance is: " + balance_current(index2))
  }

}

object Account {
  def main(args: Array[String]) : Unit = {
    var account = new Account()
    account.credit()
    println("----")
    account.debit()
  }
}
