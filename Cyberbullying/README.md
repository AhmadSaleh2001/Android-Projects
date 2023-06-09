# Arabic Cyberbullying Classification Android Project

The "Arabic Cyberbullying Classification" project is an Android application developed using Java. Its main functionality is to allow users to send messages and predict whether the messages contain cyberbullying content or not.

![Screenrecorder-2023-06-09-14-05](https://github.com/AhmadSaleh2001/Android-Projects/assets/79485253/7d57c1a7-533f-45fb-a8e1-b7cde44075f6)

## Project Overview

The project consists of the following components:

1. **Android Application**: The Android application provides a user-friendly interface for users to input messages and receive the cyberbullying classification results.

2. **Python Model and FastAPI**: The project utilizes a machine learning model developed in Python for cyberbullying classification. The model employs the TF-IDF (Term Frequency-Inverse Document Frequency) scoring technique to assign weights to words in the text. It then utilizes the LinearSVM (Support Vector Machine) algorithm for training and classification. The model is saved as a pickled file. To integrate the model into the Android application, a FastAPI server is created on the local machine to expose an API endpoint for classification.

## Usage

To use the "Arabic Cyberbullying Classification" Android application, follow these steps:

1. Install the Android application on your device or emulator.

2. Launch the application.

3. Enter the message you want to classify in the provided input field.

4. Tap the "Check" button to send the message for classification.

5. The application will communicate with the FastAPI server running on the local machine to perform the cyberbullying classification.

6. The classification result will be displayed on the application's interface, indicating whether the message contains cyberbullying or not.

## Development

If you wish to contribute to the project or modify it, follow these steps to set up the development environment:

1. Open the project in Android Studio.

2. Build the project to resolve any dependencies.

3. Set up the Python environment on your local machine.

4. Install the necessary Python dependencies specified in the project's requirements.

5. Run the FastAPI server using the provided Python script.

6. Ensure that the Android application is configured to communicate with the correct API endpoint.

7. Make any desired modifications to the Android application or the machine learning model.

8. Build and run the modified application to test the changes.

## Acknowledgments

We would like to express our gratitude to the contributors and developers who have made this project possible. Additionally, we extend our thanks to Dr. May Zakarneh for her valuable guidance and support during the development of this Android project. We would also like to thank Dr. Eman Daragrameh for her supervision and guidance throughout the development of the machine learning model used in this project. Her expertise and support were invaluable in creating an effective model. We would also like to thank her for providing us with a high-quality dataset for training the model. Her contributions significantly contributed to the success of this project.
