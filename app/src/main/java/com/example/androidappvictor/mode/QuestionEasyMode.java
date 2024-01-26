package com.example.androidappvictor.mode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionEasyMode {

    private static final QuestionData[] questionsData = {
            new QuestionData("What is the capital city of France?", new String[]{"Moscow", "Berlin", "London", "Paris"}, "Paris"),
            new QuestionData("Who wrote the play <Romeo and Juliet>?", new String[]{"John Steinbeck", "F. Scott Fitzgerald", "Charles Dickens", "William Shakespeare"}, "William Shakespeare"),
            new QuestionData("What is the largest planet in our solar system?", new String[]{"Earth", "Saturn", "Mars", "Jupiter"}, "Jupiter"),
            new QuestionData("Who is known as the inventor of the telephone?", new String[]{"Thomas Edison", "Nikola Tesla", "Galileo Galilei", "Alexander Graham Bell"}, "Alexander Graham Bell"),
            new QuestionData("Which continent is known as the <Land Down Under>?", new String[]{"Brazil", "India", "Canada", "Australia"}, "Australia"),
            new QuestionData("What is the largest mammal in the world?", new String[]{"Elephant", "Giraffe", "Blue whale", "Polar bear"}, "Blue whale"),
            new QuestionData("Which gas do plants absorb from the atmosphere during photosynthesis?", new String[]{"Oxygen (O2)", "Carbon monoxide (CO)", "Nitrogen (N2)", "Carbon dioxide (CO2)"}, "Carbon dioxide (CO2)"),
            new QuestionData("What is the currency of Japan?", new String[]{"Euro (€)", "Japanese Yen (¥)", "Chinese Yuan (¥)", "Indian Rupee (₹)"}, "Japanese Yen (¥)"),
            new QuestionData("What is the chemical symbol for gold?", new String[]{"Ag", "Au", "Fe", "Hg"}, "Au"),
            new QuestionData("Which planet is often referred to as the <Red Planet>?", new String[]{"Venus", "Mars", "Saturn", "Jupiter"}, "Mars"),
            new QuestionData("Who is the author of the Harry Potter book series?", new String[]{"J.R.R. Tolkien", "J.K. Rowling", "George Orwell", "Leo Tolstoy"}, "J.K. Rowling"),
            new QuestionData("What is the tallest mountain in the world?", new String[]{"Mount Kilimanjaro", "Mount Everest", "Mount McKinley", "Mount Fuji"}, "Mount Everest"),
            new QuestionData("What is the largest ocean on Earth?", new String[]{"Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"}, "Pacific Ocean"),
            new QuestionData("Who painted the Mona Lisa?", new String[]{"Pablo Picasso", "Michelangelo", "Vincent van Gogh", "Leonardo da Vinci"}, "Leonardo da Vinci"),
            new QuestionData("What is the capital city of Canada?", new String[]{"Ottawa", "Toronto", "Montreal", "Vancouver"}, "Ottawa"),
            new QuestionData("How many continents are there on Earth?", new String[]{"Five", "Six", "Seven", "Eight"}, "Seven"),
            new QuestionData("Who is credited with discovering gravity when an apple fell on his head?", new String[]{"Sir Isaac Newton", "Albert Einstein", "Galileo Galilei", "Johannes Kepler"}, "Sir Isaac Newton"),
            new QuestionData("What is the largest desert in the world?", new String[]{"Sahara Desert", "Gobi Desert", "Atacama Desert", "Kalahari Desert"}, "Sahara Desert"),
            new QuestionData("What is the smallest prime number?", new String[]{"1", "2", "3", "4"}, "2"),
            new QuestionData("What is the chemical formula for water?", new String[]{"H2O", "CO2", "N2", "O2"}, "H2O"),
            new QuestionData("What is the largest species of shark?", new String[]{"Great white shark", "Hammerhead shark", "Tiger shark", "Whale shark"}, "Whale shark"),
            new QuestionData("Which country is known as the Land of the Rising Sun?", new String[]{"South Korea", "China", "Vietnam", "Japan"}, "Japan"),
            new QuestionData("Who wrote the famous play Hamlet?", new String[]{"William Shakespeare", "Leo Tolstoy", "F. Scott Fitzgerald", "George Orwell"}, "William Shakespeare"),
            new QuestionData("What is the freezing point of water in degrees Celsius?", new String[]{"-10°C", "0°C", "10°C", "20°C"}, "0°C"),
            new QuestionData("Which gas makes up the majority of Earth's atmosphere?", new String[]{"Oxygen (O2)", "Carbon dioxide (CO2)", "Methane (CH4)", "Nitrogen (N2)"}, "Nitrogen (N2)"),
            new QuestionData("What is the largest species of penguin?", new String[]{"Emperor penguin", "King penguin", "African penguin", "Humboldt penguin"}, "Emperor penguin"),
            new QuestionData("Who is the current President of the United States?", new String[]{"Donald Trump", "Barack Obama", "Joe Biden", "George W. Bush"}, "Joe Biden"),
            new QuestionData("Which gas do plants release during respiration?", new String[]{"Oxygen (O2)", "Carbon dioxide (CO2)", "Water vapor (H2O)", "Hydrogen (H2)"}, "Oxygen (O2)"),
            new QuestionData("What is the largest organ in the human body?", new String[]{"Heart", "Liver", "Brain", "Skin"}, "Skin"),
            new QuestionData("What is the national flower of Japan?", new String[]{"Tulip", "Cherry blossom (Sakura)", "Rose", "Daffodil"}, "Cherry blossom (Sakura)"),
            new QuestionData("What is the name of the famous public square in the heart of Birmingham?", new String[]{"Victoria Square", "Centenary Square", "Brindleyplace", "St. Philip's Square"}, "Victoria Square"),
            new QuestionData("Which iconic British band originated from Birmingham?", new String[]{"The Beatles", "Pink Floyd", "Led Zeppelin", "Black Sabbath"}, "Black Sabbath"),
            new QuestionData("In which year did Birmingham host the Commonwealth Games?", new String[]{"1992", "2002", "2022", "2012"}, "2022"),
            new QuestionData("What is the name of Birmingham's international airport?", new String[]{"Heathrow Airport", "Gatwick Airport", "Birmingham Airport", "Manchester Airport"}, "Birmingham Airport"),
            new QuestionData("Which famous chocolate brand has its origins in Birmingham?", new String[]{"Cadbury", "Nestle", "Mars", "Lindt"}, "Cadbury"),
            new QuestionData("What is the name of the largest park in Birmingham?", new String[]{"Sutton Park", "Cannon Hill Park", "Kings Heath Park", "Sheldon Country Park"}, "Sutton Park"),
            new QuestionData("Which river runs through Birmingham?", new String[]{"River Severn", "River Trent", "River Avon", "River Tame"}, "River Tame"),
            new QuestionData("Birmingham is famous for which type of cuisine that originated in the city?", new String[]{"Indian Curry", "Fish and Chips", "Balti", "Shepherd's Pie"}, "Balti"),
            new QuestionData("What is the name of Birmingham's renowned art gallery?", new String[]{"Birmingham Museum and Art Gallery", "The Barber Institute of Fine Arts", "Ikon Gallery", "Eastside Projects"}, "Birmingham Museum and Art Gallery"),
            new QuestionData("Which famous British author was born in Birmingham in 1892?", new String[]{"J.R.R. Tolkien", "Jane Austen", "Charles Dickens", "Agatha Christie"}, "J.R.R. Tolkien"),
            new QuestionData("What is the chemical symbol for gold?", new String[]{"Ag", "Au", "Fe", "Hg"}, "Au"),
            new QuestionData("Which planet is often referred to as the Red Planet?", new String[]{"Venus", "Mars", "Saturn", "Jupiter"}, "Mars"),
            new QuestionData("Who is the author of the Harry Potter book series?", new String[]{"J.R.R. Tolkien", "J.K. Rowling", "George Orwell", "Leo Tolstoy"}, "J.K. Rowling"),
            new QuestionData("What is the tallest mountain in the world?", new String[]{"Mount Kilimanjaro", "Mount Everest", "Mount McKinley", "Mount Fuji"}, "Mount Everest"),
            new QuestionData("What is the largest ocean on Earth?", new String[]{"Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"}, "Pacific Ocean"),
            new QuestionData("Who painted the Mona Lisa?", new String[]{"Pablo Picasso", "Michelangelo", "Vincent van Gogh", "Leonardo da Vinci"}, "Leonardo da Vinci"),
            new QuestionData("What is the capital city of Canada?", new String[]{"Ottawa", "Toronto", "Montreal", "Vancouver"}, "Ottawa"),
            new QuestionData("How many continents are there on Earth?", new String[]{"Five", "Six", "Seven", "Eight"}, "Seven"),
            new QuestionData("Who is credited with discovering gravity when an apple fell on his head?", new String[]{"Sir Isaac Newton", "Albert Einstein", "Galileo Galilei", "Johannes Kepler"}, "Sir Isaac Newton"),
            new QuestionData("What is the largest desert in the world?", new String[]{"Sahara Desert", "Gobi Desert", "Atacama Desert", "Kalahari Desert"}, "Sahara Desert"),
            new QuestionData("What is the smallest prime number?", new String[]{"1", "2", "3", "4"}, "2"),
            new QuestionData("What is the chemical formula for water?", new String[]{"H2O", "CO2", "N2", "O2"}, "H2O"),
            new QuestionData("What is the largest species of shark?", new String[]{"Great white shark", "Hammerhead shark", "Tiger shark", "Whale shark"}, "Whale shark"),
            new QuestionData("What is the freezing point of water in degrees Fahrenheit?", new String[]{"32°F", "0°F", "100°F", "212°F"}, "32°F"),
            new QuestionData("What year did the Titanic sink?", new String[]{"1910", "1912", "1915", "1920"}, "1912"),
            new QuestionData("Who is known as the 'Father of Geometry'?", new String[]{"Aristotle", "Pythagoras", "Euclid", "Archimedes"}, "Euclid"),
            new QuestionData("What is the hardest natural substance on Earth?", new String[]{"Iron", "Diamond", "Quartz", "Graphite"}, "Diamond"),
            new QuestionData("Who was the first person to walk on the moon?", new String[]{"Neil Armstrong", "Buzz Aldrin", "Yuri Gagarin", "John Glenn"}, "Neil Armstrong"),
            new QuestionData("What is the capital of Italy?", new String[]{"Rome", "Venice", "Milan", "Florence"}, "Rome"),
            new QuestionData("What is the primary language spoken in Brazil?", new String[]{"Spanish", "Portuguese", "English", "French"}, "Portuguese"),
            new QuestionData("Which animal is known as the king of the jungle?", new String[]{"Tiger", "Elephant", "Lion", "Giraffe"}, "Lion"),
            new QuestionData("In what year did World War II end?", new String[]{"1945", "1940", "1950", "1939"}, "1945"),
            new QuestionData("What is the boiling point of water in degrees Celsius?", new String[]{"100°C", "90°C", "80°C", "110°C"}, "100°C"),
            new QuestionData("What is the main ingredient in chocolate?", new String[]{"Sugar", "Cocoa", "Milk", "Butter"}, "Cocoa"),
            new QuestionData("What is the largest country in the world by area?", new String[]{"Russia", "Canada", "China", "United States"}, "Russia"),
            new QuestionData("What is the capital city of Egypt?", new String[]{"Cairo", "Alexandria", "Giza", "Luxor"}, "Cairo"),
            new QuestionData("What is the name of the longest river in the world?", new String[]{"Nile", "Amazon", "Yangtze", "Mississippi"}, "Nile"),
            new QuestionData("Which planet is known as the 'Blue Planet'?", new String[]{"Earth", "Mars", "Neptune", "Saturn"}, "Earth"),
            new QuestionData("Who wrote the novel '1984'?", new String[]{"George Orwell", "Aldous Huxley", "Mark Twain", "J.K. Rowling"}, "George Orwell"),
            new QuestionData("What is the name of the galaxy that contains our Solar System?", new String[]{"Andromeda Galaxy", "Milky Way Galaxy", "Triangulum Galaxy", "Whirlpool Galaxy"}, "Milky Way Galaxy"),
            new QuestionData("Who is the famous physicist who developed the theory of relativity?", new String[]{"Albert Einstein", "Isaac Newton", "Stephen Hawking", "Marie Curie"}, "Albert Einstein"),
            new QuestionData("What gas do humans exhale during respiration?", new String[]{"Oxygen", "Nitrogen", "Carbon dioxide", "Helium"}, "Carbon dioxide"),
            new QuestionData("What is the largest bird in the world?", new String[]{"Eagle", "Ostrich", "Penguin", "Albatross"}, "Ostrich"),
            new QuestionData("What is the capital of Australia?", new String[]{"Sydney", "Melbourne", "Canberra", "Perth"}, "Canberra"),
            new QuestionData("Which famous artist cut off his own ear?", new String[]{"Pablo Picasso", "Vincent van Gogh", "Leonardo da Vinci", "Claude Monet"}, "Vincent van Gogh"),
            new QuestionData("What is the hardest known natural material?", new String[]{"Diamond", "Ruby", "Steel", "Iron"}, "Diamond"),
            new QuestionData("Who is the Greek goddess of love and beauty?", new String[]{"Athena", "Aphrodite", "Hera", "Artemis"}, "Aphrodite"),
            new QuestionData("What is the name of the largest continent?", new String[]{"Asia", "Africa", "Europe", "North America"}, "Asia"),
            new QuestionData("Which country is famous for its tulips and windmills?", new String[]{"Netherlands", "Belgium", "Germany", "France"}, "Netherlands"),
            new QuestionData("What is the chemical symbol for salt?", new String[]{"NaCl", "K", "H2O", "CO2"}, "NaCl"),
            new QuestionData("Who is known as the father of modern physics?", new String[]{"Albert Einstein", "Isaac Newton", "Galileo Galilei", "Stephen Hawking"}, "Galileo Galilei"),
            new QuestionData("What is the name of the bear in the children's book series 'Winnie-the-Pooh'?", new String[]{"Paddington", "Baloo", "Winnie", "Yogi"}, "Winnie"),
            new QuestionData("What is the smallest country in the world?", new String[]{"Monaco", "Vatican City", "San Marino", "Liechtenstein"}, "Vatican City"),
            new QuestionData("Which planet is known as the 'Ringed Planet'?", new String[]{"Jupiter", "Saturn", "Uranus", "Neptune"}, "Saturn"),
            new QuestionData("Who is the author of the 'The Great Gatsby'?", new String[]{"F. Scott Fitzgerald", "Ernest Hemingway", "Mark Twain", "John Steinbeck"}, "F. Scott Fitzgerald"),
            new QuestionData("In which continent is the Amazon Rainforest located?", new String[]{"South America", "Africa", "Asia", "North America"}, "South America"),
            new QuestionData("What is the name of the famous clock tower in London?", new String[]{"Big Ben", "Tower Bridge", "London Eye", "Buckingham Palace"}, "Big Ben"),
            new QuestionData("Who discovered penicillin?", new String[]{"Alexander Fleming", "Marie Curie", "Thomas Edison", "Louis Pasteur"}, "Alexander Fleming"),
            new QuestionData("What is the name of the longest river in Europe?", new String[]{"Danube", "Volga", "Rhine", "Seine"}, "Volga"),
            new QuestionData("Who painted 'The Starry Night'?", new String[]{"Vincent van Gogh", "Pablo Picasso", "Claude Monet", "Leonardo da Vinci"}, "Vincent van Gogh"),
            new QuestionData("What is the national animal of Australia?", new String[]{"Kangaroo", "Koala", "Emu", "Platypus"}, "Kangaroo"),
            new QuestionData("Which element is represented by the symbol 'O' on the periodic table?", new String[]{"Oxygen", "Gold", "Osmium", "Oxygenium"}, "Oxygen"),
            new QuestionData("What is the capital city of Spain?", new String[]{"Madrid", "Barcelona", "Seville", "Valencia"}, "Madrid"),
            new QuestionData("Who is the author of 'Pride and Prejudice'?", new String[]{"Jane Austen", "Charlotte Brontë", "Emily Brontë", "Mary Shelley"}, "Jane Austen"),
            new QuestionData("What type of animal is a penguin?", new String[]{"Mammal", "Reptile", "Bird", "Fish"}, "Bird"),
            new QuestionData("What is the main currency used in the United Kingdom?", new String[]{"Pound Sterling", "Euro", "Dollar", "Yen"}, "Pound Sterling"),
            new QuestionData("What is the name of the world's largest coral reef system?", new String[]{"Great Barrier Reef", "Red Sea Coral Reef", "New Caledonia Barrier Reef", "Mesoamerican Barrier Reef"}, "Great Barrier Reef"),
            new QuestionData("Who was the first woman to win a Nobel Prize?", new String[]{"Marie Curie", "Rosalind Franklin", "Ada Lovelace", "Dorothy Hodgkin"}, "Marie Curie"),
            new QuestionData("What is the capital city of Japan?", new String[]{"Tokyo", "Kyoto", "Osaka", "Nagoya"}, "Tokyo"),
            new QuestionData("Which organ is responsible for pumping blood throughout the body?", new String[]{"Heart", "Lungs", "Liver", "Kidneys"}, "Heart"),
            new QuestionData("Who is the famous writer of the play 'A Midsummer Night's Dream'?", new String[]{"William Shakespeare", "Christopher Marlowe", "John Milton", "Ben Jonson"}, "William Shakespeare"),
            new QuestionData("What is the largest mammal in the ocean?", new String[]{"Blue Whale", "Orca", "Great White Shark", "Sperm Whale"}, "Blue Whale"),
            new QuestionData("What is the capital of Germany?", new String[]{"Berlin", "Munich", "Frankfurt", "Hamburg"}, "Berlin"),
            new QuestionData("Which planet in our solar system is known for its distinctive rings?", new String[]{"Saturn", "Jupiter", "Uranus", "Neptune"}, "Saturn"),
            new QuestionData("In what year did the first human land on the moon?", new String[]{"1969", "1965", "1972", "1961"}, "1969"),
            new QuestionData("What is the national flower of India?", new String[]{"Lotus", "Rose", "Jasmine", "Marigold"}, "Lotus"),
            new QuestionData("Who is the famous scientist who formulated the laws of motion?", new String[]{"Isaac Newton", "Albert Einstein", "Galileo Galilei", "Stephen Hawking"}, "Isaac Newton"),
            new QuestionData("What is the name of the largest rainforest in the world?", new String[]{"Amazon Rainforest", "Congo Rainforest", "Daintree Rainforest", "Sundarbans Rainforest"}, "Amazon Rainforest"),
            new QuestionData("Who was the first President of the United States?", new String[]{"George Washington", "Thomas Jefferson", "Abraham Lincoln", "John Adams"}, "George Washington"),
            new QuestionData("What is the most common blood type in humans?", new String[]{"O+", "A+", "B+", "AB+"}, "O+"),
            new QuestionData("What is the tallest building in the world?", new String[]{"Burj Khalifa", "Shanghai Tower", "One World Trade Center", "Taipei 101"}, "Burj Khalifa"),
            new QuestionData("What is the fastest land animal?", new String[]{"Cheetah", "Lion", "Horse", "Greyhound"}, "Cheetah"),
            new QuestionData("What is the name of the process by which plants make their food?", new String[]{"Photosynthesis", "Respiration", "Fermentation", "Osmosis"}, "Photosynthesis"),
            new QuestionData("What is the capital city of India?", new String[]{"New Delhi", "Mumbai", "Bangalore", "Kolkata"}, "New Delhi"),
            new QuestionData("Who wrote the novel 'To Kill a Mockingbird'?", new String[]{"Harper Lee", "Ernest Hemingway", "Mark Twain", "Jane Austen"}, "Harper Lee"),
            new QuestionData("What is the largest bone in the human body?", new String[]{"Femur", "Skull", "Spine", "Humerus"}, "Femur"),
            new QuestionData("Which planet in our solar system is known as the 'Red Planet'?", new String[]{"Mars", "Jupiter", "Saturn", "Venus"}, "Mars"),
            new QuestionData("What is the primary component of the sun?", new String[]{"Helium", "Oxygen", "Hydrogen", "Nitrogen"}, "Hydrogen"),
            new QuestionData("Who painted the 'Last Supper'?", new String[]{"Leonardo da Vinci", "Michelangelo", "Raphael", "Donatello"}, "Leonardo da Vinci"),
            new QuestionData("What is the name of the largest ocean?", new String[]{"Pacific Ocean", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean"}, "Pacific Ocean"),
            new QuestionData("Which language is primarily spoken in Brazil?", new String[]{"Portuguese", "Spanish", "English", "French"}, "Portuguese"),
            new QuestionData("Who was the first female Prime Minister of the United Kingdom?", new String[]{"Margaret Thatcher", "Theresa May", "Indira Gandhi", "Angela Merkel"}, "Margaret Thatcher"),
            new QuestionData("What is the name of the fairy tale character who slept for 100 years?", new String[]{"Sleeping Beauty", "Cinderella", "Snow White", "Rapunzel"}, "Sleeping Beauty"),
            new QuestionData("Who is known as the 'King of Pop'?", new String[]{"Michael Jackson", "Elvis Presley", "Prince", "Freddie Mercury"}, "Michael Jackson"),
            new QuestionData("What is the tallest land animal?", new String[]{"Giraffe", "Elephant", "Rhino", "Hippopotamus"}, "Giraffe"),
            new QuestionData("What is the most widely spoken language in the world?", new String[]{"English", "Mandarin Chinese", "Spanish", "Hindi"}, "Mandarin Chinese"),
            new QuestionData("Which country is known for constructing the Great Wall?", new String[]{"China", "Japan", "Mongolia", "India"}, "China"),
            new QuestionData("What is the name of the fictional detective created by Sir Arthur Conan Doyle?", new String[]{"Sherlock Holmes", "Hercule Poirot", "Miss Marple", "Harry Hole"}, "Sherlock Holmes"),
            new QuestionData("What gas is essential for humans to breathe?", new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"}, "Oxygen"),
            new QuestionData("In which city is the famous statue of Christ the Redeemer located?", new String[]{"Rio de Janeiro", "Buenos Aires", "Santiago", "Lima"}, "Rio de Janeiro"),
            new QuestionData("What is the capital city of Russia?", new String[]{"Moscow", "Saint Petersburg", "Novosibirsk", "Yekaterinburg"}, "Moscow"),
            new QuestionData("Who was the ancient Greek god of the sea?", new String[]{"Poseidon", "Zeus", "Hades", "Apollo"}, "Poseidon")
    };

    public static List<Question> getRandomQuestions() {
        List<Question> questionList = new ArrayList<>();
        for (QuestionData qData : questionsData) {
            questionList.add(new Question(qData.question, qData.choices, qData.correctAnswer));
        }

        Collections.shuffle(questionList);
        return questionList.subList(0, 10); // Return first 10 questions
    }

    // Inner class to hold question data structure
    private static class QuestionData {
        String question;
        String[] choices;
        String correctAnswer;

        QuestionData(String question, String[] choices, String correctAnswer) {
            this.question = question;
            this.choices = choices;
            this.correctAnswer = correctAnswer;
        }
    }

    // Inner class to hold question data for the quiz
    public static class Question {
        private final String question;
        private final String[] choices;
        private final String correctAnswer;

        public Question(String question, String[] choices, String correctAnswer) {
            this.question = question;
            this.choices = choices;
            this.correctAnswer = correctAnswer;
        }

        // Getters
        public String getQuestion() {
            return question;
        }

        public String[] getChoices() {
            return choices;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }
    }
}
