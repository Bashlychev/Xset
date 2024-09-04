package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class News20233 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_News20233 = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC28_0 = new HashMap<>();
    headersUC28_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC28_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC28_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC28_0.put("priority", "u=0, i");
    headersUC28_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC28_0.put("sec-ch-ua-mobile", "?0");
    headersUC28_0.put("sec-ch-ua-platform", "Linux");
    headersUC28_0.put("sec-fetch-dest", "document");
    headersUC28_0.put("sec-fetch-mode", "navigate");
    headersUC28_0.put("sec-fetch-site", "same-origin");
    headersUC28_0.put("sec-fetch-user", "?1");
    headersUC28_0.put("upgrade-insecure-requests", "1");
    headersUC28_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC28_1 = new HashMap<>();
    headersUC28_1.put("accept", "*/*");
    headersUC28_1.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC28_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC28_1.put("content-type", "text/plain");
    headersUC28_1.put("origin", "https://shtab.opmoscow.ru");
    headersUC28_1.put("priority", "u=1, i");
    headersUC28_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC28_1.put("sec-ch-ua-mobile", "?0");
    headersUC28_1.put("sec-ch-ua-platform", "Linux");
    headersUC28_1.put("sec-fetch-dest", "empty");
    headersUC28_1.put("sec-fetch-mode", "cors");
    headersUC28_1.put("sec-fetch-site", "cross-site");
    headersUC28_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC28_2 = new HashMap<>();
    headersUC28_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC28_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC28_2.put("sec-ch-ua-mobile", "?0");
    headersUC28_2.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC28_8 = new HashMap<>();
    headersUC28_8.put("Upgrade-Insecure-Requests", "1");
    headersUC28_8.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC28_8.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC28_8.put("sec-ch-ua-mobile", "?0");
    headersUC28_8.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC28_9 = new HashMap<>();
    headersUC28_9.put("accept", "*/*");
    headersUC28_9.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC28_9.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC28_9.put("origin", "https://shtab.opmoscow.ru");
    headersUC28_9.put("priority", "u=1, i");
    headersUC28_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC28_9.put("sec-ch-ua-mobile", "?0");
    headersUC28_9.put("sec-ch-ua-platform", "Linux");
    headersUC28_9.put("sec-fetch-dest", "empty");
    headersUC28_9.put("sec-fetch-mode", "cors");
    headersUC28_9.put("sec-fetch-site", "cross-site");
    headersUC28_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

    Map<CharSequence, String> headersUC28_11 = new HashMap<>();
    headersUC28_11.put("accept", "*/*");
    headersUC28_11.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC28_11.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC28_11.put("origin", "https://shtab.opmoscow.ru");
    headersUC28_11.put("priority", "u=4, i");
    headersUC28_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC28_11.put("sec-ch-ua-mobile", "?0");
    headersUC28_11.put("sec-ch-ua-platform", "Linux");
    headersUC28_11.put("sec-fetch-dest", "empty");
    headersUC28_11.put("sec-fetch-mode", "no-cors");
    headersUC28_11.put("sec-fetch-site", "cross-site");
    headersUC28_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scnUC28 = scenario("Archive.News20233")
      .exec(
        http("request_0")
          .get("/obshchestvennyy-shtab-po-vyboram-2023/news/view/korpus-nablyudateley-sformirovan-k-nemu-prisoedinilis-bolee-11-000-moskvichey-")
          .headers(headersUC28_0)
          .resources(
            http("request_1")
              .post(uri1 + "/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=413260420&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fkorpus-nablyudateley-sformirovan-k-nemu-prisoedinilis-bolee-11-000-moskvichey-&rn=820307563&browser-info=we%3A1%3Aet%3A1724482328%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824115208%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724482328&t=gdpr(14)ti(1)")
              .headers(headersUC28_1)
              .body(RawFileBody("news20233/0001_request.gif")),
            http("request_2")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersUC28_2),
            http("request_3")
              .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_4")
              .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_5")
              .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_6")
              .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_7")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC28_2),
            http("request_8")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersUC28_8),
            http("request_9")
              .get(uri1 + "/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fkorpus-nablyudateley-sformirovan-k-nemu-prisoedinilis-bolee-11-000-moskvichey-&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A286918698%3Az%3A300%3Ai%3A20240824115209%3Aet%3A1724482330%3Ac%3A1%3Arn%3A407718939%3Arqn%3A69%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A593%3Awv%3A2%3Ads%3A0%2C0%2C405%2C2%2C1%2C0%2C%2C206%2C%2C%2C%2C%2C616%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482329087%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482330%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(6800)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
              .headers(headersUC28_9),
            http("request_10")
              .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fkorpus-nablyudateley-sformirovan-k-nemu-prisoedinilis-bolee-11-000-moskvichey-&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A286918698%3Az%3A300%3Ai%3A20240824115209%3Aet%3A1724482330%3Ac%3A1%3Arn%3A525986269%3Arqn%3A150%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C405%2C2%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482329087%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482330%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC28_9),
            http("request_11")
              .post(uri1 + "/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fkorpus-nablyudateley-sformirovan-k-nemu-prisoedinilis-bolee-11-000-moskvichey-&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724482329_2e001568b850cbf6b237014c349ad619b667ab2b47ed53ef8097ec3e6dcddff0&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A286918698%3Az%3A300%3Ai%3A20240824115209%3Aet%3A1724482330%3Ac%3A1%3Arn%3A1005171146%3Arqn%3A70%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C15%2C644%2C644%2C0%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482329087%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482330&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6800)aw(1)rcm(0)cdl(na)eco(16851712)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
              .headers(headersUC28_11)
          )
      );

	  setUp(scnUC28.injectOpen(atOnceUsers(1))).protocols(httpProtocol_News20233);
  }
}
