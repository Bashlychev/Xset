package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class Press extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_Press = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC09_0 = new HashMap<>();
    headersUC09_0.put("accept", "*/*");
    headersUC09_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC09_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC09_0.put("content-type", "text/plain");
    headersUC09_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC09_0.put("priority", "u=1, i");
    headersUC09_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC09_0.put("sec-ch-ua-mobile", "?0");
    headersUC09_0.put("sec-ch-ua-platform", "Linux");
    headersUC09_0.put("sec-fetch-dest", "empty");
    headersUC09_0.put("sec-fetch-mode", "cors");
    headersUC09_0.put("sec-fetch-site", "cross-site");
    headersUC09_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC09_2 = new HashMap<>();
    headersUC09_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC09_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC09_2.put("sec-ch-ua-mobile", "?0");
    headersUC09_2.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC09_12 = new HashMap<>();
    headersUC09_12.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC09_12.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC09_12.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC09_12.put("priority", "u=0, i");
    headersUC09_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC09_12.put("sec-ch-ua-mobile", "?0");
    headersUC09_12.put("sec-ch-ua-platform", "Linux");
    headersUC09_12.put("sec-fetch-dest", "document");
    headersUC09_12.put("sec-fetch-mode", "navigate");
    headersUC09_12.put("sec-fetch-site", "cross-site");
    headersUC09_12.put("sec-fetch-user", "?1");
    headersUC09_12.put("upgrade-insecure-requests", "1");
    headersUC09_12.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC09_26 = new HashMap<>();
    headersUC09_26.put("accept", "*/*");
    headersUC09_26.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC09_26.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC09_26.put("origin", "https://shtab.opmoscow.ru");
    headersUC09_26.put("priority", "u=1, i");
    headersUC09_26.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC09_26.put("sec-ch-ua-mobile", "?0");
    headersUC09_26.put("sec-ch-ua-platform", "Linux");
    headersUC09_26.put("sec-fetch-dest", "empty");
    headersUC09_26.put("sec-fetch-mode", "cors");
    headersUC09_26.put("sec-fetch-site", "cross-site");
    headersUC09_26.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC09_27 = new HashMap<>();
    headersUC09_27.put("Upgrade-Insecure-Requests", "1");
    headersUC09_27.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC09_27.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC09_27.put("sec-ch-ua-mobile", "?0");
    headersUC09_27.put("sec-ch-ua-platform", "Linux");
    
    String uri2 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC09 = scenario("Press")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=631142777&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fpress&rn=483912631&browser-info=bt%3A1%3Awe%3A1%3Aet%3A1724486377%3Aw%3A1920x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125937%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486377&t=gdpr(14)ti(1)")
          .headers(headersUC09_0)
          .body(RawFileBody("press/0000_request.gif"))
          .resources(
            http("request_1")
              .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=631142777&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fpress&rn=235699728&browser-info=we%3A1%3Aet%3A1724486378%3Aw%3A1920x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125937%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486378&t=gdpr(14)ti(1)")
              .headers(headersUC09_0)
              .body(RawFileBody("press/0001_request.gif")),
            http("request_2")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headersUC09_2),
            http("request_3")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headersUC09_2),
            http("request_4")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headersUC09_2),
            http("request_5")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC09_2),
            http("request_6")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC09_2),
            http("request_7")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC09_2),
            http("request_8")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC09_2),
            http("request_9")
              .get(uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC09_2),
            http("request_10")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC09_2),
            http("request_11")
              .get("/metrika/tag.js")
              .headers(headersUC09_2),
            http("request_12")
              .get(uri2 + "/press")
              .headers(headersUC09_12),
            http("request_13")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_14")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_15")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_16")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC09_2),
            http("request_17")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC09_2),
            http("request_18")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC09_2),
            http("request_19")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC09_2),
            http("request_20")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC09_2),
            http("request_21")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC09_2),
            http("request_22")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC09_2),
            http("request_23")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC09_2),
            http("request_24")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC09_2),
            http("request_25")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC09_2),
            http("request_26")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fpress&page-ref=https%3A%2F%2Fwww.google.com%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A252178634%3Az%3A300%3Ai%3A20240824125939%3Aet%3A1724486379%3Ac%3A1%3Arn%3A655465797%3Arqn%3A243%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C418%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724486378506%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724486379%3At%3A%D0%9E%D1%82%D0%BA%D1%80%D1%8B%D1%82%D1%8B%20%D0%B4%D0%BB%D1%8F%20%D0%A1%D0%9C%D0%98&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC09_26),
            http("request_27")
              .get("/metrika/metrika_match.html")
              .headers(headersUC09_27)
          )
      );

	  setUp(scnUC09.injectOpen(atOnceUsers(1))).protocols(httpProtocol_Press);
  }
}
