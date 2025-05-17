🎓 Student Performance Prediction Form

A simple Python web application that collects student data through a form, predicts the student’s grade category using a trained machine learning model, and displays the predicted result.

✨ Features:
- 📝 Collects student details via a user-friendly web form
- 🤖 Uses a machine learning model to predict student grade category
- 📊 Displays the predicted grade class dynamically
- ✅ Validates input data before prediction
- 🔧 Easily extendable for different datasets or prediction targets

🛠️ Technologies Used:
- 🐍 Python – Backend logic and ML model integration
- 🌐 Flask – Lightweight web framework for building the form and displaying results
- 📚 scikit-learn – For building/training the prediction model (can be pre-trained)
- 🎨 HTML/CSS – Frontend form interface

🚀 Installation & Usage:
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/student-performance-prediction.git
   cd student-performance-prediction
   ```

2. Install required packages:
   ```bash
   pip install flask scikit-learn pandas numpy
   ```

3. Place your trained ML model file (model.pkl) in the project directory (or update the script to use your model).

4. Run the Flask app:
   ```bash
   python app.py
   ```

5. Open your browser and go to:
   ```bash
   http://127.0.0.1:5000/
   ```

6. Fill out the form with student data and submit to see the predicted grade class.

⚙️ How It Works:
- The app presents a form to enter student info such as gender, parental education, tutoring status, etc.
- Upon submission, the backend script preprocesses the data and feeds it to the ML model.
- The model outputs a predicted grade class (1, 2, 3, or 4).
- The prediction is shown on the result page dynamically.

📂 Project Structure:
```bash
📂student-performance-prediction/
├── app.py            # Flask app and prediction logic
├── model.pkl         # Pre-trained ML model file (pickle)
├── templates/
│   ├── index.html    # HTML form page
│   └── result.html   # Prediction result page
└── README.md         # Project documentation
```
