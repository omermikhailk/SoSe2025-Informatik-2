class StatisticsApplication {
    static Statistics collectStatistics(String... inputs) {
        // We need to find out the number of numeric characters
        // And then the average length of all strings (regardless of what characters were in there)
        
        int numberOfChars = 0;
        int numberOfNumericChars = 0;
        int averageLength = 0;

        if (inputs == null || inputs.length == 0) {
            return new Statistics(averageLength, numberOfNumericChars);
        }
        else {
            for (String s : inputs) {
                numberOfChars += s.length();

                for (Character c : s.toCharArray()) {
                    if (Character.isDigit(c)) {
                        numberOfNumericChars += 1;
                    }
                }
            }

            averageLength = numberOfChars / inputs.length;
            // Hier koennte man auch nach = (double) machen aber mMn ergibt das keinen Sinn
            // ein Teil von einem Buchstabe in den Ergebnissen zu zaehlen

            return new Statistics(averageLength, numberOfNumericChars);
        }
    }

    public static void main(String[] args) {
        String[] testOne = {};
        String testOneRepr = String.join(" \" , \"", testOne);
        String[] testTwo = {"hello", "hello", "12345"};
        String testTwoRepr = String.join(" \" , \"", testTwo);
        String[] testThree = {"Doing", "my", "homework", "!"};
        String testThreeRepr = String.join(" \" , \"", testThree);

        Statistics one = collectStatistics(testOne);
        Statistics two = collectStatistics(testTwo);
        Statistics three = collectStatistics(testThree);

        System.out.println("collectStatistics(\"" + testOneRepr + "\")");
        System.out.println("average length: " + one.getAverageLength());
        System.out.println("digits: " + one.getDigits());

        System.out.println("collectStatistics(\"" + testTwoRepr + "\")");
        System.out.println("average length: " + two.getAverageLength());
        System.out.println("digits: " + two.getDigits());

        System.out.println("collectStatistics(\"" + testThreeRepr + "\")");
        System.out.println("average length: " + three.getAverageLength());
        System.out.println("digits: " + three.getDigits());
    }
}
