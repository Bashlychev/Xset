package Projects.voteGD.com;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class SiteMap extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://www.googletagmanager.com")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    headers_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headers_10 = new HashMap<>();
    headers_10.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_10.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_10.put("accept-language", "ru-RU,ru;q=0.9");
    headers_10.put("priority", "u=0, i");
    headers_10.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_10.put("sec-ch-ua-mobile", "?0");
    headers_10.put("sec-ch-ua-platform", "Linux");
    headers_10.put("sec-fetch-dest", "document");
    headers_10.put("sec-fetch-mode", "navigate");
    headers_10.put("sec-fetch-site", "same-origin");
    headers_10.put("sec-fetch-user", "?1");
    headers_10.put("upgrade-insecure-requests", "1");
    headers_10.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_11 = new HashMap<>();
    headers_11.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_11.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_11.put("accept-language", "ru-RU,ru;q=0.9");
    headers_11.put("priority", "u=2, i");
    headers_11.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_11.put("sec-ch-ua-mobile", "?0");
    headers_11.put("sec-ch-ua-platform", "Linux");
    headers_11.put("sec-fetch-dest", "image");
    headers_11.put("sec-fetch-mode", "no-cors");
    headers_11.put("sec-fetch-site", "same-origin");
    headers_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_13 = new HashMap<>();
    headers_13.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_13.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_13.put("accept-language", "ru-RU,ru;q=0.9");
    headers_13.put("priority", "u=1, i");
    headers_13.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_13.put("sec-ch-ua-mobile", "?0");
    headers_13.put("sec-ch-ua-platform", "Linux");
    headers_13.put("sec-fetch-dest", "image");
    headers_13.put("sec-fetch-mode", "no-cors");
    headers_13.put("sec-fetch-site", "same-origin");
    headers_13.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_17 = new HashMap<>();
    headers_17.put("Upgrade-Insecure-Requests", "1");
    headers_17.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    headers_17.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_17.put("sec-ch-ua-mobile", "?0");
    headers_17.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headers_19 = new HashMap<>();
    headers_19.put("accept", "*/*");
    headers_19.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_19.put("accept-language", "ru-RU,ru;q=0.9");
    headers_19.put("origin", "https://votegd.com");
    headers_19.put("priority", "u=1, i");
    headers_19.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_19.put("sec-ch-ua-mobile", "?0");
    headers_19.put("sec-ch-ua-platform", "Linux");
    headers_19.put("sec-fetch-dest", "empty");
    headers_19.put("sec-fetch-mode", "no-cors");
    headers_19.put("sec-fetch-site", "cross-site");
    headers_19.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    String uri1 = "https://votegd.com";
    
    String uri3 = "https://fonts.gstatic.com/s/montserrat/v26";
    
    String uri4 = "https://fonts.googleapis.com/css2";
    
    String uri5 = "https://www.google-analytics.com/g/collect";
    
    String uri6 = "https://mc.yandex.ru/metrika";

    ScenarioBuilder scn = scenario("Projects.voteGD.com.SiteMap")
      .exec(
        http("request_0")
          .get("/gtag/js?id=G-126E14W1P6")
          .headers(headers_0)
          .check(bodyBytes().is(RawFileBody("sitemap/0000_response.js")))
          .resources(
            http("request_1")
              .get(uri4 + "?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap")
              .headers(headers_0)
              .check(bodyBytes().is(RawFileBody("sitemap/0001_response.css"))),
            http("request_2")
              .get(uri1 + "/layout/css/bootstrap.css")
              .headers(headers_0)
              .check(bodyBytes().is(RawFileBody("sitemap/0002_response.css"))),
            http("request_3")
              .get(uri1 + "/layout/css/style.css")
              .headers(headers_0)
              .check(bodyBytes().is(RawFileBody("sitemap/0003_response.css"))),
            http("request_4")
              .get(uri1 + "/layout/images/minilogo.png")
              .headers(headers_0)
              .check(bodyBytes().is(RawFileBody("sitemap/0004_response.png"))),
            http("request_5")
              .get(uri6 + "/tag.js")
              .headers(headers_0)
              .check(bodyBytes().is(RawFileBody("sitemap/0005_response.js"))),
            http("request_6")
              .get(uri3 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2"),
            http("request_7")
              .get(uri3 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2"),
            http("request_8")
              .get(uri1 + "/layout/fonts/fontawesome-webfont.woff2?v=4.7.0"),
            http("request_9")
              .get(uri1 + "/layout/fonts/Linearicons.ttf"),
            http("request_10")
              .get(uri1 + "/sitemap/")
              .headers(headers_10)
              .check(bodyBytes().is(RawFileBody("sitemap/0010_response.html"))),
            http("request_11")
              .get(uri1 + "/sitemap/images/parallax-03.jpg")
              .headers(headers_11),
            http("request_12")
              .get(uri1 + "/assets/777cc481/jquery.js")
              .headers(headers_0)
              .check(bodyBytes().is(RawFileBody("sitemap/0012_response.js"))),
            http("request_13")
              .get(uri1 + "/sitemap/images/parallax-03.jpg/")
              .headers(headers_13)
              .check(status().is(404))
              .check(bodyBytes().is(RawFileBody("sitemap/0013_response.html"))),
            http("request_14")
              .get(uri1 + "/assets/8f4a1b0a/yii.js")
              .headers(headers_0)
              .check(bodyBytes().is(RawFileBody("sitemap/0014_response.js"))),
            http("request_15")
              .get(uri1 + "/layout/js/core.min.js")
              .headers(headers_0)
              .check(bodyBytes().is(RawFileBody("sitemap/0015_response.js"))),
            http("request_16")
              .get(uri1 + "/layout/js/script.js")
              .headers(headers_0)
              .check(bodyBytes().is(RawFileBody("sitemap/0016_response.js"))),
            http("request_17")
              .get(uri6 + "/metrika_match.html")
              .headers(headers_17),
            http("request_18")
              .get(uri1 + "/favicon.ico")
              .headers(headers_0)
              .check(bodyBytes().is(RawFileBody("sitemap/0018_response.ico")))
          )
      )
      .pause(4)
      .exec(
        http("request_19")
          .post(uri5 + "?v=2&tid=G-126E14W1P6&gtm=45je48e0v9113022429za200&_p=1723890126175&gcd=13l3l3l3l1&npa=0&dma=0&tag_exp=0&cid=1736459249.1723885632&ul=ru-ru&sr=1920x1080&uaa=x86&uab=64&uafvl=Not)A%253BBrand%3B99.0.0.0%7CGoogle%2520Chrome%3B127.0.6533.119%7CChromium%3B127.0.6533.119&uamb=0&uam=&uap=Linux&uapv=6.5.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&sid=1723885632&sct=1&seg=1&dl=https%3A%2F%2Fvotegd.com%2Fsitemap%2F&dr=https%3A%2F%2Fvotegd.com%2Fmunicipal%2F2024%2F&dt=%D0%9A%D0%B0%D1%80%D1%82%D0%B0%20%D1%81%D0%B0%D0%B9%D1%82%D0%B0%20%7C%20Vote%D0%93%D0%94&en=page_view&_ee=1&tfd=5868")
          .headers(headers_19)
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
