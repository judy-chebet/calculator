fun main(args: Array<String>) {
    var fare=100
    if (fare<0 && fare<=20){
        println("fair")
    }else if(fare>20 && fare<=40){
        println("good")
    }else if (fare>40 && fare<=60){
        println("better")
    }else if (fare>60 && fare<=80){
        println("best")
    }else{
        println("wow!")
    }
}