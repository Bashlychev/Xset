package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class Kandidati extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_Kandidati = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC11_0 = new HashMap<>();
    headersUC11_0.put("accept", "*/*");
    headersUC11_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC11_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC11_0.put("content-type", "text/plain");
    headersUC11_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC11_0.put("priority", "u=1, i");
    headersUC11_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC11_0.put("sec-ch-ua-mobile", "?0");
    headersUC11_0.put("sec-ch-ua-platform", "Linux");
    headersUC11_0.put("sec-fetch-dest", "empty");
    headersUC11_0.put("sec-fetch-mode", "cors");
    headersUC11_0.put("sec-fetch-site", "cross-site");
    headersUC11_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC11_1 = new HashMap<>();
    headersUC11_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC11_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC11_1.put("sec-ch-ua-mobile", "?0");
    headersUC11_1.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC11_33 = new HashMap<>();
    headersUC11_33.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC11_33.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC11_33.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC11_33.put("priority", "u=0, i");
    headersUC11_33.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC11_33.put("sec-ch-ua-mobile", "?0");
    headersUC11_33.put("sec-ch-ua-platform", "Linux");
    headersUC11_33.put("sec-fetch-dest", "document");
    headersUC11_33.put("sec-fetch-mode", "navigate");
    headersUC11_33.put("sec-fetch-site", "same-origin");
    headersUC11_33.put("sec-fetch-user", "?1");
    headersUC11_33.put("upgrade-insecure-requests", "1");
    headersUC11_33.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC11_44 = new HashMap<>();
    headersUC11_44.put("Upgrade-Insecure-Requests", "1");
    headersUC11_44.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC11_44.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC11_44.put("sec-ch-ua-mobile", "?0");
    headersUC11_44.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC11_45 = new HashMap<>();
    headersUC11_45.put("accept", "*/*");
    headersUC11_45.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC11_45.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC11_45.put("origin", "https://shtab.opmoscow.ru");
    headersUC11_45.put("priority", "u=1, i");
    headersUC11_45.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC11_45.put("sec-ch-ua-mobile", "?0");
    headersUC11_45.put("sec-ch-ua-platform", "Linux");
    headersUC11_45.put("sec-fetch-dest", "empty");
    headersUC11_45.put("sec-fetch-mode", "cors");
    headersUC11_45.put("sec-fetch-site", "cross-site");
    headersUC11_45.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri2 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC11 = scenario("Kandidati")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=3&wv-type=7&wmode=0&wv-hit=295113844&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fkandidaty&rn=961630866&browser-info=we%3A1%3Aet%3A1724420352%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823183911%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724420352&t=gdpr(14)ti(1)")
          .headers(headersUC11_0)
          .body(RawFileBody("kandidati/0000_request.gif"))
          .resources(
            http("request_1")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headersUC11_1),
            http("request_2")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headersUC11_1),
            http("request_3")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headersUC11_1),
            http("request_4")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC11_1),
            http("request_5")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC11_1),
            http("request_6")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC11_1),
            http("request_7")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC11_1),
            http("request_8")
              .get(uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC11_1),
            http("request_9")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC11_1),
            http("request_10")
              .get(uri2 + "/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
              .headers(headersUC11_1),
            http("request_11")
              .get(uri2 + "/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
              .headers(headersUC11_1),
            http("request_12")
              .get(uri2 + "/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
              .headers(headersUC11_1),
            http("request_13")
              .get(uri2 + "/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
              .headers(headersUC11_1),
            http("request_14")
              .get(uri2 + "/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
              .headers(headersUC11_1),
            http("request_15")
              .get(uri2 + "/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
              .headers(headersUC11_1),
            http("request_16")
              .get(uri2 + "/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
              .headers(headersUC11_1),
            http("request_17")
              .get(uri2 + "/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
              .headers(headersUC11_1),
            http("request_18")
              .get(uri2 + "/cache/3/a/1/f/7/3a1f7aa046a731c622e69a6fbe26ee15b1c73ca9.jpeg")
              .headers(headersUC11_1),
            http("request_19")
              .get(uri2 + "/cache/6/6/e/7/7/66e7767bfb250027d7a04d41a50724ae85e5ccc1.jpeg")
              .headers(headersUC11_1),
            http("request_20")
              .get(uri2 + "/cache/0/8/6/8/9/0868959f58c583c849bf7e37b0f06f01c5fcea37.jpeg")
              .headers(headersUC11_1),
            http("request_21")
              .get(uri2 + "/cache/5/c/9/b/b/5c9bb8891d8822a8321945cb8dbea12288d78414.jpeg")
              .headers(headersUC11_1),
            http("request_22")
              .get(uri2 + "/cache/c/a/6/7/e/ca67ec946d0cff8eeed64062e9ac3a97984a99ad.jpeg")
              .headers(headersUC11_1),
            http("request_23")
              .get(uri2 + "/cache/c/e/a/9/b/cea9b176a530e943a394c5bc36e4948a93842c25.jpeg")
              .headers(headersUC11_1),
            http("request_24")
              .get(uri2 + "/cache/4/d/6/f/5/4d6f5e11013510ddd78974effecb47a1c709a4ee.jpeg")
              .headers(headersUC11_1),
            http("request_25")
              .get(uri2 + "/cache/c/a/9/7/c/ca97c16fd5f5d46456ed022f535d5c221338a700.png")
              .headers(headersUC11_1),
            http("request_26")
              .get(uri2 + "/cache/3/f/9/6/c/3f96ccaa08906eff744ac9bd8198cfc3d72420cf.jpeg")
              .headers(headersUC11_1),
            http("request_27")
              .get(uri2 + "/cache/e/7/8/5/4/e7854c040bf140e32cc8bfdcaf8713033162609e.jpeg")
              .headers(headersUC11_1),
            http("request_28")
              .get(uri2 + "/build/images/opmoscow/loading.svg")
              .headers(headersUC11_1),
            http("request_29")
              .get("/metrika/tag.js")
              .headers(headersUC11_1),
            http("request_30")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_31")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_32")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_33")
              .get(uri2 + "/kandidaty")
              .headers(headersUC11_33),
            http("request_34")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC11_1),
            http("request_35")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC11_1),
            http("request_36")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC11_1),
            http("request_37")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC11_1),
            http("request_38")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC11_1),
            http("request_39")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC11_1),
            http("request_40")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC11_1),
            http("request_41")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC11_1),
            http("request_42")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC11_1),
            http("request_43")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC11_1),
            http("request_44")
              .get("/metrika/metrika_match.html")
              .headers(headersUC11_44),
            http("request_45")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fkandidaty&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fzelyonye&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A963215201%3Az%3A300%3Ai%3A20240823183912%3Aet%3A1724420353%3Ac%3A1%3Arn%3A586053256%3Arqn%3A52%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C339%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724420352219%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724420353%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%B2%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D1%8B%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%8B%2C%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%20%D0%B8%20%D0%9A%D1%83%D1%80%D0%BA%D0%B8%D0%BD%D0%BE%202024&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(1)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC11_45)
          )
      );

	  setUp(scnUC11.injectOpen(atOnceUsers(1))).protocols(httpProtocol_Kandidati);
  }
}
