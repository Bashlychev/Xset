package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class CandidatesSR extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_CandidatesSR = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC14_0 = new HashMap<>();
    headersUC14_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC14_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC14_0.put("sec-ch-ua-mobile", "?0");
    headersUC14_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC14_41 = new HashMap<>();
    headersUC14_41.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC14_41.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC14_41.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC14_41.put("priority", "u=0, i");
    headersUC14_41.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC14_41.put("sec-ch-ua-mobile", "?0");
    headersUC14_41.put("sec-ch-ua-platform", "Linux");
    headersUC14_41.put("sec-fetch-dest", "document");
    headersUC14_41.put("sec-fetch-mode", "navigate");
    headersUC14_41.put("sec-fetch-site", "same-origin");
    headersUC14_41.put("sec-fetch-user", "?1");
    headersUC14_41.put("upgrade-insecure-requests", "1");
    headersUC14_41.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC14_50 = new HashMap<>();
    headersUC14_50.put("Upgrade-Insecure-Requests", "1");
    headersUC14_50.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC14_50.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC14_50.put("sec-ch-ua-mobile", "?0");
    headersUC14_50.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC14_51 = new HashMap<>();
    headersUC14_51.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headersUC14_51.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC14_51.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC14_51.put("priority", "i");
    headersUC14_51.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC14_51.put("sec-ch-ua-mobile", "?0");
    headersUC14_51.put("sec-ch-ua-platform", "Linux");
    headersUC14_51.put("sec-fetch-dest", "image");
    headersUC14_51.put("sec-fetch-mode", "no-cors");
    headersUC14_51.put("sec-fetch-site", "same-origin");
    headersUC14_51.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC14_74 = new HashMap<>();
    headersUC14_74.put("accept", "*/*");
    headersUC14_74.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC14_74.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC14_74.put("origin", "https://shtab.opmoscow.ru");
    headersUC14_74.put("priority", "u=1, i");
    headersUC14_74.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC14_74.put("sec-ch-ua-mobile", "?0");
    headersUC14_74.put("sec-ch-ua-platform", "Linux");
    headersUC14_74.put("sec-fetch-dest", "empty");
    headersUC14_74.put("sec-fetch-mode", "cors");
    headersUC14_74.put("sec-fetch-site", "cross-site");
    headersUC14_74.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scnUC14 = scenario("CandidatesSR")
      .exec(
        http("request_0")
          .get("/build/5758.f38a32ed.css")
          .headers(headersUC14_0)
          .resources(
            http("request_1")
              .get("/build/6395.76430bbc.css")
              .headers(headersUC14_0),
            http("request_2")
              .get("/build/8886.31d6cfe0.css")
              .headers(headersUC14_0),
            http("request_3")
              .get("/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC14_0),
            http("request_4")
              .get("/build/runtime.aaa04269.js")
              .headers(headersUC14_0),
            http("request_5")
              .get("/build/9755.89d0240d.js")
              .headers(headersUC14_0),
            http("request_6")
              .get("/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC14_0),
            http("request_7")
              .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC14_0),
            http("request_8")
              .get("/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC14_0),
            http("request_9")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersUC14_0),
            http("request_10")
              .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_11")
              .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_12")
              .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_13")
              .get("/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
              .headers(headersUC14_0),
            http("request_14")
              .get("/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
              .headers(headersUC14_0),
            http("request_15")
              .get("/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
              .headers(headersUC14_0),
            http("request_16")
              .get("/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
              .headers(headersUC14_0),
            http("request_17")
              .get("/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
              .headers(headersUC14_0),
            http("request_18")
              .get("/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
              .headers(headersUC14_0),
            http("request_19")
              .get("/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
              .headers(headersUC14_0),
            http("request_20")
              .get("/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
              .headers(headersUC14_0),
            http("request_21")
              .get("/cache/1/e/4/c/3/1e4c3705a53a062c9c969e87e3803c04c3d118d5.png")
              .headers(headersUC14_0),
            http("request_22")
              .get("/cache/8/0/2/f/8/802f84992255d0ba503ad037ffae62e671bad504.jpeg")
              .headers(headersUC14_0),
            http("request_23")
              .get("/cache/2/9/3/3/9/29339fcee8b90a70ca81eb11cbd80a9bc4b42818.jpeg")
              .headers(headersUC14_0),
            http("request_24")
              .get("/cache/3/8/f/3/7/38f3728ac4cdc557cddfc253126d4245d7e17d6f.jpeg")
              .headers(headersUC14_0),
            http("request_25")
              .get("/cache/6/b/8/2/2/6b822478316ae5a09164d337db00c87170192bbd.jpeg")
              .headers(headersUC14_0),
            http("request_26")
              .get("/cache/4/a/d/2/6/4ad267f7960c4a1e58b63b53bd20065dd424d360.jpeg")
              .headers(headersUC14_0),
            http("request_27")
              .get("/cache/f/2/e/a/a/f2eaaa5869c958ca98dac25b3901c6afb002245b.jpeg")
              .headers(headersUC14_0),
            http("request_28")
              .get("/cache/9/9/1/4/f/9914ff311d769f57ad7b03ea15d7f57cbfa4e0e4.jpeg")
              .headers(headersUC14_0),
            http("request_29")
              .get("/cache/d/b/f/5/4/dbf5441379030ebb65b4151ed9de586879b04b3c.jpeg")
              .headers(headersUC14_0),
            http("request_30")
              .get("/cache/7/5/0/0/7/75007d8b3ad43ff29acbf58168cb20b71f60dab7.png")
              .headers(headersUC14_0),
            http("request_31")
              .get("/cache/d/4/2/6/3/d42638da9e390d149688a8bba62f36f4232fb658.jpeg")
              .headers(headersUC14_0),
            http("request_32")
              .get("/cache/3/a/f/0/2/3af02853de016370855d55d9a40c64e5bdb1c213.jpeg")
              .headers(headersUC14_0),
            http("request_33")
              .get("/cache/0/0/7/2/e/0072ed6f837e7aba39ab6a8253358829dd52ca71.jpeg")
              .headers(headersUC14_0),
            http("request_34")
              .get("/cache/f/4/d/7/6/f4d765d67d7614bc1fef76e658f3104f92c84c8b.jpeg")
              .headers(headersUC14_0),
            http("request_35")
              .get("/cache/e/0/e/9/3/e0e93490420225aa06326db53f301e98eee20409.jpeg")
              .headers(headersUC14_0),
            http("request_36")
              .get("/cache/5/f/7/0/7/5f707a2ded20ff0d8b3e8da69b3b6412c0e7528b.png")
              .headers(headersUC14_0),
            http("request_37")
              .get("/cache/2/a/8/4/4/2a8448329d59efae112dfe14f16b46565f6b4992.jpeg")
              .headers(headersUC14_0),
            http("request_38")
              .get("/cache/7/0/f/a/d/70fad1440198abdd0435f5ec098a3807b570ce0c.jpeg")
              .headers(headersUC14_0),
            http("request_39")
              .get("/cache/3/3/9/1/f/3391f92c2e81fb25591df0aaddc7cccdc0be6874.jpeg")
              .headers(headersUC14_0),
            http("request_40")
              .get("/cache/e/d/a/7/a/eda7abcf8082fedb5940b04b59ba1bb5ee5f9597.png")
              .headers(headersUC14_0),
            http("request_41")
              .get("/party/view/spravedlivaya-rossiya--za-pravdu")
              .headers(headersUC14_41),
            http("request_42")
              .get("/build/7255.871eb160.js")
              .headers(headersUC14_0),
            http("request_43")
              .get("/build/6889.3f713c69.js")
              .headers(headersUC14_0),
            http("request_44")
              .get("/build/7729.67d87565.js")
              .headers(headersUC14_0),
            http("request_45")
              .get("/build/8981.bc50772a.js")
              .headers(headersUC14_0),
            http("request_46")
              .get("/build/3734.2c5e1582.js")
              .headers(headersUC14_0),
            http("request_47")
              .get("/build/9154.f1370752.js")
              .headers(headersUC14_0),
            http("request_48")
              .get("/build/1676.2634f191.js")
              .headers(headersUC14_0),
            http("request_49")
              .get("/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC14_0),
            http("request_50")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersUC14_50),
            http("request_51")
              .get("/cache/7/3/8/8/2/73882d61fbbbf795e0ce0ddda54cf12c32fc2de9.jpeg")
              .headers(headersUC14_51),
            http("request_52")
              .get("/cache/9/d/1/1/2/9d11215cd51349f7a4df73dfc217488d12c58ca5.png")
              .headers(headersUC14_51),
            http("request_53")
              .get("/cache/b/f/d/0/f/bfd0f8ca603f0adac4bd2bb54988977a6404d5e0.jpeg")
              .headers(headersUC14_51),
            http("request_54")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC14_0),
            http("request_55")
              .get("/cache/4/4/e/5/f/44e5f3a06b3967bcc205a9f0e6bc078a62315ea0.jpeg")
              .headers(headersUC14_51),
            http("request_56")
              .get("/cache/2/4/c/b/7/24cb7b68f086fa08dcbce5ce588d651abd19117b.jpeg")
              .headers(headersUC14_51),
            http("request_57")
              .get("/cache/d/d/6/e/d/dd6ed71641c4a121f861b2c0cd312694fa192efe.jpeg")
              .headers(headersUC14_51),
            http("request_58")
              .get("/cache/5/6/0/9/e/5609e1d4362e02b3da70c18da281c482bd7a9616.jpeg")
              .headers(headersUC14_51),
            http("request_59")
              .get("/cache/8/b/1/6/2/8b162c67e20920f4fa81b44256443bc2dd455dba.jpeg")
              .headers(headersUC14_51),
            http("request_60")
              .get("/cache/9/6/2/0/f/9620f5a58bb263c0984c6e2917791953a5bd5155.jpeg")
              .headers(headersUC14_51),
            http("request_61")
              .get("/cache/9/6/9/d/6/969d68a4456fe3580343da3afae3c6d2da11b567.jpeg")
              .headers(headersUC14_51),
            http("request_62")
              .get("/cache/0/b/4/9/9/0b499989d77a3622e260ed65729438c1de5bca39.jpeg")
              .headers(headersUC14_51),
            http("request_63")
              .get("/cache/a/e/7/d/d/ae7dd8bc16e319711217ca2c1eed2c2185dc60ba.jpeg")
              .headers(headersUC14_51),
            http("request_64")
              .get("/cache/e/b/2/b/8/eb2b8198da4633b480d731b7bffb86b558729f70.jpeg")
              .headers(headersUC14_51),
            http("request_65")
              .get("/cache/a/1/5/c/9/a15c974b6fb05caf4bfa265a3183001ea0b84919.jpeg")
              .headers(headersUC14_51),
            http("request_66")
              .get("/cache/8/1/d/8/6/81d868f71115de5ff6be783abc6ce9671d2f149c.jpeg")
              .headers(headersUC14_51),
            http("request_67")
              .get("/cache/f/f/5/9/8/ff598ec78b78b06fe355e8876a4bcc67000fc617.jpeg")
              .headers(headersUC14_51),
            http("request_68")
              .get("/cache/b/9/4/7/3/b9473801a53869d379b19ca0ec5b71d31439037f.jpeg")
              .headers(headersUC14_51),
            http("request_69")
              .get("/cache/5/e/3/f/6/5e3f67b90da3a10c53921b1046cf73456ea925c6.jpeg")
              .headers(headersUC14_51),
            http("request_70")
              .get("/cache/e/9/7/9/0/e9790585f058982acf327ff8b0d33088e094c0f3.jpeg")
              .headers(headersUC14_51),
            http("request_71")
              .get("/cache/9/f/8/7/2/9f8725a2cf2639bdef090c94ae9459b2b2fd7d8b.jpeg")
              .headers(headersUC14_51),
            http("request_72")
              .get("/cache/d/0/1/5/6/d0156e80d95f2ab2d6f7e617252c9199d1e39df3.jpeg")
              .headers(headersUC14_51),
            http("request_73")
              .get("/cache/b/1/d/b/9/b1db9213644e025d4958f7cdb39e56e51f802c6c.jpeg")
              .headers(headersUC14_51),
            http("request_74")
              .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fspravedlivaya-rossiya--za-pravdu&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fkprf&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A792086320%3Az%3A300%3Ai%3A20240823184755%3Aet%3A1724420875%3Ac%3A1%3Arn%3A814962355%3Arqn%3A65%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C678%2C%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724420874550%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724420875%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%A1%D0%BF%D1%80%D0%B0%D0%B2%D0%B5%D0%B4%D0%BB%D0%B8%D0%B2%D0%B0%D1%8F%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D1%8F%20%E2%80%93%20%D0%97%D0%B0%20%D0%BF%D1%80%D0%B0%D0%B2%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC14_74),
            http("request_75")
              .get("/cache/b/b/2/4/7/bb2477eb69db739520cf4ed181aa7906d3a5b228.png")
              .headers(headersUC14_51),
            http("request_76")
              .get("/cache/a/1/7/6/9/a1769b12a5a0fc03e05719282a25caf61345c796.jpeg")
              .headers(headersUC14_51)
          )
      );

	  setUp(scnUC14.injectOpen(atOnceUsers(1))).protocols(httpProtocol_CandidatesSR);
  }
}
