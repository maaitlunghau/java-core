package primitive_types;

public class PrimitiveTypes {

    // TYPES OF PRIMITIVE DATA TYPES IN JAVA
    // 1. byte (1 byte)
    byte a = 10;

    // 2. short (2 bytes)
    short b = 100;

    // 3. int (4 bytes)
    int c = 1_000;

    // 4. long (8 bytes)
    long d = 10_000L;

    // 5. float (4 bytes)
    float e = 1.5f;

    // 6. double (8 bytes)
    double f = 1.5;

    // 7. char (2 bytes)
    char g = 'Y';

    // 8. boolean (dependency JVM)
    boolean h = true;

    // Trong Java, var chỉ được phép khai báo dưới dạng biến cục bộ (local
    // variable),
    // không được dùng để khai báo như một thành viên (field) trong class.
    // var year = 2026; // ❌ 'var' is now allowed here.

    public static void main(String[] args) {
        var age = 20; // ✅ Valid (local variable)
        System.out.println("age: " + age);

        // Underscores (_) make numbers easier to read.
        int number = 1_000_000;
        System.out.println("number: " + number); // 1000000

        // ------------------------------
        // Overflow (Tràn giá trị)
        // ------------------------------
        byte numb = (byte) 128;
        System.out.println("numb: " + numb); // -128
        // Vì byte chỉ lưu giá trị từ -128 đến 127
        // nên khi ép kiểu 128
        // kết quả bị tràn và trở thành -128.
        // => Ép kiểu ko đảm bảo được dữ liệu luôn được giữ nguyên.

        // --------------------------------------------
        // Wrapper Classes, Autoboxing, Unboxing
        //
        // - Autoboxing: Tự động chuyển Primitive thành Wrapper Object
        // - Unboxing: Tự động chuyển Wrapper Object thành Primitive
        // --------------------------------------------
        // Autoboxing: primitive -> wrapper object
        Integer number2 = 10;
        System.out.println("number2: " + number2 + " (" + number2.getClass().getSimpleName() + ")");

        // Unboxing: wrapper object -> primitive
        int result = number2;
        System.out.println("result: " + result);

        // --------------------------------------------
        // Widening Conversion (Automatic)
        //
        // - Chuyển đổi từ kiểu dữ liệu nhỏ sang kiểu có phạm vi lớn hơn,
        // không cần casting.
        // --------------------------------------------
        int small = 100;
        long big = small;
        double decimal = big;

        System.out.println("big: " + big); // 100
        System.out.println("decimal: " + decimal); // 100.0

        // --------------------------------------------
        // Narrowing Conversion (Manual Casting)
        //
        // - Chuyển đổi sang kiểu nhỏ hơn, thường cần
        // casting và có thể mất dữ liệu
        // --------------------------------------------
        double price = 19.99;
        int roundedPrice = (int) price;

        System.out.println("roundedPrice: " + roundedPrice); // 19 (decimal part is removed, not rounded)
    }
}
