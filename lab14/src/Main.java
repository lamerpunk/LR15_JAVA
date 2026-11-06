import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n================ МЕНЮ ЛАБОРАТОРНОЙ № 14 ================");
            System.out.println("1 - Задание 1 (Информация о файле и любимой книге)");
            System.out.println("2 - Задание 2 (10 чисел в файл f, произведение)");
            System.out.println("3 - Задание 3 (Разделение чисел: двузначные в g, остальные в h)");
            System.out.println("4 - Задание 4 (14 значений температуры, средняя)");
            System.out.println("5 - Задание 5 (10 чисел в файл f, подсчет кратных 5)");
            System.out.println("0 - Выход");
            System.out.print("Выберите номер задания: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- ЗАДАНИЕ 1 ---");
                    File bookFile = new File("book_info.txt");

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(bookFile))) {
                        writer.write("Название: Мастер и Маргарита\n");
                        writer.write("Автор: Михаил Афанасьевич Булгаков\n");
                        writer.write("Жанр: Роман, мистика, сатира\n");
                        writer.write("Год первой публикации: 1967\n");
                    } catch (IOException e) {
                        System.err.println("Ошибка записи файла: " + e.getMessage());
                    }

                    System.out.println("Данные о файле:");
                    System.out.println("Имя файла: " + bookFile.getName());
                    System.out.println("Абсолютный путь: " + bookFile.getAbsolutePath());
                    System.out.println("Размер: " + bookFile.length() + " байт");
                    System.out.println("Доступен для чтения: " + (bookFile.canRead() ? "Да" : "Нет"));
                    System.out.println("Доступен для записи: " + (bookFile.canWrite() ? "Да" : "Нет"));
                    System.out.println("Дата изменения: " + new Date(bookFile.lastModified()));

                    System.out.println("\nСодержимое файла книги:");
                    try (BufferedReader reader = new BufferedReader(new FileReader(bookFile))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        System.err.println("Ошибка чтения файла: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("\n--- ЗАДАНИЕ 2 ---");
                    File fileF2 = new File("task2_f.txt");

                    System.out.println("Введите 10 целых чисел с клавиатуры:");
                    try (PrintWriter pw = new PrintWriter(new FileWriter(fileF2))) {
                        for (int i = 0; i < 10; i++) {
                            int val = scanner.nextInt();
                            pw.println(val);
                        }
                    } catch (IOException e) {
                        System.err.println("Ошибка записи в файл f: " + e.getMessage());
                    }

                    System.out.print("Числа из файла task2_f.txt: ");
                    long product = 1;
                    try (Scanner fileScan = new Scanner(fileF2)) {
                        while (fileScan.hasNextInt()) {
                            int num = fileScan.nextInt();
                            System.out.print(num + " ");
                            product *= num;
                        }
                        System.out.println();
                    } catch (IOException e) {
                        System.err.println("Ошибка чтения файла f: " + e.getMessage());
                    }
                    System.out.println("Произведение всех чисел: " + product);
                    break;

                case 3:
                    System.out.println("\n--- ЗАДАНИЕ 3 ---");
                    File fileF3 = new File("task3_f.txt");
                    File fileG3 = new File("task3_g.txt");
                    File fileH3 = new File("task3_h.txt");

                    Random random = new Random();
                    try (PrintWriter pw = new PrintWriter(new FileWriter(fileF3))) {
                        for (int i = 0; i < 15; i++) {
                            pw.println(random.nextInt(200) - 50);
                        }
                    } catch (IOException e) {
                        System.err.println("Ошибка генерации случайных чисел: " + e.getMessage());
                    }

                    try (Scanner srcScanner = new Scanner(fileF3);
                         PrintWriter writerG = new PrintWriter(new FileWriter(fileG3));
                         PrintWriter writerH = new PrintWriter(new FileWriter(fileH3))) {

                        while (srcScanner.hasNextInt()) {
                            int val = srcScanner.nextInt();
                            int abs = Math.abs(val);
                            if (abs >= 10 && abs <= 99) {
                                writerG.println(val);
                            } else {
                                writerH.println(val);
                            }
                        }
                    } catch (IOException e) {
                        System.err.println("Ошибка распределения по файлам: " + e.getMessage());
                    }

                    System.out.println("Файлы task3_f.txt, task3_g.txt (двузначные) и task3_h.txt (остальные) успешно записаны.");
                    break;

                case 4:
                    System.out.println("\n--- ЗАДАНИЕ 4 ---");
                    File tempFile = new File("temperatures.txt");

                    System.out.println("Введите 14 вещественных значений температуры (например, 36.6):");
                    try (PrintWriter pw = new PrintWriter(new FileWriter(tempFile))) {
                        for (int i = 0; i < 14; i++) {
                            double t = scanner.nextDouble();
                            pw.println(t);
                        }
                    } catch (IOException e) {
                        System.err.println("Ошибка записи температур: " + e.getMessage());
                    }

                    double tempSum = 0.0;
                    int tempCount = 0;
                    try (Scanner tempScan = new Scanner(tempFile)) {
                        while (tempScan.hasNextDouble()) {
                            tempSum += tempScan.nextDouble();
                            tempCount++;
                        }
                    } catch (IOException e) {
                        System.err.println("Ошибка чтения температур: " + e.getMessage());
                    }

                    double avgTemp = (tempCount > 0) ? (tempSum / tempCount) : 0.0;
                    System.out.printf("Средняя температура пациента: %.2f°C%n", avgTemp);
                    break;

                case 5:
                    System.out.println("\n--- ЗАДАНИЕ 5 ---");
                    File fileF5 = new File("task5_f.txt");

                    try (PrintWriter pw = new PrintWriter(new FileWriter(fileF5))) {
                        for (int i = 1; i <= 10; i++) {
                            pw.println(i * 3);
                        }
                    } catch (IOException e) {
                        System.err.println("Ошибка записи файла f: " + e.getMessage());
                    }

                    int countDiv5 = 0;
                    System.out.print("Числа из файла task5_f.txt: ");
                    try (Scanner scan5 = new Scanner(fileF5)) {
                        while (scan5.hasNextInt()) {
                            int n = scan5.nextInt();
                            System.out.print(n + " ");
                            if (n % 5 == 0) {
                                countDiv5++;
                            }
                        }
                        System.out.println();
                    } catch (IOException e) {
                        System.err.println("Ошибка чтения файла f: " + e.getMessage());
                    }
                    System.out.println("Количество чисел, кратных 5: " + countDiv5);
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный номер задания! Введите число от 0 до 5.");
                    break;
            }
        }
    }
}