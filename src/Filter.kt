/**
 * Created by Sony VAIO on 31/05/2016.
 */


 fun main(args: Array<String>) {

    val names = "Lewis James Joe Man Jhezzuuu"

    if ("a" in names)
        print("Yes")

    val m = arrayListOf(1,2,4,5,-1,-4,-3,-4,-5,2,4,5,32,4,6)
    //val positive = m.filter { x -> x > 0 }
     val positive = m.filter { it > 0 }
    print(positive)


}
