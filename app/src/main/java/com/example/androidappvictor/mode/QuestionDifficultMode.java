package com.example.androidappvictor.mode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionDifficultMode {

    private static final QuestionData[] questionsData = {
            new QuestionData("What is the chemical symbol for the element Tungsten?", new String[]{"W", "Tg", "Tu", "Ts"}, "W"),
            new QuestionData("Who is considered the father of modern physics?", new String[]{"Albert Einstein", "Isaac Newton", "Galileo Galilei", "Stephen Hawking"}, "Galileo Galilei"),
            new QuestionData("What is the capital of Iceland?", new String[]{"Oslo", "Reykjavik", "Helsinki", "Copenhagen"}, "Reykjavik"),
            new QuestionData("Which English city was once known as 'Brummagem'?", new String[]{"Birmingham", "Bristol", "Bradford", "Brighton"}, "Birmingham"),
            new QuestionData("What is the square root of 169?", new String[]{"11", "12", "13", "14"}, "13"),
            new QuestionData("In which Shakespearean play does the character 'Iago' appear?", new String[]{"Othello", "Macbeth", "Hamlet", "King Lear"}, "Othello"),
            new QuestionData("What is the study of fungi called?", new String[]{"Biology", "Mycology", "Botany", "Zoology"}, "Mycology"),
            new QuestionData("Which British monarch succeeded Queen Victoria?", new String[]{"Edward VII", "George V", "Edward VIII", "George VI"}, "Edward VII"),
            new QuestionData("What is the hardest known natural material?", new String[]{"Diamond", "Graphite", "Quartz", "Ruby"}, "Diamond"),
            new QuestionData("Which planet in our solar system has the most moons?", new String[]{"Jupiter", "Saturn", "Mars", "Uranus"}, "Saturn"),
            new QuestionData("What is the name of the largest library in Birmingham, UK?", new String[]{"Birmingham Central Library", "Library of Birmingham", "Cadbury Research Library", "Aston University Library"}, "Library of Birmingham"),
            new QuestionData("Who composed the 'Enigma Variations'?", new String[]{"Edward Elgar", "Johannes Brahms", "Wolfgang Amadeus Mozart", "Ludwig van Beethoven"}, "Edward Elgar"),
            new QuestionData("What is the smallest bone in the human body?", new String[]{"Femur", "Stapes", "Humerus", "Radius"}, "Stapes"),
            new QuestionData("Which battle marked the end of the Wars of the Roses?", new String[]{"Battle of Bosworth Field", "Battle of Agincourt", "Battle of Hastings", "Battle of Stamford Bridge"}, "Battle of Bosworth Field"),
            new QuestionData("What is the name of the deepest part of the world's oceans?", new String[]{"Mariana Trench", "Java Trench", "Tonga Trench", "Philippine Trench"}, "Mariana Trench"),
            new QuestionData("Which physicist developed the theory of general relativity?", new String[]{"Albert Einstein", "Isaac Newton", "Niels Bohr", "Marie Curie"}, "Albert Einstein"),
            new QuestionData("Who was the first female Prime Minister of India?", new String[]{"Indira Gandhi", "Benazir Bhutto", "Golda Meir", "Margaret Thatcher"}, "Indira Gandhi"),
            new QuestionData("In which year was the first iPhone released?", new String[]{"2005", "2007", "2009", "2011"}, "2007"),
            new QuestionData("Which element has the highest melting point?", new String[]{"Tungsten", "Iron", "Carbon", "Uranium"}, "Tungsten"),
            new QuestionData("What is the longest river in the world?", new String[]{"Amazon River", "Nile River", "Yangtze River", "Mississippi River"}, "Nile River"),
            new QuestionData("Who wrote 'A Brief History of Time'?", new String[]{"Stephen Hawking", "Albert Einstein", "Carl Sagan", "Brian Cox"}, "Stephen Hawking"),
            new QuestionData("Which city is the Bullring shopping centre located in?", new String[]{"Birmingham", "Manchester", "London", "Leeds"}, "Birmingham"),
            new QuestionData("What is the name of the theory that proposes the universe is expanding at an accelerating rate?", new String[]{"Big Bang Theory", "Steady State Theory", "Dark Matter Theory", "Dark Energy Theory"}, "Dark Energy Theory"),
            new QuestionData("Who was the first woman to win a Nobel Prize?", new String[]{"Marie Curie", "Dorothy Hodgkin", "Ada Lovelace", "Rosalind Franklin"}, "Marie Curie"),
            new QuestionData("What is the capital city of New Zealand?", new String[]{"Auckland", "Wellington", "Christchurch", "Hamilton"}, "Wellington"),
            new QuestionData("Which architect designed the Guggenheim Museum in Bilbao?", new String[]{"Frank Gehry", "Zaha Hadid", "I.M. Pei", "Norman Foster"}, "Frank Gehry"),
            new QuestionData("What is the study of earthquakes called?", new String[]{"Geology", "Seismology", "Volcanology", "Meteorology"}, "Seismology"),
            new QuestionData("Which composer wrote the 'Moonlight Sonata'?", new String[]{"Johann Sebastian Bach", "Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Franz Schubert"}, "Ludwig van Beethoven"),
            new QuestionData("What is the process by which plants convert carbon dioxide into oxygen called?", new String[]{"Photosynthesis", "Respiration", "Transpiration", "Fermentation"}, "Photosynthesis"),
            new QuestionData("In what year did Birmingham gain city status in the UK?", new String[]{"1889", "1896", "1909", "1911"}, "1889"),
            new QuestionData("Who was the first British monarch of the House of Windsor?", new String[]{"Edward VII", "George V", "Elizabeth II", "Victoria"}, "George V"),
            new QuestionData("What is the formula for calculating the area of a circle?", new String[]{"πr^2", "2πr", "πd", "r^2/π"}, "πr^2"),
            new QuestionData("Which Shakespeare play features the characters Rosencrantz and Guildenstern?", new String[]{"Hamlet", "Macbeth", "Othello", "King Lear"}, "Hamlet"),
            new QuestionData("What is the capital of Norway?", new String[]{"Oslo", "Stockholm", "Copenhagen", "Helsinki"}, "Oslo"),
            new QuestionData("What is the name of the process by which green plants and some other organisms use sunlight to synthesize foods from carbon dioxide and water?", new String[]{"Photosynthesis", "Cellular Respiration", "Fermentation", "Chemosynthesis"}, "Photosynthesis"),
            new QuestionData("What is the largest internal organ in the human body?", new String[]{"Heart", "Liver", "Brain", "Lung"}, "Liver"),
            new QuestionData("Which scientist is known for the Uncertainty Principle?", new String[]{"Werner Heisenberg", "Albert Einstein", "Isaac Newton", "Niels Bohr"}, "Werner Heisenberg"),
            new QuestionData("What is the only mammal capable of true sustained flight?", new String[]{"Flying squirrel", "Bat", "Colugo", "Hummingbird"}, "Bat"),
            new QuestionData("What is the name of the deepest known location in Earth's oceans?", new String[]{"Challenger Deep", "Mariana Trench", "Java Trench", "Tonga Trench"}, "Challenger Deep"),
            new QuestionData("Who composed the 'Four Seasons'?", new String[]{"Antonio Vivaldi", "Johann Sebastian Bach", "Ludwig van Beethoven", "Wolfgang Amadeus Mozart"}, "Antonio Vivaldi"),
            new QuestionData("Which philosopher wrote 'Critique of Pure Reason'?", new String[]{"Immanuel Kant", "Friedrich Nietzsche", "Socrates", "Plato"}, "Immanuel Kant"),
            new QuestionData("What is the largest moon of Saturn called?", new String[]{"Titan", "Europa", "Ganymede", "Callisto"}, "Titan"),
            new QuestionData("Who painted the 'Last Supper'?", new String[]{"Leonardo da Vinci", "Michelangelo", "Raphael", "Caravaggio"}, "Leonardo da Vinci"),
            new QuestionData("What is the boiling point of water at sea level in Celsius?", new String[]{"90°C", "95°C", "100°C", "105°C"}, "100°C"),
            new QuestionData("What is the capital of Egypt?", new String[]{"Cairo", "Alexandria", "Giza", "Luxor"}, "Cairo"),
            new QuestionData("Which British author wrote 'Brave New World'?", new String[]{"Aldous Huxley", "George Orwell", "Virginia Woolf", "Ian Fleming"}, "Aldous Huxley"),
            new QuestionData("What is the largest gland in the human body?", new String[]{"Thyroid", "Pancreas", "Liver", "Salivary Gland"}, "Liver"),
            new QuestionData("In which city is the UK's National Sea Life Centre located?", new String[]{"London", "Brighton", "Manchester", "Birmingham"}, "Birmingham"),
            new QuestionData("What is the scientific term for the study of birds?", new String[]{"Ornithology", "Entomology", "Herpetology", "Ichthyology"}, "Ornithology"),
            new QuestionData("Which gas is most abundant in the Earth's atmosphere?", new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"}, "Nitrogen"),
            new QuestionData("What is the primary component of the Earth's atmosphere?", new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Argon"}, "Nitrogen"),
            new QuestionData("Who wrote the epic poem 'Paradise Lost'?", new String[]{"John Milton", "William Shakespeare", "Geoffrey Chaucer", "T.S. Eliot"}, "John Milton"),
            new QuestionData("What is the chemical formula for table salt?", new String[]{"NaCl", "KCl", "LiCl", "MgCl2"}, "NaCl"),
            new QuestionData("Which planet is known as the Red Planet?", new String[]{"Mars", "Jupiter", "Venus", "Saturn"}, "Mars"),
            new QuestionData("What is the highest mountain in the world?", new String[]{"Mount Everest", "K2", "Kangchenjunga", "Lhotse"}, "Mount Everest"),
            new QuestionData("Who discovered penicillin?", new String[]{"Alexander Fleming", "Marie Curie", "Louis Pasteur", "Isaac Newton"}, "Alexander Fleming"),
            new QuestionData("What is the longest river in Europe?", new String[]{"Danube", "Ural", "Volga", "Rhine"}, "Volga"),
            new QuestionData("Which element is represented by the atomic number 1?", new String[]{"Hydrogen", "Helium", "Oxygen", "Carbon"}, "Hydrogen"),
            new QuestionData("In what year did World War II end?", new String[]{"1945", "1944", "1946", "1947"}, "1945"),
            new QuestionData("What is the capital of Australia?", new String[]{"Sydney", "Melbourne", "Canberra", "Perth"}, "Canberra"),
            new QuestionData("Who composed the music for the opera 'The Marriage of Figaro'?", new String[]{"Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Giuseppe Verdi", "Richard Wagner"}, "Wolfgang Amadeus Mozart"),
            new QuestionData("What is the main ingredient in traditional Japanese miso soup?", new String[]{"Tofu", "Rice", "Seaweed", "Miso Paste"}, "Miso Paste"),
            new QuestionData("Which scientist is credited with the development of the theory of evolution?", new String[]{"Charles Darwin", "Albert Einstein", "Isaac Newton", "Gregor Mendel"}, "Charles Darwin"),
            new QuestionData("What is the hardest mineral according to the Mohs scale?", new String[]{"Diamond", "Quartz", "Topaz", "Corundum"}, "Diamond"),
            new QuestionData("In which country is the ancient city of Petra located?", new String[]{"Jordan", "Egypt", "Greece", "Italy"}, "Jordan"),
            new QuestionData("Who painted the 'Sistine Chapel Ceiling'?", new String[]{"Leonardo da Vinci", "Michelangelo", "Raphael", "Titian"}, "Michelangelo"),
            new QuestionData("What is the primary function of the ribosomes in a cell?", new String[]{"Protein Synthesis", "DNA Replication", "Energy Production", "Cell Division"}, "Protein Synthesis"),
            new QuestionData("Which country is known as the Land of the Rising Sun?", new String[]{"China", "South Korea", "Japan", "Thailand"}, "Japan"),
            new QuestionData("In which year did the Berlin Wall fall?", new String[]{"1989", "1991", "1987", "1990"}, "1989"),
            new QuestionData("Who is the author of the novel '1984'?", new String[]{"George Orwell", "Aldous Huxley", "Ray Bradbury", "H.G. Wells"}, "George Orwell"),
            new QuestionData("What is the main currency used in the European Union?", new String[]{"Euro", "Pound Sterling", "US Dollar", "Swiss Franc"}, "Euro"),
            new QuestionData("What is the scientific name for the process of water changing from a liquid to a gas?", new String[]{"Evaporation", "Condensation", "Sublimation", "Deposition"}, "Evaporation"),
            new QuestionData("What element is represented by the symbol 'Au'?", new String[]{"Gold", "Silver", "Aluminum", "Argon"}, "Gold"),
            new QuestionData("Who is known for composing the 'Fifth Symphony'?", new String[]{"Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Johann Sebastian Bach", "Pyotr Ilyich Tchaikovsky"}, "Ludwig van Beethoven"),
            new QuestionData("What is the nearest star to Earth?", new String[]{"Proxima Centauri", "Sirius", "Alpha Centauri", "Betelgeuse"}, "Proxima Centauri"),
            new QuestionData("In which city was the Titanic built?", new String[]{"Liverpool", "Belfast", "Glasgow", "Southampton"}, "Belfast"),
            new QuestionData("Who developed the theory of relativity?", new String[]{"Albert Einstein", "Isaac Newton", "Stephen Hawking", "Niels Bohr"}, "Albert Einstein"),
            new QuestionData("What is the most abundant metal in the Earth's crust?", new String[]{"Iron", "Aluminum", "Copper", "Silver"}, "Aluminum"),
            new QuestionData("Which ancient civilization built the Machu Picchu complex?", new String[]{"Inca", "Maya", "Aztec", "Olmec"}, "Inca"),
            new QuestionData("Who discovered the circulation of blood in the human body?", new String[]{"William Harvey", "Louis Pasteur", "Gregor Mendel", "Alexander Fleming"}, "William Harvey"),
            new QuestionData("What is the largest desert on Earth?", new String[]{"Sahara", "Arabian", "Gobi", "Antarctic"}, "Antarctic"),
            new QuestionData("Which physicist is famous for his laws of motion?", new String[]{"Isaac Newton", "Albert Einstein", "Galileo Galilei", "James Clerk Maxwell"}, "Isaac Newton"),
            new QuestionData("What is the capital city of Brazil?", new String[]{"Rio de Janeiro", "Sao Paulo", "Brasilia", "Salvador"}, "Brasilia"),
            new QuestionData("Who wrote the novel 'Moby-Dick'?", new String[]{"Herman Melville", "Mark Twain", "John Steinbeck", "Ernest Hemingway"}, "Herman Melville"),
            new QuestionData("What gas is the primary component of Jupiter's atmosphere?", new String[]{"Hydrogen", "Helium", "Methane", "Ammonia"}, "Hydrogen"),
            new QuestionData("In which continent is the Kalahari Desert located?", new String[]{"Africa", "Asia", "Australia", "North America"}, "Africa"),
            new QuestionData("Who composed the opera 'The Magic Flute'?", new String[]{"Wolfgang Amadeus Mozart", "Giuseppe Verdi", "Richard Wagner", "Ludwig van Beethoven"}, "Wolfgang Amadeus Mozart"),
            new QuestionData("Which element is represented by the atomic number 6?", new String[]{"Carbon", "Oxygen", "Nitrogen", "Hydrogen"}, "Carbon"),
            new QuestionData("What is the name of the largest moon of Jupiter?", new String[]{"Europa", "Io", "Ganymede", "Callisto"}, "Ganymede"),
            new QuestionData("Who was the first woman to fly solo across the Atlantic Ocean?", new String[]{"Amelia Earhart", "Valentina Tereshkova", "Sally Ride", "Harriet Quimby"}, "Amelia Earhart"),
            new QuestionData("What is the name of the layer of the Earth's atmosphere where most weather occurs?", new String[]{"Stratosphere", "Troposphere", "Mesosphere", "Thermosphere"}, "Troposphere"),
            new QuestionData("Who was the ancient Greek god of the sea?", new String[]{"Poseidon", "Zeus", "Apollo", "Hades"}, "Poseidon"),
            new QuestionData("What is the chemical symbol for gold?", new String[]{"Au", "Ag", "Fe", "Cu"}, "Au"),
            new QuestionData("Which country is known for constructing the ancient Pyramids of Giza?", new String[]{"Egypt", "Mexico", "Peru", "India"}, "Egypt"),
            new QuestionData("What is the name of the longest river in Asia?", new String[]{"Yangtze River", "Mekong River", "Ganges River", "Indus River"}, "Yangtze River"),
            new QuestionData("Who is the author of the play 'A Streetcar Named Desire'?", new String[]{"Tennessee Williams", "Arthur Miller", "Eugene O'Neill", "Samuel Beckett"}, "Tennessee Williams"),
            new QuestionData("Which vitamin is primarily obtained from sunlight exposure?", new String[]{"Vitamin A", "Vitamin B12", "Vitamin C", "Vitamin D"}, "Vitamin D"),
            new QuestionData("What is the main ingredient in the traditional Indian dish, dal?", new String[]{"Rice", "Chickpeas", "Lentils", "Potatoes"}, "Lentils"),
            new QuestionData("Who was the first American president?", new String[]{"George Washington", "Thomas Jefferson", "Abraham Lincoln", "John Adams"}, "George Washington"),
            new QuestionData("What phenomenon explains the bending of light rays as they pass from one medium to another?", new String[]{"Refraction", "Reflection", "Diffraction", "Dispersion"}, "Refraction"),
            new QuestionData("Which chemical element has the symbol 'K'?", new String[]{"Potassium", "Krypton", "Kalium", "Kerium"}, "Potassium"),
            new QuestionData("In Greek mythology, who is the goddess of wisdom?", new String[]{"Athena", "Artemis", "Hera", "Aphrodite"}, "Athena"),
            new QuestionData("What is the capital city of Spain?", new String[]{"Madrid", "Barcelona", "Valencia", "Seville"}, "Madrid")
    };

    public static List<Question> getRandomQuestions() {
        List<Question> questionList = new ArrayList<>();
        for (QuestionData qData : questionsData) {
            questionList.add(new Question(qData.question, qData.choices, qData.correctAnswer));
        }

        Collections.shuffle(questionList);
        return questionList.subList(0, 10); // Return first 10 questions
    }

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

    public static class Question {
        private final String question;
        private final String[] choices;
        private final String correctAnswer;

        public Question(String question, String[] choices, String correctAnswer) {
            this.question = question;
            this.choices = choices;
            this.correctAnswer = correctAnswer;
        }

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
