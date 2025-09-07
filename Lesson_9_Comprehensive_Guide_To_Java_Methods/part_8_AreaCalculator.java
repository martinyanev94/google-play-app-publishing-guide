public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        float circleArea = calculateCircleArea(5f);
        Log.d("Area", "Area of the circle: " + circleArea);
        
        float rectangleArea = calculateRectangleArea(4f, 6f);
        Log.d("Area", "Area of the rectangle: " + rectangleArea);
    }

    private float calculateCircleArea(float radius) {
        return (float) (Math.PI * radius * radius);
    }

    private float calculateRectangleArea(float length, float width) {
        return length * width;
    }
}
