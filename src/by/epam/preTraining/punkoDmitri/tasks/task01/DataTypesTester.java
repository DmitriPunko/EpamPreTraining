package by.epam.preTraining.punkoDmitri.tasks.task01;

public class DataTypesTester {

    public static void testByte() {
        byte a = 28;
        byte b = 84;
        byte c;

        System.out.println("\n************ Arithmetical Operators ************ ");

        // addition
        c = (byte) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = (byte) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        // miltiplication
        c = (byte) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = (byte) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = (byte) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 12;
        // unary minus
        c = (byte) -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = (byte) +a;
        System.out.printf("-%d = %d\n", a, c);
        // prefix increment
        a = 12;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 12;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 12;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 12;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n************ Bitwise Operators ************ ");

        c = (byte) (a & b); // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (byte) (a | b); // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (byte) (a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (byte) ~a; // bitwise bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (byte) (a << 1); // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (byte) (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -12;
        c = (byte) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = 12;
        c = (byte) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        c = 26;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        c = 24;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n************ Relational Operators ************");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n************ Logical Operations ************");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n************ Misc Operators ************");
        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 1000000000000000000L;
        float f = 1.9f;
        double d = 123456789.62;
        boolean bool = true;

        c = bt;
        System.out.printf("byte = byte: c = %d --> c = %d\n", bt, c);
        c = (byte) sh;
        System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);
        c = (byte) ch;
        System.out.printf("byte = char: c = (byte)'%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
        // c = (byte)bool;
        //   System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n", bool)
    }

    public static void testShort() {
        short  a = 26;
        short b = 95;
        short c;

        System.out.println("\n************ Arithmetical Operators ************ ");

        // addition
        c = (short) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = (short) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        // miltiplication
        c = (short) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = (short) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = (short) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 5;
        // unary minus
        c = (short) -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = (short) +a;
        System.out.printf("-%d = %d\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n************ Bitwise Operators ************ ");

        c = (short) (a & b); // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short) (a | b); // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short) (a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short) ~a; // bitwise bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (short) (a << 1); // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (short) (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = (short) (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = 5;
        c = (short) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        c = 32;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        c = 28;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n************ Relational Operators ************");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n************ Logical Operations ************");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n************ Misc Operators ************");
        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 1000000000000000000L;
        float f = 1.9f;
        double d = 123456789.62;
        boolean bool = true;

        c = bt;
        System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("short = short: c = %d --> c = %d\n", sh, c);
        c = (short) ch;
        System.out.printf("short = char: c = (short)'%c' --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
        // c = (short)bool;
        //   System.out.printf("short = boolean: c = (short)%b --> Compile Error\n", bool)
    }

    public static void testInt() {
        int a = 5;
        int b = 10;
        int c;

        System.out.println("\n************ Arithmetical Operators ************ ");

        // addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // miltiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 5;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("-%d = %d\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n************ Bitwise Operators ************ ");

        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = ~a; // bitwise bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        c = 74;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        c = 74;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n************ Relational Operators ************");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n************ Logical Operations ************");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n************ Misc Operators ************");
        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (int)bool;
        //   System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool)

    }

    public static void testLong() {
        long a = 1200;
        long b = 58727;
        long c;

        System.out.println("\n************ Arithmetical Operators ************ ");

        // addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // miltiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 5;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("-%d = %d\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n************ Bitwise Operators ************ ");

        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

        c = ~a; // bitwise bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        a = -5;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        c = 758;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        c = 758;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n************ Relational Operators ************");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n************ Logical Operations ************");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n************ Misc Operators ************");
        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = l;
        System.out.printf("long = long: c = %d --> c = %d\n", l, c);
        c = (long) f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
        // c = (long)bool;
        //   System.out.printf("long = boolean: c = (long)%b --> Compile Error\n", bool)


    }

    public static void testFloat() {
        float a = 1.5f;
        float b = 12.8f;
        float c;

        System.out.println("\n************ Arithmetical Operators ************ ");

        // addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        // miltiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        a = 5;
        // unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("-%f = %f\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%f = %f\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%f++ = %f\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%f = %f\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("\n************ Bitwise Operators ************ ");

//        c = a & b; // bitwise AND
//        c = a | b; // bitwise OR
//        c = a ^ b; // bitwise XOR
//        c = ~a; // bitwise bitwise unary compliment
//        c = a << 1; // left shift
//        c = a >> 1; // right shift
//        a = -5;
//        c = a >> 1; // right shift
//        a = 5;
//        c = a >>> 1; // zero fill right shift

        System.out.println("\n***** Assignment Operators *****");

        c = 7.21f;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

//        System.out.printf("%f |= %f --> c = %f\n", c, a, c |= a);
//        System.out.printf("%f &= %f --> c = %f\n", c, a, c &= a);
//        System.out.printf("%f ^= %f --> c = %f\n", c, a, c ^= a);
//        System.out.printf("%f >>= 1 --> c = %f\n", c, c >>= 1);
//        System.out.printf("%f <<= 1 --> c = %f\n", c, c <<= 1);
//        System.out.printf("%f >>>= 1 --> c = %f\n", c, c >>>= 1);

        System.out.println("\n************ Relational Operators ************");

        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n************ Logical Operations ************");

        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n************ Misc Operators ************");
        System.out.println("\nCondition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
        c = l;
        System.out.printf("float = long: c = %d --> c = %f\n", l, c);
        c = f;
        System.out.printf("float = float: c = %f --> c = %f\n", f, c);
        c = (float) d;
        System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
        // c = (float)bool;
        //   System.out.printf("float = boolean: c = (float)%f --> Compile Error\n", bool)
    }

    public static void testDouble() {
        double a = 1.5;
        double b = 12.8;
        double c;

        System.out.println("\n************ Arithmetical Operators ************ ");

        // addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        // miltiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        a = 5;
        // unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("-%f = %f\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%f = %f\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%f++ = %f\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%f = %f\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("\n************ Bitwise Operators ************ ");

//        c = a & b; // bitwise AND
//        c = a | b; // bitwise OR
//        c = a ^ b; // bitwise XOR
//        c = ~a; // bitwise bitwise unary compliment
//        c = a << 1; // left shift
//        c = a >> 1; // right shift
//        a = -5;
//        c = a >> 1; // right shift
//        a = 5;
//        c = a >>> 1; // zero fill right shift

        System.out.println("\n***** Assignment Operators *****");

        c = 7.21;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

//        System.out.printf("%f |= %f --> c = %f\n", c, a, c |= a);
//        System.out.printf("%f &= %f --> c = %f\n", c, a, c &= a);
//        System.out.printf("%f ^= %f --> c = %f\n", c, a, c ^= a);
//        System.out.printf("%f >>= 1 --> c = %f\n", c, c >>= 1);
//        System.out.printf("%f <<= 1 --> c = %f\n", c, c <<= 1);
//        System.out.printf("%f >>>= 1 --> c = %f\n", c, c >>>= 1);

        System.out.println("\n************ Relational Operators ************");

        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        System.out.println("\n************ Logical Operations ************");

        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n************ Misc Operators ************");
        System.out.println("\nCondition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = bt;
        System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
        c = l;
        System.out.printf("double = long: c = %d --> c = %f\n", l, c);
        c = f;
        System.out.printf("double = float: c = %f --> c = %f\n", f, c);
        c = d;
        System.out.printf("double = double: c = %f --> c = %f\n", d, c);
        // c = (double)bool;
        //   System.out.printf("double = boolean: c = (double)%f --> Compile Error\n", bool)
    }

    public static void testChar() {
        char e = 'a';
        char d = 'b';
        char c;

        System.out.println("\n************ Arithmetical Operators ************ ");

        // addition
        c = (char) (d + e);
        System.out.printf("%c + %c = %c\n", d, e, c);
        // subtraction
        c = (char) (d - e);
        System.out.printf("%c - %c = %c\n", d, e, c);
        // multiplication
        c = (char) (d * e);
        System.out.printf("%c * %c = %c\n", d, e, c);
        // division
        c = (char) (d / e);
        System.out.printf("%c / %c = %c\n", d, e, c);
        // modulus
        c = (char) (d % e);
        System.out.printf("%c %% %c = %c\n", d, e, c);

        d = 5;
        // unary minus
        c = (char) -d;
        System.out.printf("-%c = %c\n", d, c);
        // unary plus
        c = (char) +d;
        System.out.printf("-%c = %c\n", d, c);
        // prefix increment
        d = 5;
        System.out.printf("++%c = %c\n", d, ++d);
        // postfix increment
        d = 5;
        System.out.printf("%c++ = %c\n", d, d++);
        // prefix decrement
        d = 5;
        System.out.printf("--%c = %c\n", d, --d);
        // postfix decrement
        d = 5;
        System.out.printf("%c-- = %c\n", d, d--);

        System.out.println("\n************ Bitwise Operators ************ ");

        c = (char) (d & e); // bitwise AND
        System.out.printf("%c & %c = %c\n", d, e, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Character.toString(d), Character.toString(e), Character.toString(c));

        c = (char) (d | e); // bitwise OR
        System.out.printf("%c | %c = %c\n", d, e, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Character.toString(d), Character.toString(e), Character.toString(c));

        c = (char) (d ^ e); // bitwise XOR
        System.out.printf("%c ^ %c = %c\n", d, e, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Character.toString(d), Character.toString(e), Character.toString(c));

        c = (char) ~d; // bitwise bitwise unary compliment
        System.out.printf("~%c = %c\n", d, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Character.toString(d), Character.toString(c));

        c = (char) (d << 1); // left shift
        System.out.printf("%c << 1 = %c\n", d, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Character.toString(d), Character.toString(c));

        c = (char) (d >> 1); // right shift
        System.out.printf("%c >> 1 = %c\n", d, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Character.toString(d), Character.toString(c));

        d = 'b';
        c = (char) (d >> 1); // right shift
        System.out.printf("%c >> 1 = %c\n", d, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Character.toString(d), Character.toString(c));

        d = 'b';
        c = (char) (d >>> 1); // zero fill right shift
        System.out.printf("%c >>> 1 = %c\n", d, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Character.toString(d), Character.toString(c));

        System.out.println("\n***** Assignment Operators *****");

        c = 'H';
        System.out.printf("%c += %c --> c = %c\n", c, d, c += d);
        System.out.printf("%c -= %c --> c = %c\n", c, d, c -= d);
        System.out.printf("%c *= %c --> c = %c\n", c, d, c *= d);
        System.out.printf("%c /= %c --> c = %c\n", c, d, c /= d);
        System.out.printf("%c %%= %c --> c = %c\n", c, d, c %= d);

        c = 'H';
        System.out.printf("%c |= %c --> c = %c\n", c, d, c |= d);
        System.out.printf("%c &= %c --> c = %c\n", c, d, c &= d);
        System.out.printf("%c ^= %c --> c = %c\n", c, d, c ^= d);
        System.out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1);
        System.out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1);
        System.out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1);

        System.out.println("\n************ Relational Operators ************");

        // greater than
        System.out.printf("%c > %c --> %b\n", d, e, d > e);
        // greater than or equal to
        System.out.printf("%c >= %c --> %b\n", d, e, d >= e);
        // less than
        System.out.printf("%c < %c --> %b\n", d, e, d < e);
        // less than or equal to
        System.out.printf("%c <= %c --> %b\n", d, e, d <= e);
        // equal to
        System.out.printf("%c == %c --> %b\n", d, e, d == e);
        // not equal to
        System.out.printf("%c != %c --> %b\n", d, e, d != e);

        System.out.println("\n************ Logical Operations ************");

        // logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", d, e, d, (d > e) && (d > 0));

        // bitwise logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", d, e, d, (d > e) & (d > 0));

        // logical OR
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", d, e, e, (d >= e) || (e != 0));

        // bitwise logical OR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", d, e, e, (d >= e) | (e != 0));

        // logical XOR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", d, e, e, (d >= e) ^ (e != 0));

        // logical NOT
        System.out.printf("!(%c >= %c) --> %b\n", d, e, !(d >= e));

        System.out.println("\n************ Misc Operators ************");
        System.out.println("\nCondition Operator:");

        System.out.printf("%c > %c ? %c : %c --> %c\n", d, e, d, e, (d > e ? d : e));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double db = 123456789.625;
        boolean bool = true;

        c = (char) bt;
        System.out.printf("char = byte: c = (char)%d --> c = %c\n", bt, c);
        c = (char) sh;
        System.out.printf("char = short: c = (char)%d --> c = %c\n", sh, c);
        c = ch;
        System.out.printf("char = char: c = '%c' --> c = %c\n", ch, c);
        c = (char) l;
        System.out.printf("char = long: c = (char)%d --> c = %c\n", l, c);
        c = (char) f;
        System.out.printf("char = float: c = (char)%f --> c = %c\n", f, c);
        c = (char) db;
        System.out.printf("char = double: c = (char)%f --> c = %c\n", db, c);
        // c = (char)bool;
        //   System.out.printf("char = boolean: c = (char)%b --> Compile Error\n", bool)
    }

    public static void testBoolean() {
        boolean a = true;
        boolean b = false;
        boolean c;

        System.out.println("\n************ Arithmetical Operators ************ ");

//        // addition
//        c = a + b;
//        System.out.printf("%b + %b = %b\n", a, b, c);
//        // subtraction
//        c = a - b;
//        System.out.printf("%b - %b = %b\n", a, b, c);
//        // miltiplication
//        c = a * b;
//        System.out.printf("%b * %b = %b\n", a, b, c);
//        // division
//        c = a / b;
//        System.out.printf("%b / %b = %b\n", a, b, c);
//        // modulus
//        c = a % b;
//        System.out.printf("%b %% %b = %b\n", a, b, c);
//
//        a = 5;
//        // unary minus
//        c = -a;
//        System.out.printf("-%b = %b\n", a, c);
//        // unary plus
//        c = +a;
//        System.out.printf("-%b = %b\n", a, c);
//        // prefix increment
//        a = 5;
//        System.out.printf("++%b = %b\n", a, ++a);
//        // postfix increment
//        a = 5;
//        System.out.printf("%b++ = %b\n", a, a++);
//        // prefix decrement
//        a = 5;
//        System.out.printf("--%b = %b\n", a, --a);
//        // postfix decrement
//        a = 5;
//        System.out.printf("%b-- = %b\n", a, a--);

        System.out.println("\n************ Bitwise Operators ************ ");

        c = a & b; // bitwise AND
        System.out.printf("%b & %b = %b\n", a, b, c);
//        System.out.println("in binary form:");
//        System.out.printf("%b & %b = %b\n", Boolean.toBinaryString(a), Boolean.toBinaryString(b), Boolean.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("%b | %b = %b\n", a, b, c);
//        System.out.println("in binary form:");
//        System.out.printf("%b | %b = %b\n", Boolean.toBinaryString(a), Boolean.toBinaryString(b), Boolean.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
//        System.out.println("in binary form:");
//        System.out.printf("%b ^ %b = %b\n", Boolean.toBinaryString(a), Boolean.toBinaryString(b), Boolean.toBinaryString(c));

//        c = ~a; // bitwise bitwise unary compliment
//        System.out.printf("~%b = %b\n", a, c);
//        System.out.println("in binary form:");
//        System.out.printf("~%b = %b\n", Boolean.toBinaryString(a), Boolean.toBinaryString(c));

//        c = a << 1; // left shift
//        System.out.printf("%b << 1 = %b\n", a, c);
//        System.out.println("in binary form:");
//        System.out.printf("%b << 1 = %b\n", Boolean.toBinaryString(a), Boolean.toBinaryString(c));

//        c = a >> 1; // right shift
//        System.out.printf("%b >> 1 = %b\n", a, c);
//        System.out.println("in binary form:");
//        System.out.printf("%b >> 1 = %b\n", Boolean.toBinaryString(a), Boolean.toBinaryString(c));

//        a = -5;
//        c = a >> 1; // right shift
//        System.out.printf("%b >> 1 = %b\n", a, c);
//        System.out.println("in binary form:");
//        System.out.printf("%b >> 1 = %b\n", Boolean.toBinaryString(a), Boolean.toBinaryString(c));

//        a = 5;
//        c = a >>> 1; // zero fill right shift
//        System.out.printf("%d >>> 1 = %d\n", a, c);
//        System.out.println("in binary form:");
//        System.out.printf("%s >>> 1 = %s\n", Boolean.toBinaryString(a), Boolean.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

//        c = true;
//        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
//        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
//        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
//        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
//        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        c = true;
        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
//        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
//        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
//        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n************ Relational Operators ************");
//
//        // greater than
//        System.out.printf("%d > %d --> %b\n", a, b, a > b);
//        // greater than or equal to
//        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
//        // less than
//        System.out.printf("%d < %d --> %b\n", a, b, a < b);
//        // less than or equal to
//        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
//        // equal to
        System.out.printf("%b == %b --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);

        System.out.println("\n************ Logical Operations ************");
//
        // logical AND
        c = a && b;
        System.out.printf("%b && %b --> %b\n", a, b, c);

        // logical OR
        c = a || b;
        System.out.printf("%b || %b --> %b\n", a, b, c);

        // logical XOR
        c = a ^ b;
        System.out.printf("%b ^ %b --> %b\n", a, b, c);

        // logical NOT
        System.out.printf("!%b --> %b\n", a, !a);

        System.out.println("\n************ Misc Operators ************");
        System.out.println("\nCondition Operator:");

        System.out.printf("%b ? %b : %b --> %b\n", c, a, b, (c ? a : b));

        System.out.println("\nType Cast Operator:");
//
//        byte bt = 1;
//        short sh = -32000;
//        char ch = '\u0002';
//        long l = 100000000000000000L;
//        float f = 1.9f;
//        double d = 123456789.625;
        boolean bool = true;

//        c = (boolean) bt;
//        System.out.printf("boolean = byte: c = (boolean)%d --> Compile Error\n", bt, c);
//        c = (boolean) sh;
//        System.out.printf("boolean = short: c = (boolean)%d --> Compile Error\n", sh, c);
//        c = (boolean) ch;
//        System.out.printf("boolean = char: c = (boolean)'%c' --> Compile Error\n", ch, c);
//        c = (boolean) l;
//        System.out.printf("boolean = long: c = (boolean)%d --> Compile Error\n", l, c);
//        c = (boolean) f;
//        System.out.printf("boolean = float: c = (boolean)%f --> Compile Error\n", f, c);
//        c = (boolean) d;
//        System.out.printf("boolean = double: c = (boolean)%f --> Compile Error\n", d, c);
         c = bool;
           System.out.printf("boolean = boolean: c = %b --> \n", c);
    }

    public static void testString() {
        String s1 = "abc";
        String s2 = "def";
        String s3;

        System.out.println("\n************ Arithmetical Operators ************ ");

        // addition
        s3 = s1 + s2;
        System.out.printf("%s + %s = %s\n", s1, s2, s3);
//        // subtraction
//        // miltiplication
//        // division
//        // modulus

//        // unary minus
//        //unary plus
//        //prefix increment
//        // postfix increment
//        // prefix decrement
//        // postfix decrement

        System.out.println("\n************ Bitwise Operators ************ ");

//        s3 = s1 & s2; // bitwise AND
//        System.out.printf("%d & %d = %d\n", s1, s2, s3);
//
//        s3 = s1 | s2; // bitwise OR
//        System.out.printf("%d | %d = %d\n", s1, s2, s3);
//
//        s3 = s1 ^ s2; // bitwise XOR
//        System.out.printf("%d ^ %d = %d\n", s1, s2, s3);
//
//        s3 = ~s1; // bitwise bitwise unary compliment
//        System.out.printf("~%d = %d\n", s1, s3);
//
//        s3 = s1 << 1; // left shift
//        System.out.printf("%d << 1 = %d\n", s1, s3);
//
//        s3 = s1 >> 1; // right shift
//        System.out.printf("%d >> 1 = %d\n", s1, s3);
//
//        s3 = s1 >> 1; // right shift
//        System.out.printf("%d >> 1 = %d\n", s1, s3);
//
//        s3 = s1 >>> 1; // zero fill right shift
//        System.out.printf("%d >>> 1 = %d\n", s1, s3);

        System.out.println("\n***** Assignment Operators *****");

        s3 = "fdsfsd";
        System.out.printf("%s += %s --> c = %s\n", s3, s1, s3 += s1);
//        System.out.printf("%d -= %d --> c = %d\n", s3, s1, s3 -= s1);
//        System.out.printf("%d *= %d --> c = %d\n", s3, s1, s3 *= s1);
//        System.out.printf("%d /= %d --> c = %d\n", s3, s1, s3 /= s1);
//        System.out.printf("%d %%= %d --> c = %d\n", s3, s1, s3 %= s1);

//        s3 = "FDsfdsf";
//        System.out.printf("%d |= %d --> c = %d\n", s3, s1, s3 |= s1);
//        System.out.printf("%d &= %d --> c = %d\n", s3, s1, s3 &= s1);
//        System.out.printf("%d ^= %d --> c = %d\n", s3, s1, s3 ^= s1);
//        System.out.printf("%d >>= 1 --> c = %d\n", s3, s3 >>= 1);
//        System.out.printf("%d <<= 1 --> c = %d\n", s3, s3 <<= 1);
//        System.out.printf("%d >>>= 1 --> c = %d\n", s3, s3 >>>= 1);

        System.out.println("\n************ Relational Operators ************");

//        // greater than
//        System.out.printf("%d > %d --> %b\n", s1, s2, s1 > s2);
//        // greater than or equal to
//        System.out.printf("%d >= %d --> %b\n", s1, s2, s1 >= s2);
//        // less than
//        System.out.printf("%d < %d --> %b\n", s1, s2, s1 < s2);
//        // less than or equal to
//        System.out.printf("%d <= %d --> %b\n", s1, s2, s1 <= s2);
        // equal to
        System.out.printf("%s == %s --> %b\n", s1, s2, s1 == s2);
        // not equal to
        System.out.printf("%s != %s --> %b\n", s1, s2, s1 != s2);

        System.out.println("\n************ Logical Operations ************");

//        // logical AND
//        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", s1, s2, s1, s1 && s2);
//
//        // bitwise logical AND
//        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", s1, s2, s1, s2 & s2);
//
//        // logical OR
//        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", s1, s2, s2, s1 || s2);
//
//        // bitwise logical OR
//        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", s1, s2, s2, s1 | s2);
//
//        // logical XOR
//        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", s1, s2, s2, s1 ^ s2);
//
//        // logical NOT
//        System.out.printf("!(%d >= %d) --> %b\n", s1, s2, !(s1 >= s2));

        System.out.println("\n************ Misc Operators ************");

        System.out.printf("%s instanceof Object --> %b", s1, (s1 instanceof Object));

        System.out.println("\nCondition Operator:");

//        System.out.printf("%d > %d ? %d : %d --> %d\n", s1, s2, s1, s2, (s1 > s2 ? s1 : s2));

        System.out.println("\nType Cast Operator:");

//        byte bt = 1;
//        short sh = -32000;
//        char ch = '\u0002';
//        long l = 100000000000000000L;
//        float f = 1.9f;
//        double d = 123456789.625;
//        boolean bool = true;

//        s3 = (String) bt;
//        System.out.printf("String = byte: c = (String)%d --> Compile Error\n", bt, s3);
//        s3 = (String) sh;
//        System.out.printf("String = short: c = (String)%d --> Compile Error\n", sh, s3);
//        s3 = (String) ch;
//        System.out.printf("String = char: c = (String)'%c' --> Compile Error\n", ch, s3);
//        s3 = (String) l;
//        System.out.printf("String = long: c = (String)%d --> Compile Error\n", l, s3);
//        s3 = (String) f;
//        System.out.printf("String = float: c = (String)%f --> Compile Error\n", f, s3);
//        s3 = (String) d;
//        System.out.printf("String = double: c = (String)%f --> Compile Error\n", d, s3);
        // c = (String) bool;
        //   System.out.printf("String = boolean: c = (String)%b --> Compile Error\n", bool)


    }

    public static void testStudent() {
        Student student1 = new Student("Dmitri", 9);
        Student student2 = new Student("Kate", 10);
        Student student3;

        System.out.println("\n************ Arithmetical Operators ************ ");

//        // addition
//        student3 = student1 + student2;
//        System.out.printf("%d + %d = %d\n", student1, student2, student3);
//        // subtraction
//        student3 = student1 - student2;
//        System.out.printf("%d - %d = %d\n", student1, student2, student3);
//        // miltiplication
//        student3 = student1 * student2;
//        System.out.printf("%d * %d = %d\n", student1, student2, student3);
//        // division
//        student3 = student1 / student2;
//        System.out.printf("%d / %d = %d\n", student1, student2, student3);
//        // modulus
//        student3 = student1 % student2;
//        System.out.printf("%d %% %d = %d\n", student1, student2, student3);
//
//        student1 = 5;
//        // unary minus
//        student3 = -student1;
//        System.out.printf("-%d = %d\n", student1, student3);
//        // unary plus
//        student3 = +student1;
//        System.out.printf("-%d = %d\n", student1, student3);
//        // prefix increment
//        student1 = 5;
//        System.out.printf("++%d = %d\n", student1, ++student1);
//        // postfix increment
//        student1 = 5;
//        System.out.printf("%d++ = %d\n", student1, student1++);
//        // prefix decrement
//        student1 = 5;
//        System.out.printf("--%d = %d\n", student1, --student1);
//        // postfix decrement
//        student1 = 5;
//        System.out.printf("%d-- = %d\n", student1, student1--);

        System.out.println("\n************ Bitwise Operators ************ ");

//        student3 = student1 & student2; // bitwise AND
//        System.out.printf("%d & %d = %d\n", student1, student2, student3);
//        System.out.println("in binary form:");
//        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(student1), Integer.toBinaryString(student2), Integer.toBinaryString(student3));
//
//        student3 = student1 | student2; // bitwise OR
//        System.out.printf("%d | %d = %d\n", student1, student2, student3);
//        System.out.println("in binary form:");
//        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(student1), Integer.toBinaryString(student2), Integer.toBinaryString(student3));
//
//        student3 = student1 ^ student2; // bitwise XOR
//        System.out.printf("%d ^ %d = %d\n", student1, student2, student3);
//        System.out.println("in binary form:");
//        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(student1), Integer.toBinaryString(student2), Integer.toBinaryString(student3));
//
//        student3 = ~student1; // bitwise bitwise unary compliment
//        System.out.printf("~%d = %d\n", student1, student3);
//        System.out.println("in binary form:");
//        System.out.printf("~%s = %s\n", Integer.toBinaryString(student1), Integer.toBinaryString(student3));
//
//        student3 = student1 << 1; // left shift
//        System.out.printf("%d << 1 = %d\n", student1, student3);
//        System.out.println("in binary form:");
//        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(student1), Integer.toBinaryString(student3));
//
//        student3 = student1 >> 1; // right shift
//        System.out.printf("%d >> 1 = %d\n", student1, student3);
//        System.out.println("in binary form:");
//        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(student1), Integer.toBinaryString(student3));
//
//        student1 = -5;
//        student3 = student1 >> 1; // right shift
//        System.out.printf("%d >> 1 = %d\n", student1, student3);
//        System.out.println("in binary form:");
//        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(student1), Integer.toBinaryString(student3));
//
//        student1 = 5;
//        student3 = student1 >>> 1; // zero fill right shift
//        System.out.printf("%d >>> 1 = %d\n", student1, student3);
//        System.out.println("in binary form:");
//        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(student1), Integer.toBinaryString(student3));

        System.out.println("\n***** Assignment Operators *****");

//        student3 = 74;
//        System.out.printf("%d += %d --> c = %d\n", student3, student1, student3 += student1);
//        System.out.printf("%d -= %d --> c = %d\n", student3, student1, student3 -= student1);
//        System.out.printf("%d *= %d --> c = %d\n", student3, student1, student3 *= student1);
//        System.out.printf("%d /= %d --> c = %d\n", student3, student1, student3 /= student1);
//        System.out.printf("%d %%= %d --> c = %d\n", student3, student1, student3 %= student1);
//
//        student3 = 74;
//        System.out.printf("%d |= %d --> c = %d\n", student3, student1, student3 |= student1);
//        System.out.printf("%d &= %d --> c = %d\n", student3, student1, student3 &= student1);
//        System.out.printf("%d ^= %d --> c = %d\n", student3, student1, student3 ^= student1);
//        System.out.printf("%d >>= 1 --> c = %d\n", student3, student3 >>= 1);
//        System.out.printf("%d <<= 1 --> c = %d\n", student3, student3 <<= 1);
//        System.out.printf("%d >>>= 1 --> c = %d\n", student3, student3 >>>= 1);

        System.out.println("\n************ Relational Operators ************");

//        // greater than
//        System.out.printf("%d > %d --> %b\n", student1, student2, student1 > student2);
//        // greater than or equal to
//        System.out.printf("%d >= %d --> %b\n", student1, student2, student1 >= student2);
//        // less than
//        System.out.printf("%d < %d --> %b\n", student1, student2, student1 < student2);
//        // less than or equal to
//        System.out.printf("%d <= %d --> %b\n", student1, student2, student1 <= student2);
        // equal to
        System.out.printf("%s == %s --> %b\n", student1, student2, student1 == student2);
        // not equal to
        System.out.printf("%s != %s --> %b\n", student1, student2, student1 != student2);

        System.out.println("\n************ Logical Operations ************");

//        // logical AND
//        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", student1, student2, student1, (student1 > student2) && (student1 > 0));
//
//        // bitwise logical AND
//        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", student1, student2, student1, (student1 > student2) & (student1 > 0));
//
//        // logical OR
//        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", student1, student2, student2, (student1 >= student2) || (student2 != 0));
//
//        // bitwise logical OR
//        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", student1, student2, student2, (student1 >= student2) | (student2 != 0));
//
//        // logical XOR
//        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", student1, student2, student2, (student1 >= student2) ^ (student2 != 0));
//
//        // logical NOT
//        System.out.printf("!(%d >= %d) --> %b\n", student1, student2, !(student1 >= student2));

        System.out.println("\n************ Misc Operators ************");

        System.out.printf("%s instanceof Object --> %b", student1, (student1 instanceof Object));

        System.out.println("\nCondition Operator:");

//        System.out.printf("%d > %d ? %d : %d --> %d\n", student1, student2, student1, student2, (student1 > student2 ? student1 : student2));

        System.out.println("\nType Cast Operator:");

//        byte bt = 1;
//        short sh = -32000;
//        char ch = '\u0002';
//        long l = 100000000000000000L;
//        float f = 1.9f;
//        double d = 123456789.625;
//        boolean bool = true;
//
//        student3 = (task01.Student) bt;
//        System.out.printf(" (task01.Student) = byte: c =  (task01.Student)%d --> c = %d\n", bt, student3);
//        student3 = (task01.Student) sh;
//        System.out.printf(" (task01.Student) = short: c = (task01.Student) %d --> c = %d\n", sh, student3);
//        student3 = (task01.Student) ch;
//        System.out.printf(" (task01.Student) = char: c =  (task01.Student)'%c' --> c = %d\n", ch, student3);
//        student3 = (task01.Student) l;
//        System.out.printf(" (task01.Student) = long: c =  (task01.Student)%d --> c = %d\n", l, student3);
//        student3 = (task01.Student) f;
//        System.out.printf(" (task01.Student) = float: c =  (task01.Student)%f --> c = %d\n", f, student3);
//        student3 = (task01.Student) d;
//        System.out.printf(" (task01.Student) = double: c =  (task01.Student)%f --> c = %d\n", d, student3);
//        // c = (task01.Student) bool;
//        //   System.out.printf("task01.Student = boolean: c =  (task01.Student)%b --> Compile Error\n", bool)

    }

}
