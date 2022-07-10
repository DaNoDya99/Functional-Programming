object Q_1_2{
    @main def main(args: String*) : Unit = {
        var (k,i,j,m,n) = (2,2,2,5,5)
        var (f , g)  = (12.0f,4.0f)
        var c = 'X'
        
        println(k + 12*m)
        println(m/j)
        println(n%j)
        println(m/j*j)
        println(f + 10*5 + g)
        println(++(i)*n) // Scala doesnot have ++ or -- operators to increment and decrement. But in java it has.
    }

    //Declare a function for pre increment.
    def ++(n:Int) : Int = { 
        var m = n+1;
        m
    }
}