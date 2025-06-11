class Statistics {
    private int averageLength;
    private int numberOfNumericChars;

    public Statistics(int averageLength, int numberOfNumericChars) {
        this.averageLength = averageLength;
        this.numberOfNumericChars = numberOfNumericChars;
    }

    public int getDigits() {
        return this.numberOfNumericChars;
    }
    
    public int getAverageLength() {
        return this.averageLength;
    }
}
