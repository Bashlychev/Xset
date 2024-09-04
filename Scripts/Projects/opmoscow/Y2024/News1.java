package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class News1 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_News1 = http
            .baseUrl("https://shtab.opmoscow.ru")
            .inferHtmlResources()
            ;

    Map<CharSequence, String> headersUC20_0 = new HashMap<>();
    headersUC20_0.put("accept", "*/*");
    headersUC20_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC20_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC20_0.put("content-type", "text/plain");
    headersUC20_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC20_0.put("priority", "u=1, i");
    headersUC20_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC20_0.put("sec-ch-ua-mobile", "?0");
    headersUC20_0.put("sec-ch-ua-platform", "Linux");
    headersUC20_0.put("sec-fetch-dest", "empty");
    headersUC20_0.put("sec-fetch-mode", "cors");
    headersUC20_0.put("sec-fetch-site", "cross-site");
    headersUC20_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC20_2 = new HashMap<>();
    headersUC20_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC20_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC20_2.put("sec-ch-ua-mobile", "?0");
    headersUC20_2.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC20_26 = new HashMap<>();
    headersUC20_26.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC20_26.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC20_26.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC20_26.put("priority", "u=0, i");
    headersUC20_26.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC20_26.put("sec-ch-ua-mobile", "?0");
    headersUC20_26.put("sec-ch-ua-platform", "Linux");
    headersUC20_26.put("sec-fetch-dest", "document");
    headersUC20_26.put("sec-fetch-mode", "navigate");
    headersUC20_26.put("sec-fetch-site", "same-origin");
    headersUC20_26.put("sec-fetch-user", "?1");
    headersUC20_26.put("upgrade-insecure-requests", "1");
    headersUC20_26.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC20_29 = new HashMap<>();
    headersUC20_29.put("accept", "*/*");
    headersUC20_29.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC20_29.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC20_29.put("origin", "https://shtab.opmoscow.ru");
    headersUC20_29.put("priority", "u=1, i");
    headersUC20_29.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC20_29.put("sec-ch-ua-mobile", "?0");
    headersUC20_29.put("sec-ch-ua-platform", "Linux");
    headersUC20_29.put("sec-fetch-dest", "empty");
    headersUC20_29.put("sec-fetch-mode", "cors");
    headersUC20_29.put("sec-fetch-site", "cross-site");
    headersUC20_29.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC20_30 = new HashMap<>();
    headersUC20_30.put("Upgrade-Insecure-Requests", "1");
    headersUC20_30.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC20_30.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC20_30.put("sec-ch-ua-mobile", "?0");
    headersUC20_30.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC20_32 = new HashMap<>();
    headersUC20_32.put("accept", "*/*");
    headersUC20_32.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC20_32.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC20_32.put("origin", "https://shtab.opmoscow.ru");
    headersUC20_32.put("priority", "u=4, i");
    headersUC20_32.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC20_32.put("sec-ch-ua-mobile", "?0");
    headersUC20_32.put("sec-ch-ua-platform", "Linux");
    headersUC20_32.put("sec-fetch-dest", "empty");
    headersUC20_32.put("sec-fetch-mode", "no-cors");
    headersUC20_32.put("sec-fetch-site", "cross-site");
    headersUC20_32.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri2 = "https://shtab.opmoscow.ru";
    
    String uri3 = "https://yastatic.net";

    ScenarioBuilder scnUC20 = scenario("Projects.asafov.News1")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=1&wv-check=10431&wv-type=0&wmode=0&wv-hit=302056641&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Ftestovoe-golosovanie-v-moskve-proshlo-v-shtatnom-rezhime&rn=699405502&browser-info=we%3A1%3Aet%3A1724422053%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823190732%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724422053&t=gdpr(14)ti(1)")
          .headers(headersUC20_0)
          .body(RawFileBody("news1/0000_request.gif"))
          .resources(
            http("request_1")
              .post("/webvisor/89667203?wv-part=6&wv-type=7&wmode=0&wv-hit=302056641&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Ftestovoe-golosovanie-v-moskve-proshlo-v-shtatnom-rezhime&rn=498528486&browser-info=we%3A1%3Aet%3A1724422051%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823190730%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724422051&t=gdpr(14)ti(1)")
              .headers(headersUC20_0)
              .body(RawFileBody("news1/0001_request.gif")),
            http("request_2")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headersUC20_2),
            http("request_3")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headersUC20_2),
            http("request_4")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headersUC20_2),
            http("request_5")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC20_2),
            http("request_6")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC20_2),
            http("request_7")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC20_2),
            http("request_8")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC20_2),
            http("request_9")
              .get(uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC20_2),
            http("request_10")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC20_2),
            http("request_11")
              .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
              .headers(headersUC20_2),
            http("request_12")
              .get(uri3 + "/share2/share.js")
              .headers(headersUC20_2),
            http("request_13")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC20_2),
            http("request_14")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC20_2),
            http("request_15")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC20_2),
            http("request_16")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC20_2),
            http("request_17")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC20_2),
            http("request_18")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC20_2),
            http("request_19")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC20_2),
            http("request_20")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC20_2),
            http("request_21")
              .get("/metrika/tag.js")
              .headers(headersUC20_2),
            http("request_22")
              .get(uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_23")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_24")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_25")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_26")
              .get(uri2 + "/news/view/testovoe-golosovanie-v-moskve-proshlo-v-shtatnom-rezhime")
              .headers(headersUC20_26),
            http("request_27")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC20_2),
            http("request_28")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC20_2),
            http("request_29")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Ftestovoe-golosovanie-v-moskve-proshlo-v-shtatnom-rezhime&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A435281084%3Az%3A300%3Ai%3A20240823190733%3Aet%3A1724422053%3Ac%3A1%3Arn%3A831517926%3Arqn%3A98%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C492%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422052534%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422053%3At%3A%D0%A2%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%BF%D1%80%D0%BE%D1%88%D0%BB%D0%BE%20%D0%B2%20%D1%88%D1%82%D0%B0%D1%82%D0%BD%D0%BE%D0%BC%20%D1%80%D0%B5%D0%B6%D0%B8%D0%BC%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC20_29),
            http("request_30")
              .get("/metrika/metrika_match.html")
              .headers(headersUC20_30),
            http("request_31")
              .get("/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Ftestovoe-golosovanie-v-moskve-proshlo-v-shtatnom-rezhime&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A435281084%3Az%3A300%3Ai%3A20240823190733%3Aet%3A1724422053%3Ac%3A1%3Arn%3A741171057%3Arqn%3A9%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C492%2C58%2C1%2C0%2C%2C11%2C%2C%2C%2C%2C565%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422052534%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422053%3At%3A%D0%A2%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%BF%D1%80%D0%BE%D1%88%D0%BB%D0%BE%20%D0%B2%20%D1%88%D1%82%D0%B0%D1%82%D0%BD%D0%BE%D0%BC%20%D1%80%D0%B5%D0%B6%D0%B8%D0%BC%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
              .headers(headersUC20_29),
            http("request_32")
              .post("/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Ftestovoe-golosovanie-v-moskve-proshlo-v-shtatnom-rezhime&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724422053_9d04215be791e105d3dcf42d14597b6e36fba213ea92126a73d70c312fefbcee&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A435281084%3Az%3A300%3Ai%3A20240823190733%3Aet%3A1724422054%3Ac%3A1%3Arn%3A41266524%3Arqn%3A10%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A568%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C7%2C578%2C578%2C1%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724422052534%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422054&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
              .headers(headersUC20_32)
          )
      );

	  setUp(scnUC20.injectOpen(atOnceUsers(1))).protocols(httpProtocol_News1);
  }
}
