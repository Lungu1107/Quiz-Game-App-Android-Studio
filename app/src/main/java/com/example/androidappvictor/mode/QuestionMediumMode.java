package com.example.androidappvictor.mode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionMediumMode {

    private static final QuestionData[] questionsData = {
            new QuestionData("Who was the Prime Minister of the UK during most of World War II?", new String[]{"Winston Churchill", "Neville Chamberlain", "Margaret Thatcher", "Tony Blair"}, "Winston Churchill"),
            new QuestionData("What is the longest river in the UK?", new String[]{"River Thames", "River Severn", "River Mersey", "River Trent"}, "River Severn"),
            new QuestionData("What is the main ingredient in traditional Japanese miso soup?", new String[]{"Rice", "Noodles", "Tofu", "Seaweed"}, "Tofu"),
            new QuestionData("Which element has the chemical symbol 'Na'?", new String[]{"Nitrogen", "Nickel", "Sodium", "Neon"}, "Sodium"),
            new QuestionData("What is the name of the famous clock tower in London?", new String[]{"Big Ben", "The Gherkin", "Tower Bridge", "The Shard"}, "Big Ben"),
            new QuestionData("Who discovered penicillin?", new String[]{"Alexander Fleming", "Marie Curie", "Isaac Newton", "Albert Einstein"}, "Alexander Fleming"),
            new QuestionData("What is the second planet from the sun?", new String[]{"Mercury", "Venus", "Earth", "Mars"}, "Venus"),
            new QuestionData("Which country hosted the 2012 Summer Olympics?", new String[]{"China", "Brazil", "United Kingdom", "Greece"}, "United Kingdom"),
            new QuestionData("What is the capital city of Scotland?", new String[]{"Glasgow", "Aberdeen", "Dundee", "Edinburgh"}, "Edinburgh"),
            new QuestionData("In which year did the Beatles release their first single?", new String[]{"1960", "1962", "1964", "1966"}, "1962"),
            new QuestionData("What is the largest bird of prey in the UK?", new String[]{"Golden Eagle", "Barn Owl", "Peregrine Falcon", "Red Kite"}, "Golden Eagle"),
            new QuestionData("Which novel features the character Atticus Finch?", new String[]{"To Kill a Mockingbird", "The Great Gatsby", "Pride and Prejudice", "1984"}, "To Kill a Mockingbird"),
            new QuestionData("What is the currency of Sweden?", new String[]{"Euro", "Swedish Krona", "Swiss Franc", "Danish Krone"}, "Swedish Krona"),
            new QuestionData("Birmingham is historically known for being a leader in which industry?", new String[]{"Automotive", "Steel", "Textile", "Jewellery"}, "Jewellery"),
            new QuestionData("The Bullring is a major commercial area in which UK city?", new String[]{"Manchester", "Birmingham", "Leeds", "Liverpool"}, "Birmingham"),
            new QuestionData("What is the name of the river that flows through London?", new String[]{"River Thames", "River Severn", "River Mersey", "River Trent"}, "River Thames"),
            new QuestionData("In what year was the Magna Carta signed?", new String[]{"1066", "1215", "1415", "1603"}, "1215"),
            new QuestionData("Which element is represented by the letter 'O' in the periodic table?", new String[]{"Osmium", "Oxygen", "Gold", "Oganesson"}, "Oxygen"),
            new QuestionData("What is the tallest building in the UK?", new String[]{"The Shard", "One Canada Square", "The Gherkin", "BT Tower"}, "The Shard"),
            new QuestionData("Which city is known as 'The City of a Thousand Trades'?", new String[]{"Manchester", "Leeds", "Birmingham", "Liverpool"}, "Birmingham"),
            new QuestionData("Who wrote 'Pride and Prejudice'?", new String[]{"Jane Austen", "Emily Brontë", "Charlotte Brontë", "Mary Shelley"}, "Jane Austen"),
            new QuestionData("What is the chemical formula for ozone?", new String[]{"O2", "O3", "CO2", "H2O"}, "O3"),
            new QuestionData("Which city is the birthplace of the Industrial Revolution in the UK?", new String[]{"Manchester", "London", "Birmingham", "Liverpool"}, "Manchester"),
            new QuestionData("Who is known as the 'Bard of Avon'?", new String[]{"Geoffrey Chaucer", "William Shakespeare", "John Milton", "Charles Dickens"}, "William Shakespeare"),
            new QuestionData("What is the highest mountain in the UK?", new String[]{"Scafell Pike", "Snowdon", "Ben Nevis", "Helvellyn"}, "Ben Nevis"),
            new QuestionData("Which English king had six wives?", new String[]{"Henry V", "Henry VIII", "Edward III", "Richard III"}, "Henry VIII"),
            new QuestionData("Who was the first female Prime Minister of the United Kingdom?", new String[]{"Margaret Thatcher", "Theresa May", "Indira Gandhi", "Angela Merkel"}, "Margaret Thatcher"),
            new QuestionData("What is the longest river in the world?", new String[]{"Amazon", "Nile", "Yangtze", "Mississippi"}, "Nile"),
            new QuestionData("Which famous scientist developed the theory of relativity?", new String[]{"Isaac Newton", "Albert Einstein", "Stephen Hawking", "Nikola Tesla"}, "Albert Einstein"),
            new QuestionData("What is the name of the highest court in the United Kingdom?", new String[]{"The Supreme Court", "The High Court", "The Court of Appeal", "The Crown Court"}, "The Supreme Court"),
            new QuestionData("What is the deepest lake in the UK?", new String[]{"Loch Ness", "Windermere", "Loch Lomond", "Wastwater"}, "Wastwater"),
            new QuestionData("In which English city is the National Space Centre located?", new String[]{"London", "Manchester", "Leicester", "Bristol"}, "Leicester"),
            new QuestionData("Which vitamin is predominantly absorbed by the body from sunlight?", new String[]{"Vitamin A", "Vitamin B12", "Vitamin C", "Vitamin D"}, "Vitamin D"),
            new QuestionData("Who wrote the novel '1984'?", new String[]{"George Orwell", "Aldous Huxley", "Ray Bradbury", "John Steinbeck"}, "George Orwell"),
            new QuestionData("What is the main language spoken in Brazil?", new String[]{"Spanish", "Portuguese", "French", "English"}, "Portuguese"),
            new QuestionData("Who is the patron saint of Ireland?", new String[]{"Saint Patrick", "Saint Andrew", "Saint David", "Saint George"}, "Saint Patrick"),
            new QuestionData("The Brindleyplace development is a notable feature of which UK city?", new String[]{"Birmingham", "Manchester", "Leeds", "Liverpool"}, "Birmingham"),
            new QuestionData("What is the smallest planet in our solar system?", new String[]{"Mercury", "Venus", "Mars", "Earth"}, "Mercury"),
            new QuestionData("Which artist painted 'The Starry Night'?", new String[]{"Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet"}, "Vincent van Gogh"),
            new QuestionData("What is the capital city of Australia?", new String[]{"Sydney", "Melbourne", "Canberra", "Brisbane"}, "Canberra"),
            new QuestionData("In which city is the UK's National Exhibition Centre (NEC) located?", new String[]{"London", "Birmingham", "Manchester", "Glasgow"}, "Birmingham"),
            new QuestionData("Who was the first woman to fly solo across the Atlantic Ocean?", new String[]{"Amelia Earhart", "Harriet Quimby", "Valentina Tereshkova", "Bessie Coleman"}, "Amelia Earhart"),
            new QuestionData("What is the capital of New Zealand?", new String[]{"Auckland", "Christchurch", "Wellington", "Hamilton"}, "Wellington"),
            new QuestionData("Which planet in our solar system is known for its rings?", new String[]{"Jupiter", "Saturn", "Uranus", "Neptune"}, "Saturn"),
            new QuestionData("Who wrote 'The Lord of the Rings'?", new String[]{"J.R.R. Tolkien", "J.K. Rowling", "C.S. Lewis", "George R.R. Martin"}, "J.R.R. Tolkien"),
            new QuestionData("Which river flows through the city of Birmingham, UK?", new String[]{"River Severn", "River Thames", "River Trent", "River Rea"}, "River Rea"),
            new QuestionData("What is the chemical symbol for iron?", new String[]{"Ir", "Fe", "In", "I"}, "Fe"),
            new QuestionData("Which English city is known as the 'City of Dreaming Spires'?", new String[]{"Oxford", "Cambridge", "London", "Bristol"}, "Oxford"),
            new QuestionData("Which country is famous for its fjords?", new String[]{"Norway", "Sweden", "Finland", "Iceland"}, "Norway"),
            new QuestionData("What is the name of the largest castle in England?", new String[]{"Windsor Castle", "Dover Castle", "Warwick Castle", "Leeds Castle"}, "Windsor Castle"),
            new QuestionData("What is the primary ingredient in a traditional Italian pesto sauce?", new String[]{"Tomatoes", "Basil", "Mushrooms", "Olives"}, "Basil"),
            new QuestionData("Who was the first American President?", new String[]{"George Washington", "Abraham Lincoln", "Thomas Jefferson", "John Adams"}, "George Washington"),
            new QuestionData("What is the capital city of Brazil?", new String[]{"Rio de Janeiro", "São Paulo", "Brasília", "Salvador"}, "Brasília"),
            new QuestionData("Which famous artist sculpted 'David' in the early 16th century?", new String[]{"Leonardo da Vinci", "Michelangelo", "Raphael", "Donatello"}, "Michelangelo"),
            new QuestionData("What is the largest planet in our solar system?", new String[]{"Jupiter", "Saturn", "Neptune", "Mars"}, "Jupiter"),
            new QuestionData("Who is the author of the 'Sherlock Holmes' series?", new String[]{"Agatha Christie", "Arthur Conan Doyle", "Ian Fleming", "Stephen King"}, "Arthur Conan Doyle"),
            new QuestionData("In what year did the Berlin Wall fall?", new String[]{"1989", "1979", "1969", "1999"}, "1989"),
            new QuestionData("What is the name of the most famous painting by Johannes Vermeer?", new String[]{"The Night Watch", "Girl with a Pearl Earring", "The Milkmaid", "The Astronomer"}, "Girl with a Pearl Earring"),
            new QuestionData("Which element is represented by the symbol 'H'?", new String[]{"Helium", "Hydrogen", "Hafnium", "Holmium"}, "Hydrogen"),
            new QuestionData("In which country is the ancient city of Petra located?", new String[]{"Egypt", "Jordan", "Syria", "Israel"}, "Jordan"),
            new QuestionData("Which ocean surrounds the Maldives?", new String[]{"Indian Ocean", "Pacific Ocean", "Atlantic Ocean", "Arctic Ocean"}, "Indian Ocean"),
            new QuestionData("Who composed the famous musical piece 'Für Elise'?", new String[]{"Wolfgang Amadeus Mozart", "Johann Sebastian Bach", "Ludwig van Beethoven", "Franz Schubert"}, "Ludwig van Beethoven"),
            new QuestionData("What is the tallest mammal in the world?", new String[]{"Elephant", "Giraffe", "Hippopotamus", "Rhinoceros"}, "Giraffe"),
            new QuestionData("Which city is known as the birthplace of the Renaissance?", new String[]{"Rome", "Milan", "Venice", "Florence"}, "Florence"),
            new QuestionData("What is the capital of Canada?", new String[]{"Ottawa", "Toronto", "Montreal", "Vancouver"}, "Ottawa"),
            new QuestionData("Who was the first person to fly solo non-stop across the Atlantic?", new String[]{"Charles Lindbergh", "Amelia Earhart", "Howard Hughes", "Wright Brothers"}, "Charles Lindbergh"),
            new QuestionData("What is the primary language spoken in the Scandinavian country of Sweden?", new String[]{"Danish", "Finnish", "Norwegian", "Swedish"}, "Swedish"),
            new QuestionData("What is the chemical symbol for silver?", new String[]{"Ag", "Au", "Si", "Sr"}, "Ag"),
            new QuestionData("Who is known as the 'Maid of Orléans'?", new String[]{"Marie Antoinette", "Joan of Arc", "Catherine the Great", "Elizabeth I"}, "Joan of Arc"),
            new QuestionData("What is the smallest bone in the human body?", new String[]{"Stapes", "Femur", "Tibia", "Humerus"}, "Stapes"),
            new QuestionData("Which country is the largest producer of coffee in the world?", new String[]{"Brazil", "Colombia", "Vietnam", "Ethiopia"}, "Brazil"),
            new QuestionData("What is the national animal of China?", new String[]{"Dragon", "Panda", "Tiger", "Phoenix"}, "Panda"),
            new QuestionData("In which European city can you find the home of Anne Frank?", new String[]{"Berlin", "Amsterdam", "Paris", "Brussels"}, "Amsterdam"),
            new QuestionData("What is the name of the famous detective in Agatha Christie's novels?", new String[]{"Sherlock Holmes", "Hercule Poirot", "Miss Marple", "Philip Marlowe"}, "Hercule Poirot"),
            new QuestionData("Which planet is known as the 'Morning Star'?", new String[]{"Venus", "Mars", "Mercury", "Jupiter"}, "Venus"),
            new QuestionData("Who was the Greek god of war?", new String[]{"Ares", "Zeus", "Hermes", "Apollo"}, "Ares"),
            new QuestionData("What type of animal is a Komodo dragon?", new String[]{"Lizard", "Dragon", "Snake", "Bird"}, "Lizard"),
            new QuestionData("Who was the first female Nobel laureate?", new String[]{"Marie Curie", "Mother Teresa", "Malala Yousafzai", "Rosalind Franklin"}, "Marie Curie"),
            new QuestionData("What is the name of the layer of Earth's atmosphere closest to space?", new String[]{"Stratosphere", "Exosphere", "Troposphere", "Mesosphere"}, "Exosphere"),
            new QuestionData("Who is the author of the novel 'Brave New World'?", new String[]{"George Orwell", "Aldous Huxley", "F. Scott Fitzgerald", "Ray Bradbury"}, "Aldous Huxley"),
            new QuestionData("What is the capital city of New Zealand?", new String[]{"Auckland", "Wellington", "Christchurch", "Dunedin"}, "Wellington"),
            new QuestionData("Which historical figure is known as the 'Father of Modern Science'?", new String[]{"Galileo Galilei", "Isaac Newton", "Albert Einstein", "Nicolaus Copernicus"}, "Galileo Galilei"),
            new QuestionData("In what year did the Titanic sink?", new String[]{"1912", "1910", "1905", "1920"}, "1912"),
            new QuestionData("What is the hardest natural substance on Earth?", new String[]{"Diamond", "Quartz", "Ruby", "Sapphire"}, "Diamond"),
            new QuestionData("Which country is known as the 'Land of the Rising Sun'?", new String[]{"Japan", "China", "South Korea", "Thailand"}, "Japan"),
            new QuestionData("Who composed the music for the film 'Jaws'?", new String[]{"John Williams", "Hans Zimmer", "Ennio Morricone", "Danny Elfman"}, "John Williams"),
            new QuestionData("What is the largest mammal in the world?", new String[]{"Blue Whale", "African Elephant", "Giraffe", "Polar Bear"}, "Blue Whale"),
            new QuestionData("What is the national flower of India?", new String[]{"Lotus", "Rose", "Marigold", "Jasmine"}, "Lotus"),
            new QuestionData("Who painted the 'Sistine Chapel Ceiling'?", new String[]{"Michelangelo", "Leonardo da Vinci", "Raphael", "Donatello"}, "Michelangelo"),
            new QuestionData("What is the longest river in Africa?", new String[]{"Nile River", "Congo River", "Zambezi River", "Niger River"}, "Nile River"),
            new QuestionData("Which vitamin is essential for maintaining healthy skin and vision?", new String[]{"Vitamin A", "Vitamin B12", "Vitamin C", "Vitamin D"}, "Vitamin A"),
            new QuestionData("What is the name of the largest moon of Saturn?", new String[]{"Titan", "Europa", "Ganymede", "Callisto"}, "Titan"),
            new QuestionData("In which country was the ancient city of Troy located?", new String[]{"Greece", "Italy", "Turkey", "Egypt"}, "Turkey"),
            new QuestionData("Which country is known for inventing the sport of cricket?", new String[]{"England", "Australia", "India", "South Africa"}, "England"),
            new QuestionData("What is the name of the longest river in South America?", new String[]{"Amazon River", "Orinoco River", "Paraná River", "Magdalena River"}, "Amazon River"),
            new QuestionData("Who is credited with inventing the light bulb?", new String[]{"Thomas Edison", "Nikola Tesla", "Alexander Graham Bell", "Benjamin Franklin"}, "Thomas Edison"),
            new QuestionData("What is the capital city of Germany?", new String[]{"Berlin", "Munich", "Frankfurt", "Hamburg"}, "Berlin"),
            new QuestionData("Which planet in our solar system is known for its prominent ring system?", new String[]{"Jupiter", "Saturn", "Uranus", "Neptune"}, "Saturn"),
            new QuestionData("Who wrote the play 'Macbeth'?", new String[]{"William Shakespeare", "Christopher Marlowe", "Ben Jonson", "John Milton"}, "William Shakespeare"),
            new QuestionData("What is the main ingredient in guacamole?", new String[]{"Tomato", "Onion", "Avocado", "Pepper"}, "Avocado"),
            new QuestionData("What is the largest country in Africa by area?", new String[]{"Nigeria", "South Africa", "Algeria", "Egypt"}, "Algeria"),
            new QuestionData("Who was the first woman to win a Nobel Prize?", new String[]{"Marie Curie", "Rosalind Franklin", "Dorothy Hodgkin", "Ada Lovelace"}, "Marie Curie"),
            new QuestionData("Which ocean lies on the east coast of the United States?", new String[]{"Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Arctic Ocean"}, "Atlantic Ocean"),
            new QuestionData("In Greek mythology, who is the god of the sea?", new String[]{"Poseidon", "Zeus", "Apollo", "Ares"}, "Poseidon"),
            new QuestionData("Which element has the highest melting point?", new String[]{"Iron", "Tungsten", "Gold", "Carbon"}, "Tungsten"),
            new QuestionData("What is the capital city of South Korea?", new String[]{"Seoul", "Pyongyang", "Busan", "Incheon"}, "Seoul"),
            new QuestionData("Who is known as the 'Father of History'?", new String[]{"Herodotus", "Socrates", "Aristotle", "Plato"}, "Herodotus"),
            new QuestionData("What is the name of the largest galaxy in the Local Group?", new String[]{"Milky Way", "Andromeda Galaxy", "Triangulum Galaxy", "Magellanic Clouds"}, "Andromeda Galaxy")



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
