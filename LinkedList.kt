class LinkedList<T : Any> {

    private var сontent: T? = null; // Значение нашего элемента списка
    private var сhild: LinkedList<T>? = null; // Ребенок нашего элемента

    constructor() {
        сontent = null;
        сhild = null;
    }

    constructor(child: LinkedList<T>) {
        this.сhild = child;
    }

    constructor(content: T, child: LinkedList<T>) {
        this.сontent = content;
        this.сhild = child;
    }

    fun getContent(): T? {
        if (сontent != null) return сontent;
        return null;
    }

    fun getChild(): LinkedList<T>? {
        if (сhild != null) return сhild;
        return null;
    }

    fun setContent(content: T){
        this.сontent = content;
    }

    fun setChild(child: LinkedList<T>){
        this.сhild = child;
    }
}
