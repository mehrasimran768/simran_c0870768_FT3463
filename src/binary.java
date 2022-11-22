public class binary extends arithmeticExp{

        arithmeticExp left;
        arithmeticExp right;

        public binary(arithmeticExp newLeft, arithmeticExp newRight){
            left = newLeft;
            right = newRight;
        }

        @Override
        public String evaluate() {
            return "";
        }
    }

