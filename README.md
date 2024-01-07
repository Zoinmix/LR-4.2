# Лабораторна робота №4.2

## Функціональність програми

**У далекій галактиці існують повідомлення, зашифровані в дивних шаблонах, які потребують декодування. Вам було доручено написати програму на Java, яка розшифровує ці повідомлення.**

**Зашифроване повідомлення складається зі слів, розділених розділювачами, і кожне слово може бути закодовано різними методами. Ваша програма повинна виявляти метод кодування та декодувати відповідно.**

### Методи кодування:

1. **Кодування заміни голосних**: усі голосні (a, e, i, o, u) замінюються на числа: a=1, e=2, i=3, o=4, u=5. Наприклад, "t2st3ng" повинно бути "testing".
2. **Кодування заміни приголосних**: всі приголосні замінюються на наступний приголосний в послідовності. Наприклад, "ufttjoh" повинно бути "testing".

### Вимоги:

1. Створіть клас Java [Decoder] зі статичними методами для кожного типу кодування.
2. Використовуйте регулярні вирази, щоб визначити, який метод кодування було застосовано до кожного слова. 
3. Використовуйте `StringBuilder` для ефективних маніпуляцій з рядками.
4. Створіть функцію [main] для демонстрації вашого декодера з прикладами зашифрованих повідомлень. 

> Примітка: Це рішення припускає, що методи кодування не перетинаються. У реальному світі може знадобитися додаткові методи для визначення типу кодування з більшою точністю.

## Опис роботи

- Створити клас [Decoder]
- Додати функціональність:
  - Метод для декодування заміни голосних
  - Метод для декодування заміни приголосних
- Написати [тести]
- Написати загальну функцію `decode()`, яка буде виявляти метод кодування та декодуватиме повідомлення
- Написати `main()`

## Висновок

**Під час виконання лабораторної роботи я покращив навички маніпулювання рядками Java, навчився використовувати `StringBuilder` та регулярні вирази.**

[Decoder]: Decoder.java
[main]: Main.java
[тести]: ../../../../../test/java/lab4_2/DecoderTests.java