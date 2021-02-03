//Que 3 : Write the program to calculate determinat of matrix 

object Determinant{

 val A = Array.ofDim[Int](3,3)    
var det = 0; 
var x = 0;
var y = 0;
var z = 0;    
    // Driver code 
    def main (args : Array[String]) { 
         A(0)(0) = 6
        A(0)(1) = 1
        A(0)(2) = 1
        A(1)(0) = 4
        A(1)(1) = -2
        A(1)(2) = 5
        A(2)(0) = 2
        A(2)(1) = 8
        A(2)(2) = 7

println ("Original Matrix is:")
	for (i <- 0 to 2){
            for (j <- 0 to 2){
		println(" " + A(i)(j))
                }
	println();

	}
x = A(0)(0) * ( A(1)(1) * A(2)(2) - A(2)(1) * A(1)(2) )
println("X :" + x)
y = A(0)(1)*((A(1)(0)*A(2)(2))-(A(2)(0)*A(1)(2)))
println("y :" + y)
z = A(0)(2)*((A(1)(0)*A(2)(1))-(A(2)(0)*A(1)(1)))
println("z :" + z)
det = x - y + z
println("Determinat of matrix :" + det)


}
}




/*
Output:

Original Matrix is:
 6
 1
 1

 4
 -2
 5

 2
 8
 7

X :-324
y :18
z :36
Determinat of matrix :-306
 */
