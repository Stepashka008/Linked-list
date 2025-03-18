fun main() {
    val myList: MyList<Int> = MyList<Int>();

    myList.push_back(5); // Вставляем в конец списка
    myList.push_back(8);
    myList.push_back(9);
    myList.push_back(3);
    myList.push_back(1);
    myList.push_back(7);
    myList.push_back(6);

    myList.push_front(-8); // Вставляем в конец списка
    myList.push_front(-4);

    myList.insert(3, 8); // Вставляем на 9 место

    myList.pop_back(); // Удаляем последний элемент
    myList.pop_back();

    println(myList.toString());
}