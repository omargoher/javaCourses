### byte

The `byte` data type is an 8-bit (-128 → 127 )

• Its default value is 0 .

---

### short

The `short` data type is an 16-bit (-32,768 → 32,767)

• Its default value is 0 .

---

### int

The `int` data type is an 32-bit (-2<sup>31</sup> → 2<sup>31</sup>-1) 

• Its default value is 0 .

---

### long

The `long` data type is an 64-bit (-2<sup>63</sup> → 2<sup>63</sup>-1) 

• Its default value is 0L.

Note that you should end the value with a "L"

---

### float

The `float` data type is a Stores fractional numbers.

• 32-bit — Sufficient for storing decimal digits.

• Its default value is 0.0f.

• Its default size is 4 byte.

• It is not a good approach to use float for precise values, such as currency.

• A floating point number can also be a scientific number with an "e" or ”E”to indicate the power of 10:

Note that you should end the value with a "f"

---

### double

The `double` data type is a Stores fractional numbers.

• 64-bit — Sufficient for storing 15 decimal digits.

• It is not a good approach to use double for precise values, such as currency.

• Its default value is 0.0d.

• A floating point number can also be a scientific number with an "e"or”E” to indicate the power of 10:

Note that you should end the value with a "d"

---

### char

The `char` data type is a single 16-bit Unicode character.

• `'\u0000'` (or 0) → `'\uffff'` (or 65,535 inclusive).

• Its default value is ‘\u0000’ .

---

### Boolean

The `boolean` data type has only two possible values: `true` and `false`. 

Use this data type for simple flags that track true/false conditions. 

This data type represents `one bit` of information, but its "size" isn't something that's precisely defined.

• Its default value is false.

---

## Note

Local variables are slightly different; the compiler never assigns a default value to an uninitialized local variable. If you cannot initialize your local variable where it is declared, make sure to assign it a value before you attempt to use it. Accessing an uninitialized local variable will result in a compile-time error.

---

## How to create Binary/Hex number

The prefix `0x` indicates hexadecimal and `0b` indicates binary:

```java
// The number 26, in decimal
int decVal = 26;
//  The number 26, in hexadecimal
int hexVal = 0x1a;
// The number 26, in binary
int binVal = 0b11010;
```

---

## special escape sequences

`\b` (backspace), `\t` (tab), `\n` (line feed), `\f` (form feed), `\r` (carriage return), `\"` (double quote), `\'` (single quote), and `\\` (backslash).

---

****Using Underscore Characters in Numeric Literals****

(`_`) can appear anywhere between digits in a numerical literal. This feature enables you, for example. to separate groups of digits in numeric literals, which can improve the readability of your code.

```java
long creditCardNumber = 1234_5678_9012_3456L;
long socialSecurityNumber = 999_99_9999L;
float pi =  3.14_15F;
long hexBytes = 0xFF_EC_DE_5E;
long hexWords = 0xCAFE_BABE;
long maxLong = 0x7fff_ffff_ffff_ffffL;
byte nybbles = 0b0010_0101;
long bytes = 0b11010010_01101001_10010100_10010010;
```

Note

You can place underscores only between digits; you cannot place underscores in the following places:

- At the beginning or end of a number
- Adjacent to a decimal point in a floating point literal
- Prior to an `F` or `L` suffix
- In positions where a string of digits is expected
