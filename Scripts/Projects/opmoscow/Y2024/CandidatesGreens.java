package Y2024;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class CandidatesGreens extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_CandidatesGreens = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC18_0 = new HashMap<>();
    headersUC18_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC18_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC18_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC18_0.put("priority", "u=0, i");
    headersUC18_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC18_0.put("sec-ch-ua-mobile", "?0");
    headersUC18_0.put("sec-ch-ua-platform", "Linux");
    headersUC18_0.put("sec-fetch-dest", "document");
    headersUC18_0.put("sec-fetch-mode", "navigate");
    headersUC18_0.put("sec-fetch-site", "same-origin");
    headersUC18_0.put("sec-fetch-user", "?1");
    headersUC18_0.put("upgrade-insecure-requests", "1");
    headersUC18_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC18_1 = new HashMap<>();
    headersUC18_1.put("accept", "*/*");
    headersUC18_1.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC18_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC18_1.put("content-type", "text/plain");
    headersUC18_1.put("origin", "https://shtab.opmoscow.ru");
    headersUC18_1.put("priority", "u=1, i");
    headersUC18_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC18_1.put("sec-ch-ua-mobile", "?0");
    headersUC18_1.put("sec-ch-ua-platform", "Linux");
    headersUC18_1.put("sec-fetch-dest", "empty");
    headersUC18_1.put("sec-fetch-mode", "cors");
    headersUC18_1.put("sec-fetch-site", "cross-site");
    headersUC18_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC18__2 = new HashMap<>();
    headersUC18__2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC18__2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC18__2.put("sec-ch-ua-mobile", "?0");
    headersUC18__2.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC18_7 = new HashMap<>();
    headersUC18_7.put("accept", "*/*");
    headersUC18_7.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC18_7.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC18_7.put("origin", "https://shtab.opmoscow.ru");
    headersUC18_7.put("priority", "u=1, i");
    headersUC18_7.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC18_7.put("sec-ch-ua-mobile", "?0");
    headersUC18_7.put("sec-ch-ua-platform", "Linux");
    headersUC18_7.put("sec-fetch-dest", "empty");
    headersUC18_7.put("sec-fetch-mode", "cors");
    headersUC18_7.put("sec-fetch-site", "cross-site");
    headersUC18_7.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC18_8 = new HashMap<>();
    headersUC18_8.put("Upgrade-Insecure-Requests", "1");
    headersUC18_8.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC18_8.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC18_8.put("sec-ch-ua-mobile", "?0");
    headersUC18_8.put("sec-ch-ua-platform", "Linux");
    
    String uri2 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC18 = scenario("Y2024.CandidatesGreens")
      .exec(
        http("request_0")
          .get(uri2 + "/party/view/zelyonye")
          .headers(headersUC18_0)
          .resources(
            http("request_1")
              .post("/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=414794426&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fzelyonye&rn=33863958&browser-info=we%3A1%3Aet%3A1724421140%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823185220%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724421140&t=gdpr(14)ti(1)")
              .headers(headersUC18_1)
              .body(RawFileBody("candidatesgreens/0001_request.gif")),
            http("request_2")
              .get("/metrika/tag.js")
              .headers(headersUC18__2),
            http("request_3")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_4")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_5")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_6")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC18__2),
            http("request_7")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fzelyonye&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fnovye-lyudi&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A550097042%3Az%3A300%3Ai%3A20240823185221%3Aet%3A1724421142%3Ac%3A1%3Arn%3A817963467%3Arqn%3A74%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C2259%2C2%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724421139531%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724421142%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%97%D0%B5%D0%BB%D0%B5%D0%BD%D1%8B%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(0)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC18_7)
          )
      )
      .pause(1)
      .exec(
        http("request_8")
          .get("/metrika/metrika_match.html")
          .headers(headersUC18_8)
      );

	  setUp(scnUC18.injectOpen(atOnceUsers(1))).protocols(httpProtocol_CandidatesGreens);
  }
}
