
object Q4_a {
  def normalWorking(n : Double) : Double = {
    val Total = n*250
    Total
  }

  def otWorking(n: Double) : Double = {
    val Total = n*85
    Total
  }

  def calcSalary(n: Double , m: Double) : Double = {
    var salary = normalWorking(n) + otWorking(m)
    
    if (n >= 40 && m >= 30) {
        salary = salary*0.88 
    }

    salary
  }

  @main def main(args: String*) : Unit = {

    print("Enter normal working hours: ")
    var n = scala.io.StdIn.readInt()

    print("Enter OT hours: ")
    var m = scala.io.StdIn.readInt()

    var salary = calcSalary(n,m)
    println("Your salary is: "+salary)
  }
}
