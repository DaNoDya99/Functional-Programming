import scala.collection.mutable.ListBuffer

object Q4_b {

  def priceDecrease(n: Int, m: Int) : ListBuffer[Int] = {
    var price = n
    var attendence = m
    var x = new ListBuffer[Int]()

    while (price != 0) {
        var profit = attendence*price - 500 - 3*attendence
        x += profit
        price = price - 5
        attendence = attendence + 20
    }
    
    x
  }

  def priceIncrease(n: Int, m:Int) : ListBuffer[Int] = {
    var price = n
    var attendence = m
    var x = new ListBuffer[Int]()

    while(attendence != 0) {
        var profit = attendence*price - 500 - 3*attendence
        x += profit
        price = price + 5
        attendence = attendence - 20
    }

    x
  }

  def getMaxProfit(n: Int, m: Int) : Int = {
    var profit_list1 = priceIncrease(n,m)
    var profit_list2 = priceDecrease(n,m)
    var price = 0

    if(profit_list1.max > profit_list2.max) {
        price = 15 + 5*profit_list1.indexOf(profit_list1.max)
    } else {
        price = 15 - 5*profit_list2.indexOf(profit_list2.max)
    }

    price
  }

  @main def main(args: String*) : Unit = {
    var y = getMaxProfit(15,120)
    println("Price of a ticket : Rs " + y + "/=")
  }
}
