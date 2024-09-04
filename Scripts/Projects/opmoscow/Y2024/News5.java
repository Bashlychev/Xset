package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class News5 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_News5 = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC24_0 = new HashMap<>();
    headersUC24_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC24_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC24_0.put("sec-ch-ua-mobile", "?0");
    headersUC24_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC24_13 = new HashMap<>();
    headersUC24_13.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC24_13.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC24_13.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC24_13.put("priority", "u=0, i");
    headersUC24_13.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC24_13.put("sec-ch-ua-mobile", "?0");
    headersUC24_13.put("sec-ch-ua-platform", "Linux");
    headersUC24_13.put("sec-fetch-dest", "document");
    headersUC24_13.put("sec-fetch-mode", "navigate");
    headersUC24_13.put("sec-fetch-site", "same-origin");
    headersUC24_13.put("sec-fetch-user", "?1");
    headersUC24_13.put("upgrade-insecure-requests", "1");
    headersUC24_13.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC24_26 = new HashMap<>();
    headersUC24_26.put("Upgrade-Insecure-Requests", "1");
    headersUC24_26.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC24_26.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC24_26.put("sec-ch-ua-mobile", "?0");
    headersUC24_26.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC24_27 = new HashMap<>();
    headersUC24_27.put("accept", "*/*");
    headersUC24_27.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC24_27.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC24_27.put("origin", "https://shtab.opmoscow.ru");
    headersUC24_27.put("priority", "u=1, i");
    headersUC24_27.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC24_27.put("sec-ch-ua-mobile", "?0");
    headersUC24_27.put("sec-ch-ua-platform", "Linux");
    headersUC24_27.put("sec-fetch-dest", "empty");
    headersUC24_27.put("sec-fetch-mode", "cors");
    headersUC24_27.put("sec-fetch-site", "cross-site");
    headersUC24_27.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC24_29 = new HashMap<>();
    headersUC24_29.put("accept", "*/*");
    headersUC24_29.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC24_29.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC24_29.put("origin", "https://shtab.opmoscow.ru");
    headersUC24_29.put("priority", "u=4, i");
    headersUC24_29.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC24_29.put("sec-ch-ua-mobile", "?0");
    headersUC24_29.put("sec-ch-ua-platform", "Linux");
    headersUC24_29.put("sec-fetch-dest", "empty");
    headersUC24_29.put("sec-fetch-mode", "no-cors");
    headersUC24_29.put("sec-fetch-site", "cross-site");
    headersUC24_29.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri1 = "https://mc.yandex.ru";
    
    String uri3 = "https://yastatic.net";

    ScenarioBuilder scnUC24 = scenario("News5")
      .exec(
        http("request_0")
          .get("/build/5758.f38a32ed.css")
          .headers(headersUC24_0)
          .resources(
            http("request_1")
              .get("/build/6395.76430bbc.css")
              .headers(headersUC24_0),
            http("request_2")
              .get("/build/8886.31d6cfe0.css")
              .headers(headersUC24_0),
            http("request_3")
              .get("/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC24_0),
            http("request_4")
              .get("/build/runtime.aaa04269.js")
              .headers(headersUC24_0),
            http("request_5")
              .get("/build/9755.89d0240d.js")
              .headers(headersUC24_0),
            http("request_6")
              .get("/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC24_0),
            http("request_7")
              .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC24_0),
            http("request_8")
              .get("/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC24_0),
            http("request_9")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersUC24_0),
            http("request_10")
              .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_11")
              .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_12")
              .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_13")
              .get("/news/view/vse-o-vyborah--2024-moskvicham-rasskazali-o-proverennyh-informacionnyh-resursah")
              .headers(headersUC24_13),
            http("request_14")
              .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
              .headers(headersUC24_0),
            http("request_15")
              .get(uri3 + "/share2/share.js")
              .headers(headersUC24_0),
            http("request_16")
              .get("/build/7255.871eb160.js")
              .headers(headersUC24_0),
            http("request_17")
              .get("/build/6889.3f713c69.js")
              .headers(headersUC24_0),
            http("request_18")
              .get("/build/7729.67d87565.js")
              .headers(headersUC24_0),
            http("request_19")
              .get("/build/8981.bc50772a.js")
              .headers(headersUC24_0),
            http("request_20")
              .get("/build/3734.2c5e1582.js")
              .headers(headersUC24_0),
            http("request_21")
              .get("/build/9154.f1370752.js")
              .headers(headersUC24_0),
            http("request_22")
              .get("/build/1676.2634f191.js")
              .headers(headersUC24_0),
            http("request_23")
              .get("/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC24_0),
            http("request_24")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC24_0),
            http("request_25")
              .get("/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC24_0),
            http("request_26")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersUC24_26),
            http("request_27")
              .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fvse-o-vyborah--2024-moskvicham-rasskazali-o-proverennyh-informacionnyh-resursah&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A261492663%3Az%3A300%3Ai%3A20240823191616%3Aet%3A1724422577%3Ac%3A1%3Arn%3A533457641%3Arqn%3A111%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C474%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422576391%3Anp%3ATGludXggeDg2XzY0%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422577%3At%3A%D0%92%D1%81%D0%B5%20%D0%BE%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D1%85%20%E2%80%93%202024%3A%20%D0%BC%D0%BE%D1%81%D0%BA%D0%B2%D0%B8%D1%87%D0%B0%D0%BC%20%D1%80%D0%B0%D1%81%D1%81%D0%BA%D0%B0%D0%B7%D0%B0%D0%BB%D0%B8%20%D0%BE%20%D0%BF%D1%80%D0%BE%D0%B2%D0%B5%D1%80%D0%B5%D0%BD%D0%BD%D1%8B%D1%85%20%D0%B8%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D1%8B%D1%85%20%D1%80%D0%B5%D1%81%D1%83%D1%80%D1%81%D0%B0%D1%85&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC24_27),
            http("request_28")
              .get(uri1 + "/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fvse-o-vyborah--2024-moskvicham-rasskazali-o-proverennyh-informacionnyh-resursah&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A261492663%3Az%3A300%3Ai%3A20240823191616%3Aet%3A1724422577%3Ac%3A1%3Arn%3A58762029%3Arqn%3A28%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C474%2C36%2C1%2C0%2C%2C34%2C%2C%2C%2C%2C546%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422576391%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422577%3At%3A%D0%92%D1%81%D0%B5%20%D0%BE%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D1%85%20%E2%80%93%202024%3A%20%D0%BC%D0%BE%D1%81%D0%BA%D0%B2%D0%B8%D1%87%D0%B0%D0%BC%20%D1%80%D0%B0%D1%81%D1%81%D0%BA%D0%B0%D0%B7%D0%B0%D0%BB%D0%B8%20%D0%BE%20%D0%BF%D1%80%D0%BE%D0%B2%D0%B5%D1%80%D0%B5%D0%BD%D0%BD%D1%8B%D1%85%20%D0%B8%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D1%8B%D1%85%20%D1%80%D0%B5%D1%81%D1%83%D1%80%D1%81%D0%B0%D1%85&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
              .headers(headersUC24_27),
            http("request_29")
              .post(uri1 + "/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fvse-o-vyborah--2024-moskvicham-rasskazali-o-proverennyh-informacionnyh-resursah&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724422586_92c007ab1bfead604c16ccf3f292a8f9a895665f8101bced5b9687a3b77d1cb3&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A261492663%3Az%3A300%3Ai%3A20240823191626%3Aet%3A1724422586%3Ac%3A1%3Arn%3A626502863%3Arqn%3A29%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A533%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C5%2C558%2C558%2C0%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724422576391%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422586&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
              .headers(headersUC24_29)
          )
      );

	  setUp(scnUC24.injectOpen(atOnceUsers(1))).protocols(httpProtocol_News5);
  }
}
