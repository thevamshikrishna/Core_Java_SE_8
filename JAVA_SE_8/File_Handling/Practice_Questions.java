public class Practice_Questions {
    public static void main(String[] args) {
        System.out.println("1.\tWrite a program that reads a text file and counts the number of words, lines, and characters in the file. Then, output the count into a new text file.\n" +
                "2.\tWrite a program that copies the content of one file to another. Ensure that:\n" +
                "The source file should be read line-by-line.\n" +
                "The content of the source file should be copied into a new destination file.\n" +
                "The program must handle exceptions (e.g., file not found, I/O errors).\n" +
                "3.\tWrite a program that converts a CSV (Comma-Separated Values) file to a JSON file. The CSV file contains user information with columns such as \"ID\", \"Name\", \"Email\", and \"Age\". Each line represents a record of a user.\n" +
                "Requirements:\n" +
                "Read the CSV file line by line.\n" +
                "Convert each line into a JSON object, where each column is mapped to a key (e.g., id, name, email, age).\n" +
                "Write the JSON object into a new JSON file.\n" +
                "4.\tWrite a program that merges the contents of multiple text files into a single output file. Each input file may contain different content (e.g., multiple chapters of a book).\n" +
                "Requirements:\n" +
                "The program should accept the names of multiple input files and combine them into one output file.\n" +
                "Each file’s content should be separated by a newline in the output file.\n" +
                "Ensure that file reading and writing are done efficiently using buffered streams.\n" +
                "5.\tWrite a program that reads a text file, searches for a specified word, and replaces it with another word. The program should modify the content in the file with the new word and then save the changes back to the file.\n" +
                "Requirements:\n" +
                "The program should accept the filename, the word to find, and the word to replace as inputs.\n" +
                "Handle edge cases such as the word not being found or the file being empty.\n" +
                "The program must write the modified content back to the same file.\n" +
                "\n");
    }
}