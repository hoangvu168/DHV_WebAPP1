package com.example.dhv_webapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class QuadraticSolverActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solver);

        EditText inputA = findViewById(R.id.inputA);
        EditText inputB = findViewById(R.id.inputB);
        EditText inputC = findViewById(R.id.inputC);
        Button btnSolve = findViewById(R.id.btnSolve);
        TextView resultView = findViewById(R.id.resultView);

        btnSolve.setOnClickListener(v -> {
            try {
                double a = Double.parseDouble(inputA.getText().toString());
                double b = Double.parseDouble(inputB.getText().toString());
                double c = Double.parseDouble(inputC.getText().toString());

                if (a == 0) {
                    if (b == 0) {
                        resultView.setText(c == 0 ? "Phương trình có vô số nghiệm" : "Phương trình vô nghiệm");
                    } else {
                        double x = -c / b;
                        resultView.setText("Nghiệm của phương trình: x = " + x);
                    }
                } else {
                    double delta = b * b - 4 * a * c;
                    String result;
                    if (delta > 0) {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        result = "Phương trình có 2 nghiệm:\n x1 = " + x1 + "\n x2 = " + x2;
                    } else if (delta == 0) {
                        double x = -b / (2 * a);
                        result = "Phương trình có nghiệm kép: x = " + x;
                    } else {
                        double realPart = -b / (2 * a);
                        double imaginaryPart = Math.sqrt(-delta) / (2 * a);
                        result = "Phương trình có nghiệm phức:\n x1 = " + realPart + " + " + imaginaryPart + "i" +
                                "\n x2 = " + realPart + " - " + imaginaryPart + "i";
                    }
                    resultView.setText(result);
                }
            } catch (NumberFormatException e) {
                resultView.setText("Vui lòng nhập số hợp lệ!");
            }
        });
    }
}
