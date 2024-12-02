package compiler_modules.lexer;

public class IntToken extends Token {
    public final int value;

    public IntToken(int value) {
        super(Tag.INT_VALUE);
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }
}
