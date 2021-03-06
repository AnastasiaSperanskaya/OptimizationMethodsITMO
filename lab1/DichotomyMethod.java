package lab1;
import java.text.NumberFormat;
import java.util.Locale;

import static java.lang.Math.abs;

public class DichotomyMethod {
    public static void dichotomyMethod(Function f, float a, float b, float eps) {
        float delta = eps / 3;
        float x1, x2, middle, x = 0;
        int iter = 0;
        while (b - a > eps) {
            iter++;
            System.out.println(iter + "th interval: " + a + " , " + b);
            middle = (a+b)/2;
            x = middle;
            x1 = middle - delta;
            x2 = middle + delta;
            //System.out.println("Calculated middle point: " + x);
            //System.out.println("Calculated function value: " + f.execute(x));
            System.out.println("Calculated points are: " + x1 + " , " + x2);
            System.out.println("Calculated function values are: " + f.execute(x1) + " , " + f.execute(x2));
            if (f.execute(x1) < f.execute(x2)) b = x2;
            else a = x1;
        }
        System.out.println("next interval could be: [" + a + " ; " + b + "]");
        System.out.println("x = " + x + " f(x) = " + f.execute(x));
        System.out.println("Iterations made: " + iter);
    }

    public static void dichotomyMethodPart2(Function f, float a, float b, float eps) {
        NumberFormat nf2 = NumberFormat.getInstance(new Locale("sk", "SK"));
        nf2.setMaximumFractionDigits(10);
        float delta = eps / 3;
        float x1, x2, middle, x = 0;
        int iter = 0;
        while (b - a > eps) {
            iter++;
            middle = (a+b)/2;
            x = middle;
            x1 = middle - delta;
            x2 = middle + delta;
            if (f.execute(x1) < f.execute(x2)) b = x2;
            else a = x1;
        }
        System.out.println("Function called: " + iter*2 + " Accuracy: " + nf2.format(eps));
    }

    public static void main(String[] args) {
        Function func1 = Functions.action(1);
        Function func2 = Functions.action(2);
        Function func3 = Functions.action(3);
        Function func4 = Functions.action(4);
        Function func5 = Functions.action(5);
        Function f_cos = Functions.action(6);
        Function f_pol5 = Functions.action(7);

        //unimodal function (cosine) investigation on three intervals
//        System.out.println("Cosine function results on interval [-10;10]:");
//        dichotomyMethod(f_cos, -10, 10, 0.1f);
//        System.out.println();
//        System.out.println("Cosine function results on interval [-7;4]:");
//        dichotomyMethod(f_cos, -7, 4, 0.1f);
//        System.out.println();
//        System.out.println("Cosine function resultson interval [-5;3]:");
//        dichotomyMethod(f_cos, -5, 3, 0.1f);
//        System.out.println();

        //unimodal function (polinom 5th power) investigation on three intervals
        System.out.println("Polinom function results on interval [-1;3]:");
        dichotomyMethod(f_pol5, -1, 3, 0.1f);
        System.out.println();
        System.out.println("Polinom function results on interval [-0.8;1]:");
        dichotomyMethod(f_pol5, -0.8f, 1, 0.1f);
        System.out.println();
        System.out.println("Polinom function resultson interval [-2;4]:");
        dichotomyMethod(f_pol5, -2, 4, 0.1f);
        System.out.println();
        System.out.println("Polinom function resultson interval [-10;10]:");
        dichotomyMethod(f_pol5, -10, 10, 0.1f);
        System.out.println();

        //outputting results of function calls with different accuracy
//        dichotomyMethodPart2(func1, -0.5f, 0.5f, 0.1f);
//        dichotomyMethodPart2(func1, -0.5f, 0.5f, 0.05f);
//        dichotomyMethodPart2(func1, -0.5f, 0.5f, 0.03f);
//        dichotomyMethodPart2(func1, -0.5f, 0.5f, 0.01f);
//        dichotomyMethodPart2(func1, -0.5f, 0.5f, 0.001f);
//        dichotomyMethodPart2(func1, -0.5f, 0.5f, 0.0005f);
//        dichotomyMethodPart2(func1, -0.5f, 0.5f, 0.00005f);
//        dichotomyMethodPart2(func1, -0.5f, 0.5f, 0.000001f);
//        dichotomyMethodPart2(func1, -0.5f, 0.5f, 0.0000001f);
//        dichotomyMethodPart2(func1, -0.5f, 0.5f, 0.00000001f);
//        dichotomyMethodPart2(func1, -0.5f, 0.5f, 0.000000001f);
//        dichotomyMethodPart2(func1, -0.5f, 0.5f, 0.0000000001f);

        //first task - 5 different unimodal functions investigation
//        System.out.println("First function results:");
//        dichotomyMethod(func1, -0.5f, 0.5f, 0.1f);
//        System.out.println();
//        System.out.println("Second function results:");
//        dichotomyMethod(func2, 6f, 9.9f, 0.1f);
//        System.out.println();
//        System.out.println("Third function results:");
//        dichotomyMethod(func3, 0f, (float) (2 * Math.PI), 0.1f);
//        System.out.println();
//        System.out.println("Fourth function results:");
//        dichotomyMethod(func4, 0f, 1f, 0.1f);
//        System.out.println();
//        System.out.println("Fifth function results:");
//        dichotomyMethod(func5, 0.5f, 2.5f, 0.1f);
    }
}
