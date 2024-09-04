package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class RazborNarusheniy extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_RazborNarusheniy = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC08_0 = new HashMap<>();
    headersUC08_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC08_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC08_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC08_0.put("priority", "u=0, i");
    headersUC08_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC08_0.put("sec-ch-ua-mobile", "?0");
    headersUC08_0.put("sec-ch-ua-platform", "Linux");
    headersUC08_0.put("sec-fetch-dest", "document");
    headersUC08_0.put("sec-fetch-mode", "navigate");
    headersUC08_0.put("sec-fetch-site", "cross-site");
    headersUC08_0.put("sec-fetch-user", "?1");
    headersUC08_0.put("upgrade-insecure-requests", "1");
    headersUC08_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC08_1 = new HashMap<>();
    headersUC08_1.put("accept", "*/*");
    headersUC08_1.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC08_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC08_1.put("content-type", "text/plain");
    headersUC08_1.put("origin", "https://shtab.opmoscow.ru");
    headersUC08_1.put("priority", "u=1, i");
    headersUC08_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC08_1.put("sec-ch-ua-mobile", "?0");
    headersUC08_1.put("sec-ch-ua-platform", "Linux");
    headersUC08_1.put("sec-fetch-dest", "empty");
    headersUC08_1.put("sec-fetch-mode", "cors");
    headersUC08_1.put("sec-fetch-site", "cross-site");
    headersUC08_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC08_3 = new HashMap<>();
    headersUC08_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC08_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC08_3.put("sec-ch-ua-mobile", "?0");
    headersUC08_3.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC08_8 = new HashMap<>();
    headersUC08_8.put("accept", "*/*");
    headersUC08_8.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC08_8.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC08_8.put("origin", "https://shtab.opmoscow.ru");
    headersUC08_8.put("priority", "u=1, i");
    headersUC08_8.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC08_8.put("sec-ch-ua-mobile", "?0");
    headersUC08_8.put("sec-ch-ua-platform", "Linux");
    headersUC08_8.put("sec-fetch-dest", "empty");
    headersUC08_8.put("sec-fetch-mode", "cors");
    headersUC08_8.put("sec-fetch-site", "cross-site");
    headersUC08_8.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC08_9 = new HashMap<>();
    headersUC08_9.put("Upgrade-Insecure-Requests", "1");
    headersUC08_9.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC08_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC08_9.put("sec-ch-ua-mobile", "?0");
    headersUC08_9.put("sec-ch-ua-platform", "Linux");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scnUC08 = scenario("RazborNarusheniy")
      .exec(
        http("request_0")
          .get("/razbor-narushenij")
          .headers(headersUC08_0)
          .resources(
            http("request_1")
              .post(uri1 + "/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=805872216&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Frazbor-narushenij&rn=841479143&browser-info=bt%3A1%3Awe%3A1%3Aet%3A1724486328%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125847%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486328&t=gdpr(14)ti(1)")
              .headers(headersUC08_1)
              .body(RawFileBody("razbornarusheniy/0001_request.gif")),
            http("request_2")
              .post(uri1 + "/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=805872216&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Frazbor-narushenij&rn=793250707&browser-info=we%3A1%3Aet%3A1724486328%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125848%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486328&t=gdpr(14)ti(1)")
              .headers(headersUC08_1)
              .body(RawFileBody("razbornarusheniy/0002_request.gif")),
            http("request_3")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersUC08_3),
            http("request_4")
              .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_5")
              .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_6")
              .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_7")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC08_3),
            http("request_8")
              .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Frazbor-narushenij&page-ref=https%3A%2F%2Fwww.google.com%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A892286489%3Az%3A300%3Ai%3A20240824125849%3Aet%3A1724486329%3Ac%3A1%3Arn%3A685310649%3Arqn%3A240%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C410%2C3%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724486328595%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724486329%3At%3A%D0%90%D0%BD%D0%B0%D0%BB%D0%B8%D0%B7%D0%B8%D1%80%D1%83%D0%B5%D0%BC%20%D1%81%D0%BE%D0%BE%D0%B1%D1%89%D0%B5%D0%BD%D0%B8%D1%8F%20%D0%BE%20%D0%B2%D0%BE%D0%B7%D0%BC%D0%BE%D0%B6%D0%BD%D1%8B%D1%85%20%D0%BD%D0%B0%D1%80%D1%83%D1%88%D0%B5%D0%BD%D0%B8%D1%8F%D1%85&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC08_8),
            http("request_9")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersUC08_9)
          )
      );

	  setUp(scnUC08.injectOpen(atOnceUsers(1))).protocols(httpProtocol_RazborNarusheniy);
  }
}
