package Projects.voteGD.com;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;


public class About extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://votegd.com")
      .inferHtmlResources()
      .acceptHeader("*/*")
      .acceptEncodingHeader("gzip, deflate, br")
      .acceptLanguageHeader("ru-RU,ru;q=0.9")
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
    headers_0.put("sec-fetch-site", "none");
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
    
    Map<CharSequence, String> headers_4 = new HashMap<>();
    headers_4.put("origin", "https://votegd.com");
    headers_4.put("pragma", "no-cache");
    headers_4.put("priority", "u=0");
    headers_4.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_4.put("sec-ch-ua-mobile", "?0");
    headers_4.put("sec-ch-ua-platform", "Linux");
    headers_4.put("sec-fetch-dest", "font");
    headers_4.put("sec-fetch-mode", "cors");
    headers_4.put("sec-fetch-site", "cross-site");
    
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
    
    Map<CharSequence, String> headers_7 = new HashMap<>();
    headers_7.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_7.put("pragma", "no-cache");
    headers_7.put("priority", "u=1, i");
    headers_7.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_7.put("sec-ch-ua-mobile", "?0");
    headers_7.put("sec-ch-ua-platform", "Linux");
    headers_7.put("sec-fetch-dest", "image");
    headers_7.put("sec-fetch-mode", "no-cors");
    headers_7.put("sec-fetch-site", "same-origin");
    
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

    ScenarioBuilder scn = scenario("Projects.voteGD.com.About")
      .exec(
        http("request_0")
          .get("/about/")
          .headers(headers_0)
          .resources(
            http("request_1")
              .get(uri4 + "/metrika/tag.js")
              .headers(headers_1),
            http("request_2")
              .get(uri4 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fabout%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A201048916154%3Ahid%3A308723531%3Az%3A300%3Ai%3A20240817154400%3Aet%3A1723891440%3Ac%3A1%3Arn%3A857922284%3Arqn%3A6%3Au%3A1723891286351736628%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C107%2C2%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723891439766%3Agi%3AR0ExLjEuODM0MzMwMDkxLjE3MjM4OTEyODc%3D%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723891440%3At%3A%D0%9E%20%D0%BD%D0%B0%D1%81%20%7C%20VoteGD%20%D0%B2%D1%81%D0%B5%20%D0%BE%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%B0%D1%85%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(1)cdl(na)eco(21037568)ti(1)")
              .headers(headers_2),
            http("request_3")
              .get(uri4 + "/watch/78422502/1?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fabout%2F&charset=utf-8&uah=chu%0A%22Not%29A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not%29A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A201048916154%3Ahid%3A308723531%3Az%3A300%3Ai%3A20240817154400%3Aet%3A1723891440%3Ac%3A1%3Arn%3A857922284%3Arqn%3A6%3Au%3A1723891286351736628%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C107%2C2%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723891439766%3Agi%3AR0ExLjEuODM0MzMwMDkxLjE3MjM4OTEyODc%3D%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723891440%3At%3A%D0%9E%20%D0%BD%D0%B0%D1%81%20%7C%20VoteGD%20%D0%B2%D1%81%D0%B5%20%D0%BE%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%B0%D1%85%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B&t=gdpr%2814%29clc%280-0-0%29rqnt%281%29aw%281%29rcm%281%29cdl%28na%29eco%2821037568%29ti%281%29&redirnss=1")
              .headers(headers_2),
            http("request_4")
              .get(uri2 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2")
              .headers(headers_4),
            http("request_5")
              .get(uri4 + "/metrika/metrika_match.html")
              .headers(headers_5),
            http("request_6")
              .get(uri2 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2")
              .headers(headers_4),
            http("request_7")
              .get("/about/images/parallax-03.jpg/")
              .headers(headers_7)
              .check(status().is(404)),
            http("request_8")
              .get("/favicon.ico")
              .headers(headers_7)
          )
      )
      .pause(3)
      .exec(
        http("request_9")
          .post(uri3 + "?v=2&tid=G-126E14W1P6&gtm=45je48e0v9113022429za200&_p=1723891439887&gcd=13l3l3l3l1&npa=0&dma=0&tag_exp=0&cid=834330091.1723891287&ul=ru-ru&sr=1920x1080&uaa=x86&uab=64&uafvl=Not)A%253BBrand%3B99.0.0.0%7CGoogle%2520Chrome%3B127.0.6533.119%7CChromium%3B127.0.6533.119&uamb=0&uam=&uap=Linux&uapv=6.5.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&sid=1723891286&sct=1&seg=1&dl=https%3A%2F%2Fvotegd.com%2Fabout%2F&dt=%D0%9E%20%D0%BD%D0%B0%D1%81%20%7C%20VoteGD%20%D0%B2%D1%81%D0%B5%20%D0%BE%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%B0%D1%85%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B&en=page_view&_ee=1&_et=1&tfd=5399")
          .headers(headers_9)
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
