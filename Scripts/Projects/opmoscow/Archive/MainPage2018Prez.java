package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class MainPage2018Prez extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_MainPage2018Prez = http
      .baseUrl("https://www.youtube.com")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC36_0 = new HashMap<>();
    headersUC36_0.put("accept", "*/*");
    headersUC36_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC36_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC36_0.put("authorization", "SAPISIDHASH 1724482966_159afe35fce66c22df9393f38795f5fdefce2cc3");
    headersUC36_0.put("content-type", "application/json");
    headersUC36_0.put("origin", "https://www.youtube.com");
    headersUC36_0.put("priority", "u=1, i");
    headersUC36_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_0.put("sec-ch-ua-mobile", "?0");
    headersUC36_0.put("sec-ch-ua-platform", "Linux");
    headersUC36_0.put("sec-fetch-dest", "empty");
    headersUC36_0.put("sec-fetch-mode", "cors");
    headersUC36_0.put("sec-fetch-site", "same-origin");
    headersUC36_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC36_0.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC36_0.put("x-goog-authuser", "1");
    headersUC36_0.put("x-goog-event-time", "1724482966292");
    headersUC36_0.put("x-goog-request-time", "1724482966292");
    headersUC36_0.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSjziqa2BjIKCgJSVRIEGgAgVQ%3D%3D");
    headersUC36_0.put("x-origin", "https://www.youtube.com");
    headersUC36_0.put("x-youtube-ad-signals", "dt=1724482940479&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C893%2C500&vis=1&wgl=true&ca_type=image&bid=ANyPxKpQ6ePoo7N-CM-ZUEiuFNd6cQwUNiOS9ZBLuibWuJFRX_XUBbWlWjnpwJjB5dlwtO7CC_5j51Js2M1WC0vSwbEK0O7wZQ");
    headersUC36_0.put("x-youtube-client-name", "56");
    headersUC36_0.put("x-youtube-client-version", "1.20240820.01.00");
    headersUC36_0.put("x-youtube-time-zone", "Asia/Tashkent");
    headersUC36_0.put("x-youtube-utc-offset", "300");
    
    Map<CharSequence, String> headersUC36_1 = new HashMap<>();
    headersUC36_1.put("accept", "*/*");
    headersUC36_1.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC36_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC36_1.put("content-type", "text/plain");
    headersUC36_1.put("origin", "https://shtab.opmoscow.ru");
    headersUC36_1.put("priority", "u=1, i");
    headersUC36_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_1.put("sec-ch-ua-mobile", "?0");
    headersUC36_1.put("sec-ch-ua-platform", "Linux");
    headersUC36_1.put("sec-fetch-dest", "empty");
    headersUC36_1.put("sec-fetch-mode", "cors");
    headersUC36_1.put("sec-fetch-site", "cross-site");
    headersUC36_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC36_2 = new HashMap<>();
    headersUC36_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC36_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_2.put("sec-ch-ua-mobile", "?0");
    headersUC36_2.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC36_56 = new HashMap<>();
    headersUC36_56.put("Upgrade-Insecure-Requests", "1");
    headersUC36_56.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC36_56.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_56.put("sec-ch-ua-mobile", "?0");
    headersUC36_56.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC36_57 = new HashMap<>();
    headersUC36_57.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC36_57.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC36_57.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC36_57.put("priority", "u=0, i");
    headersUC36_57.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_57.put("sec-ch-ua-mobile", "?0");
    headersUC36_57.put("sec-ch-ua-platform", "Linux");
    headersUC36_57.put("sec-fetch-dest", "document");
    headersUC36_57.put("sec-fetch-mode", "navigate");
    headersUC36_57.put("sec-fetch-site", "same-origin");
    headersUC36_57.put("sec-fetch-user", "?1");
    headersUC36_57.put("upgrade-insecure-requests", "1");
    headersUC36_57.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC36_58 = new HashMap<>();
    headersUC36_58.put("accept", "*/*");
    headersUC36_58.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC36_58.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC36_58.put("origin", "https://shtab.opmoscow.ru");
    headersUC36_58.put("priority", "u=1, i");
    headersUC36_58.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_58.put("sec-ch-ua-mobile", "?0");
    headersUC36_58.put("sec-ch-ua-platform", "Linux");
    headersUC36_58.put("sec-fetch-dest", "empty");
    headersUC36_58.put("sec-fetch-mode", "cors");
    headersUC36_58.put("sec-fetch-site", "cross-site");
    headersUC36_58.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC36_71 = new HashMap<>();
    headersUC36_71.put("Origin", "https://www.youtube.com");
    headersUC36_71.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC36_71.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_71.put("sec-ch-ua-mobile", "?0");
    headersUC36_71.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC36_80 = new HashMap<>();
    headersUC36_80.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC36_80.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC36_80.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC36_80.put("priority", "u=0, i");
    headersUC36_80.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_80.put("sec-ch-ua-mobile", "?0");
    headersUC36_80.put("sec-ch-ua-platform", "Linux");
    headersUC36_80.put("sec-fetch-dest", "iframe");
    headersUC36_80.put("sec-fetch-mode", "navigate");
    headersUC36_80.put("sec-fetch-site", "cross-site");
    headersUC36_80.put("upgrade-insecure-requests", "1");
    headersUC36_80.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC36_80.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    Map<CharSequence, String> headersUC36_91 = new HashMap<>();
    headersUC36_91.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headersUC36_91.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC36_91.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC36_91.put("priority", "i");
    headersUC36_91.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_91.put("sec-ch-ua-mobile", "?0");
    headersUC36_91.put("sec-ch-ua-platform", "Linux");
    headersUC36_91.put("sec-fetch-dest", "image");
    headersUC36_91.put("sec-fetch-mode", "no-cors");
    headersUC36_91.put("sec-fetch-site", "same-origin");
    headersUC36_91.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC36_91.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    Map<CharSequence, String> headersUC36_92 = new HashMap<>();
    headersUC36_92.put("accept", "*/*");
    headersUC36_92.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC36_92.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC36_92.put("authorization", "SAPISIDHASH 1d5b27c6a579a965f51cbd7d4693f8a3b7fc42cb");
    headersUC36_92.put("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
    headersUC36_92.put("origin", "https://www.youtube.com");
    headersUC36_92.put("priority", "u=1, i");
    headersUC36_92.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_92.put("sec-ch-ua-mobile", "?0");
    headersUC36_92.put("sec-ch-ua-platform", "Linux");
    headersUC36_92.put("sec-fetch-dest", "empty");
    headersUC36_92.put("sec-fetch-mode", "cors");
    headersUC36_92.put("sec-fetch-site", "cross-site");
    headersUC36_92.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC36_92.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC36_92.put("x-goog-authuser", "0");
    
    Map<CharSequence, String> headersUC36_94 = new HashMap<>();
    headersUC36_94.put("accept", "*/*");
    headersUC36_94.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC36_94.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC36_94.put("origin", "https://www.youtube.com");
    headersUC36_94.put("priority", "u=1, i");
    headersUC36_94.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_94.put("sec-ch-ua-mobile", "?0");
    headersUC36_94.put("sec-ch-ua-platform", "Linux");
    headersUC36_94.put("sec-fetch-dest", "empty");
    headersUC36_94.put("sec-fetch-mode", "cors");
    headersUC36_94.put("sec-fetch-site", "cross-site");
    headersUC36_94.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC36_94.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    Map<CharSequence, String> headersUC36_95 = new HashMap<>();
    headersUC36_95.put("accept", "*/*");
    headersUC36_95.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC36_95.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC36_95.put("content-type", "application/json+protobuf");
    headersUC36_95.put("origin", "https://www.youtube.com");
    headersUC36_95.put("priority", "u=1, i");
    headersUC36_95.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_95.put("sec-ch-ua-mobile", "?0");
    headersUC36_95.put("sec-ch-ua-platform", "Linux");
    headersUC36_95.put("sec-fetch-dest", "empty");
    headersUC36_95.put("sec-fetch-mode", "cors");
    headersUC36_95.put("sec-fetch-site", "cross-site");
    headersUC36_95.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC36_95.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC36_95.put("x-goog-api-key", "AIzaSyDyT5W0Jh49F30Pqqtyfdf7pDLFKLJoAnw");
    headersUC36_95.put("x-user-agent", "grpc-web-javascript/0.1");
    
    Map<CharSequence, String> headersUC36_99 = new HashMap<>();
    headersUC36_99.put("accept", "*/*");
    headersUC36_99.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC36_99.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC36_99.put("authorization", "SAPISIDHASH 1724482971_7c3b3f0ebe324b94b67cfdcdf41e4df5a8aa0c31");
    headersUC36_99.put("content-type", "application/json");
    headersUC36_99.put("origin", "https://www.youtube.com");
    headersUC36_99.put("priority", "u=1, i");
    headersUC36_99.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_99.put("sec-ch-ua-mobile", "?0");
    headersUC36_99.put("sec-ch-ua-platform", "Linux");
    headersUC36_99.put("sec-fetch-dest", "empty");
    headersUC36_99.put("sec-fetch-mode", "cors");
    headersUC36_99.put("sec-fetch-site", "same-origin");
    headersUC36_99.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC36_99.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC36_99.put("x-goog-authuser", "1");
    headersUC36_99.put("x-goog-event-time", "1724482971515");
    headersUC36_99.put("x-goog-request-time", "1724482971515");
    headersUC36_99.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSiYi6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
    headersUC36_99.put("x-origin", "https://www.youtube.com");
    headersUC36_99.put("x-youtube-ad-signals", "dt=1724482968848&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C893%2C500&vis=1&wgl=true&ca_type=image&bid=ANyPxKqfm0NkexZiQRD6NmPeKbbcHeY4iJ8PiiqYAG4UcvKS2sk8_sbiAYVgA6M0RMnGd0z2a2GDR7IEj6QqAshLnnExOGXoPw");
    headersUC36_99.put("x-youtube-client-name", "56");
    headersUC36_99.put("x-youtube-client-version", "1.20240820.01.00");
    headersUC36_99.put("x-youtube-time-zone", "Asia/Tashkent");
    headersUC36_99.put("x-youtube-utc-offset", "300");
    
    Map<CharSequence, String> headersUC36_100 = new HashMap<>();
    headersUC36_100.put("accept", "*/*");
    headersUC36_100.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC36_100.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC36_100.put("authorization", "SAPISIDHASH 1724482978_9cf3de13047b33660550de427c51465f43cbf3a9");
    headersUC36_100.put("content-type", "application/json");
    headersUC36_100.put("origin", "https://www.youtube.com");
    headersUC36_100.put("priority", "u=1, i");
    headersUC36_100.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC36_100.put("sec-ch-ua-mobile", "?0");
    headersUC36_100.put("sec-ch-ua-platform", "Linux");
    headersUC36_100.put("sec-fetch-dest", "empty");
    headersUC36_100.put("sec-fetch-mode", "cors");
    headersUC36_100.put("sec-fetch-site", "same-origin");
    headersUC36_100.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC36_100.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC36_100.put("x-goog-authuser", "1");
    headersUC36_100.put("x-goog-event-time", "1724482978519");
    headersUC36_100.put("x-goog-request-time", "1724482978519");
    headersUC36_100.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSiYi6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
    headersUC36_100.put("x-origin", "https://www.youtube.com");
    headersUC36_100.put("x-youtube-ad-signals", "dt=1724482968848&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C893%2C500&vis=1&wgl=true&ca_type=image&bid=ANyPxKqfm0NkexZiQRD6NmPeKbbcHeY4iJ8PiiqYAG4UcvKS2sk8_sbiAYVgA6M0RMnGd0z2a2GDR7IEj6QqAshLnnExOGXoPw");
    headersUC36_100.put("x-youtube-client-name", "56");
    headersUC36_100.put("x-youtube-client-version", "1.20240820.01.00");
    headersUC36_100.put("x-youtube-time-zone", "Asia/Tashkent");
    headersUC36_100.put("x-youtube-utc-offset", "300");
    
    String uri01 = "https://jnn-pa.googleapis.com/$rpc/google.internal.waa.v1.Waa";
    
    String uri03 = "https://googleads.g.doubleclick.net/pagead/id";
    
    String uri04 = "https://www.google.com/js/th/JNHVvl2kSR9fjdF95zymQ6dEkKki6kBWa3TewZmiOS4.js";
    
    String uri05 = "https://fonts.gstatic.com/s/roboto/v18";
    
    String uri06 = "https://www.gstatic.com";
    
    String uri07 = "https://i.ytimg.com";
    
    String uri08 = "https://play.google.com/log";
    
    String uri09 = "https://static.doubleclick.net/instream/ad_status.js";
    
    String uri10 = "https://mc.yandex.ru";
    
    String uri11 = "https://yt3.ggpht.com/ytc/AIdro_mzDihl2M5HeRapUkSW3tlJi2s6Am-nkOGUOh2_A1mDcck=s68-c-k-c0x00ffffff-no-rj";
    
    String uri12 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC36 = scenario("Archive.MainPage2018Prez")
      .exec(
        http("request_0")
          .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
          .headers(headersUC36_0)
          .body(RawFileBody("mainpage2018prez/0000_request.json"))
          .resources(
            http("request_1")
              .post(uri10 + "/webvisor/89667203?wv-part=10&wv-type=7&wmode=0&wv-hit=275090560&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&rn=426694675&browser-info=we%3A1%3Aet%3A1724482966%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824120245%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724482966&t=gdpr(14)ti(1)")
              .headers(headersUC36_1)
              .body(RawFileBody("mainpage2018prez/0001_request.gif")),
            http("request_2")
              .get(uri12 + "/build/5758.f38a32ed.css")
              .headers(headersUC36_2),
            http("request_3")
              .get(uri12 + "/build/6395.76430bbc.css")
              .headers(headersUC36_2),
            http("request_4")
              .get(uri12 + "/build/8886.31d6cfe0.css")
              .headers(headersUC36_2),
            http("request_5")
              .get(uri12 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC36_2),
            http("request_6")
              .get(uri12 + "/build/runtime.aaa04269.js")
              .headers(headersUC36_2),
            http("request_7")
              .get(uri12 + "/build/9755.89d0240d.js")
              .headers(headersUC36_2),
            http("request_8")
              .get(uri12 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC36_2),
            http("request_9")
              .get(uri12 + "/uploads/media/default/0001/17/4bd9b9fe185a7be5441247e5d48c32d33bbd3e7e.png")
              .headers(headersUC36_2),
            http("request_10")
              .get(uri12 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC36_2),
            http("request_11")
              .get(uri12 + "/cache/b/1/e/6/3/b1e6349294a6faab03d90c7cd7cede2209ca3380.jpeg")
              .headers(headersUC36_2),
            http("request_12")
              .get(uri12 + "/cache/0/6/7/4/c/0674cb551940a2b3517fed859062de9f80a85eb4.jpeg")
              .headers(headersUC36_2),
            http("request_13")
              .get(uri12 + "/cache/2/a/e/d/7/2aed74619e97da0bdc2987954df66fdd80ac13ef.jpeg")
              .headers(headersUC36_2),
            http("request_14")
              .get(uri12 + "/cache/4/f/c/7/3/4fc735b98fb78401dc1cbb07e5e70ff2ea027cf1.jpeg")
              .headers(headersUC36_2),
            http("request_15")
              .get(uri12 + "/cache/9/7/9/9/5/97995a1ebdd93576d5e9394884a4402bf9718fb0.jpeg")
              .headers(headersUC36_2),
            http("request_16")
              .get(uri12 + "/cache/c/0/e/8/e/c0e8e6e74dc69b3706ccc519bd2e0cae360403a5.jpeg")
              .headers(headersUC36_2),
            http("request_17")
              .get(uri12 + "/cache/a/6/9/6/b/a696b7677997432e1e0c350f8c7d5f9549529fe2.jpeg")
              .headers(headersUC36_2),
            http("request_18")
              .get(uri12 + "/cache/b/5/0/3/7/b5037ea095062afd1bc7c5faf6da034ce984ccdb.jpeg")
              .headers(headersUC36_2),
            http("request_19")
              .get(uri10 + "/metrika/tag.js")
              .headers(headersUC36_2),
            http("request_20")
              .get(uri12 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
            http("request_21")
              .get(uri12 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_22")
              .get(uri12 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_23")
              .get(uri12 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_24")
              .get(uri12 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_25")
              .get(uri12 + "/build/fonts/subset-Montserrat-SemiBoldItalic.89c710ac.woff2"),
            http("request_26")
              .get(uri12 + "/cache/f/b/6/c/3/fb6c37537dc66818fbbb5c705f7f4aaf2cdba3b7.jpeg")
              .headers(headersUC36_2),
            http("request_27")
              .get(uri12 + "/cache/a/a/3/3/1/aa331ba8755f7d011b952620065e69a56ec20e0c.jpeg")
              .headers(headersUC36_2),
            http("request_28")
              .get(uri12 + "/cache/f/1/4/5/0/f145041afcbb34b843d7f7f42ff87f0c58280eb6.jpeg")
              .headers(headersUC36_2),
            http("request_29")
              .get(uri12 + "/cache/e/a/0/d/f/ea0dff986d38d4fde789c16e7ccc9f5d784f570f.jpeg")
              .headers(headersUC36_2),
            http("request_30")
              .get(uri12 + "/cache/7/8/f/0/c/78f0c431a34bf4e5e98f264bf9359ac396a448ae.jpeg")
              .headers(headersUC36_2),
            http("request_31")
              .get(uri12 + "/cache/9/b/8/6/d/9b86d1ee2466c2b69eeb342b1752da9e7395deee.jpeg")
              .headers(headersUC36_2),
            http("request_32")
              .get(uri12 + "/cache/4/2/5/0/6/425067c3f4e28f05f1b944d87b93e7e2b65eb1ae.jpeg")
              .headers(headersUC36_2),
            http("request_33")
              .get(uri12 + "/cache/f/5/d/7/8/f5d785fd3394e0a8a9166c8b3f39cc0507f20164.jpeg")
              .headers(headersUC36_2),
            http("request_34")
              .get(uri12 + "/cache/9/5/8/1/7/95817fa6b1940a5fab53928aec1843be45b375f0.jpeg")
              .headers(headersUC36_2),
            http("request_35")
              .get(uri12 + "/cache/a/b/c/9/2/abc921120827ecd9a884bc67c9c7fbfc6ef23fa3.jpeg")
              .headers(headersUC36_2),
            http("request_36")
              .get(uri12 + "/cache/9/c/0/5/7/9c0579092da48f670e8f09bb2464a2adca4f016c.jpeg")
              .headers(headersUC36_2),
            http("request_37")
              .get(uri12 + "/cache/c/4/d/8/c/c4d8c812ccc352c2c7de68eb2549ab042a5bdfef.jpeg")
              .headers(headersUC36_2),
            http("request_38")
              .get(uri12 + "/cache/1/0/f/7/4/10f74876981740667fe60f2413c7e098cac25fb7.jpeg")
              .headers(headersUC36_2),
            http("request_39")
              .get(uri12 + "/cache/4/3/f/9/3/43f9386301785d1ab836ea0c37e5c38fa81ce765.jpeg")
              .headers(headersUC36_2),
            http("request_40")
              .get(uri12 + "/cache/a/e/e/f/e/aeefec5a2aa80990aa28f356dc93c2768b356a07.jpeg")
              .headers(headersUC36_2),
            http("request_41")
              .get(uri12 + "/cache/c/7/3/8/5/c7385bb8b930c02f3a75e3107cc8d875a8b91c27.jpeg")
              .headers(headersUC36_2),
            http("request_42")
              .get(uri12 + "/cache/9/6/9/2/2/9692280782531aef8b8ba418c90ec4f0effc5be5.jpeg")
              .headers(headersUC36_2),
            http("request_43")
              .get(uri12 + "/cache/8/f/c/c/d/8fccda61015f10d9898e6fe5eb2cba0fbdbafccc.jpeg")
              .headers(headersUC36_2),
            http("request_44")
              .get(uri12 + "/cache/7/c/5/4/8/7c5487d4bcfa29837ee76f41f3573e90fc36321c.jpeg")
              .headers(headersUC36_2),
            http("request_45")
              .get(uri12 + "/cache/5/b/f/3/b/5bf3baa05ab9f7d33599f3f3d42f1ea8ba9deb88.jpeg")
              .headers(headersUC36_2),
            http("request_46")
              .get(uri12 + "/cache/0/4/7/d/9/047d974f2f6138b0ec36f9c7bbc9a7dd931e79fb.jpeg")
              .headers(headersUC36_2),
            http("request_47")
              .get(uri12 + "/cache/1/7/2/5/1/1725100e6a3f7292e0f7835462fc0d0a08b53462.jpeg")
              .headers(headersUC36_2),
            http("request_48")
              .get(uri12 + "/cache/f/5/0/3/d/f503d7b102f1ee1d9e694778aaae68ab85b2324a.jpeg")
              .headers(headersUC36_2),
            http("request_49")
              .get(uri12 + "/cache/2/4/f/c/0/24fc09261c2c4668f11de439398982e46e850269.jpeg")
              .headers(headersUC36_2),
            http("request_50")
              .get(uri12 + "/cache/e/f/7/b/0/ef7b04dd45af93e32e85e1702ac91319d71d30d8.jpeg")
              .headers(headersUC36_2),
            http("request_51")
              .get(uri12 + "/cache/e/c/f/7/c/ecf7cb2d9114fdb3e43613c2a592d110aaabef43.jpeg")
              .headers(headersUC36_2),
            http("request_52")
              .get(uri12 + "/cache/b/9/6/3/b/b963bd84b8cc25ec24ad67f94ae8abde3d10a32c.jpeg")
              .headers(headersUC36_2),
            http("request_53")
              .get(uri12 + "/cache/8/4/3/a/e/843aed61e6bfcb25ecd0f2f066a38d57e4913fcc.jpeg")
              .headers(headersUC36_2),
            http("request_54")
              .get(uri12 + "/cache/d/a/3/c/8/da3c8e2ced05f7b2a29858743cbaf1818657b87c.jpeg")
              .headers(headersUC36_2),
            http("request_55")
              .get(uri12 + "/build/images/opmoscow/loading.svg")
              .headers(headersUC36_2),
            http("request_56")
              .get(uri10 + "/metrika/metrika_match.html")
              .headers(headersUC36_56),
            http("request_57")
              .get(uri12 + "/obshchestvennyy-shtab-po-vyboram-2018")
              .headers(headersUC36_57),
            http("request_58")
              .get(uri10 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A828850156%3Az%3A300%3Ai%3A20240824120247%3Aet%3A1724482967%3Ac%3A1%3Arn%3A613962669%3Arqn%3A174%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C903%2C%2C3%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482966294%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482967%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%9F%D1%80%D0%B5%D0%B7%D0%B8%D0%B4%D0%B5%D1%82%D0%B0%20%D0%A0%D0%A4%20%D0%B2%202018%20%D0%B3%D0%BE%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC36_58),
            http("request_59")
              .get(uri12 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC36_2),
            http("request_60")
              .get(uri12 + "/uploads/media/default/0001/13/d7bd5a946caf86665e8f343780c7ae8d5e26f341.jpeg")
              .headers(headersUC36_2),
            http("request_61")
              .get(uri12 + "/build/7255.871eb160.js")
              .headers(headersUC36_2),
            http("request_62")
              .get(uri12 + "/build/6889.3f713c69.js")
              .headers(headersUC36_2),
            http("request_63")
              .get(uri12 + "/cache/0/4/4/7/7/04477960fdc8cde2b446420b88998e9542b6b56c.jpeg")
              .headers(headersUC36_2),
            http("request_64")
              .get(uri12 + "/build/7729.67d87565.js")
              .headers(headersUC36_2),
            http("request_65")
              .get(uri12 + "/build/8981.bc50772a.js")
              .headers(headersUC36_2),
            http("request_66")
              .get(uri12 + "/build/3734.2c5e1582.js")
              .headers(headersUC36_2),
            http("request_67")
              .get(uri12 + "/build/9154.f1370752.js")
              .headers(headersUC36_2),
            http("request_68")
              .get(uri12 + "/build/1676.2634f191.js")
              .headers(headersUC36_2),
            http("request_69")
              .get(uri12 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC36_2),
            http("request_70")
              .get("/s/player/a87a9450/www-player.css")
              .headers(headersUC36_2),
            http("request_71")
              .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
              .headers(headersUC36_71),
            http("request_72")
              .get(uri05 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
              .headers(headersUC36_71),
            http("request_73")
              .get(uri05 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
              .headers(headersUC36_71),
            http("request_74")
              .get(uri07 + "/vi/oEFFIVweZvk/hqdefault.jpg")
              .headers(headersUC36_2),
            http("request_75")
              .get(uri07 + "/vi/jDgy34SkfOE/hqdefault.jpg")
              .headers(headersUC36_2),
            http("request_76")
              .get(uri07 + "/vi/TC3ZW-jsydo/hqdefault.jpg")
              .headers(headersUC36_2),
            http("request_77")
              .get(uri12 + "/cache/5/f/7/8/d/5f78d414dd5af19950318e79a22f5eb5bcce3a80.jpeg")
              .headers(headersUC36_2),
            http("request_78")
              .get(uri12 + "/cache/5/a/1/1/3/5a113ac912dcc012e8ada2f6250d4641d83b5275.jpeg")
              .headers(headersUC36_2),
            http("request_79")
              .get(uri12 + "/cache/6/f/d/9/3/6fd93f3e8f1fbb4e1a036159eba4e63340d23366.jpeg")
              .headers(headersUC36_2),
            http("request_80")
              .get("/embed/7AlrV7ujopg")
              .headers(headersUC36_80),
            http("request_81")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/embed.js")
              .headers(headersUC36_2),
            http("request_82")
              .get("/s/player/a87a9450/www-embed-player.vflset/www-embed-player.js")
              .headers(headersUC36_2),
            http("request_83")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/base.js")
              .headers(headersUC36_2),
            http("request_84")
              .get(uri09)
              .headers(headersUC36_2),
            http("request_85")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/remote.js")
              .headers(headersUC36_2),
            http("request_86")
              .get(uri04)
              .headers(headersUC36_2),
            http("request_87")
              .get(uri07 + "/vi_webp/7AlrV7ujopg/sddefault.webp")
              .headers(headersUC36_2),
            http("request_88")
              .get(uri11)
              .headers(headersUC36_2),
            http("request_89")
              .get(uri06 + "/cv/js/sender/v1/cast_sender.js")
              .headers(headersUC36_2),
            http("request_90")
              .get(uri06 + "/eureka/clank/128/cast_sender.js")
              .headers(headersUC36_2),
            http("request_91")
              .get("/generate_204?snOtmw")
              .headers(headersUC36_91),
            http("request_92")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC36_92)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,null,[1,0,0,0,0]]],1828,[[\"1724482969213\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"aGIf\\\"]],[null,71]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724482969214\"]", ""),
            http("request_93")
              .get(uri12 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC36_2),
            http("request_94")
              .get(uri03)
              .headers(headersUC36_94),
            http("request_95")
              .post(uri01 + "/Create")
              .headers(headersUC36_95)
              .body(RawFileBody("mainpage2018prez/0095_request.dat")),
            http("request_96")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC36_92)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724482971165\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,41.700000000186265]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"bk\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.10000000009313226]],[[[\\\"q\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.10000000009313226]],[[[\\\"S\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.599999999627471]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,2091.899999999907]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724482971165\"]"),
            http("request_97")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC36_92)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724482971169\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,2.6000000000931323]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,2]],\"1724482971169\"]"),
            http("request_98")
              .post(uri01 + "/GenerateIT")
              .headers(headersUC36_95)
              .body(RawFileBody("mainpage2018prez/0098_request.dat")),
            http("request_99")
              .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
              .headers(headersUC36_99)
              .body(RawFileBody("mainpage2018prez/0099_request.json"))
          )
      )
      .pause(6)
      .exec(
        http("request_100")
          .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
          .headers(headersUC36_0)
          .body(RawFileBody("mainpage2018prez/0100_request.json"))
      );

	  setUp(scnUC36.injectOpen(atOnceUsers(1))).protocols(httpProtocol_MainPage2018Prez);
  }
}
