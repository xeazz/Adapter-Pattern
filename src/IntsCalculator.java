public class IntsCalculator implements Ints {
    protected final Calculator calculator;

    public IntsCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int sum(int arg0, int arg1) {
        return (int) this.calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) this.calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        return (int) this.calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
