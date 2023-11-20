package Documents;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CachedDocument extends DocumentDecorator {
    public String gcsPath;
    public CachedDocument(String gcsPath) {
        decoratedDoc = new SmartDocument(gcsPath);
        this.gcsPath = gcsPath;
    }

    @Override
    public String parse() {
        String cachedResult = RetrieveFromCache();

        if (cachedResult != null) {
            System.out.println("Using cached result.");
            return cachedResult;
        }

        String parsedResult = decoratedDoc.parse();
        StoreInCache(parsedResult);

        return parsedResult;
    }

    private String RetrieveFromCache() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:cache.db")) {
            CreateCacheTable(connection);

            String key = gcsPath;
            try (PreparedStatement statement = connection.prepareStatement("SELECT value FROM cache WHERE key = ?")) {
                statement.setString(1, key);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return resultSet.getString("value");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void StoreInCache(String toCache) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:cache.db")) {
            CreateCacheTable(connection);

            String key = gcsPath;
            try (PreparedStatement statement = connection.prepareStatement("INSERT INTO cache (key, value) VALUES (?, ?)")) {
                statement.setString(1, key);
                statement.setString(2, toCache);
                statement.executeUpdate();
            }
            System.out.println("Storing result in the cache.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void CreateCacheTable(Connection connection) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS cache (key TEXT PRIMARY KEY, value TEXT)")) {
            statement.executeUpdate();
        }
    }
}
