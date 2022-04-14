import java.time.temporal.TemporalAmount

fun main(){
    var money=savingsAccount("ABSA",77701787351,"Jescah Amanda",3000)
    println(deposit(364.98))
    println(deposit(7076.23))

}
//Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
class CurrentAccount(account:String,number:Long, accountName:String,balance:Int){

}
fun deposit(amount: Double){
    var depositAmount=amount++
println(depositAmount)
}
fun withdraw(amount: Double){
    var depositAmount=amount--

}
fun details(){
    var details:String
    println(details)
}
class savingsAccount(account:String,number:Long,accountNane: String, balance: Int, withdrawals:Int){
    }


}
// A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
data class Product(var name:String,var weight:Double,  var price:Int,var category:String){
    class Category(var groceries:String, var hygiene:String)
}


fun items(Array<String>): String{
    var character=("Jackline,Joyce,Antony")
    println(character)
}