package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class MainPage2023 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_MainPage2023 = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC25_0 = new HashMap<>();
    headersUC25_0.put("accept", "*/*");
    headersUC25_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC25_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC25_0.put("content-type", "text/plain");
    headersUC25_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC25_0.put("priority", "u=1, i");
    headersUC25_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC25_0.put("sec-ch-ua-mobile", "?0");
    headersUC25_0.put("sec-ch-ua-platform", "Linux");
    headersUC25_0.put("sec-fetch-dest", "empty");
    headersUC25_0.put("sec-fetch-mode", "cors");
    headersUC25_0.put("sec-fetch-site", "cross-site");
    headersUC25_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC25_1 = new HashMap<>();
    headersUC25_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC25_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC25_1.put("sec-ch-ua-mobile", "?0");
    headersUC25_1.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC25_37 = new HashMap<>();
    headersUC25_37.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC25_37.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC25_37.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC25_37.put("priority", "u=0, i");
    headersUC25_37.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC25_37.put("sec-ch-ua-mobile", "?0");
    headersUC25_37.put("sec-ch-ua-platform", "Linux");
    headersUC25_37.put("sec-fetch-dest", "document");
    headersUC25_37.put("sec-fetch-mode", "navigate");
    headersUC25_37.put("sec-fetch-site", "same-origin");
    headersUC25_37.put("sec-fetch-user", "?1");
    headersUC25_37.put("upgrade-insecure-requests", "1");
    headersUC25_37.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC25_48 = new HashMap<>();
    headersUC25_48.put("accept", "*/*");
    headersUC25_48.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC25_48.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC25_48.put("origin", "https://shtab.opmoscow.ru");
    headersUC25_48.put("priority", "u=1, i");
    headersUC25_48.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC25_48.put("sec-ch-ua-mobile", "?0");
    headersUC25_48.put("sec-ch-ua-platform", "Linux");
    headersUC25_48.put("sec-fetch-dest", "empty");
    headersUC25_48.put("sec-fetch-mode", "cors");
    headersUC25_48.put("sec-fetch-site", "cross-site");
    headersUC25_48.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC25_49 = new HashMap<>();
    headersUC25_49.put("Upgrade-Insecure-Requests", "1");
    headersUC25_49.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC25_49.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC25_49.put("sec-ch-ua-mobile", "?0");
    headersUC25_49.put("sec-ch-ua-platform", "Linux");
    
    String uri2 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC25 = scenario("Archive.MainPage2023")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=3&wv-type=7&wmode=0&wv-hit=4997530&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&rn=247839678&browser-info=we%3A1%3Aet%3A1724481694%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824114134%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724481694&t=gdpr(14)ti(1)")
          .headers(headersUC25_0)
          .body(RawFileBody("mainpage2023/0000_request.gif"))
          .resources(
            http("request_1")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headersUC25_1),
            http("request_2")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headersUC25_1),
            http("request_3")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headersUC25_1),
            http("request_4")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC25_1),
            http("request_5")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC25_1),
            http("request_6")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC25_1),
            http("request_7")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC25_1),
            http("request_8")
              .get(uri2 + "/uploads/media/default/0002/08/eaeb42854c5147ecd4db172ab7aa6a48cf0de830.png")
              .headers(headersUC25_1),
            http("request_9")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC25_1),
            http("request_10")
              .get(uri2 + "/cache/4/e/4/b/c/4e4bce3ff9353a38a8cf548abd48c406354a014c.jpeg")
              .headers(headersUC25_1),
            http("request_11")
              .get(uri2 + "/cache/3/9/f/1/5/39f15709c006290e19dd68a664d2f3bea1beafcf.jpeg")
              .headers(headersUC25_1),
            http("request_12")
              .get(uri2 + "/cache/4/2/d/4/2/42d42c8d0e90edb4524715cf885ac23da58ee495.png")
              .headers(headersUC25_1),
            http("request_13")
              .get(uri2 + "/uploads/media/default/0001/28/8381d6d787f039276e071d762399a29444faa61d.jpeg")
              .headers(headersUC25_1),
            http("request_14")
              .get(uri2 + "/build/images/shtadopm/structure5.jpg")
              .headers(headersUC25_1),
            http("request_15")
              .get(uri2 + "/build/images/shtadopm/structure6.jpg")
              .headers(headersUC25_1),
            http("request_16")
              .get(uri2 + "/build/images/shtadopm/structure4.jpg")
              .headers(headersUC25_1),
            http("request_17")
              .get(uri2 + "/build/images/shtadopm/structure1.jpg")
              .headers(headersUC25_1),
            http("request_18")
              .get(uri2 + "/build/images/shtadopm/structure3.jpg")
              .headers(headersUC25_1),
            http("request_19")
              .get(uri2 + "/cache/c/f/1/d/2/cf1d21ddbaadf8635959a8e5eb813fda6f2c4868.jpeg")
              .headers(headersUC25_1),
            http("request_20")
              .get(uri2 + "/cache/c/e/a/0/2/cea024e923a1eca76df9aa638d7a2a8433b53862.jpeg")
              .headers(headersUC25_1),
            http("request_21")
              .get(uri2 + "/cache/e/7/f/c/6/e7fc68be33f56dc99294de4b67e244046df252ad.jpeg")
              .headers(headersUC25_1),
            http("request_22")
              .get(uri2 + "/build/images/opmoscow/loading.svg")
              .headers(headersUC25_1),
            http("request_23")
              .get(uri2 + "/uploads/media/default/0002/08/844891c0cb823bbd1be67eaef729f65abf6cb8cd.png")
              .headers(headersUC25_1),
            http("request_24")
              .get(uri2 + "/build/images/shtadopm/archive1.png")
              .headers(headersUC25_1),
            http("request_25")
              .get(uri2 + "/uploads/media/default/0001/16/d8be626d1edbeeeae3a7f853cbc2b6114695d91e.png")
              .headers(headersUC25_1),
            http("request_26")
              .get(uri2 + "/build/images/shtadopm/archive2.png")
              .headers(headersUC25_1),
            http("request_27")
              .get(uri2 + "/build/images/shtadopm/archive3.png")
              .headers(headersUC25_1),
            http("request_28")
              .get(uri2 + "/build/images/shtadopm/archive4.png")
              .headers(headersUC25_1),
            http("request_29")
              .get(uri2 + "/build/images/shtadopm/archive5.png")
              .headers(headersUC25_1),
            http("request_30")
              .get(uri2 + "/uploads/media/default/0001/14/8e41f9787e36e8029d3c6170de36347f0ca54c05.png")
              .headers(headersUC25_1),
            http("request_31")
              .get(uri2 + "/uploads/media/slides/0001/13/4ec801b9e1775a9059c90458ed5764228c943142.jpeg")
              .headers(headersUC25_1),
            http("request_32")
              .get("/metrika/tag.js")
              .headers(headersUC25_1),
            http("request_33")
              .get(uri2 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
            http("request_34")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_35")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_36")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_37")
              .get(uri2 + "/obshchestvennyy-shtab-po-vyboram-2023")
              .headers(headersUC25_37),
            http("request_38")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC25_1),
            http("request_39")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC25_1),
            http("request_40")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC25_1),
            http("request_41")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC25_1),
            http("request_42")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC25_1),
            http("request_43")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC25_1),
            http("request_44")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC25_1),
            http("request_45")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC25_1),
            http("request_46")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC25_1),
            http("request_47")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC25_1),
            http("request_48")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A8824332%3Az%3A300%3Ai%3A20240824114136%3Aet%3A1724481696%3Ac%3A1%3Arn%3A733529838%3Arqn%3A133%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C488%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724481695859%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724481697%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%B2%202023%20%D0%B3%D0%BE%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC25_48),
            http("request_49")
              .get("/metrika/metrika_match.html")
              .headers(headersUC25_49)
          )
      );

	  setUp(scnUC25.injectOpen(atOnceUsers(1))).protocols(httpProtocol_MainPage2023);
  }
}
