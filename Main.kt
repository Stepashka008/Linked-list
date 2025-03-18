fun main() {
    val myList: MyList<Int> = MyList<Int>();
    myList.push_back(5);
    myList.push_back(8);
    myList.push_back(9);
    myList.push_back(3);
    myList.push_back(1);
    myList.push_back(7);
    myList.push_back(6);
    println(myList.toString());
}
