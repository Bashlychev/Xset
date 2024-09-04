package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class MainPage2022 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_MainPage2022 = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC29_0 = new HashMap<>();
    headersUC29_0.put("accept", "*/*");
    headersUC29_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC29_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC29_0.put("content-type", "text/plain");
    headersUC29_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC29_0.put("priority", "u=1, i");
    headersUC29_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC29_0.put("sec-ch-ua-mobile", "?0");
    headersUC29_0.put("sec-ch-ua-platform", "Linux");
    headersUC29_0.put("sec-fetch-dest", "empty");
    headersUC29_0.put("sec-fetch-mode", "cors");
    headersUC29_0.put("sec-fetch-site", "cross-site");
    headersUC29_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC29_2 = new HashMap<>();
    headersUC29_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC29_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC29_2.put("sec-ch-ua-mobile", "?0");
    headersUC29_2.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC29_17 = new HashMap<>();
    headersUC29_17.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC29_17.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC29_17.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC29_17.put("priority", "u=0, i");
    headersUC29_17.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC29_17.put("sec-ch-ua-mobile", "?0");
    headersUC29_17.put("sec-ch-ua-platform", "Linux");
    headersUC29_17.put("sec-fetch-dest", "document");
    headersUC29_17.put("sec-fetch-mode", "navigate");
    headersUC29_17.put("sec-fetch-site", "same-origin");
    headersUC29_17.put("sec-fetch-user", "?1");
    headersUC29_17.put("upgrade-insecure-requests", "1");
    headersUC29_17.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC29_45 = new HashMap<>();
    headersUC29_45.put("accept", "*/*");
    headersUC29_45.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC29_45.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC29_45.put("origin", "https://shtab.opmoscow.ru");
    headersUC29_45.put("priority", "u=1, i");
    headersUC29_45.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC29_45.put("sec-ch-ua-mobile", "?0");
    headersUC29_45.put("sec-ch-ua-platform", "Linux");
    headersUC29_45.put("sec-fetch-dest", "empty");
    headersUC29_45.put("sec-fetch-mode", "cors");
    headersUC29_45.put("sec-fetch-site", "cross-site");
    headersUC29_45.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC29_46 = new HashMap<>();
    headersUC29_46.put("Upgrade-Insecure-Requests", "1");
    headersUC29_46.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC29_46.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC29_46.put("sec-ch-ua-mobile", "?0");
    headersUC29_46.put("sec-ch-ua-platform", "Linux");
    
    String uri2 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC29 = scenario("Archive.MainPage2022")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=623331497&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2022&rn=648428412&browser-info=we%3A1%3Aet%3A1724483490%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121129%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483490&t=gdpr(14)ti(1)")
          .headers(headersUC29_0)
          .body(RawFileBody("mainpage2022/0000_request.gif"))
          .resources(
            http("request_1")
              .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=623331497&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2022&rn=352877609&browser-info=bt%3A1%3Awe%3A1%3Aet%3A1724483489%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121129%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483489&t=gdpr(14)ti(1)")
              .headers(headersUC29_0),
            http("request_2")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headersUC29_2),
            http("request_3")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headersUC29_2),
            http("request_4")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headersUC29_2),
            http("request_5")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC29_2),
            http("request_6")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC29_2),
            http("request_7")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC29_2),
            http("request_8")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC29_2),
            http("request_9")
              .get(uri2 + "/uploads/media/default/0001/12/81f47d7cf5158a496131d62bdf6b34571fb9d723.png")
              .headers(headersUC29_2),
            http("request_10")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC29_2),
            http("request_11")
              .get("/metrika/tag.js")
              .headers(headersUC29_2),
            http("request_12")
              .get(uri2 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
            http("request_13")
              .get(uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_14")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_15")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_16")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_17")
              .get(uri2 + "/obshchestvennyy-shtab-po-vyboram-2022")
              .headers(headersUC29_17),
            http("request_18")
              .get(uri2 + "/cache/c/0/e/8/e/c0e8e6e74dc69b3706ccc519bd2e0cae360403a5.jpeg")
              .headers(headersUC29_2),
            http("request_19")
              .get(uri2 + "/cache/b/e/6/c/0/be6c0c0599be356d9e6d5b566a9bf3f96380b6f9.jpeg")
              .headers(headersUC29_2),
            http("request_20")
              .get(uri2 + "/cache/5/2/2/7/a/5227a9907fb3976350c71e29af65c32b76390918.jpeg")
              .headers(headersUC29_2),
            http("request_21")
              .get(uri2 + "/cache/b/0/1/8/1/b01813f0e98cd4c5e5175089c5618cbe8691fb6f.jpeg")
              .headers(headersUC29_2),
            http("request_22")
              .get(uri2 + "/cache/3/d/3/1/7/3d3174931f6629bc2a40ef2602b5f587ae482ec3.jpeg")
              .headers(headersUC29_2),
            http("request_23")
              .get(uri2 + "/cache/d/0/7/3/0/d073016a513dc0e189bd798f6e4883ca4c16f3cf.jpeg")
              .headers(headersUC29_2),
            http("request_24")
              .get(uri2 + "/cache/2/c/0/3/0/2c030d5011c1d602add8e88c6424409de6d9a762.jpeg")
              .headers(headersUC29_2),
            http("request_25")
              .get(uri2 + "/cache/4/0/e/e/6/40ee6cbe8c32d15c4e9060730c3db27536379d9e.jpeg")
              .headers(headersUC29_2),
            http("request_26")
              .get(uri2 + "/build/images/opmoscow/loading.svg")
              .headers(headersUC29_2),
            http("request_27")
              .get(uri2 + "/build/images/shtadopm/archive1.png")
              .headers(headersUC29_2),
            http("request_28")
              .get(uri2 + "/uploads/media/default/0001/16/d8be626d1edbeeeae3a7f853cbc2b6114695d91e.png")
              .headers(headersUC29_2),
            http("request_29")
              .get(uri2 + "/build/images/shtadopm/archive2.png")
              .headers(headersUC29_2),
            http("request_30")
              .get(uri2 + "/build/images/shtadopm/archive3.png")
              .headers(headersUC29_2),
            http("request_31")
              .get(uri2 + "/build/images/shtadopm/archive4.png")
              .headers(headersUC29_2),
            http("request_32")
              .get(uri2 + "/build/images/shtadopm/archive5.png")
              .headers(headersUC29_2),
            http("request_33")
              .get(uri2 + "/uploads/media/default/0001/14/8e41f9787e36e8029d3c6170de36347f0ca54c05.png")
              .headers(headersUC29_2),
            http("request_34")
              .get(uri2 + "/uploads/media/slides/0001/13/4ec801b9e1775a9059c90458ed5764228c943142.jpeg")
              .headers(headersUC29_2),
            http("request_35")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC29_2),
            http("request_36")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC29_2),
            http("request_37")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC29_2),
            http("request_38")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC29_2),
            http("request_39")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC29_2),
            http("request_40")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC29_2),
            http("request_41")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC29_2),
            http("request_42")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC29_2),
            http("request_43")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC29_2),
            http("request_44")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC29_2),
            http("request_45")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2022&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A624561450%3Az%3A300%3Ai%3A20240824121131%3Aet%3A1724483491%3Ac%3A1%3Arn%3A917629662%3Arqn%3A194%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C534%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483490666%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483491%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%B2%202022%20%D0%B3%D0%BE%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC29_45),
            http("request_46")
              .get("/metrika/metrika_match.html")
              .headers(headersUC29_46)
          )
      );

	  setUp(scnUC29.injectOpen(atOnceUsers(1))).protocols(httpProtocol_MainPage2022);
  }
}
