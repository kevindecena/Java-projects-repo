class TextInput {
    private StringBuilder value;

    public TextInput() {
        this.value = new StringBuilder();
    }

    public void add(char c) {
        value.append(c);
    }

    public String getValue() {
        return value.toString();
    }
}

class NumericInput extends TextInput {
    @Override
    public void add(char c) {
        if (Character.isDigit(c)) {
            super.add(c);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
