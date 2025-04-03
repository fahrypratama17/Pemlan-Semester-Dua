public class Perpustakaan{
    public static void main(String[] args){

        System.out.println("Berikut adalah daftar buku untuk kategori Teknologi");
        Buku category1Buku1 = new Buku("Teknologi", "The Innovators", "Walter Isaacson", "Simon & Schuster", "2014", 560, "15 x 23 cm", "978-1476708690");
        Buku category1Buku2 = new Buku("Teknologi", "The Fourth Industrial Revolution", "Klaus Schwab", "Crown Business", "2016", 192, "14 x 21 cm", "978-1524758868");
        Buku category1Buku3 = new Buku("Teknologi", "Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "Prentice Hall", "2008", 464, "17 x 24 cm", "978-0132350884");
        Buku category1Buku4 = new Buku("Teknologi", "Artificial Intelligence: A Guide for Thinking Humans", "Melanie Mitchell", "Farrar, Straus and Giroux", "2019", 336, "15 x 23 cm", "978-0374257835");
        Buku category1Buku5 = new Buku("Teknologi", "The Singularity Is Near", "Ray Kurzweil", "Penguin Books", "2005", 652, "16 x 24 cm", "978-0143037880");
        Buku category1Buku6 = new Buku("Teknologi", "How Google Works", "Eric Schmidt & Jonathan Rosenberg", "Grand Central Publishing", "2014", 304, "15 x 23 cm", "978-1455582327");
        Buku category1Buku7 = new Buku("Teknologi", "The Phoenix Project", "Gene Kim, Kevin Behr, George Spafford", "IT Revolution Press", "2013", 432, "16 x 24 cm", "978-0988262591");
        Buku category1Buku8 = new Buku("Teknologi", "Code: The Hidden Language of Computer Hardware and Software", "Charles Petzold", "Microsoft Press", "1999", 400, "17 x 24 cm", "978-0735611313");
        Buku category1Buku9 = new Buku("Teknologi", "The Art of Computer Programming (Volume 1)", "Donald Knuth", "Addison-Wesley", "1997", 672, "18 x 25 cm", "978-0201896831");
        Buku category1Buku10 = new Buku("Teknologi", "Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future", "Ashlee Vance", "HarperCollins", "2015", 400, "15 x 23 cm", "978-0062301253");
        
        category1Buku1.displayMessage();
        category1Buku2.displayMessage();
        category1Buku3.displayMessage();
        category1Buku4.displayMessage();
        category1Buku5.displayMessage();
        category1Buku6.displayMessage();
        category1Buku7.displayMessage();
        category1Buku8.displayMessage();
        category1Buku9.displayMessage();
        category1Buku10.displayMessage();

        System.out.println("Berikut adalah daftar buku untuk kategori Filsafat");
        Buku category2Buku1 = new Buku("Filsafat", "The Republic", "Plato", "Penguin Classics", "2007", 416, "13 x 20 cm", "978-0140455113");
        Buku category2Buku2 = new Buku("Filsafat", "Nicomachean Ethics", "Aristotle", "Oxford University Press", "2009", 352, "14 x 21 cm", "978-0199213610");
        Buku category2Buku3 = new Buku("Filsafat", "Beyond Good and Evil", "Friedrich Nietzsche", "Penguin Classics", "2003", 240, "13 x 20 cm", "978-0140449235");
        Buku category2Buku4 = new Buku("Filsafat", "Meditations", "Marcus Aurelius", "Modern Library", "2002", 256, "13 x 20 cm", "978-0812968255");
        Buku category2Buku5 = new Buku("Filsafat", "Critique of Pure Reason", "Immanuel Kant", "Cambridge University Press", "1998", 785, "15 x 23 cm", "978-0521657297");
        Buku category2Buku6 = new Buku("Filsafat", "Being and Time", "Martin Heidegger", "Harper Perennial", "2008", 589, "15 x 23 cm", "978-0061575594");
        Buku category2Buku7 = new Buku("Filsafat", "The World as Will and Representation", "Arthur Schopenhauer", "Dover Publications", "1969", 576, "14 x 22 cm", "978-0486217611");
        Buku category2Buku8 = new Buku("Filsafat", "Discourse on Method and Meditations on First Philosophy", "René Descartes", "Hackett Publishing", "1999", 128, "13 x 20 cm", "978-0872204201");
        Buku category2Buku9 = new Buku("Filsafat", "The Social Contract", "Jean-Jacques Rousseau", "Penguin Classics", "2006", 192, "13 x 20 cm", "978-0143037491");
        Buku category2Buku10 = new Buku("Filsafat", "The Phenomenology of Spirit", "Georg Wilhelm Friedrich Hegel", "Oxford University Press", "2018", 640, "15 x 23 cm", "978-0198782650");

        category2Buku1.displayMessage();
        category2Buku2.displayMessage();
        category2Buku3.displayMessage();
        category2Buku4.displayMessage();
        category2Buku5.displayMessage();
        category2Buku6.displayMessage();
        category2Buku7.displayMessage();
        category2Buku8.displayMessage();
        category2Buku9.displayMessage();
        category2Buku10.displayMessage();

        System.out.println("Berikut adalah daftar buku untuk kategori Sejarah");
        Buku category3Buku1 = new Buku("Sejarah", "Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "Harper", "2015", 498, "15 x 23 cm", "978-0062316097");
        Buku category3Buku2 = new Buku("Sejarah", "Guns, Germs, and Steel", "Jared Diamond", "W. W. Norton & Company", "1997", 480, "16 x 24 cm", "978-0393317558");
        Buku category3Buku3 = new Buku("Sejarah", "A People's History of the United States", "Howard Zinn", "Harper Perennial", "2015", 784, "15 x 23 cm", "978-0062397348");
        Buku category3Buku4 = new Buku("Sejarah", "The Silk Roads: A New History of the World", "Peter Frankopan", "Vintage", "2017", 672, "14 x 21 cm", "978-1101912379");
        Buku category3Buku5 = new Buku("Sejarah", "The Diary of a Young Girl", "Anne Frank", "Bantam", "1993", 352, "13 x 20 cm", "978-0553296983");
        Buku category3Buku6 = new Buku("Sejarah", "The Wright Brothers", "David McCullough", "Simon & Schuster", "2015", 336, "15 x 23 cm", "978-1476728742");
        Buku category3Buku7 = new Buku("Sejarah", "Genghis Khan and the Making of the Modern World", "Jack Weatherford", "Crown", "2005", 352, "14 x 21 cm", "978-0609809648");
        Buku category3Buku8 = new Buku("Sejarah", "1776", "David McCullough", "Simon & Schuster", "2005", 400, "15 x 23 cm", "978-0743226721");
        Buku category3Buku9 = new Buku("Sejarah", "The Rise and Fall of the Third Reich", "William L. Shirer", "Simon & Schuster", "2011", 1280, "16 x 24 cm", "978-1451651683");
        Buku category3Buku10 = new Buku("Sejarah", "The Histories", "Herodotus", "Penguin Classics", "2003", 952, "13 x 20 cm", "978-0140449082");
        
        category3Buku1.displayMessage();
        category3Buku2.displayMessage();
        category3Buku3.displayMessage();
        category3Buku4.displayMessage();
        category3Buku5.displayMessage();
        category3Buku6.displayMessage();
        category3Buku7.displayMessage();
        category3Buku8.displayMessage();
        category3Buku9.displayMessage();
        category3Buku10.displayMessage();

        System.out.println("Berikut adalah daftar buku untuk kategori Agama");
        Buku category4Buku1 = new Buku("Agama", "The Case for God", "Karen Armstrong", "Anchor", "2010", 432, "15 x 23 cm", "978-0307389800");
        Buku category4Buku2 = new Buku("Agama", "Mere Christianity", "C. S. Lewis", "HarperOne", "2001", 227, "14 x 21 cm", "978-0060652920");
        Buku category4Buku3 = new Buku("Agama", "The Qur'an: A New Translation", "M. A. S. Abdel Haleem", "Oxford University Press", "2008", 464, "14 x 21 cm", "978-0199535958");
        Buku category4Buku4 = new Buku("Agama", "The Bible", "Multiple Authors", "Zondervan", "2011", 2048, "16 x 24 cm", "978-0310436010");
        Buku category4Buku5 = new Buku("Agama", "The Bhagavad Gita", "Eknath Easwaran", "Nilgiri Press", "2007", 294, "14 x 21 cm", "978-1586380199");
        Buku category4Buku6 = new Buku("Agama", "Tao Te Ching", "Laozi", "Penguin Classics", "2009", 176, "13 x 20 cm", "978-0140449334");
        Buku category4Buku7 = new Buku("Agama", "The Dhammapada", "Eknath Easwaran", "Nilgiri Press", "2007", 296, "14 x 21 cm", "978-1586380205");
        Buku category4Buku8 = new Buku("Agama", "God Is Not One", "Stephen Prothero", "HarperOne", "2011", 400, "15 x 23 cm", "978-0061571282");
        Buku category4Buku9 = new Buku("Agama", "The Varieties of Religious Experience", "William James", "Modern Library", "2002", 576, "15 x 23 cm", "978-0679640110");
        Buku category4Buku10 = new Buku("Agama", "The Gospel of the Flying Spaghetti Monster", "Bobby Henderson", "Villard", "2006", 192, "14 x 21 cm", "978-0812976564");

        category4Buku1.displayMessage();
        category4Buku2.displayMessage();
        category4Buku3.displayMessage();
        category4Buku4.displayMessage();
        category4Buku5.displayMessage();
        category4Buku6.displayMessage();
        category4Buku7.displayMessage();
        category4Buku8.displayMessage();
        category4Buku9.displayMessage();
        category4Buku10.displayMessage();

        System.out.println("Berikut adalah daftar buku untuk kategori Psikologi");
        Buku category5Buku1 = new Buku("Psikologi", "Thinking, Fast and Slow", "Daniel Kahneman", "Farrar, Straus and Giroux", "2011", 499, "15 x 23 cm", "978-0374533551");
        Buku category5Buku2 = new Buku("Psikologi", "The Power of Habit", "Charles Duhigg", "Random House", "2012", 400, "14 x 21 cm", "978-0812981605");
        Buku category5Buku3 = new Buku("Psikologi", "Influence: The Psychology of Persuasion", "Robert B. Cialdini", "Harper Business", "2006", 336, "14 x 21 cm", "978-0061241895");
        Buku category5Buku4 = new Buku("Psikologi", "Predictably Irrational", "Dan Ariely", "Harper Perennial", "2009", 384, "14 x 21 cm", "978-0061353246");
        Buku category5Buku5 = new Buku("Psikologi", "The Social Animal", "Elliot Aronson", "Worth Publishers", "2011", 608, "16 x 24 cm", "978-1429233415");
        Buku category5Buku6 = new Buku("Psikologi", "Grit: The Power of Passion and Perseverance", "Angela Duckworth", "Scribner", "2016", 352, "15 x 23 cm", "978-1501111112");
        Buku category5Buku7 = new Buku("Psikologi", "Drive: The Surprising Truth About What Motivates Us", "Daniel H. Pink", "Riverhead Books", "2011", 288, "14 x 21 cm", "978-1594484803");
        Buku category5Buku8 = new Buku("Psikologi", "Man’s Search for Meaning", "Viktor E. Frankl", "Beacon Press", "2006", 165, "14 x 21 cm", "978-0807014295");
        Buku category5Buku9 = new Buku("Psikologi", "Mindset: The New Psychology of Success", "Carol S. Dweck", "Ballantine Books", "2007", 320, "14 x 21 cm", "978-0345472328");
        Buku category5Buku10 = new Buku("Psikologi", "The Lucifer Effect: Understanding How Good People Turn Evil", "Philip Zimbardo", "Random House", "2007", 576, "15 x 23 cm", "978-0812974447");

        category5Buku1.displayMessage();
        category5Buku2.displayMessage();
        category5Buku3.displayMessage();
        category5Buku4.displayMessage();
        category5Buku5.displayMessage();
        category5Buku6.displayMessage();
        category5Buku7.displayMessage();
        category5Buku8.displayMessage();
        category5Buku9.displayMessage();
        category5Buku10.displayMessage();

        System.out.println("Berikut adalah daftar buku untuk kategori Politik");
        Buku category6Buku1 = new Buku("Politik", "The Prince", "Niccolò Machiavelli", "Penguin Classics", "2003", 176, "13 x 20 cm", "978-0140449150");
        Buku category6Buku2 = new Buku("Politik", "The Communist Manifesto", "Karl Marx & Friedrich Engels", "Oxford University Press", "2008", 96, "13 x 20 cm", "978-0199535712");
        Buku category6Buku3 = new Buku("Politik", "On Liberty", "John Stuart Mill", "Dover Publications", "2002", 112, "14 x 21 cm", "978-0486421308");
        Buku category6Buku4 = new Buku("Politik", "The Road to Serfdom", "F. A. Hayek", "University of Chicago Press", "2007", 274, "15 x 23 cm", "978-0226320557");
        Buku category6Buku5 = new Buku("Politik", "Leviathan", "Thomas Hobbes", "Penguin Classics", "1982", 736, "13 x 20 cm", "978-0140431957");
        Buku category6Buku6 = new Buku("Politik", "Democracy in America", "Alexis de Tocqueville", "Library of America", "2004", 928, "16 x 24 cm", "978-1931082549");
        Buku category6Buku7 = new Buku("Politik", "The Origins of Totalitarianism", "Hannah Arendt", "Harcourt", "1973", 576, "15 x 23 cm", "978-0156701532");
        Buku category6Buku8 = new Buku("Politik", "The Federalist Papers", "Alexander Hamilton, James Madison, John Jay", "Signet", "2003", 688, "14 x 21 cm", "978-0451528810");
        Buku category6Buku9 = new Buku("Politik", "The End of History and the Last Man", "Francis Fukuyama", "Free Press", "2006", 448, "15 x 23 cm", "978-0743284554");
        Buku category6Buku10 = new Buku("Politik", "Why Nations Fail", "Daron Acemoglu & James A. Robinson", "Crown Business", "2012", 546, "15 x 23 cm", "978-0307719225");

        category6Buku1.displayMessage();
        category6Buku2.displayMessage();
        category6Buku3.displayMessage();
        category6Buku4.displayMessage();
        category6Buku5.displayMessage();
        category6Buku6.displayMessage();
        category6Buku7.displayMessage();
        category6Buku8.displayMessage();
        category6Buku9.displayMessage();
        category6Buku10.displayMessage();

        System.out.println("Berikut adalah daftar buku untuk kategori Fiksi");
        Buku category7Buku1 = new Buku("Fiksi", "To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", "1960", 281, "14 x 21 cm", "978-0061120084");
        Buku category7Buku2 = new Buku("Fiksi", "1984", "George Orwell", "Secker & Warburg", "1949", 328, "14 x 21 cm", "978-0451524935");
        Buku category7Buku3 = new Buku("Fiksi", "The Great Gatsby", "F. Scott Fitzgerald", "Scribner", "1925", 180, "14 x 21 cm", "978-0743273565");
        Buku category7Buku4 = new Buku("Fiksi", "Pride and Prejudice", "Jane Austen", "T. Egerton", "1813", 279, "13 x 20 cm", "978-0141439518");
        Buku category7Buku5 = new Buku("Fiksi", "Moby-Dick", "Herman Melville", "Harper & Brothers", "1851", 585, "15 x 23 cm", "978-1503280786");
        Buku category7Buku6 = new Buku("Fiksi", "Brave New World", "Aldous Huxley", "Chatto & Windus", "1932", 311, "14 x 21 cm", "978-0060850524");
        Buku category7Buku7 = new Buku("Fiksi", "The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", "1951", 277, "14 x 21 cm", "978-0316769488");
        Buku category7Buku8 = new Buku("Fiksi", "The Hobbit", "J.R.R. Tolkien", "George Allen & Unwin", "1937", 310, "15 x 23 cm", "978-0345339683");
        Buku category7Buku9 = new Buku("Fiksi", "Crime and Punishment", "Fyodor Dostoevsky", "The Russian Messenger", "1866", 671, "15 x 23 cm", "978-0486415871");
        Buku category7Buku10 = new Buku("Fiksi", "The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", "1954", 1178, "15 x 23 cm", "978-0618640157");

        category7Buku1.displayMessage();
        category7Buku2.displayMessage();
        category7Buku3.displayMessage();
        category7Buku4.displayMessage();
        category7Buku5.displayMessage();
        category7Buku6.displayMessage();
        category7Buku7.displayMessage();
        category7Buku8.displayMessage();
        category7Buku9.displayMessage();
        category7Buku10.displayMessage();
    }
}