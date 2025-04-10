fun main() {

    // Целочисленный список
    println("ЦЕЛОЧИСЛЕННЫЙ СПИСОК\n");

    val myList: MyList<Int> = MyList<Int>();

    println("Изначальный массив: ");
    println(myList.toString() + "\n");

    myList.push_back(5); // Вставляем в конец списка
    myList.push_back(8);
    myList.push_back(9);
    myList.push_back(3);
    myList.push_back(1);
    myList.push_back(7);
    myList.push_back(6);

    println("Массив после добавления в конец 5, 8, 9, 3, 1, 7, 6: ")
    println(myList.toString() + "\n");

    myList.push_front(-8); // Вставляем в начало списка
    myList.push_front(-4);
    println("Массив после добавления в начало -8, -4: ")
    println(myList.toString() + "\n");

    myList.insert(3, 8); // Вставляем на 9 место
    println("Массив после добавления 3 на 9 место: ")
    println(myList.toString() + "\n");

    myList.pop_back(); // Удаляем последний элемент
    println("Массив после удаления последнего элемента: ")
    println(myList.toString() + "\n");

    myList.pop_front(); // Удаление первого элемента
    println("Массив после удаления первого элемента: ")
    println(myList.toString() + "\n");

    myList.remove_at(6); // Удаляем элемент на 7 месте
    myList.remove_at(2); // Удаляем элемент на 3 месте
    println("Массив после удаления элементов на 3 и 7 местах: ")
    println(myList.toString() + "\n");

    myList.size_index(7, 1); // Заменяем значение элемента 1 индекса
    println("Массив после замены 2 места на 7: ")
    println(myList.toString() + "\n");

    myList.answer_index(2); // Чтение элемента, который стоит на 3 месте

    println();

    println("Кол-во элементов в списке: " + myList.Count() + "\n"); // Выдает сколько элементов в списке (с учётом first и last)

    println("Пустой ли список: " + myList.empty() + "\n"); // Проверка пустой ли список

    println("Первый элемент списка: " + myList.front().getContent() + "\n"); // Вывод первого элемента списка

    println("Последний элемент списка: " + myList.back().getContent() + "\n"); // Вывод последнего элемента списка

    myList.clear(); // Очищение списка
    println("Массив после очищения всего списка: ")
    println(myList.toString() + "\n");

    // Строчный список
    println("СТРОЧНЫЙ СПИСОК\n");

    val myListT: MyList<String> = MyList<String>();

    println("Изначальный массив: ");
    println(myListT.toString() + "\n");

    myListT.push_back("ghj"); // Вставляем в конец списка
    myListT.push_back("wje");
    myListT.push_back("jwe");
    myListT.push_back("frd");
    myListT.push_back("jgd");
    myListT.push_back("wti");
    myListT.push_back("ufi");

    println("Массив после добавления в конец: ")
    println(myListT.toString() + "\n");

    myListT.push_front("qut"); // Вставляем в начало списка
    myListT.push_front("yup");
    println("Массив после добавления в начало qut, yup: ")
    println(myListT.toString() + "\n");

    myListT.insert("weq", 8); // Вставляем на 9 место
    println("Массив после добавления weq на 9 место: ")
    println(myListT.toString() + "\n");

    myListT.pop_back(); // Удаляем последний элемент
    println("Массив после удаления последнего элемента: ")
    println(myListT.toString() + "\n");

    myListT.pop_front(); // Удаление первого элемента
    println("Массив после удаления первого элемента: ")
    println(myListT.toString() + "\n");

    myListT.remove_at(6); // Удаляем элемент на 7 месте
    myListT.remove_at(2); // Удаляем элемент на 3 месте
    println("Массив после удаления элементов на 3 и 7 местах: ")
    println(myListT.toString() + "\n");

    myListT.size_index("uei", 1); // Заменяем значение элемента 1 индекса
    println("Массив после замены 2 места на uei: ")
    println(myListT.toString() + "\n");

    myListT.answer_index(2); // Чтение элемента, который стоит на 3 месте

    println();

    println("Кол-во элементов в списке: " + myListT.Count() + "\n"); // Выдает сколько элементов в списке (с учётом first и last)

    println("Пустой ли список: " + myListT.empty() + "\n"); // Проверка пустой ли список

    println("Первый элемент списка: " + myListT.front().getContent() + "\n"); // Вывод первого элемента списка

    println("Последний элемент списка: " + myListT.back().getContent() + "\n"); // Вывод последнего элемента списка

    myListT.clear(); // Очищение списка
    println("Массив после очищения всего списка: ")
    println(myListT.toString() + "\n");
}