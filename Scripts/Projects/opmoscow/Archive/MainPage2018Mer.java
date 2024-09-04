package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class MainPage2018Mer extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_MainPage2018Mer = http
      .baseUrl("https://www.youtube.com")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC40_0 = new HashMap<>();
    headersUC40_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC40_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC40_0.put("sec-ch-ua-mobile", "?0");
    headersUC40_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC40_7 = new HashMap<>();
    headersUC40_7.put("Origin", "https://www.youtube.com");
    headersUC40_7.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC40_7.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC40_7.put("sec-ch-ua-mobile", "?0");
    headersUC40_7.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC40_9 = new HashMap<>();
    headersUC40_9.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headersUC40_9.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC40_9.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC40_9.put("priority", "i");
    headersUC40_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC40_9.put("sec-ch-ua-mobile", "?0");
    headersUC40_9.put("sec-ch-ua-platform", "Linux");
    headersUC40_9.put("sec-fetch-dest", "image");
    headersUC40_9.put("sec-fetch-mode", "no-cors");
    headersUC40_9.put("sec-fetch-site", "same-origin");
    headersUC40_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC40_9.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    Map<CharSequence, String> headersUC40_10 = new HashMap<>();
    headersUC40_10.put("accept", "*/*");
    headersUC40_10.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC40_10.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC40_10.put("authorization", "SAPISIDHASH 1724484017_2aec38c3f076105bb86377da0db126e013203ba6");
    headersUC40_10.put("content-type", "application/json");
    headersUC40_10.put("origin", "https://www.youtube.com");
    headersUC40_10.put("priority", "u=1, i");
    headersUC40_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC40_10.put("sec-ch-ua-mobile", "?0");
    headersUC40_10.put("sec-ch-ua-platform", "Linux");
    headersUC40_10.put("sec-fetch-dest", "empty");
    headersUC40_10.put("sec-fetch-mode", "cors");
    headersUC40_10.put("sec-fetch-site", "same-origin");
    headersUC40_10.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC40_10.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC40_10.put("x-goog-authuser", "1");
    headersUC40_10.put("x-goog-event-time", "1724484017184");
    headersUC40_10.put("x-goog-request-time", "1724484017184");
    headersUC40_10.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSiuk6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
    headersUC40_10.put("x-origin", "https://www.youtube.com");
    headersUC40_10.put("x-youtube-ad-signals", "dt=1724484016024&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C1017%2C600&vis=1&wgl=true&ca_type=image");
    headersUC40_10.put("x-youtube-client-name", "56");
    headersUC40_10.put("x-youtube-client-version", "1.20240820.01.00");
    headersUC40_10.put("x-youtube-time-zone", "Asia/Tashkent");
    headersUC40_10.put("x-youtube-utc-offset", "300");
    
    Map<CharSequence, String> headersUC40_11 = new HashMap<>();
    headersUC40_11.put("accept", "*/*");
    headersUC40_11.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC40_11.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC40_11.put("origin", "https://www.youtube.com");
    headersUC40_11.put("priority", "u=1, i");
    headersUC40_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC40_11.put("sec-ch-ua-mobile", "?0");
    headersUC40_11.put("sec-ch-ua-platform", "Linux");
    headersUC40_11.put("sec-fetch-dest", "empty");
    headersUC40_11.put("sec-fetch-mode", "cors");
    headersUC40_11.put("sec-fetch-site", "cross-site");
    headersUC40_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC40_11.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    Map<CharSequence, String> headersUC40_12 = new HashMap<>();
    headersUC40_12.put("accept", "*/*");
    headersUC40_12.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC40_12.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC40_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC40_12.put("sec-ch-ua-mobile", "?0");
    headersUC40_12.put("sec-ch-ua-platform", "Linux");
    headersUC40_12.put("sec-fetch-dest", "script");
    headersUC40_12.put("sec-fetch-mode", "no-cors");
    headersUC40_12.put("sec-fetch-site", "cross-site");
    headersUC40_12.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC40_12.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    Map<CharSequence, String> headersUC40_14 = new HashMap<>();
    headersUC40_14.put("accept", "*/*");
    headersUC40_14.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC40_14.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC40_14.put("content-type", "application/json+protobuf");
    headersUC40_14.put("origin", "https://www.youtube.com");
    headersUC40_14.put("priority", "u=1, i");
    headersUC40_14.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC40_14.put("sec-ch-ua-mobile", "?0");
    headersUC40_14.put("sec-ch-ua-platform", "Linux");
    headersUC40_14.put("sec-fetch-dest", "empty");
    headersUC40_14.put("sec-fetch-mode", "cors");
    headersUC40_14.put("sec-fetch-site", "cross-site");
    headersUC40_14.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC40_14.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC40_14.put("x-goog-api-key", "AIzaSyDyT5W0Jh49F30Pqqtyfdf7pDLFKLJoAnw");
    headersUC40_14.put("x-user-agent", "grpc-web-javascript/0.1");
    
    Map<CharSequence, String> headersUC40_15 = new HashMap<>();
    headersUC40_15.put("accept", "*/*");
    headersUC40_15.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC40_15.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC40_15.put("authorization", "SAPISIDHASH 1d5b27c6a579a965f51cbd7d4693f8a3b7fc42cb");
    headersUC40_15.put("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
    headersUC40_15.put("origin", "https://www.youtube.com");
    headersUC40_15.put("priority", "u=1, i");
    headersUC40_15.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC40_15.put("sec-ch-ua-mobile", "?0");
    headersUC40_15.put("sec-ch-ua-platform", "Linux");
    headersUC40_15.put("sec-fetch-dest", "empty");
    headersUC40_15.put("sec-fetch-mode", "cors");
    headersUC40_15.put("sec-fetch-site", "cross-site");
    headersUC40_15.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC40_15.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC40_15.put("x-goog-authuser", "0");
    
    Map<CharSequence, String> headersUC40_66 = new HashMap<>();
    headersUC40_66.put("accept", "*/*");
    headersUC40_66.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC40_66.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC40_66.put("origin", "https://shtab.opmoscow.ru");
    headersUC40_66.put("priority", "u=1, i");
    headersUC40_66.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC40_66.put("sec-ch-ua-mobile", "?0");
    headersUC40_66.put("sec-ch-ua-platform", "Linux");
    headersUC40_66.put("sec-fetch-dest", "empty");
    headersUC40_66.put("sec-fetch-mode", "cors");
    headersUC40_66.put("sec-fetch-site", "cross-site");
    headersUC40_66.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC40_67 = new HashMap<>();
    headersUC40_67.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC40_67.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC40_67.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC40_67.put("priority", "u=0, i");
    headersUC40_67.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC40_67.put("sec-ch-ua-mobile", "?0");
    headersUC40_67.put("sec-ch-ua-platform", "Linux");
    headersUC40_67.put("sec-fetch-dest", "document");
    headersUC40_67.put("sec-fetch-mode", "navigate");
    headersUC40_67.put("sec-fetch-site", "same-origin");
    headersUC40_67.put("sec-fetch-user", "?1");
    headersUC40_67.put("upgrade-insecure-requests", "1");
    headersUC40_67.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC40_79 = new HashMap<>();
    headersUC40_79.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC40_79.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC40_79.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC40_79.put("priority", "u=0, i");
    headersUC40_79.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC40_79.put("sec-ch-ua-mobile", "?0");
    headersUC40_79.put("sec-ch-ua-platform", "Linux");
    headersUC40_79.put("sec-fetch-dest", "iframe");
    headersUC40_79.put("sec-fetch-mode", "navigate");
    headersUC40_79.put("sec-fetch-site", "cross-site");
    headersUC40_79.put("upgrade-insecure-requests", "1");
    headersUC40_79.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC40_79.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    Map<CharSequence, String> headersUC40_88 = new HashMap<>();
    headersUC40_88.put("Upgrade-Insecure-Requests", "1");
    headersUC40_88.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC40_88.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC40_88.put("sec-ch-ua-mobile", "?0");
    headersUC40_88.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC40_110 = new HashMap<>();
    headersUC40_110.put("accept", "*/*");
    headersUC40_110.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC40_110.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC40_110.put("authorization", "SAPISIDHASH 1724484024_b56251584bc3e2280bd883e351de69378093c633");
    headersUC40_110.put("content-type", "application/json");
    headersUC40_110.put("origin", "https://www.youtube.com");
    headersUC40_110.put("priority", "u=1, i");
    headersUC40_110.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC40_110.put("sec-ch-ua-mobile", "?0");
    headersUC40_110.put("sec-ch-ua-platform", "Linux");
    headersUC40_110.put("sec-fetch-dest", "empty");
    headersUC40_110.put("sec-fetch-mode", "cors");
    headersUC40_110.put("sec-fetch-site", "same-origin");
    headersUC40_110.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC40_110.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC40_110.put("x-goog-authuser", "1");
    headersUC40_110.put("x-goog-event-time", "1724484024520");
    headersUC40_110.put("x-goog-request-time", "1724484024521");
    headersUC40_110.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSizk6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
    headersUC40_110.put("x-origin", "https://www.youtube.com");
    headersUC40_110.put("x-youtube-ad-signals", "dt=1724484022053&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C1017%2C600&vis=1&wgl=true&ca_type=image&bid=ANyPxKqBl-n-sEYhQnPr4cS8QkxI5YbewRFY7NwRnNucNBARQ4QBtQL-_q902pDIPZsYCD3_hh3NPhaWOgQtId1lKt4spzyrzA");
    headersUC40_110.put("x-youtube-client-name", "56");
    headersUC40_110.put("x-youtube-client-version", "1.20240820.01.00");
    headersUC40_110.put("x-youtube-time-zone", "Asia/Tashkent");
    headersUC40_110.put("x-youtube-utc-offset", "300");
    
    String uri01 = "https://jnn-pa.googleapis.com/$rpc/google.internal.waa.v1.Waa";
    
    String uri03 = "https://googleads.g.doubleclick.net/pagead/id";
    
    String uri04 = "https://www.google.com/js/th/JNHVvl2kSR9fjdF95zymQ6dEkKki6kBWa3TewZmiOS4.js";
    
    String uri05 = "https://fonts.gstatic.com/s/roboto/v18";
    
    String uri06 = "https://www.gstatic.com";
    
    String uri07 = "https://i.ytimg.com";
    
    String uri08 = "https://play.google.com/log";
    
    String uri09 = "https://static.doubleclick.net/instream/ad_status.js";
    
    String uri10 = "https://mc.yandex.ru";
    
    String uri11 = "https://yt3.ggpht.com/ytc/AIdro_mzDihl2M5HeRapUkSW3tlJi2s6Am-nkOGUOh2_A1mDcck=s68-c-k-c0x00ffffff-no-rj";
    
    String uri12 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC40 = scenario("Archive.MainPage2018Mer")
      .exec(
        http("request_0")
          .get("/s/player/a87a9450/player_ias.vflset/en_US/embed.js")
          .headers(headersUC40_0)
          .resources(
            http("request_1")
              .get("/s/player/a87a9450/www-embed-player.vflset/www-embed-player.js")
              .headers(headersUC40_0),
            http("request_2")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/base.js")
              .headers(headersUC40_0),
            http("request_3")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/remote.js")
              .headers(headersUC40_0),
            http("request_4")
              .get(uri04)
              .headers(headersUC40_0),
            http("request_5")
              .get(uri07 + "/vi_webp/21AT1HgApBk/maxresdefault.webp")
              .headers(headersUC40_0),
            http("request_6")
              .get(uri11)
              .headers(headersUC40_0),
            http("request_7")
              .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
              .headers(headersUC40_7),
            http("request_8")
              .get(uri06 + "/cv/js/sender/v1/cast_sender.js")
              .headers(headersUC40_0),
            http("request_9")
              .get("/generate_204?WE44dA")
              .headers(headersUC40_9),
            http("request_10")
              .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
              .headers(headersUC40_10)
              .body(RawFileBody("mainpage2018mer/0010_request.json")),
            http("request_11")
              .get(uri03)
              .headers(headersUC40_11),
            http("request_12")
              .get(uri09)
              .headers(headersUC40_12),
            http("request_13")
              .get(uri06 + "/eureka/clank/128/cast_sender.js")
              .headers(headersUC40_0),
            http("request_14")
              .post(uri01 + "/Create")
              .headers(headersUC40_14)
              .body(RawFileBody("mainpage2018mer/0014_request.dat")),
            http("request_15")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC40_15)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,null,[1,0,0,0,0]]],1828,[[\"1724484016313\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"aGIf\\\"]],[null,72.70000000018626]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484016314\"]", ""),
            http("request_16")
              .get(uri12 + "/build/5758.f38a32ed.css")
              .headers(headersUC40_0),
            http("request_17")
              .get(uri12 + "/build/6395.76430bbc.css")
              .headers(headersUC40_0),
            http("request_18")
              .get(uri12 + "/build/8886.31d6cfe0.css")
              .headers(headersUC40_0),
            http("request_19")
              .get(uri12 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC40_0),
            http("request_20")
              .get(uri12 + "/build/runtime.aaa04269.js")
              .headers(headersUC40_0),
            http("request_21")
              .get(uri12 + "/build/9755.89d0240d.js")
              .headers(headersUC40_0),
            http("request_22")
              .get(uri12 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC40_0),
            http("request_23")
              .get(uri12 + "/uploads/media/default/0001/17/b4bb9395f1924fb2c4b47fb0e516d838a8dc086b.png")
              .headers(headersUC40_0),
            http("request_24")
              .get(uri12 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC40_0),
            http("request_25")
              .get(uri12 + "/cache/b/1/e/6/3/b1e6349294a6faab03d90c7cd7cede2209ca3380.jpeg")
              .headers(headersUC40_0),
            http("request_26")
              .get(uri12 + "/cache/0/6/7/4/c/0674cb551940a2b3517fed859062de9f80a85eb4.jpeg")
              .headers(headersUC40_0),
            http("request_27")
              .get(uri12 + "/cache/c/0/e/8/e/c0e8e6e74dc69b3706ccc519bd2e0cae360403a5.jpeg")
              .headers(headersUC40_0),
            http("request_28")
              .get(uri12 + "/cache/4/f/c/7/3/4fc735b98fb78401dc1cbb07e5e70ff2ea027cf1.jpeg")
              .headers(headersUC40_0),
            http("request_29")
              .get(uri12 + "/cache/a/a/3/3/1/aa331ba8755f7d011b952620065e69a56ec20e0c.jpeg")
              .headers(headersUC40_0),
            http("request_30")
              .get(uri12 + "/cache/a/6/9/6/b/a696b7677997432e1e0c350f8c7d5f9549529fe2.jpeg")
              .headers(headersUC40_0),
            http("request_31")
              .get(uri12 + "/cache/8/f/c/c/d/8fccda61015f10d9898e6fe5eb2cba0fbdbafccc.jpeg")
              .headers(headersUC40_0),
            http("request_32")
              .get(uri12 + "/cache/6/f/0/c/6/6f0c640c9572d46b3ddb5c0610e26a1c2b4cb77d.jpeg")
              .headers(headersUC40_0),
            http("request_33")
              .get(uri12 + "/cache/4/3/f/9/3/43f9386301785d1ab836ea0c37e5c38fa81ce765.jpeg")
              .headers(headersUC40_0),
            http("request_34")
              .get(uri12 + "/cache/9/6/9/2/2/9692280782531aef8b8ba418c90ec4f0effc5be5.jpeg")
              .headers(headersUC40_0),
            http("request_35")
              .get(uri12 + "/cache/5/b/f/3/b/5bf3baa05ab9f7d33599f3f3d42f1ea8ba9deb88.jpeg")
              .headers(headersUC40_0),
            http("request_36")
              .get(uri12 + "/cache/7/c/5/4/8/7c5487d4bcfa29837ee76f41f3573e90fc36321c.jpeg")
              .headers(headersUC40_0),
            http("request_37")
              .get(uri12 + "/cache/c/a/1/7/a/ca17a3d8815252f537d41a317ad81102a0081518.jpeg")
              .headers(headersUC40_0),
            http("request_38")
              .get(uri12 + "/cache/0/4/a/d/7/04ad7ba00f7a80b08fa793e351e94f370c72e5d9.jpeg")
              .headers(headersUC40_0),
            http("request_39")
              .get(uri12 + "/cache/f/5/0/3/d/f503d7b102f1ee1d9e694778aaae68ab85b2324a.jpeg")
              .headers(headersUC40_0),
            http("request_40")
              .get(uri12 + "/cache/a/e/e/f/e/aeefec5a2aa80990aa28f356dc93c2768b356a07.jpeg")
              .headers(headersUC40_0),
            http("request_41")
              .get(uri12 + "/cache/1/7/2/5/1/1725100e6a3f7292e0f7835462fc0d0a08b53462.jpeg")
              .headers(headersUC40_0),
            http("request_42")
              .get(uri12 + "/cache/c/7/3/8/5/c7385bb8b930c02f3a75e3107cc8d875a8b91c27.jpeg")
              .headers(headersUC40_0),
            http("request_43")
              .get(uri12 + "/cache/9/c/0/5/7/9c0579092da48f670e8f09bb2464a2adca4f016c.jpeg")
              .headers(headersUC40_0),
            http("request_44")
              .get(uri12 + "/cache/c/5/9/0/4/c59041baa92f4935415e61382a354b9ecb07bf83.jpeg")
              .headers(headersUC40_0),
            http("request_45")
              .get(uri12 + "/cache/c/7/a/3/6/c7a36b11e9fd210cdff720d448059d5df598bb87.jpeg")
              .headers(headersUC40_0),
            http("request_46")
              .get(uri12 + "/cache/4/2/5/0/6/425067c3f4e28f05f1b944d87b93e7e2b65eb1ae.jpeg")
              .headers(headersUC40_0),
            http("request_47")
              .get(uri12 + "/cache/7/8/f/0/c/78f0c431a34bf4e5e98f264bf9359ac396a448ae.jpeg")
              .headers(headersUC40_0),
            http("request_48")
              .get(uri12 + "/cache/8/c/f/9/9/8cf993f7e150ebdfd19c7e26f11eb012d530689d.jpeg")
              .headers(headersUC40_0),
            http("request_49")
              .get(uri12 + "/cache/9/2/2/6/b/9226bff5420be71ca305cb4ebd93d5fbd6b8909a.jpeg")
              .headers(headersUC40_0),
            http("request_50")
              .get(uri12 + "/cache/2/4/3/e/2/243e253954e118d1e6e6371e4c5ef754ca265ec1.jpeg")
              .headers(headersUC40_0),
            http("request_51")
              .get(uri12 + "/cache/b/1/9/9/9/b1999d41fe4cd17dbba5b652fe3d476b5162b4e5.jpeg")
              .headers(headersUC40_0),
            http("request_52")
              .get(uri12 + "/cache/8/6/0/a/d/860ad484d9f5bb88f824c57a130aa5efe93896bb.jpeg")
              .headers(headersUC40_0),
            http("request_53")
              .get(uri12 + "/cache/0/e/9/e/3/0e9e3a739aab97aaf354fd744daa9be680b54f6d.jpeg")
              .headers(headersUC40_0),
            http("request_54")
              .get(uri12 + "/cache/4/4/1/f/d/441fda08275c6de8d8203e1bed195fe6fcd93dce.jpeg")
              .headers(headersUC40_0),
            http("request_55")
              .get(uri12 + "/cache/e/7/6/5/e/e765ec02ee3aeab13e5105f360f9bfe9a1ea9300.jpeg")
              .headers(headersUC40_0),
            http("request_56")
              .get(uri12 + "/cache/7/2/1/f/e/721fe0e34b916ae9f6a6f95dd6d472e47a33e541.jpeg")
              .headers(headersUC40_0),
            http("request_57")
              .get(uri12 + "/cache/3/c/5/4/0/3c5408b78843e8e80f2b8a0cf96fe06a5c722485.jpeg")
              .headers(headersUC40_0),
            http("request_58")
              .get(uri12 + "/build/images/opmoscow/loading.svg")
              .headers(headersUC40_0),
            http("request_59")
              .get(uri10 + "/metrika/tag.js")
              .headers(headersUC40_0),
            http("request_60")
              .get(uri12 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
            http("request_61")
              .get(uri12 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_62")
              .get(uri12 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_63")
              .get(uri12 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_64")
              .get(uri12 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_65")
              .get(uri12 + "/build/fonts/subset-Montserrat-SemiBoldItalic.89c710ac.woff2"),
            http("request_66")
              .get(uri10 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-mera-2018&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A834535538%3Az%3A300%3Ai%3A20240824122018%3Aet%3A1724484019%3Ac%3A1%3Arn%3A984234994%3Arqn%3A210%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C1288%2C%2C2%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724484017189%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724484019%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%9C%D1%8D%D1%80%D0%B0%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B%20%D0%B2%202018%20%D0%B3%D0%BE%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC40_66),
            http("request_67")
              .get(uri12 + "/obshchestvennyy-shtab-po-vyboram-mera-2018")
              .headers(headersUC40_67),
            http("request_68")
              .get(uri12 + "/cache/0/4/4/7/7/04477960fdc8cde2b446420b88998e9542b6b56c.jpeg")
              .headers(headersUC40_0),
            http("request_69")
              .get(uri12 + "/cache/6/c/f/b/5/6cfb5516545927d800cd05e651adccfd335565c6.jpeg")
              .headers(headersUC40_0),
            http("request_70")
              .get(uri12 + "/cache/2/8/5/8/f/2858f3590f8324ec11e08f67bb1b7cb7cb1cd2d1.jpeg")
              .headers(headersUC40_0),
            http("request_71")
              .get(uri12 + "/build/7255.871eb160.js")
              .headers(headersUC40_0),
            http("request_72")
              .get(uri12 + "/build/6889.3f713c69.js")
              .headers(headersUC40_0),
            http("request_73")
              .get(uri12 + "/build/7729.67d87565.js")
              .headers(headersUC40_0),
            http("request_74")
              .get(uri12 + "/build/8981.bc50772a.js")
              .headers(headersUC40_0),
            http("request_75")
              .get(uri12 + "/build/3734.2c5e1582.js")
              .headers(headersUC40_0),
            http("request_76")
              .get(uri12 + "/build/9154.f1370752.js")
              .headers(headersUC40_0),
            http("request_77")
              .get(uri12 + "/build/1676.2634f191.js")
              .headers(headersUC40_0),
            http("request_78")
              .get(uri12 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC40_0),
            http("request_79")
              .get("/embed/21AT1HgApBk")
              .headers(headersUC40_79),
            http("request_80")
              .get(uri07 + "/vi/adznB-7qAx0/hqdefault.jpg")
              .headers(headersUC40_0),
            http("request_81")
              .get(uri07 + "/vi/7DLtdWD8bUc/hqdefault.jpg")
              .headers(headersUC40_0),
            http("request_82")
              .get(uri07 + "/vi/4YOqYa-dOPI/hqdefault.jpg")
              .headers(headersUC40_0),
            http("request_83")
              .get(uri12 + "/cache/5/f/7/8/d/5f78d414dd5af19950318e79a22f5eb5bcce3a80.jpeg")
              .headers(headersUC40_0),
            http("request_84")
              .get(uri12 + "/cache/5/a/1/1/3/5a113ac912dcc012e8ada2f6250d4641d83b5275.jpeg")
              .headers(headersUC40_0),
            http("request_85")
              .get(uri12 + "/cache/6/f/d/9/3/6fd93f3e8f1fbb4e1a036159eba4e63340d23366.jpeg")
              .headers(headersUC40_0),
            http("request_86")
              .get(uri05 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
              .headers(headersUC40_7),
            http("request_87")
              .get("/s/player/a87a9450/www-player.css")
              .headers(headersUC40_0),
            http("request_88")
              .get(uri10 + "/metrika/metrika_match.html")
              .headers(headersUC40_88),
            http("request_89")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/embed.js")
              .headers(headersUC40_0),
            http("request_90")
              .get("/s/player/a87a9450/www-embed-player.vflset/www-embed-player.js")
              .headers(headersUC40_0),
            http("request_91")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/base.js")
              .headers(headersUC40_0),
            http("request_92")
              .get(uri05 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
              .headers(headersUC40_7),
            http("request_93")
              .get(uri12 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC40_0),
            http("request_94")
              .get(uri09)
              .headers(headersUC40_0),
            http("request_95")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/remote.js")
              .headers(headersUC40_0),
            http("request_96")
              .get(uri04)
              .headers(headersUC40_0),
            http("request_97")
              .get(uri07 + "/vi_webp/21AT1HgApBk/maxresdefault.webp")
              .headers(headersUC40_0),
            http("request_98")
              .get(uri11)
              .headers(headersUC40_0),
            http("request_99")
              .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
              .headers(headersUC40_7),
            http("request_100")
              .get(uri06 + "/cv/js/sender/v1/cast_sender.js")
              .headers(headersUC40_0),
            http("request_101")
              .get(uri03)
              .headers(headersUC40_11),
            http("request_102")
              .get(uri06 + "/eureka/clank/128/cast_sender.js")
              .headers(headersUC40_0),
            http("request_103")
              .get("/generate_204?6iVn9g")
              .headers(headersUC40_9),
            http("request_104")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC40_15)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,null,[1,0,0,0,0]]],1828,[[\"1724484022350\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"aGIf\\\"]],[null,83]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484022350\"]", ""),
            http("request_105")
              .get(uri12 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC40_0),
            http("request_106")
              .post(uri01 + "/Create")
              .headers(headersUC40_14)
              .body(RawFileBody("mainpage2018mer/0106_request.dat")),
            http("request_107")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC40_15)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484023084\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,44.299999999813735]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"bk\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.10000000055879354]],[[[\\\"q\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.30000000074505806]],[[[\\\"S\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.900000000372529]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,910.0999999996275]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484023084\"]"),
            http("request_108")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC40_15)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484023088\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,2.599999999627471]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,2]],\"1724484023088\"]"),
            http("request_109")
              .post(uri01 + "/GenerateIT")
              .headers(headersUC40_14)
              .body(RawFileBody("mainpage2018mer/0109_request.dat"))
          )
      )
      .pause(1)
      .exec(
        http("request_110")
          .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
          .headers(headersUC40_110)
          .body(RawFileBody("mainpage2018mer/0110_request.json"))
      );

	  setUp(scnUC40.injectOpen(atOnceUsers(1))).protocols(httpProtocol_MainPage2018Mer);
  }
}
