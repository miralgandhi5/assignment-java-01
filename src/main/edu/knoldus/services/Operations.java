package main.edu.knoldus.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


import static java.util.stream.Collectors.counting;

public class Operations {

  private static Boolean isPrime(Integer x) {

    if ((x == 1) || (x == 0))
      return false;
    else {
      for (int i = 1; i <= (x / 2); i++) {
        if ((x % i) == 0)
          return false;
      }
      return true;
    }

  }

  public static List<Integer> getPrimeNumbers(List<Integer> numbers) {
    return numbers.stream().filter(Operations::isPrime).collect(Collectors.toList());
  }

  public static Map<String,Integer> wordCount(String str){
    return Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.collectingAndThen(counting(),Long::intValue)));
  }

  public static Map<String,Integer> wordCountFromFile(String path) {
    File file = new File(path);
    List<String> words = new ArrayList<>();

    if(file.exists()) {
      try (Scanner scanner = new Scanner(file)) {
        while (scanner.hasNext()) {
          words.add(scanner.next());
        }

      } catch (FileNotFoundException ex) {
        System.out.println(ex.getMessage());
      }



      return words.stream().collect(Collectors.groupingBy(Function.identity(),
          Collectors.collectingAndThen(counting(), Long::intValue)));
    }
    else{
      return new HashMap<String, Integer>();
    }
  }

  public static List<Integer> multiplyLists(List<Integer> inputListOne,List<Integer> inputListTwo) {
    return IntStream.range(0,inputListOne.size() > inputListTwo.size() ? inputListTwo.size() : inputListTwo.size()).map( value -> inputListOne.get(value) * inputListTwo.get(value)).boxed().collect(Collectors.toList());
  }

}
