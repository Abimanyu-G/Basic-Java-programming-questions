class reversingWords{
    public static void main(String[] args) {
        String sentence = "I have brought freedom , justice";
        //String reversed = "";
        String words[] = sentence.split("\\s+");

        StringBuilder revBuild = new StringBuilder();

        for(int i = words.length -1; i>=0; i--){
           revBuild.append(words[i]);

           if(i>0){
            revBuild.append(" ");
           }
        }

        System.out.println(revBuild);
    }
}