package Projects.voteGD.com;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class MgdDistrict extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://votegd.com")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_0.put("accept-language", "ru-RU,ru;q=0.9");
    headers_0.put("priority", "u=0, i");
    headers_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Linux");
    headers_0.put("sec-fetch-dest", "document");
    headers_0.put("sec-fetch-mode", "navigate");
    headers_0.put("sec-fetch-site", "same-origin");
    headers_0.put("sec-fetch-user", "?1");
    headers_0.put("upgrade-insecure-requests", "1");
    headers_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    headers_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_1.put("sec-ch-ua-mobile", "?0");
    headers_1.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headers_7 = new HashMap<>();
    headers_7.put("accept", "*/*");
    headers_7.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_7.put("accept-language", "ru-RU,ru;q=0.9");
    headers_7.put("origin", "https://votegd.com");
    headers_7.put("priority", "u=1, i");
    headers_7.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_7.put("sec-ch-ua-mobile", "?0");
    headers_7.put("sec-ch-ua-platform", "Linux");
    headers_7.put("sec-fetch-dest", "empty");
    headers_7.put("sec-fetch-mode", "cors");
    headers_7.put("sec-fetch-site", "cross-site");
    headers_7.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_9 = new HashMap<>();
    headers_9.put("accept", "*/*");
    headers_9.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_9.put("accept-language", "ru-RU,ru;q=0.9");
    headers_9.put("origin", "https://votegd.com");
    headers_9.put("priority", "u=1, i");
    headers_9.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_9.put("sec-ch-ua-mobile", "?0");
    headers_9.put("sec-ch-ua-platform", "Linux");
    headers_9.put("sec-fetch-dest", "empty");
    headers_9.put("sec-fetch-mode", "no-cors");
    headers_9.put("sec-fetch-site", "cross-site");
    headers_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    String uri2 = "https://fonts.gstatic.com/s/montserrat/v26";
    
    String uri3 = "https://www.google-analytics.com/g/collect";
    
    String uri4 = "https://mc.yandex.ru";

    ScenarioBuilder scn = scenario("Projects.voteGD.com.MgdDistrict")
      .exec(
        http("request_0")
          .get("/mgd/2024/district/")
          .headers(headers_0)
          .check(bodyBytes().is(RawFileBody("mgddistrict/0000_response.html")))
          .resources(
            http("request_1")
              .get(uri4 + "/metrika/tag.js")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgddistrict/0001_response.js"))),
            http("request_2")
              .get(uri2 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2"),
            http("request_3")
              .get(uri2 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2"),
            http("request_4")
              .get("/layout/fonts/fontawesome-webfont.woff2?v=4.7.0"),
            http("request_5")
              .get("/layout/fonts/Linearicons.ttf"),
            http("request_6")
              .get("/favicon.ico")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("mgddistrict/0006_response.ico"))),
            http("request_7")
              .get(uri4 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2Fdistrict%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A293928863%3Az%3A300%3Ai%3A20240817144705%3Aet%3A1723888025%3Ac%3A1%3Arn%3A834507975%3Arqn%3A98%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C123%2C1%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723888025149%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723888025%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BD%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D1%85%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%202024%20%D0%BF%D0%BE%20%D0%BE%D0%BA%D1%80%D1%83%D0%B3%D0%B0%D0%BC%20%D0%B8%20%D1%80%D0%B0%D0%B9%D0%BE%D0%BD%D0%B0%D0%BC%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B%20%7C%20VoteGD&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
              .headers(headers_7),
            http("request_8")
              .get(uri4 + "/watch/78422502/1?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2Fdistrict%2F&page-ref=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2F&charset=utf-8&uah=chu%0A%22Not%29A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not%29A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A293928863%3Az%3A300%3Ai%3A20240817144705%3Aet%3A1723888025%3Ac%3A1%3Arn%3A834507975%3Arqn%3A98%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C123%2C1%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723888025149%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723888025%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BD%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D1%85%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%202024%20%D0%BF%D0%BE%20%D0%BE%D0%BA%D1%80%D1%83%D0%B3%D0%B0%D0%BC%20%D0%B8%20%D1%80%D0%B0%D0%B9%D0%BE%D0%BD%D0%B0%D0%BC%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B%20%7C%20VoteGD&t=gdpr%2814%29clc%280-0-0%29rqnt%281%29aw%281%29rcm%280%29cdl%28na%29eco%2821037568%29ti%281%29&redirnss=1")
              .headers(headers_7)
              .check(bodyBytes().is(RawFileBody("mgddistrict/0008_response.json")))
          )
      )
      .pause(4)
      .exec(
        http("request_9")
          .post(uri3 + "?v=2&tid=G-126E14W1P6&gtm=45je48e0v9113022429za200&_p=1723888025287&gcd=13l3l3l3l1&npa=0&dma=0&tag_exp=0&cid=1736459249.1723885632&ul=ru-ru&sr=1920x1080&uaa=x86&uab=64&uafvl=Not)A%253BBrand%3B99.0.0.0%7CGoogle%2520Chrome%3B127.0.6533.119%7CChromium%3B127.0.6533.119&uamb=0&uam=&uap=Linux&uapv=6.5.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&sid=1723885632&sct=1&seg=1&dl=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2Fdistrict%2F&dr=https%3A%2F%2Fvotegd.com%2Fmgd%2F2024%2F&dt=%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BD%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D1%85%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%202024%20%D0%BF%D0%BE%20%D0%BE%D0%BA%D1%80%D1%83%D0%B3%D0%B0%D0%BC%20%D0%B8%20%D1%80%D0%B0%D0%B9%D0%BE%D0%BD%D0%B0%D0%BC%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B%20%7C%20VoteGD&en=page_view&_ee=1&tfd=5223")
          .headers(headers_9)
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
