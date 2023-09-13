# Songr Web Application

A simple web application built with Spring Boot and Gradle for managing and displaying albums.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 8 or later installed.
- A web browser for accessing the application.

## Getting Started

To run this application locally, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/songr.git
   ```

2. Navigate to the project directory:

   ```bash
   cd songr
   ```

3. Build the application using Gradle:

   ```bash
   ./gradlew build
   ```

4. Start the Spring Boot application:

   ```bash
   ./gradlew bootRun
   ```

5. Open a web browser and navigate to [http://localhost:8080/](http://localhost:8080/) to access the Songr application.


## My routs 
1. `/hello` route that says hello to the world or to a name that you insert.
2. `/capitalize` route that capitalize any word you insert.
3. `/albums` route that will see a list of albums displayed with their titles, artists, song counts, lengths, and image.


## Customization

- To add, update, or remove albums, you can modify the controller in `src/main/java/com/yourpackage/controller/AlbumController.java`.
- Customize the HTML templates in the `src/main/resources/templates` directory to change the look and feel of your application.
- Styling can be adjusted by modifying the CSS in `src/main/resources/static`.
