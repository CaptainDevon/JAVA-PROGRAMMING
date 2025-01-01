import java.util.*;

public class PdfViewer {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Integer>h=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            h.add(s.nextInt());
        }
        s.nextLine();
        String word=s.nextLine();
        System.out.println(designerPdfViewer(h, word));
        s.close();
    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        int max = h.get(word.charAt(0) - 'a');
        for (int i = 0; i < word.length(); i++) {
            if (max < h.get(word.charAt(i) - 'a'))
                max = h.get(word.charAt(i) - 'a');
        }
        return max * word.length();
    }
}
