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
    fun insert(content: T, index: Int) { // Добавляет элемент по индексу (ИНДЕКС !!! Будет начинаться с first (То есть индекс first = 0)
        var tmp: LinkedList<T> = first;
        var i: Int = 0;
        while (i != index - 1) {
            tmp = tmp.getChild()!!;
            i++;
        }
        val newTmp = LinkedList<T>(content, tmp.getChild()!!);
        tmp.setChild(newTmp);
        count++;
    }
    fun pop_back() { // Удаление последнего элемента в списке
        var tmp: LinkedList<T> = first;
        var i: Int = 1;
        while (i != count) {
            tmp = tmp.getChild()!!; // Если значение null выбросится ошибка
            i++;
        }
        tmp.setChild(last);
        count--;
    }
    fun pop_front() { // Удаление первого элемента
        var tmp: LinkedList<T> = first.getChild()?.getChild()!!;
        first.setChild(tmp);
        count--;
    }
    fun remove_at(index: Int) { // Удаление по указанному индексу
        var tmp: LinkedList<T> = first;
        var i: Int = 0;
        while (i != index - 1) {
            tmp = tmp.getChild()!!;
            i++;
        }
        try {
            val newTmp = tmp.getChild()?.getChild();
            tmp.setChild(newTmp!!);
        }
        catch (ex: Exception) {
            tmp.setChild(last);
        }
        count--;
    }
    fun size_index(content: T, index: Int) { // Изменение значение в указанном по индексу элементе
        var tmp: LinkedList<T> = first;
        var i: Int = 0;
        while (i != index) {
            tmp = tmp.getChild()!!;
            i++;
        }
        tmp.setContent(content);
    }
    fun answer_index(index: Int) { // Чтение элемента по индексу
        var tmp: LinkedList<T> = first;
        var i: Int = 0;
        while (i != index) {
            tmp = tmp.getChild()!!;
            i++;
        }
        println("На " +"${index + 1} месте находится: " + tmp.getContent());
    }
    fun Count() : Int {
        return (count + 2);
    }
    fun empty() : Boolean { // Пустой ли список
        return count == 0;
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
