/**
 * @program JavaBooks
 * @description: 接口
 * @author: mf
 * @create: 2019/03/11 16:45
 */

public interface Interface {
}

// 在软件工程中，接口泛指供别人调用的方法或者函数
// 在这里， 它是对行为的抽象
// 接口中可以有变量和方法， 但：变量会被隐式地指定为public static final变量 ， 用private会报错
// 口中所有的方法不能有具体的实现，也就是说，接口中的方法必须都是抽象方法。

// 要让一个类遵循某组特地的接口需要使用implements关键字

class ClassName implements Interface {}
// In fact 允许一个类遵循多个接口
// 如果一个非抽象类遵循了某个接口，就必须实现该接口中的所有方法
// 对于遵循某个接口的抽象类，可以不实现该接口中的抽象方法。


// 语法层面上的区别
// 1。 抽象类可以提供成员方法的实现细节，而接口中只能存在public abstract 方法；
// 2。 抽象类中的成员变量可以是各种类型的，而接口中的成员变量只能是public static final类型的；
// 3。 接口中不能含有静态代码块以及静态方法，而抽象类可以有静态代码块和静态方法；
// 4。 一个类只能继承一个抽象类，而一个类却可以实现多个接口。

// 设计层面上的区别
// 1. 抽象类是对一种事物的抽象，即对类抽象，而接口是对行为的抽象。、
// 抽象类是对整个类整体进行抽象，包括属性、行为，但是接口却是对类局部（行为）进行抽象。
// 举个例子，飞机和鸟是不同类的事物，但是它们都一个共性，就是都会飞呗。
// 设计的时候，可以将飞机设计一个类为Airplane，将鸟设计为Bird。
// 但是不能将飞行这个特性也设计为类，因此它是一个行为特性，并不是对一类事物的描述。
// 此时，可以将飞行设计为一个接口Fly，包含方法fly( )，然后Airplane和Bird分别根据自己的需要实现Fly这个接口。
// 至于有不同种类的飞机，比如战斗机、民用飞机等直接继承Airplane即可，对于鸟也是类似的，不同种类的鸟直接继承Bird类即可
// 继承是一个 "是不是"的关系，而 接口 实现则是 "有没有"的关系
// 如果一个类继承了某个抽象类，则子类必定是抽象类的种类，而接口实现则是有没有、具备不具备的关系
// 比如鸟是否能飞（或者是否具备飞行这个特点），能飞行则可以实现这个接口，不能飞行就不实现这个接口。


// 也就是说对于抽象类，如果需要添加新的方法，可以直接在抽象类中添加具体的实现，子类可以不进行变更；
// 而对于接口则不行，如果接口进行了变更，则所有实现这个接口的类都必须进行相应的改动。

// 举个例子

/*abstract class Door {
    public abstract void open();
    public abstract void close();
}*/

// or

/*
interface Door {
    public abstract void open();
    public abstract void close();
}*/
