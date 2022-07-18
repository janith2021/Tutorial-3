object Question4 {
  def main(args:Array[String]): Unit ={
    println("Wholesale Cost= "+wholesaleCost(60))
  }

  def totalPrice(count:Int):Double={
    count*24.95
  }
  def discount(total:Double)={
    total*0.4
  }
  def shipping(count:Int)={
    if(count<=50) 3.0 else 3.0+(count-50)*0.75
  }
  def wholesaleCost(count:Int)={
    totalPrice(count)-discount(totalPrice(count))+shipping(count)
  }
}

