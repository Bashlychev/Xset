package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class IzbiratUchastki extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_IzbiratUchastki = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC03_0 = new HashMap<>();
    headersUC03_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC03_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC03_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC03_0.put("priority", "u=0, i");
    headersUC03_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC03_0.put("sec-ch-ua-mobile", "?0");
    headersUC03_0.put("sec-ch-ua-platform", "Linux");
    headersUC03_0.put("sec-fetch-dest", "document");
    headersUC03_0.put("sec-fetch-mode", "navigate");
    headersUC03_0.put("sec-fetch-site", "same-origin");
    headersUC03_0.put("sec-fetch-user", "?1");
    headersUC03_0.put("upgrade-insecure-requests", "1");
    headersUC03_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC03_1 = new HashMap<>();
    headersUC03_1.put("accept", "*/*");
    headersUC03_1.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC03_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC03_1.put("content-type", "text/plain");
    headersUC03_1.put("origin", "https://shtab.opmoscow.ru");
    headersUC03_1.put("priority", "u=1, i");
    headersUC03_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC03_1.put("sec-ch-ua-mobile", "?0");
    headersUC03_1.put("sec-ch-ua-platform", "Linux");
    headersUC03_1.put("sec-fetch-dest", "empty");
    headersUC03_1.put("sec-fetch-mode", "cors");
    headersUC03_1.put("sec-fetch-site", "cross-site");
    headersUC03_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC03_2 = new HashMap<>();
    headersUC03_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC03_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC03_2.put("sec-ch-ua-mobile", "?0");
    headersUC03_2.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC03_9 = new HashMap<>();
    headersUC03_9.put("Upgrade-Insecure-Requests", "1");
    headersUC03_9.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC03_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC03_9.put("sec-ch-ua-mobile", "?0");
    headersUC03_9.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC03_10 = new HashMap<>();
    headersUC03_10.put("accept", "*/*");
    headersUC03_10.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC03_10.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC03_10.put("origin", "https://shtab.opmoscow.ru");
    headersUC03_10.put("priority", "u=1, i");
    headersUC03_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC03_10.put("sec-ch-ua-mobile", "?0");
    headersUC03_10.put("sec-ch-ua-platform", "Linux");
    headersUC03_10.put("sec-fetch-dest", "empty");
    headersUC03_10.put("sec-fetch-mode", "cors");
    headersUC03_10.put("sec-fetch-site", "cross-site");
    headersUC03_10.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scnUC03 = scenario("IzbiratUchastki")
      .exec(
        http("request_0")
          .get("/izbiratelnye-uchastki")
          .headers(headersUC03_0)
          .resources(
            http("request_1")
              .post(uri1 + "/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=871326288&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fizbiratelnye-uchastki&rn=108890365&browser-info=we%3A1%3Aet%3A1724417323%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823174842%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724417323&t=gdpr(14)ti(1)")
              .headers(headersUC03_1)
              .body(RawFileBody("izbiratuchastki/0001_request.gif")),
            http("request_2")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersUC03_2),
            http("request_3")
              .get("/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
            http("request_4")
              .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_5")
              .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_6")
              .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_7")
              .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_8")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC03_2),
            http("request_9")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersUC03_9),
            http("request_10")
              .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fizbiratelnye-uchastki&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fdistancionnoe-golosovanie&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A961089704%3Az%3A300%3Ai%3A20240823174843%3Aet%3A1724417324%3Ac%3A1%3Arn%3A363647287%3Arqn%3A20%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C398%2C9%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724417323226%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724417324%3At%3A%D0%98%D0%B7%D0%B1%D0%B8%D1%80%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BA%D0%B8%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%20%D0%B8%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%202024%20%E2%80%94%20%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC03_10)
          )
      );

	  setUp(scnUC03.injectOpen(atOnceUsers(1))).protocols(httpProtocol_IzbiratUchastki);
  }
}
