class TaskException extends Exception {
    private String attribute;
    private String attributeValue;

    public TaskException(String attribute, String attributeValue) {
        super("A task's description must not be empty. A task's priority must be between 1 and 5 (inclusive)");
        this.attribute = attribute;
        this.attributeValue = attributeValue;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public String getAttributeValue() {
        return this.attributeValue;
    }
}
