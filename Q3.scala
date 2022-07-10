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

    def getValue(): Int = m
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
    var b = 3
    var k = 4.3f
    var (f , g)  = (12.0f,4.0f)

    var d = new int(5)
    var a = new int(2)
    var c = new int(4)

    println(--(b)*a.getValue() + c.getValue()*d.++().getValue())
    b -= 1

    println(a.++())

    println(-2*(g-k) + c.getValue())
    c = c.++()

    println(c)

    c.m = ++(c.getValue()) * a.getValue()
    println(c)
  }
}
