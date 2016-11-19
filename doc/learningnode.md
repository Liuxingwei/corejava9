# 第二章 Java程序设计环境 #
## 2.4 使用集成开发环境 #
在idea中创建一个module，右击该module，open module settings，设置 project中的jdk；设置module中的输出目录。
右击该module，make module 或rebuild module。
右击输出目录中生成的class文件，运行，设置该运行的jdk，出现结果。重复运行时，选择右上角配置名，点击运行按钮。
# 第三章 Java的基本程序设计结构 #
## 3.3 数据类型 ##
3.3.1 长整形常量要有后缀L，十六进制数值前有一个0x前缀，八进制数值前有一个0。自Java7开始，二进制常量使用前缀0b。Java7开始可以以千为分隔单位加_，如1_020_900。
3.3.2 float类型很少用。float常理后缀：F；否则为double，也可以在double后面加D。
Double.POSITIVE_INFINITY、Double.NEGATIVE_INFINITY、Double.NaN分别表示正无穷大（正数除以0），负无穷大（负数除以0）和非数字（NaN - 0/0或负数的平方根）。
不能用 x == Double.NaN判断是否为Double.NaN，所有非数值的值都被认为是不相同的，可以使用 Double.isNaN(x)来判断。
3.3.3 虽然书上说，\u 和 \U 转义可以出现在char类型和String类型的引号之外，如 public static void main(String\us005B\u005D args)。但在idea + jdk8的环境下试验失败。
3.4 类常量使用点语法访问，而不是像C++，使用域运算符访问。且类常量可以使用 className.constantName 的形式访问，也可以使用 instantsName.constantName 或在定义类常量的类中使用 this.constantName 形式访问。见Constants.class示例。