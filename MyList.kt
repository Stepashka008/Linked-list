class MyList<T : Any> {

    private val last: LinkedList<T>; // Последний элемент связанного списка
    private val first: LinkedList<T>; // Первый элемент списка после головы
    private val front: LinkedList<T>; // Голова связанного списка
    private var count: Int; // Кол-во элементов

    constructor() {
        last = LinkedList<T>();
        first = LinkedList<T>(last);
        front = LinkedList<T>(first);
        count = 0;
    }

    fun push_back(content: T) { // Добавление элемента в конец списка
        var tmp: LinkedList<T> = first;
        if (first.getChild() == last) { // Если первый элемент указывает на последний
            tmp = LinkedList<T>(content, last); // Создание нового элемента
            first.setChild(tmp);
            count++;
        }
        else {
            var i: Int = 0;
            while (i != count) {
                tmp = tmp.getChild()!!; // Если значение null выбросится ошибка
                i++;
            }
            val newTmp = LinkedList<T>(content, last);
            tmp.setChild(newTmp);
            count++;
        }
    }
    fun push_front(content: T) { // Добавление элемента в начало списка
        val newTmp = LinkedList<T>(content, first.getChild()!!);
        first.setChild(newTmp);
        count++;
    }

    override fun toString(): String { // Вывод списка на консоль
        var tmp: LinkedList<T> = first.getChild()!!; // Если значение null выбросится ошибка

        var strContent: String = "f";
        var strChildContent: String = "${first.getChild()?.getContent()}";


        var i: Int = 0;
        while (i != count) {
            strContent += " ${tmp.getContent()}";
            tmp = tmp.getChild()!!;
            i++;
        }
        strContent += " l\n";

        tmp= first.getChild()!!;
        i = 1;
        while (i != count) {
            strChildContent += " ${tmp.getChild()?.getContent()}";
            tmp = tmp.getChild()!!;
            i++;
        }
        strChildContent += " l";

        val str: String = strContent + strChildContent;

        return str;
    }
}
