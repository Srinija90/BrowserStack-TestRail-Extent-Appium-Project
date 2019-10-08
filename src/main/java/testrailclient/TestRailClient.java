package testrailclient;

import testrailclient.APIClient;

public class TestRailClient {

    public static APIClient getClient() {
        APIClient apiClient = new APIClient("https://beautystack.testrail.io");
        apiClient.setUser("srinija.kopparapu@gmail.com");
        apiClient.setPassword("qwerty");

        return apiClient;
    }

}
