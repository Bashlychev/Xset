package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class Nabludateli extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_Nabludateli = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
      .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC04_0 = new HashMap<>();
    headersUC04_0.put("accept", "*/*");
    headersUC04_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC04_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC04_0.put("content-type", "text/plain");
    headersUC04_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC04_0.put("priority", "u=1, i");
    headersUC04_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC04_0.put("sec-ch-ua-mobile", "?0");
    headersUC04_0.put("sec-ch-ua-platform", "Linux");
    headersUC04_0.put("sec-fetch-dest", "empty");
    headersUC04_0.put("sec-fetch-mode", "cors");
    headersUC04_0.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> headersUC04_1 = new HashMap<>();
    headersUC04_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC04_1.put("sec-ch-ua-mobile", "?0");
    headersUC04_1.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC04_6 = new HashMap<>();
    headersUC04_6.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC04_6.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC04_6.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC04_6.put("priority", "u=0, i");
    headersUC04_6.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC04_6.put("sec-ch-ua-mobile", "?0");
    headersUC04_6.put("sec-ch-ua-platform", "Linux");
    headersUC04_6.put("sec-fetch-dest", "document");
    headersUC04_6.put("sec-fetch-mode", "navigate");
    headersUC04_6.put("sec-fetch-site", "same-origin");
    headersUC04_6.put("sec-fetch-user", "?1");
    headersUC04_6.put("upgrade-insecure-requests", "1");
    
    Map<CharSequence, String> headersUC04_16 = new HashMap<>();
    headersUC04_16.put("Origin", "https://shtab.opmoscow.ru");
    headersUC04_16.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC04_16.put("sec-ch-ua-mobile", "?0");
    headersUC04_16.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC04_23 = new HashMap<>();
    headersUC04_23.put("Upgrade-Insecure-Requests", "1");
    headersUC04_23.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC04_23.put("sec-ch-ua-mobile", "?0");
    headersUC04_23.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC04_24 = new HashMap<>();
    headersUC04_24.put("accept", "*/*");
    headersUC04_24.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC04_24.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC04_24.put("origin", "https://shtab.opmoscow.ru");
    headersUC04_24.put("priority", "u=1, i");
    headersUC04_24.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC04_24.put("sec-ch-ua-mobile", "?0");
    headersUC04_24.put("sec-ch-ua-platform", "Linux");
    headersUC04_24.put("sec-fetch-dest", "empty");
    headersUC04_24.put("sec-fetch-mode", "cors");
    headersUC04_24.put("sec-fetch-site", "cross-site");
    
    String uri2 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC04 = scenario("Nabludateli")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=6&wv-type=7&wmode=0&wv-hit=427998683&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnablyudateli&rn=774490361&browser-info=we%3A1%3Aet%3A1724417650%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823175410%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724417650&t=gdpr(14)ti(1)")
          .headers(headersUC04_0)
          .body(RawFileBody("nabludateli/0000_request.gif"))
          .resources(
            http("request_1")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC04_1),
            http("request_2")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC04_1),
            http("request_3")
              .get(uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC04_1),
            http("request_4")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC04_1),
            http("request_5")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC04_1),
            http("request_6")
              .get(uri2 + "/nablyudateli")
              .headers(headersUC04_6),
            http("request_7")
              .get("/metrika/tag.js")
              .headers(headersUC04_1),
            http("request_8")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC04_1),
            http("request_9")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC04_1),
            http("request_10")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC04_1),
            http("request_11")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC04_1),
            http("request_12")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC04_1),
            http("request_13")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC04_1),
            http("request_14")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC04_1),
            http("request_15")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC04_1),
            http("request_16")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2")
              .headers(headersUC04_16),
            http("request_17")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2")
              .headers(headersUC04_16),
            http("request_18")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2")
              .headers(headersUC04_16),
            http("request_19")
              .get(uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2")
              .headers(headersUC04_16),
            http("request_20")
              .get(uri2 + "/uploads/media/default/0001/28/630bf9fe2fb35ec7b3ec6066e1b744274b11bb01.jpeg")
              .headers(headersUC04_1),
            http("request_21")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC04_1),
            http("request_22")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC04_1),
            http("request_23")
              .get("/metrika/metrika_match.html")
              .headers(headersUC04_23),
            http("request_24")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnablyudateli&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A903453296%3Az%3A300%3Ai%3A20240823175412%3Aet%3A1724417652%3Ac%3A1%3Arn%3A299597295%3Arqn%3A33%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C807%2C36%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724417651436%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724417652%3At%3A%D0%9D%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0%D0%B5%D0%BC%20%D0%BD%D0%B0%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BA%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC04_24)
          )
      );

	  setUp(scnUC04.injectOpen(atOnceUsers(1))).protocols(httpProtocol_Nabludateli);
  }
}
