object Q3 {

  class int(n: Int) {
    var m = n

    def ++() : int = {
      var x = new int(m)
      m = m + 1
      x
    }
    
    def --() : int = {
      var x = new int(m);
      m = m - 1;
      x
    }   

    override def toString(): String = {
      return m.toString
    }
  }

  def --(n: Int): Int = {
    var m = n-1
    m
  }

  def ++(n: Int): Int = {
    var m = n + 1;
    m
  }

  @main def main(args: String*) : Unit = {
    var (a,b,c,d) = (2,3,4,5)
    var k = 4.3f
    var (f , g)  = (12.0f,4.0f)

    var num_d = new int(d)
    var num_a = new int(a)
    var num_c = new int(c)

    println(--(b)*a + c*num_d.++().toString().toInt)
    b -= 1

    println(num_a.++())

    println(-2*(g-k) + num_c.toString().toInt)
    num_c = num_c.++()

    println(num_c)

    c = ++(num_c.toString().toInt) * num_a.++().toString().toInt
    println(c)
  }
}
