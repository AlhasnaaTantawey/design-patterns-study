
import behavioral.strategy.after.*;
import behavioral.template.after.ImageCVReportGeration2;
import behavioral.template.after.PDFCVReportGeration2;
import behavioral.template.after.WordCVReportGeration2;
import behavioral.template.before.GenerateReport;
import behavioral.template.before.ImageCVReportGeration;
import behavioral.template.before.PDFCVReportGeration;
import behavioral.template.before.WordCVReportGeration;

//4. Client (component of strategy pattern)
public class Main {
    public static void main(String[] args) {



        //apply strategy Pattern
//        ShoppingCart cart = new ShoppingCart();
//
//        // apply discount for regular customer
//
//        cart.setDiscountStrategy(new RegularCustomerDiscount());
//
//        System.out.println("Final Price (Regular): $" + cart.calculateFinalPrice(100));
//
//        // apply discount for VIP customer
//
//        cart.setDiscountStrategy(new VIPCustomerDiscount());
//
//        System.out.println("Final Price (VIP): $" +  cart.calculateFinalPrice(100));
//
//        // apply discount for new customer
//
//        cart.setDiscountStrategy(new NewCustomerDiscount());
//
//        System.out.println("Final Price (New Customer): $" + cart.calculateFinalPrice(100));
//
//        // apply discount for Gold customer
//
//        cart.setDiscountStrategy(new GoldCustomerDiscount());
//
//        System.out.println("Final Price (Gold Customer): $" + cart.calculateFinalPrice(100));


        // before applying strategy pattern

//        Product wallet=new Product(100, "wallet");
//        Product bike=new Product(200,"bike");
//        Product watch=new Product(300 ,"watch");
//        System.out.println( wallet.calculatePrice(MemberShipType.GOLD));
//        System.out.println(watch.calculatePrice(MemberShipType.PREMIUM));
//        System.out.println( bike.calculatePrice(MemberShipType.REGULAR));
//
//        Checkout checkout=new Checkout();
//        checkout.processPayment(wallet.getPrice(), PaymentMethod.BANK_TRANSFER);
//        checkout.processPayment(bike.getPrice(), PaymentMethod.PAYPAL);
//        checkout.processPayment(watch.getPrice(), PaymentMethod.VISA_CARDS);

        //  applying strategy pattern

//        Product2 watch =new Product2(100,"watch",new GoldMembership2());
//        watch.calculateFinalPrice( watch.getPrice());
//
//        System.out.println( "");
//
//        Product2 TV =new Product2(10000,"TV",new RegularMembership2());
//        TV.calculateFinalPrice( TV.getPrice());
//
//        System.out.println( "");
//        Product2 ball =new Product2(100,"ball",new PreiumMembership2());
//        ball.calculateFinalPrice(ball.getPrice());
//
//        Checkout2 watchcheckout2=new Checkout2(new BankTransferPaymentStrategy());
//        Checkout2 TVcheckout2=new Checkout2(new PaypalPaymentStrategy());
//        Checkout2 ballcheckout2=new Checkout2(new VisaCardPaymentStrategy());
//
//        watchcheckout2.processPayment(watch.getPrice());
//        TVcheckout2.processPayment(TV.getPrice());
//        ballcheckout2.processPayment(ball.getPrice());






//        observer exmples
//        OnlionMarketPlace onlionMarketPlace=new OnlionMarketPlace();
//
//        Subscriber alhasnaa=new Customer("alhasnaa");
//        Subscriber elsayed=new Customer("elsayed");
//        Subscriber ali=new Customer("ali");
//        Subscriber mohamed=new Customer("mohamed");
//        Subscriber jobFinder=new JobFinder("alia");
//        Subscriber shippingCompany =new ShippingCompany("Raya");
//
//
//        onlionMarketPlace.Subscribers(EventType.NEW_PRODUCT,alhasnaa);
//        onlionMarketPlace.Subscribers(EventType.NEW_OFFER,ali);
//        onlionMarketPlace.Subscribers(EventType.NEW_PRODUCT,elsayed);
//        onlionMarketPlace.Subscribers(EventType.NEW_OFFER,mohamed);
//        onlionMarketPlace.Subscribers(EventType.JOB_OPENING, jobFinder);
//
//        onlionMarketPlace.Subscribers(EventType.NEW_PRODUCT, shippingCompany);
//
//
//        onlionMarketPlace.addNewJonbOpening(new JobFinder("sales manager"));
//        onlionMarketPlace.addNewProduct(new Product("tv",1000.0));
//        onlionMarketPlace.addNewOffer(new Offer("new offer with 20% discount for every item"));

        //without applying template pattern
//
//        PDFCVReportGeration pdfcvReportGeration=new PDFCVReportGeration();
//       GenerateReport pdfGenerratedReport= pdfcvReportGeration.generateCVReport("tmp/cv-001.pdf");
//        System.out.println(pdfGenerratedReport.isPasses());
//
//        WordCVReportGeration wordCVReportGeration=new WordCVReportGeration();
//       GenerateReport wordGeneratedReport=  wordCVReportGeration.generateCVReport("tmp/cv-002.doc");
//        System.out.println(wordGeneratedReport.isPasses());
//
//        ImageCVReportGeration imageCVReportGeration=new ImageCVReportGeration();
//        GenerateReport imageGeneratedReport=  imageCVReportGeration.generateCVReport("tmp/cv-003.png");
//        System.out.println(imageGeneratedReport.isPasses());


        //applying template pattern

        PDFCVReportGeration2 pdfcvReportGeration=new PDFCVReportGeration2();
        GenerateReport pdfGenerratedReport= pdfcvReportGeration.generateCVReport("tmp/cv-001.pdf",true);
        System.out.println(pdfGenerratedReport.isPasses());
        System.out.println("/n");

        WordCVReportGeration2 wordCVReportGeration=new WordCVReportGeration2();
        GenerateReport wordGeneratedReport=  wordCVReportGeration.generateCVReport("tmp/cv-002.doc",false);
        System.out.println(wordGeneratedReport.isPasses());
        System.out.println("/n");

        ImageCVReportGeration2 imageCVReportGeration=new ImageCVReportGeration2();
        GenerateReport imageGeneratedReport=  imageCVReportGeration.generateCVReport("tmp/cv-003.png",false);
        System.out.println(imageGeneratedReport.isPasses());

    }
}