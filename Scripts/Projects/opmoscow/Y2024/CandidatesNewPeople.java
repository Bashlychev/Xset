package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class CandidatesNewPeople extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_CandidatesNewPeople = http
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
    
    Map<CharSequence, String> headersUC17_1 = new HashMap<>();
    headersUC17_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC17_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC17_1.put("sec-ch-ua-mobile", "?0");
    headersUC17_1.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC17_33 = new HashMap<>();
    headersUC17_33.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC17_33.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC17_33.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC17_33.put("priority", "u=0, i");
    headersUC17_33.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC17_33.put("sec-ch-ua-mobile", "?0");
    headersUC17_33.put("sec-ch-ua-platform", "Linux");
    headersUC17_33.put("sec-fetch-dest", "document");
    headersUC17_33.put("sec-fetch-mode", "navigate");
    headersUC17_33.put("sec-fetch-site", "same-origin");
    headersUC17_33.put("sec-fetch-user", "?1");
    headersUC17_33.put("upgrade-insecure-requests", "1");
    headersUC17_33.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC17_77 = new HashMap<>();
    headersUC17_77.put("Upgrade-Insecure-Requests", "1");
    headersUC17_77.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC17_77.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC17_77.put("sec-ch-ua-mobile", "?0");
    headersUC17_77.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC17_78 = new HashMap<>();
    headersUC17_78.put("accept", "*/*");
    headersUC17_78.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC17_78.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC17_78.put("origin", "https://shtab.opmoscow.ru");
    headersUC17_78.put("priority", "u=1, i");
    headersUC17_78.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC17_78.put("sec-ch-ua-mobile", "?0");
    headersUC17_78.put("sec-ch-ua-platform", "Linux");
    headersUC17_78.put("sec-fetch-dest", "empty");
    headersUC17_78.put("sec-fetch-mode", "cors");
    headersUC17_78.put("sec-fetch-site", "cross-site");
    headersUC17_78.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri2 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC17 = scenario("CandidatesNewPeople")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=5&wv-type=7&wmode=0&wv-hit=261223731&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fnovye-lyudi&rn=655673936&browser-info=we%3A1%3Aet%3A1724421067%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240823185107%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724421067&t=gdpr(14)ti(1)")
          .headers(headersUC17_0)
          .body(RawFileBody("candidatesnewpeople/0000_request.gif"))
          .resources(
            http("request_1")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headersUC17_1),
            http("request_2")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headersUC17_1),
            http("request_3")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headersUC17_1),
            http("request_4")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC17_1),
            http("request_5")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC17_1),
            http("request_6")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC17_1),
            http("request_7")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC17_1),
            http("request_8")
              .get(uri2 + "/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC17_1),
            http("request_9")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC17_1),
            http("request_10")
              .get(uri2 + "/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
              .headers(headersUC17_1),
            http("request_11")
              .get(uri2 + "/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
              .headers(headersUC17_1),
            http("request_12")
              .get(uri2 + "/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
              .headers(headersUC17_1),
            http("request_13")
              .get(uri2 + "/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
              .headers(headersUC17_1),
            http("request_14")
              .get(uri2 + "/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
              .headers(headersUC17_1),
            http("request_15")
              .get(uri2 + "/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
              .headers(headersUC17_1),
            http("request_16")
              .get(uri2 + "/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
              .headers(headersUC17_1),
            http("request_17")
              .get(uri2 + "/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
              .headers(headersUC17_1),
            http("request_18")
              .get(uri2 + "/cache/7/a/d/c/7/7adc78913d4489f72173ed4ab29ef4969d563cac.jpeg")
              .headers(headersUC17_1),
            http("request_19")
              .get(uri2 + "/cache/7/a/9/a/3/7a9a3d01806f7a6e91a4112835de72ee5669b967.jpeg")
              .headers(headersUC17_1),
            http("request_20")
              .get(uri2 + "/cache/7/d/7/7/7/7d777a31e034963eacc5bc3af4e4a18263fa2bec.jpeg")
              .headers(headersUC17_1),
            http("request_21")
              .get(uri2 + "/cache/c/2/3/a/7/c23a7a221730f4771eb68b5d4e3447e5cb0ac105.jpeg")
              .headers(headersUC17_1),
            http("request_22")
              .get(uri2 + "/cache/f/1/7/2/8/f17286aec1b807ffea52e357967f5909856983fc.jpeg")
              .headers(headersUC17_1),
            http("request_23")
              .get(uri2 + "/cache/7/3/e/9/6/73e96d9bcabf95057a518f1d4d650d08f817c65e.jpeg")
              .headers(headersUC17_1),
            http("request_24")
              .get(uri2 + "/cache/a/f/6/8/6/af6863b26b186cf6a1bbadd1b2ba431b3edbc5e9.jpeg")
              .headers(headersUC17_1),
            http("request_25")
              .get(uri2 + "/cache/6/8/1/3/e/6813e079bb9889e573d15c2c65eb96cb61f5b111.jpeg")
              .headers(headersUC17_1),
            http("request_26")
              .get(uri2 + "/cache/b/3/e/e/b/b3eebaeaf19daa7976ade70a60e746fcf940c412.jpeg")
              .headers(headersUC17_1),
            http("request_27")
              .get(uri2 + "/cache/f/a/7/c/3/fa7c3204f9a45e2323f6a769fd9757803f8332eb.png")
              .headers(headersUC17_1),
            http("request_28")
              .get(uri2 + "/cache/f/2/a/2/0/f2a202f255aef49e731d602e72e27a7352c38ef1.png")
              .headers(headersUC17_1),
            http("request_29")
              .get(uri2 + "/cache/e/2/6/f/5/e26f5ec5a3920d342a35a9dc37b6c04247511d32.jpeg")
              .headers(headersUC17_1),
            http("request_30")
              .get(uri2 + "/cache/e/7/f/a/2/e7fa2f28f4bd58725cda4e33b5c6075d66d8f8e6.jpeg")
              .headers(headersUC17_1),
            http("request_31")
              .get(uri2 + "/cache/e/d/e/1/3/ede13e5726e1eaa8aecd368625471fd65b49adb8.jpeg")
              .headers(headersUC17_1),
            http("request_32")
              .get(uri2 + "/cache/c/1/4/1/7/c14170756fe4a6352bfa4ec95a84ca1a47904631.jpeg")
              .headers(headersUC17_1),
            http("request_33")
              .get(uri2 + "/party/view/novye-lyudi")
              .headers(headersUC17_33),
            http("request_34")
              .get(uri2 + "/cache/6/6/f/c/0/66fc0cefef3861eca2fd48580e2f36d473511976.jpeg")
              .headers(headersUC17_1),
            http("request_35")
              .get(uri2 + "/cache/4/1/a/0/f/41a0fcb9170b22c1994e4cb9ca844bf896ca2712.jpeg")
              .headers(headersUC17_1),
            http("request_36")
              .get(uri2 + "/cache/f/8/b/3/d/f8b3d13b1e3ea6f6ed23a48e0131f0e0561b051a.png")
              .headers(headersUC17_1),
            http("request_37")
              .get(uri2 + "/cache/a/0/f/0/5/a0f053bc0724383fa17ef188ef2797edf2d304a5.png")
              .headers(headersUC17_1),
            http("request_38")
              .get(uri2 + "/cache/1/3/6/5/2/1365201d806fae70c3e80a9e3e8ca5bbdcebecac.jpeg")
              .headers(headersUC17_1),
            http("request_39")
              .get(uri2 + "/cache/d/f/b/e/2/dfbe2a778141a79c4b40c0ed07630f5ad44ca174.jpeg")
              .headers(headersUC17_1),
            http("request_40")
              .get(uri2 + "/cache/4/c/0/6/e/4c06e49224b23f072f8e764f620258b94d45354a.jpeg")
              .headers(headersUC17_1),
            http("request_41")
              .get(uri2 + "/cache/3/d/e/8/9/3de893e189d87f904edd57f27ba994949c46dd5b.jpeg")
              .headers(headersUC17_1),
            http("request_42")
              .get(uri2 + "/cache/7/0/e/5/a/70e5ad16621ea2bfcb01b8fee48034c0a061b29b.jpeg")
              .headers(headersUC17_1),
            http("request_43")
              .get(uri2 + "/cache/7/6/b/4/4/76b449f691530eb5d64b9fc904c1387c61b19201.jpeg")
              .headers(headersUC17_1),
            http("request_44")
              .get(uri2 + "/cache/5/6/5/0/7/565070d9529f48c98021e0e178aeaf93abb7c7a9.jpeg")
              .headers(headersUC17_1),
            http("request_45")
              .get(uri2 + "/cache/1/2/c/0/1/12c0188c4894fff25953ca22ceeee019f59e4d1c.jpeg")
              .headers(headersUC17_1),
            http("request_46")
              .get(uri2 + "/cache/d/e/5/e/f/de5ef5434776d7ef220a8049d8d44c2fcbecaad3.jpeg")
              .headers(headersUC17_1),
            http("request_47")
              .get(uri2 + "/cache/2/4/9/2/d/2492dbbcb66026f1d748d760ed15182ba96ad89d.png")
              .headers(headersUC17_1),
            http("request_48")
              .get("/metrika/tag.js")
              .headers(headersUC17_1),
            http("request_49")
              .get(uri2 + "/cache/1/0/8/8/5/10885b71df68e219e32b18dd93fa8e0a725088e5.jpeg")
              .headers(headersUC17_1),
            http("request_50")
              .get(uri2 + "/cache/0/e/4/9/1/0e4919d7fe13bfe919ff948a08ab130964991d71.jpeg")
              .headers(headersUC17_1),
            http("request_51")
              .get(uri2 + "/cache/e/5/5/1/5/e5515eaea5e984a1318dadd7300f2c4862c72bf5.jpeg")
              .headers(headersUC17_1),
            http("request_52")
              .get(uri2 + "/cache/d/b/f/5/4/dbf5441379030ebb65b4151ed9de586879b04b3c.jpeg")
              .headers(headersUC17_1),
            http("request_53")
              .get(uri2 + "/cache/2/4/6/a/2/246a2c30b044eb4566b73876afe2b4657a52537e.jpeg")
              .headers(headersUC17_1),
            http("request_54")
              .get(uri2 + "/cache/9/8/7/3/1/98731c729a21688e05c0e5601fba47235b2fe4b6.jpeg")
              .headers(headersUC17_1),
            http("request_55")
              .get(uri2 + "/cache/f/9/8/e/d/f98ed89b5077e6f81e253a491d0760a1fcc59b21.png")
              .headers(headersUC17_1),
            http("request_56")
              .get(uri2 + "/cache/5/d/9/3/5/5d935582397a3353bb08b3e29bbffb64f1450fbf.jpeg")
              .headers(headersUC17_1),
            http("request_57")
              .get(uri2 + "/cache/e/2/b/f/3/e2bf32409ce6539882516f863474ef4aa5421dd1.jpeg")
              .headers(headersUC17_1),
            http("request_58")
              .get(uri2 + "/cache/f/d/1/a/8/fd1a804e0445f85b3057d6e68c80f77d25cf186f.png")
              .headers(headersUC17_1),
            http("request_59")
              .get(uri2 + "/cache/9/0/f/8/9/90f892803fe8116a2663069f385a1ce5a3ddba29.jpeg")
              .headers(headersUC17_1),
            http("request_60")
              .get(uri2 + "/cache/a/4/e/d/c/a4edcbd784da2e21409eb94f938a79c06f59fb1c.jpeg")
              .headers(headersUC17_1),
            http("request_61")
              .get(uri2 + "/cache/f/5/f/b/0/f5fb01561107d4a785616251bbd607e093232aec.png")
              .headers(headersUC17_1),
            http("request_62")
              .get(uri2 + "/cache/a/a/8/4/1/aa8419a8ed907ecc233da5d304648d0d7e642993.jpeg")
              .headers(headersUC17_1),
            http("request_63")
              .get(uri2 + "/cache/0/1/3/1/6/01316a956247f6c96c684ade7335eb120f071bf7.jpeg")
              .headers(headersUC17_1),
            http("request_64")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC17_1),
            http("request_65")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC17_1),
            http("request_66")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC17_1),
            http("request_67")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC17_1),
            http("request_68")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC17_1),
            http("request_69")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC17_1),
            http("request_70")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC17_1),
            http("request_71")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC17_1),
            http("request_72")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_73")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_74")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_75")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC17_1),
            http("request_76")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC17_1),
            http("request_77")
              .get("/metrika/metrika_match.html")
              .headers(headersUC17_77),
            http("request_78")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fnovye-lyudi&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fldpr&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A631036800%3Az%3A300%3Ai%3A20240823185108%3Aet%3A1724421069%3Ac%3A1%3Arn%3A215071001%3Arqn%3A72%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C505%2C23%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724421068112%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724421069%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%9D%D0%BE%D0%B2%D1%8B%D0%B5%20%D0%BB%D1%8E%D0%B4%D0%B8&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC17_78)
          )
      );

	  setUp(scnUC17.injectOpen(atOnceUsers(1))).protocols(httpProtocol_CandidatesNewPeople);
  }
}
