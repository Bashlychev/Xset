package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class CandidatesSelfNominated extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_CandidatesSelfNominated = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC17_0 = new HashMap<>();
    headersUC17_0.put("accept", "*/*");
    headersUC17_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC17_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC17_0.put("content-type", "text/plain");
    headersUC17_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC17_0.put("priority", "u=1, i");
    headersUC17_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC17_0.put("sec-ch-ua-mobile", "?0");
    headersUC17_0.put("sec-ch-ua-platform", "Linux");
    headersUC17_0.put("sec-fetch-dest", "empty");
    headersUC17_0.put("sec-fetch-mode", "cors");
    headersUC17_0.put("sec-fetch-site", "cross-site");
    headersUC17_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC17_2 = new HashMap<>();
    headersUC17_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC17_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC17_2.put("sec-ch-ua-mobile", "?0");
    headersUC17_2.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC17_15 = new HashMap<>();
    headersUC17_15.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC17_15.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC17_15.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC17_15.put("priority", "u=0, i");
    headersUC17_15.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC17_15.put("sec-ch-ua-mobile", "?0");
    headersUC17_15.put("sec-ch-ua-platform", "Linux");
    headersUC17_15.put("sec-fetch-dest", "document");
    headersUC17_15.put("sec-fetch-mode", "navigate");
    headersUC17_15.put("sec-fetch-site", "same-origin");
    headersUC17_15.put("sec-fetch-user", "?1");
    headersUC17_15.put("upgrade-insecure-requests", "1");
    headersUC17_15.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC17_54 = new HashMap<>();
    headersUC17_54.put("accept", "*/*");
    headersUC17_54.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC17_54.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC17_54.put("origin", "https://shtab.opmoscow.ru");
    headersUC17_54.put("priority", "u=1, i");
    headersUC17_54.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC17_54.put("sec-ch-ua-mobile", "?0");
    headersUC17_54.put("sec-ch-ua-platform", "Linux");
    headersUC17_54.put("sec-fetch-dest", "empty");
    headersUC17_54.put("sec-fetch-mode", "cors");
    headersUC17_54.put("sec-fetch-site", "cross-site");
    headersUC17_54.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC17_55 = new HashMap<>();
    headersUC17_55.put("Upgrade-Insecure-Requests", "1");
    headersUC17_55.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC17_55.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC17_55.put("sec-ch-ua-mobile", "?0");
    headersUC17_55.put("sec-ch-ua-platform", "Linux");
    
    String uri2 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC17 = scenario("CandidatesSelfNominated")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=2&wv-check=44765&wv-type=0&wmode=0&wv-hit=744178719&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fsamovydvizhenec&rn=445974004&browser-info=we%3A1%3Aet%3A1724421230%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823185350%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724421230&t=gdpr(14)ti(1)")
          .headers(headersUC17_0)
          .body(RawFileBody("candidatesselfnominated/0000_request.gif"))
          .resources(
            http("request_1")
              .post("/webvisor/89667203?wv-part=7&wv-type=7&wmode=0&wv-hit=744178719&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fsamovydvizhenec&rn=548969985&browser-info=we%3A1%3Aet%3A1724421231%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823185351%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724421231&t=gdpr(14)ti(1)")
              .headers(headersUC17_0)
              .body(RawFileBody("candidatesselfnominated/0001_request.gif")),
            http("request_2")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headersUC17_2),
            http("request_3")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headersUC17_2),
            http("request_4")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headersUC17_2),
            http("request_5")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC17_2),
            http("request_6")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC17_2),
            http("request_7")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC17_2),
            http("request_8")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC17_2),
            http("request_9")
              .get(uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC17_2),
            http("request_10")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC17_2),
            http("request_11")
              .get("/metrika/tag.js")
              .headers(headersUC17_2),
            http("request_12")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_13")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_14")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_15")
              .get(uri2 + "/party/view/samovydvizhenec")
              .headers(headersUC17_15),
            http("request_16")
              .get(uri2 + "/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
              .headers(headersUC17_2),
            http("request_17")
              .get(uri2 + "/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
              .headers(headersUC17_2),
            http("request_18")
              .get(uri2 + "/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
              .headers(headersUC17_2),
            http("request_19")
              .get(uri2 + "/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
              .headers(headersUC17_2),
            http("request_20")
              .get(uri2 + "/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
              .headers(headersUC17_2),
            http("request_21")
              .get(uri2 + "/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
              .headers(headersUC17_2),
            http("request_22")
              .get(uri2 + "/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
              .headers(headersUC17_2),
            http("request_23")
              .get(uri2 + "/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
              .headers(headersUC17_2),
            http("request_24")
              .get(uri2 + "/cache/d/b/f/5/4/dbf5441379030ebb65b4151ed9de586879b04b3c.jpeg")
              .headers(headersUC17_2),
            http("request_25")
              .get(uri2 + "/cache/f/6/9/9/7/f6997c4f54bfef9cfff22e3c794ab7384b93fab4.jpeg")
              .headers(headersUC17_2),
            http("request_26")
              .get(uri2 + "/cache/f/3/c/d/6/f3cd639a78084d1a2537e1d1d7350f2faa357260.jpeg")
              .headers(headersUC17_2),
            http("request_27")
              .get(uri2 + "/cache/a/3/5/5/4/a3554ccb0a1c529e1322149871676e85895be7a7.jpeg")
              .headers(headersUC17_2),
            http("request_28")
              .get(uri2 + "/cache/d/9/1/4/8/d91486849827e8cd91f7b7a395583ce77dd0c8f5.jpeg")
              .headers(headersUC17_2),
            http("request_29")
              .get(uri2 + "/cache/0/7/f/a/7/07fa730260e36e620282b133ab70d74eb369ccfb.jpeg")
              .headers(headersUC17_2),
            http("request_30")
              .get(uri2 + "/cache/c/9/4/5/a/c945a2ec1bf4e719c0338077544a49a4460ec2d7.jpeg")
              .headers(headersUC17_2),
            http("request_31")
              .get(uri2 + "/cache/1/5/a/c/c/15acc0bb74bc00f605bfbb7c2f677f1afd33090d.jpeg")
              .headers(headersUC17_2),
            http("request_32")
              .get(uri2 + "/cache/4/c/8/1/5/4c8151974b7e418ce475e09796e8a6695411451c.jpeg")
              .headers(headersUC17_2),
            http("request_33")
              .get(uri2 + "/cache/6/7/2/c/d/672cd123e702540c915bca9ecad3d8681ae99404.jpeg")
              .headers(headersUC17_2),
            http("request_34")
              .get(uri2 + "/cache/8/3/0/2/5/8302506c32a14d7d4b99bd9420d559e58e343179.jpeg")
              .headers(headersUC17_2),
            http("request_35")
              .get(uri2 + "/cache/6/8/2/8/f/6828f358592a3bb5860a5cbca698753867f125af.jpeg")
              .headers(headersUC17_2),
            http("request_36")
              .get(uri2 + "/cache/9/8/6/5/1/98651dc843db2c4fa20b205a5d86c3e29c7a00ae.jpeg")
              .headers(headersUC17_2),
            http("request_37")
              .get(uri2 + "/cache/2/3/e/d/f/23edf8250f6d6f5055df5b6eac9cdb8c8e5e055c.jpeg")
              .headers(headersUC17_2),
            http("request_38")
              .get(uri2 + "/cache/3/6/8/e/1/368e102cdf2e7f23feb9437b4f89d808ec8c1c12.jpeg")
              .headers(headersUC17_2),
            http("request_39")
              .get(uri2 + "/cache/2/b/1/b/0/2b1b087bb43e5575c197a1db15393527705c7c30.jpeg")
              .headers(headersUC17_2),
            http("request_40")
              .get(uri2 + "/cache/3/c/3/6/8/3c368239b1fcf23f3b2c5d06298605884c579f83.jpeg")
              .headers(headersUC17_2),
            http("request_41")
              .get(uri2 + "/cache/b/4/5/c/4/b45c4ae0a35543658427c50afe0ffedbeac74bc2.png")
              .headers(headersUC17_2),
            http("request_42")
              .get(uri2 + "/cache/e/c/1/2/e/ec12e99984ff7fe0928c822511d3e36a9a0ce615.png")
              .headers(headersUC17_2),
            http("request_43")
              .get(uri2 + "/cache/c/6/d/0/7/c6d07fd8c5f92a90bf3d02ce05771de33c6dacb6.jpeg")
              .headers(headersUC17_2),
            http("request_44")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC17_2),
            http("request_45")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC17_2),
            http("request_46")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC17_2),
            http("request_47")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC17_2),
            http("request_48")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC17_2),
            http("request_49")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC17_2),
            http("request_50")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC17_2),
            http("request_51")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC17_2),
            http("request_52")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC17_2),
            http("request_53")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC17_2),
            http("request_54")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fsamovydvizhenec&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fzelyonye&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A400334354%3Az%3A300%3Ai%3A20240823185354%3Aet%3A1724421235%3Ac%3A1%3Arn%3A442417363%3Arqn%3A76%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C5518%2C537%2C%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724421228697%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724421235%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D1%81%D0%B0%D0%BC%D0%BE%D0%B2%D1%8B%D0%B4%D0%B2%D0%B8%D0%B6%D0%B5%D0%BD%D1%86%D1%8B&t=gdpr(14)clc(0-0-0)rqnt(1)aw(0)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC17_54)
          )
      )
      .pause(2)
      .exec(
        http("request_55")
          .get("/metrika/metrika_match.html")
          .headers(headersUC17_55)
      );

	  setUp(scnUC17.injectOpen(atOnceUsers(1))).protocols(httpProtocol_CandidatesSelfNominated);
  }
}
