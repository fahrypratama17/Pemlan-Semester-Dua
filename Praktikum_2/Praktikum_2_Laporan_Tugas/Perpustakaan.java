
import java.util.Scanner;

public class Perpustakaan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Berikut adalah daftar buku untuk kategori Teknologi");
        Buku category1Buku1 = new Buku("Teknologi", "The Innovators", "Walter Isaacson", "Simon & Schuster", "2014", 560, "15 x 23 cm", "978-1476708690", "Kisah para inovator yang membentuk era digital modern melalui pengembangan komputer, internet, dan kecerdasan buatan.");
        Buku category1Buku2 = new Buku("Teknologi", "The Fourth Industrial Revolution", "Klaus Schwab", "Crown Business", "2016", 192, "14 x 21 cm", "978-1524758868", "Membahas dampak besar Revolusi Industri 4.0 dengan teknologi AI, IoT, otomatisasi, dan perubahan ekonomi global.");
        Buku category1Buku3 = new Buku("Teknologi", "Clean Code", "Robert C. Martin", "Prentice Hall", "2008", 464, "17 x 24 cm", "978-0132350884", "Panduan bagi pengembang perangkat lunak untuk menulis kode yang bersih, efisien, mudah dibaca, dan berkelanjutan.");
        Buku category1Buku4 = new Buku("Teknologi", "Artificial Intelligence", "Melanie Mitchell", "Farrar, Straus and Giroux", "2019", 336, "15 x 23 cm", "978-0374257835", "Penjelasan tentang AI dari sudut pandang manusia, serta tantangan etika dan filosofi yang dihadapi dalam perkembangannya.");
        Buku category1Buku5 = new Buku("Teknologi", "The Singularity Is Near", "Ray Kurzweil", "Penguin Books", "2005", 652, "16 x 24 cm", "978-0143037880", "Prediksi tentang masa depan teknologi ketika kecerdasan buatan melampaui kecerdasan manusia dalam berbagai aspek kehidupan.");

        category1Buku1.displayMessage();
        category1Buku2.displayMessage();
        category1Buku3.displayMessage();
        category1Buku4.displayMessage();
        category1Buku5.displayMessage();

        System.out.println("Berikut adalah daftar buku untuk kategori Filsafat");
        Buku category2Buku1 = new Buku("Filsafat", "The Republic", "Plato", "Penguin Classics", "2007", 416, "13 x 20 cm", "978-0140455113", "Dialog filosofis Plato tentang konsep keadilan, bentuk negara ideal, dan peran filsafat dalam kehidupan manusia.");
        Buku category2Buku2 = new Buku("Filsafat", "Nicomachean Ethics", "Aristotle", "Oxford University Press", "2009", 352, "14 x 21 cm", "978-0199213610", "Panduan etika dari Aristoteles tentang bagaimana manusia mencapai kebahagiaan sejati melalui kebajikan dan tindakan moral.");
        Buku category2Buku3 = new Buku("Filsafat", "Beyond Good and Evil", "Friedrich Nietzsche", "Penguin Classics", "2003", 240, "13 x 20 cm", "978-0140449235", "Kritik terhadap moralitas tradisional serta eksplorasi konsep kebebasan, kekuasaan, dan individu dalam masyarakat.");
        Buku category2Buku4 = new Buku("Filsafat", "Meditations", "Marcus Aurelius", "Modern Library", "2002", 256, "13 x 20 cm", "978-0812968255", "Kumpulan pemikiran Stoik Marcus Aurelius tentang kebijaksanaan, ketahanan, serta cara hidup yang berorientasi pada kebaikan.");
        Buku category2Buku5 = new Buku("Filsafat", "Critique of Pure Reason", "Immanuel Kant", "Cambridge University Press", "1998", 785, "15 x 23 cm", "978-0521657297", "Analisis kritis Kant mengenai batasan akal manusia dalam memahami realitas dan dasar pengetahuan yang rasional.");

        category2Buku1.displayMessage();
        category2Buku2.displayMessage();
        category2Buku3.displayMessage();
        category2Buku4.displayMessage();
        category2Buku5.displayMessage();

        System.out.println("Berikut adalah daftar buku untuk kategori Sejarah");
        Buku category3Buku1 = new Buku("Sejarah", "Sapiens", "Yuval Noah Harari", "Harper", "2015", 498, "15 x 23 cm", "978-0062316097", "Sebuah perjalanan sejarah evolusi manusia dari zaman purba hingga era modern dengan pendekatan sains dan budaya.");
        Buku category3Buku2 = new Buku("Sejarah", "Guns, Germs, and Steel", "Jared Diamond", "W. W. Norton & Company", "1997", 480, "16 x 24 cm", "978-0393317558", "Studi mengenai faktor lingkungan dan biologis yang membentuk perbedaan perkembangan antar peradaban dunia.");
        Buku category3Buku3 = new Buku("Sejarah", "A People's History of the United States", "Howard Zinn", "Harper Perennial", "2015", 784, "15 x 23 cm", "978-0062397348", "Sejarah Amerika dari perspektif rakyat biasa, menyoroti perjuangan kaum tertindas dalam menghadapi kekuasaan.");
        Buku category3Buku4 = new Buku("Sejarah", "The Silk Roads", "Peter Frankopan", "Vintage", "2017", 672, "14 x 21 cm", "978-1101912379", "Mengungkap sejarah dunia dari sudut pandang jalur perdagangan yang menghubungkan berbagai peradaban.");
        Buku category3Buku5 = new Buku("Sejarah", "The Diary of a Young Girl", "Anne Frank", "Bantam", "1993", 352, "13 x 20 cm", "978-0553296983", "Catatan harian seorang gadis Yahudi selama masa persembunyian dari Nazi di Perang Dunia II.");

        category3Buku1.displayMessage();
        category3Buku2.displayMessage();
        category3Buku3.displayMessage();
        category3Buku4.displayMessage();
        category3Buku5.displayMessage();

        System.out.println("Berikut adalah daftar buku untuk kategori Agama");
        Buku category4Buku1 = new Buku("Agama", "The Case for God", "Karen Armstrong", "Anchor", "2010", 432, "15 x 23 cm", "978-0307389800", "Eksplorasi sejarah dan evolusi konsep ketuhanan dalam berbagai tradisi agama di seluruh dunia.");
        Buku category4Buku2 = new Buku("Agama", "Mere Christianity", "C. S. Lewis", "HarperOne", "2001", 227, "14 x 21 cm", "978-0060652920", "Penjelasan mendalam tentang keyakinan Kristen berdasarkan logika, moralitas, dan pemikiran rasional yang kuat.");
        Buku category4Buku3 = new Buku("Agama", "The Qur'an: A New Translation", "M. A. S. Abdel Haleem", "Oxford University Press", "2008", 464, "14 x 21 cm", "978-0199535958", "Terjemahan modern Al-Qur'an yang memberikan konteks sejarah dan linguistik bagi pembaca masa kini.");
        Buku category4Buku4 = new Buku("Agama", "The Bible", "Multiple Authors", "Zondervan", "2011", 2048, "16 x 24 cm", "978-0310436010", "Kitab suci utama dalam tradisi Kristen, mencakup Perjanjian Lama dan Perjanjian Baru secara lengkap.");
        Buku category4Buku5 = new Buku("Agama", "The Bhagavad Gita", "Eknath Easwaran", "Nilgiri Press", "2007", 294, "14 x 21 cm", "978-1586380199", "Dialog spiritual dalam Mahabharata yang mengajarkan kebijaksanaan, kewajiban, dan konsep kehidupan sejati dalam Hindu.");

        category4Buku1.displayMessage();
        category4Buku2.displayMessage();
        category4Buku3.displayMessage();
        category4Buku4.displayMessage();
        category4Buku5.displayMessage();

        System.out.println("Berikut adalah daftar buku untuk kategori Psikologi");
        Buku category5Buku1 = new Buku("Psikologi", "Thinking, Fast and Slow", "Daniel Kahneman", "Farrar, Straus and Giroux", "2011", 499, "15 x 23 cm", "978-0374533551", "Analisis tentang dua sistem berpikir manusia: cepat intuitif dan lambat rasional dalam pengambilan keputusan.");
        Buku category5Buku2 = new Buku("Psikologi", "The Power of Habit", "Charles Duhigg", "Random House", "2012", 400, "14 x 21 cm", "978-0812981605", "Bagaimana kebiasaan terbentuk, bekerja dalam otak, serta bagaimana mengubahnya untuk mencapai kesuksesan.");
        Buku category5Buku3 = new Buku("Psikologi", "Influence: The Psychology of Persuasion", "Robert B. Cialdini", "Harper Business", "2006", 336, "14 x 21 cm", "978-0061241895", "Prinsip-prinsip psikologis yang menjelaskan bagaimana seseorang dapat dipengaruhi untuk berkata 'ya'.");
        Buku category5Buku4 = new Buku("Psikologi", "Predictably Irrational", "Dan Ariely", "Harper Perennial", "2009", 384, "14 x 21 cm", "978-0061353246", "Studi tentang perilaku manusia yang sering kali irasional dalam pengambilan keputusan sehari-hari.");
        Buku category5Buku5 = new Buku("Psikologi", "The Social Animal", "Elliot Aronson", "Worth Publishers", "2011", 608, "16 x 24 cm", "978-1429233415", "Eksplorasi mendalam mengenai psikologi sosial dan bagaimana manusia berinteraksi dalam kehidupan sosial.");

        category5Buku1.displayMessage();
        category5Buku2.displayMessage();
        category5Buku3.displayMessage();
        category5Buku4.displayMessage();
        category5Buku5.displayMessage();

        System.out.println("Berikut adalah daftar buku untuk kategori Politik");
        Buku category6Buku1 = new Buku("Politik", "The Prince", "Niccolò Machiavelli", "Penguin Classics", "2003", 176, "13 x 20 cm", "978-0140449150", "Panduan klasik tentang kekuasaan dan strategi politik untuk pemimpin ambisius di dunia pemerintahan.");
        Buku category6Buku2 = new Buku("Politik", "The Communist Manifesto", "Karl Marx & Friedrich Engels", "Oxford University Press", "2008", 96, "13 x 20 cm", "978-0199535712", "Manifesto revolusi kaum proletar yang menentang kapitalisme dan menjelaskan perjuangan kelas masyarakat.");
        Buku category6Buku3 = new Buku("Politik", "On Liberty", "John Stuart Mill", "Dover Publications", "2002", 112, "14 x 21 cm", "978-0486421308", "Esai politik klasik tentang kebebasan individu dan batasan yang seharusnya dimiliki oleh kekuasaan negara.");
        Buku category6Buku4 = new Buku("Politik", "The Road to Serfdom", "F. A. Hayek", "University of Chicago Press", "2007", 274, "15 x 23 cm", "978-0226320557", "Peringatan tentang bahaya sosialisme bagi kebebasan individu serta ekonomi berbasis pasar bebas.");
        Buku category6Buku5 = new Buku("Politik", "Leviathan", "Thomas Hobbes", "Penguin Classics", "1982", 736, "13 x 20 cm", "978-0140431957", "Teori kontrak sosial yang menjelaskan bagaimana kekuasaan negara berperan dalam menciptakan stabilitas masyarakat.");

        category6Buku1.displayMessage();
        category6Buku2.displayMessage();
        category6Buku3.displayMessage();
        category6Buku4.displayMessage();
        category6Buku5.displayMessage();

        System.out.println("Berikut adalah daftar buku untuk kategori Fiksi");
        Buku category7Buku1 = new Buku("Fiksi", "To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", "1960", 281, "14 x 21 cm", "978-0061120084", "Mengisahkan perjuangan melawan rasisme dan ketidakadilan di Amerika melalui sudut pandang seorang gadis kecil.");
        Buku category7Buku2 = new Buku("Fiksi", "1984", "George Orwell", "Secker & Warburg", "1949", 328, "14 x 21 cm", "978-0451524935", "Distopia totaliter di mana pemerintah mengendalikan setiap aspek kehidupan, menghilangkan kebebasan berpikir dan berbicara.");
        Buku category7Buku3 = new Buku("Fiksi", "The Great Gatsby", "F. Scott Fitzgerald", "Scribner", "1925", 180, "14 x 21 cm", "978-0743273565", "Tragedi cinta, ambisi, dan ilusi kemewahan dalam era Jazz Amerika, diwarnai dengan intrik sosial dan keserakahan.");
        Buku category7Buku4 = new Buku("Fiksi", "Pride and Prejudice", "Jane Austen", "T. Egerton", "1813", 279, "13 x 20 cm", "978-0141439518", "Romansa klasik yang menyoroti perbedaan kelas sosial, prasangka, dan perjuangan seorang wanita dalam menemukan cinta sejati.");
        Buku category7Buku5 = new Buku("Fiksi", "Moby-Dick", "Herman Melville", "Harper & Brothers", "1851", 585, "15 x 23 cm", "978-1503280786", "Kisah epik Kapten Ahab yang terobsesi memburu paus putih legendaris, menggambarkan kegilaan, takdir, dan balas dendam.");

        category7Buku1.displayMessage();
        category7Buku2.displayMessage();
        category7Buku3.displayMessage();
        category7Buku4.displayMessage();
        category7Buku5.displayMessage();

        double persenKesamaan = category1Buku1.cekPersenKesamaan(category1Buku3);
        System.out.println("Persen Kesamaan: " + persenKesamaan + "%\n\n");

        Buku bukuSalin = category7Buku5.copyBuku();
        bukuSalin.displayMessage();

        System.out.print("\nMasukkan harga per buku (Rp): ");
        double hargaBuku = input.nextDouble();

        System.out.print("\nMasukkan persen royalti: ");
        int persenRoyalti = input.nextInt();

        double royalti = category7Buku1.hitungRoyalti(hargaBuku, persenRoyalti);
        System.out.println("Royalti yang diterima (" + persenRoyalti + ") : Rp " + royalti);
    }
}
