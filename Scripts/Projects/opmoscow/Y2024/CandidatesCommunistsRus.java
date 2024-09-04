package Y2024;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class CandidatesCommunistsRus extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_CandidatesCommunistsRus = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;


    Map<CharSequence, String> headersUC15_0 = new HashMap<>();
    headersUC15_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC15_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC15_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC15_0.put("priority", "u=0, i");
    headersUC15_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC15_0.put("sec-ch-ua-mobile", "?0");
    headersUC15_0.put("sec-ch-ua-platform", "Linux");
    headersUC15_0.put("sec-fetch-dest", "document");
    headersUC15_0.put("sec-fetch-mode", "navigate");
    headersUC15_0.put("sec-fetch-site", "same-origin");
    headersUC15_0.put("sec-fetch-user", "?1");
    headersUC15_0.put("upgrade-insecure-requests", "1");
    headersUC15_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC15_1 = new HashMap<>();
    headersUC15_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC15_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC15_1.put("sec-ch-ua-mobile", "?0");
    headersUC15_1.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC15_5 = new HashMap<>();
    headersUC15_5.put("Upgrade-Insecure-Requests", "1");
    headersUC15_5.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC15_5.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC15_5.put("sec-ch-ua-mobile", "?0");
    headersUC15_5.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC15_7 = new HashMap<>();
    headersUC15_7.put("accept", "*/*");
    headersUC15_7.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC15_7.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC15_7.put("origin", "https://shtab.opmoscow.ru");
    headersUC15_7.put("priority", "u=1, i");
    headersUC15_7.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC15_7.put("sec-ch-ua-mobile", "?0");
    headersUC15_7.put("sec-ch-ua-platform", "Linux");
    headersUC15_7.put("sec-fetch-dest", "empty");
    headersUC15_7.put("sec-fetch-mode", "cors");
    headersUC15_7.put("sec-fetch-site", "cross-site");
    headersUC15_7.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scnUC15 = scenario("Y2024.CandidatesCommunistsRus")
      .exec(
        http("request_0")
          .get("/party/view/kommunisty-rossii")
          .headers(headersUC15_0)
          .resources(
            http("request_1")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersUC15_1),
            http("request_2")
              .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_3")
              .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_4")
              .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_5")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersUC15_5),
            http("request_6")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC15_1),
            http("request_7")
              .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fkommunisty-rossii&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fspravedlivaya-rossiya--za-pravdu&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A395314238%3Az%3A300%3Ai%3A20240823184856%3Aet%3A1724420937%3Ac%3A1%3Arn%3A842303713%3Arqn%3A67%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C531%2C1%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724420935961%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724420937%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%9A%D0%BE%D0%BC%D0%BC%D1%83%D0%BD%D0%B8%D1%81%D1%82%D1%8B%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B8&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC15_7)
          )
      );

	  setUp(scnUC15.injectOpen(atOnceUsers(1))).protocols(httpProtocol_CandidatesCommunistsRus);
  }
}
