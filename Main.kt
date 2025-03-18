fun main() {
    val myList: MyList<Int> = MyList<Int>();

    myList.push_back(5); // Вставляем в конец списка
    myList.push_back(8);
    myList.push_back(9);
    myList.push_back(3);
    myList.push_back(1);
    myList.push_back(7);
    myList.push_back(6);

    myList.push_front(-8); // Вставляем в начало списка
    myList.push_front(-4);

    myList.insert(3, 8); // Вставляем на 9 место

    myList.pop_back(); // Удаляем последний элемент
    myList.pop_back();

    myList.pop_front(); // Удаление первого элемента
    myList.pop_front();

    myList.remove_at(6); // Удаляем элемент на 9 месте
    myList.remove_at(2); // Удаляем элемент на 2 месте

    myList.size_index(7, 1); // Заменяем значение элемента 1 индекса

    println(myList.toString());
}