package Documents;

public class TimedDocument extends DocumentDecorator
{
    public TimedDocument(String gcsPath)
    {
        decoratedDoc = new SmartDocument(gcsPath);
    }
    @Override
    public String parse()
    {
        long startTime = System.currentTimeMillis();
        String result = decoratedDoc.parse();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Parsing took " + elapsedTime + " milliseconds.");

        return result;
    }
}
