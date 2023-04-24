package dir;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    private static final InputFileParser inputFileParser = new InputFileParser();
    private static final EntryNumberExtractor extractor = new EntryNumberExtractor();
    private static final String FILENAME = "/Users/ayanamy/javva/src/dir/file.txt";

    public static void main(String... args)
    {
        List<Entry> entries = inputFileParser.parse(FILENAME);
        List<Integer> extractedIntegers = extractor.extract(entries);
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(extractedIntegers);
        System.out.println(list);



        System.out.println("მთელი რიცხვები: ");
        prettyPrintListItems(extractedIntegers);
        System.out.println("მასივის ჯამი: ");
        int sum = extractedIntegers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

    private static <T> void prettyPrintListItems(List<T> list)
    {
        
        for (T item : list)
        {
            System.out.println(item);
        }
    }
}