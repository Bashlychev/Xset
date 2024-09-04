package Projects.voteGD.com;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class Message extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://votegd.com")
      .inferHtmlResources()
      .acceptHeader("*/*")
      .acceptEncodingHeader("gzip, deflate, br")
      .acceptLanguageHeader("ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
      .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_0.put("pragma", "no-cache");
    headers_0.put("priority", "u=0, i");
    headers_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Linux");
    headers_0.put("sec-fetch-dest", "document");
    headers_0.put("sec-fetch-mode", "navigate");
    headers_0.put("sec-fetch-site", "cross-site");
    headers_0.put("sec-fetch-user", "?1");
    headers_0.put("upgrade-insecure-requests", "1");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("pragma", "no-cache");
    headers_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_1.put("sec-ch-ua-mobile", "?0");
    headers_1.put("sec-ch-ua-platform", "Linux");
    headers_1.put("sec-fetch-dest", "script");
    headers_1.put("sec-fetch-mode", "no-cors");
    headers_1.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("origin", "https://votegd.com");
    headers_2.put("pragma", "no-cache");
    headers_2.put("priority", "u=1, i");
    headers_2.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_2.put("sec-ch-ua-mobile", "?0");
    headers_2.put("sec-ch-ua-platform", "Linux");
    headers_2.put("sec-fetch-dest", "empty");
    headers_2.put("sec-fetch-mode", "cors");
    headers_2.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("origin", "https://votegd.com");
    headers_3.put("pragma", "no-cache");
    headers_3.put("priority", "u=0");
    headers_3.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_3.put("sec-ch-ua-mobile", "?0");
    headers_3.put("sec-ch-ua-platform", "Linux");
    headers_3.put("sec-fetch-dest", "font");
    headers_3.put("sec-fetch-mode", "cors");
    headers_3.put("sec-fetch-site", "cross-site");
    headers_3.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlKHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    Map<CharSequence, String> headers_5 = new HashMap<>();
    headers_5.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_5.put("pragma", "no-cache");
    headers_5.put("priority", "u=0, i");
    headers_5.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_5.put("sec-ch-ua-mobile", "?0");
    headers_5.put("sec-ch-ua-platform", "Linux");
    headers_5.put("sec-fetch-dest", "iframe");
    headers_5.put("sec-fetch-mode", "navigate");
    headers_5.put("sec-fetch-site", "cross-site");
    headers_5.put("upgrade-insecure-requests", "1");
    
    Map<CharSequence, String> headers_6 = new HashMap<>();
    headers_6.put("origin", "https://votegd.com");
    headers_6.put("pragma", "no-cache");
    headers_6.put("priority", "u=0");
    headers_6.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_6.put("sec-ch-ua-mobile", "?0");
    headers_6.put("sec-ch-ua-platform", "Linux");
    headers_6.put("sec-fetch-dest", "font");
    headers_6.put("sec-fetch-mode", "cors");
    headers_6.put("sec-fetch-site", "same-origin");
    
    Map<CharSequence, String> headers_8 = new HashMap<>();
    headers_8.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_8.put("pragma", "no-cache");
    headers_8.put("priority", "u=1, i");
    headers_8.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_8.put("sec-ch-ua-mobile", "?0");
    headers_8.put("sec-ch-ua-platform", "Linux");
    headers_8.put("sec-fetch-dest", "image");
    headers_8.put("sec-fetch-mode", "no-cors");
    headers_8.put("sec-fetch-site", "same-origin");
    
    Map<CharSequence, String> headers_9 = new HashMap<>();
    headers_9.put("origin", "https://votegd.com");
    headers_9.put("pragma", "no-cache");
    headers_9.put("priority", "u=1, i");
    headers_9.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_9.put("sec-ch-ua-mobile", "?0");
    headers_9.put("sec-ch-ua-platform", "Linux");
    headers_9.put("sec-fetch-dest", "empty");
    headers_9.put("sec-fetch-mode", "no-cors");
    headers_9.put("sec-fetch-site", "cross-site");
    
    String uri2 = "https://fonts.gstatic.com/s/montserrat/v26";
    
    String uri3 = "https://www.google-analytics.com/g/collect";
    
    String uri4 = "https://mc.yandex.ru";

    ScenarioBuilder scn = scenario("Projects.voteGD.com.Message")
      .exec(
        http("request_0")
          .get("/message/")
          .headers(headers_0)
          .resources(
            http("request_1")
              .get(uri4 + "/metrika/tag.js")
              .headers(headers_1),
            http("request_2")
              .get(uri4 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fmessage%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1611288404515%3Ahid%3A432861832%3Az%3A300%3Ai%3A20240818131354%3Aet%3A1723968834%3Ac%3A1%3Arn%3A141902968%3Arqn%3A63%3Au%3A1723808625578809752%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C102%2C1%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723968834039%3Agi%3AR0ExLjEuMzM0MzkwMzc0LjE3MjM4MDg2MjU%3D%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723968834%3At%3A%D0%9D%D0%B0%D0%BF%D0%B8%D1%81%D0%B0%D1%82%D1%8C%20%D0%BD%D0%B0%D0%BC%20%7C%20Vote%D0%93%D0%94&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(1)cdl(na)eco(21037568)ti(1)")
              .headers(headers_2),
            http("request_3")
              .get(uri2 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2")
              .headers(headers_3),
            http("request_4")
              .get(uri2 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2")
              .headers(headers_3),
            http("request_5")
              .get(uri4 + "/metrika/metrika_match.html")
              .headers(headers_5),
            http("request_6")
              .get("/layout/fonts/fontawesome-webfont.woff2?v=4.7.0")
              .headers(headers_6),
            http("request_7")
              .get("/layout/fonts/Linearicons.ttf")
              .headers(headers_6),
            http("request_8")
              .get("/favicon.ico")
              .headers(headers_8)
          )
      )
      .pause(4)
      .exec(
        http("request_9")
          .post(uri3 + "?v=2&tid=G-126E14W1P6&gtm=45je48e0v9113022429za200&_p=1723968834157&gcd=13l3l3l3l1l1&npa=0&dma=0&tag_exp=0&cid=334390374.1723808625&ul=ru-ru&sr=1920x1080&uaa=x86&uab=64&uafvl=Not)A%253BBrand%3B99.0.0.0%7CGoogle%2520Chrome%3B127.0.6533.119%7CChromium%3B127.0.6533.119&uamb=0&uam=&uap=Linux&uapv=6.5.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&sid=1723968393&sct=6&seg=1&dl=https%3A%2F%2Fvotegd.com%2Fmessage%2F&dr=https%3A%2F%2Fvotegd.com%2Fmessage%2F&dt=%D0%9D%D0%B0%D0%BF%D0%B8%D1%81%D0%B0%D1%82%D1%8C%20%D0%BD%D0%B0%D0%BC%20%7C%20Vote%D0%93%D0%94&en=page_view&_ee=1&tfd=5382")
          .headers(headers_9)
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
