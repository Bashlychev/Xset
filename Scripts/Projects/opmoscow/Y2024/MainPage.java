package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class MainPage extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_MainPage = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC01_0 = new HashMap<>();
    headersUC01_0.put("accept", "*/*");
    headersUC01_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC01_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC01_0.put("content-type", "text/plain");
    headersUC01_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC01_0.put("priority", "u=1, i");
    headersUC01_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC01_0.put("sec-ch-ua-mobile", "?0");
    headersUC01_0.put("sec-ch-ua-platform", "Linux");
    headersUC01_0.put("sec-fetch-dest", "empty");
    headersUC01_0.put("sec-fetch-mode", "cors");
    headersUC01_0.put("sec-fetch-site", "cross-site");
    headersUC01_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC01_3 = new HashMap<>();
    headersUC01_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC01_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC01_3.put("sec-ch-ua-mobile", "?0");
    headersUC01_3.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC01_34 = new HashMap<>();
    headersUC01_34.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC01_34.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC01_34.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC01_34.put("priority", "u=0, i");
    headersUC01_34.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC01_34.put("sec-ch-ua-mobile", "?0");
    headersUC01_34.put("sec-ch-ua-platform", "Linux");
    headersUC01_34.put("sec-fetch-dest", "document");
    headersUC01_34.put("sec-fetch-mode", "navigate");
    headersUC01_34.put("sec-fetch-site", "none");
    headersUC01_34.put("sec-fetch-user", "?1");
    headersUC01_34.put("upgrade-insecure-requests", "1");
    headersUC01_34.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC01_56 = new HashMap<>();
    headersUC01_56.put("accept", "*/*");
    headersUC01_56.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC01_56.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC01_56.put("origin", "https://shtab.opmoscow.ru");
    headersUC01_56.put("priority", "u=1, i");
    headersUC01_56.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC01_56.put("sec-ch-ua-mobile", "?0");
    headersUC01_56.put("sec-ch-ua-platform", "Linux");
    headersUC01_56.put("sec-fetch-dest", "empty");
    headersUC01_56.put("sec-fetch-mode", "cors");
    headersUC01_56.put("sec-fetch-site", "cross-site");
    headersUC01_56.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC01_57 = new HashMap<>();
    headersUC01_57.put("accept", "*/*");
    headersUC01_57.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC01_57.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC01_57.put("origin", "https://shtab.opmoscow.ru");
    headersUC01_57.put("priority", "u=4, i");
    headersUC01_57.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC01_57.put("sec-ch-ua-mobile", "?0");
    headersUC01_57.put("sec-ch-ua-platform", "Linux");
    headersUC01_57.put("sec-fetch-dest", "empty");
    headersUC01_57.put("sec-fetch-mode", "no-cors");
    headersUC01_57.put("sec-fetch-site", "cross-site");
    headersUC01_57.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri2 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC01 = scenario("Projects.asafov.Projects.voteGD.com.MainPage")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=8&wv-type=7&wmode=0&wv-hit=509986764&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2F&rn=34938740&browser-info=we%3A1%3Aet%3A1724416880%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823174119%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724416880&t=gdpr(14)ti(1)")
          .headers(headersUC01_0)
          .body(RawFileBody("mainpage/0000_request.gif"))
          .resources(
            http("request_1")
              .post("/webvisor/89667203?wv-part=9&wv-type=7&wmode=0&wv-hit=509986764&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2F&rn=532300266&browser-info=we%3A1%3Aet%3A1724416882%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823174121%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724416882&t=gdpr(14)ti(1)")
              .headers(headersUC01_0)
              .body(RawFileBody("mainpage/0001_request.gif")),
            http("request_2")
              .post("/webvisor/89667203?wv-part=10&wv-type=7&wmode=0&wv-hit=509986764&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2F&rn=851844975&browser-info=we%3A1%3Aet%3A1724416884%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823174123%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724416884&t=gdpr(14)ti(1)")
              .headers(headersUC01_0)
              .body(RawFileBody("mainpage/0002_request.gif")),
            http("request_3")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headersUC01_3),
            http("request_4")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headersUC01_3),
            http("request_5")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headersUC01_3),
            http("request_6")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC01_3),
            http("request_7")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC01_3),
            http("request_8")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC01_3),
            http("request_9")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC01_3),
            http("request_10")
              .get(uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC01_3),
            http("request_11")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC01_3),
            http("request_12")
              .get("/metrika/tag.js")
              .headers(headersUC01_3),
            http("request_13")
              .get(uri2 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
            http("request_14")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_15")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_16")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_17")
              .get(uri2 + "/build/images/bg-head.cf798976.jpg"),
            http("request_18")
              .get(uri2 + "/uploads/media/default/0003/16/cf9e611c594d3ba6b924011379c5451f83bf40e2.jpeg")
              .headers(headersUC01_3),
            http("request_19")
              .get(uri2 + "/uploads/media/default/0003/16/260d39bf6af65ce5a7b5f5a4ebdbc110315450b9.jpeg")
              .headers(headersUC01_3),
            http("request_20")
              .get(uri2 + "/uploads/media/default/0003/16/791f218f33a4ddffa36707482296b056a626e788.jpeg")
              .headers(headersUC01_3),
            http("request_21")
              .get(uri2 + "/cache/4/e/4/b/c/4e4bce3ff9353a38a8cf548abd48c406354a014c.jpeg")
              .headers(headersUC01_3),
            http("request_22")
              .get(uri2 + "/cache/3/9/f/1/5/39f15709c006290e19dd68a664d2f3bea1beafcf.jpeg")
              .headers(headersUC01_3),
            http("request_23")
              .get(uri2 + "/cache/4/2/d/4/2/42d42c8d0e90edb4524715cf885ac23da58ee495.png")
              .headers(headersUC01_3),
            http("request_24")
              .get(uri2 + "/uploads/media/default/0001/28/8381d6d787f039276e071d762399a29444faa61d.jpeg")
              .headers(headersUC01_3),
            http("request_25")
              .get(uri2 + "/uploads/media/default/0003/16/a7a974a3ac969ff7baf1794fdb13f9828c13df73.jpeg")
              .headers(headersUC01_3),
            http("request_26")
              .get(uri2 + "/build/images/shtadopm/structure6.jpg")
              .headers(headersUC01_3),
            http("request_27")
              .get(uri2 + "/build/images/shtadopm/structure4.jpg")
              .headers(headersUC01_3),
            http("request_28")
              .get(uri2 + "/build/images/shtadopm/structure1.jpg")
              .headers(headersUC01_3),
            http("request_29")
              .get(uri2 + "/build/images/shtadopm/structure3.jpg")
              .headers(headersUC01_3),
            http("request_30")
              .get(uri2 + "/cache/a/1/0/a/b/a10ab468d377f9630539b270bf1e250d1b4bee43.jpeg")
              .headers(headersUC01_3),
            http("request_31")
              .get(uri2 + "/cache/7/d/1/7/9/7d1793ae7e8a3cac5579a4ceec20109e0cc718f1.jpeg")
              .headers(headersUC01_3),
            http("request_32")
              .get(uri2 + "/cache/5/b/6/6/4/5b6646e617b2738d774256ff66a5d3bfe3121345.jpeg")
              .headers(headersUC01_3),
            http("request_33")
              .get(uri2 + "/build/images/opmoscow/loading.svg")
              .headers(headersUC01_3),
            http("request_34")
              .get(uri2 + "/")
              .headers(headersUC01_34),
            http("request_35")
              .get(uri2 + "/uploads/media/default/0003/17/44256649d458f6f414c48f441d9e3c1e7d95511a.jpeg")
              .headers(headersUC01_3),
            http("request_36")
              .get(uri2 + "/uploads/media/default/0002/72/e59e831de49cd957c2c913d225579cac72ba95fa.png")
              .headers(headersUC01_3),
            http("request_37")
              .get(uri2 + "/uploads/media/default/0002/08/844891c0cb823bbd1be67eaef729f65abf6cb8cd.png")
              .headers(headersUC01_3),
            http("request_38")
              .get(uri2 + "/build/images/shtadopm/archive1.png")
              .headers(headersUC01_3),
            http("request_39")
              .get(uri2 + "/uploads/media/default/0001/16/d8be626d1edbeeeae3a7f853cbc2b6114695d91e.png")
              .headers(headersUC01_3),
            http("request_40")
              .get(uri2 + "/build/images/shtadopm/archive2.png")
              .headers(headersUC01_3),
            http("request_41")
              .get(uri2 + "/build/images/shtadopm/archive3.png")
              .headers(headersUC01_3),
            http("request_42")
              .get(uri2 + "/build/images/shtadopm/archive4.png")
              .headers(headersUC01_3),
            http("request_43")
              .get(uri2 + "/build/images/shtadopm/archive5.png")
              .headers(headersUC01_3),
            http("request_44")
              .get(uri2 + "/uploads/media/default/0001/14/8e41f9787e36e8029d3c6170de36347f0ca54c05.png")
              .headers(headersUC01_3),
            http("request_45")
              .get(uri2 + "/uploads/media/slides/0001/13/4ec801b9e1775a9059c90458ed5764228c943142.jpeg")
              .headers(headersUC01_3),
            http("request_46")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC01_3),
            http("request_47")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC01_3),
            http("request_48")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC01_3),
            http("request_49")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC01_3),
            http("request_50")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC01_3),
            http("request_51")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC01_3),
            http("request_52")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC01_3),
            http("request_53")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC01_3),
            http("request_54")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC01_3),
            http("request_55")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC01_3),
            http("request_56")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A674541449%3Az%3A300%3Ai%3A20240823174124%3Aet%3A1724416884%3Ac%3A1%3Arn%3A980195938%3Arqn%3A5%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C2316%2C477%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724416881398%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724416884%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%B3%D0%BE%D1%80%D0%B4%D1%83%D0%BC%D1%83%20(%D0%9C%D0%93%D0%94)%2C%20%D0%BC%D1%83%D0%BD%D0%B8%D1%86%D0%B8%D0%BF%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D1%8B%20%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%20%D0%B8%20%D1%80%D0%B0%D0%B9%D0%BE%D0%BD%D0%B0%20%D0%9A%D1%83%D1%80%D0%BA%D0%B8%D0%BD%D0%BE%202024&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC01_56)
          )
      )
      .pause(14)
      .exec(
        http("request_57")
          .post("/watch/89667203?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&hittoken=1724416885_236340b7f7be8b7d26980255ddde143090e47cd0fe3575b45840f8ee946297e9&browser-info=nb%3A1%3Acl%3A989%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A674541449%3Az%3A300%3Ai%3A20240823174139%3Aet%3A1724416899%3Ac%3A1%3Arn%3A298431011%3Arqn%3A6%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A2876%3Awv%3A2%3Ads%3A%2C%2C%2C188%2C%2C%2C%2C18%2C0%2C3001%2C3001%2C1%2C3001%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724416881398%3Aadb%3A2%3App%3A3629563401%3Arqnl%3A1%3Ast%3A1724416899&t=gdpr(14)clc(0-0-0)rqnt(2)aw(1)rcm(0)cdl(na)eco(21037572)dss(2)ti(0)&force-urlencoded=1")
          .headers(headersUC01_57)
      );

	  setUp(scnUC01.injectOpen(atOnceUsers(1))).protocols(httpProtocol_MainPage);
  }
}
