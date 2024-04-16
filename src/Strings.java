public class Strings {
  public static void main(String[] args) {
    // String s = "Hom nay la thu 3";
    // System.out.println(s);

    // // khai bao string buider class
    // StringBuilder str = new StringBuilder();
    // // append them cuoi chuoi
    // str.append("xin chao, ");
    // str.append("chung");
    // System.out.println(str);

    // // insert(vitri index, chuoi can chen)
    // str.insert(0, "hello");
    // System.out.println(str);

    // // delete(start, end)
    // str.delete(0, 5);
    // System.out.println(str);
    // // length
    // System.out.println(str.length());

    // // indexof: khong thay tra ve -1, thay tra ve index
    // String str = "hom nay la thu 4";
    // int foundIndex = str.indexOf("hom");
    // System.out.println(foundIndex);

    // // lastIndexof: khong thay tra ve -1, thay tra ve index
    // int foundLastIndex = str.lastIndexOf("nay");
    // System.out.println(foundLastIndex);
    // // contains => chua chuoi ky tu khong
    // boolean isExistString = str.contains("hom");
    // System.out.println(isExistString);
    // // sub tring => cat 1 chuoi tu chuoi me
    // String subString = str.substring(0, 4);
    // System.out.println(subString);

    // // replace
    // String replaceString = str.replace("hom nay", "to day");
    // System.out.println(str);
    // System.out.println(replaceString);

    // // startWith
    // boolean isStartWord = str.startsWith("hom");
    // System.out.println(isStartWord);

    // split
    String str = "Hello, Chung";
    String[] splitArr = str.split(", ");
    for (int i = 0; i < splitArr.length; i++) {
      System.out.println(splitArr[i]);
    }

    // toLowerCase
    System.out.println(str.toLowerCase());
    System.out.println(str);

    // toCharArray
    String text = "dadafafsfsfsfsf";
    char[] arrayChar = text.toCharArray();
    for (int i = 0; i < arrayChar.length; i++) {
      System.out.println(arrayChar[i]);
    }
  }
}
