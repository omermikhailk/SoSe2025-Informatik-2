class StatisticsApplication {
    static Statistics collectStatistics(String... inputs) {
        // We need to find out the number of alphabetic characters
        // And then the average length of all strings (regardless of what characters were in there)
        
        int numberOfChars = 0;
        int numberOfAlphabeticChars = 0;
        int averageLength = 0;

        if (inputs == null || inputs.length == 0) {
            return new Statistics(averageLength, numberOfAlphabeticChars);
        }
        else {
            for (String s : inputs) {
                numberOfChars += s.length();

                for (Character c : s.toCharArray()) {
                    if (Character.isLetter(c)) {
                        numberOfAlphabeticChars += 1;
                    }
                }
            }

            averageLength = numberOfChars / inputs.length;
            // Hier koennte man auch nach = (double) machen aber mMn ergibt das keinen Sinn
            // ein Teil von einem Buchstabe in den Ergebnissen zu zaehlen

            return new Statistics(averageLength, numberOfAlphabeticChars);
        }
    }
}
