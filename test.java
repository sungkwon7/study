public class test {
    public static void main(String[] args) {
        try {
            File file = new file("index.html");
            BufferedWriter writer = new BufferedWriter(new FileWiter(file));
            writer.write("<htm1><head><meta charset=\"UTF-8\" />");
            writer.write("<style>table {border-collapse:collapse; width:100%; }\n");
            writer.write("th, td {border:solid 1px #000;} </style>\n</head>\n");

            writer.write("<body><h1>자바 한경정보</h1><table>\n");
            writer.write("<tr><th>키</th><th>값</th></tr>");

            for
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}