import scala.io.StdIn.{readInt, readLine}

class Bank extends Account {

  // Method to open an account
  def opening(): Unit ={

    // readLine() method is used to
    // take a string as input from user
    var new_name = readLine("Enter the name: ")
    name += new_name
    println("Enter the opening balance: ")
    var opening_balance = readInt()
    balance_current += opening_balance
    account_number += 1908
    println("Account added successfully")
  }

  // Method used to close an existing account
  def closing(): Unit ={
    println("Enter the account number: ")
    val acc_num6 = readInt()
    val index6 = account_number.indexOf(acc_num6)
    name -= name(index6)
    balance_current -= balance_current(index6)
    account_number -= account_number(index6)
    println("Account removed successfully")
  }
}

object Banking_System
{
  def main(args: Array[String]): Unit = {

    // Object of all classes
    val obj1 = new Account()
    val obj2 = new SavingsAccount()
    val obj3 = new CurrentAccount()
    val obj4 = new Bank()

    println("Enter 1 for account details, " +
      "2 for SavingsAccount, " +
      "3 for CurrentAccount and " +
      "4 for closing or opening account")

    val choice = readInt()
    if (choice == 1)
    {
      obj1.details()
    }

    if (choice == 2)
    {
      println("Enter 1 for checking the interest " +
        "amount and 2 if you want to see the " +
        "details of any particular account: ")

      val choice1 = readInt()
      if (choice1 == 1)
      {
        obj2.interest_amount()
      }
      else if (choice == 2)
      {
        obj2.details()
      }
    }

    if(choice == 3)
    {
      println("Enter 1 for credit and 2 for debit: ")
      val choice2 = readInt()

      if (choice2 == 1)
      {
        obj3.credit()
      }
      if (choice2 == 2)
      {
        obj3.debit()
      }
    }

    if (choice == 4)
    {
      println("Enter 1 for opening account " +
        "and 2 for closing an account: ")

      val choice3 = readInt()
      if(choice3 == 1)
      {
        obj4.opening()
      }
      else
      {
        obj4.closing()
      }
    }
  }
}
