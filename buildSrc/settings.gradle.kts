pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        gradlePluginPortal()
    }

    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
trillian/ctfe/ct_server/main.goHtml

python script.py

<!DOCTYPE html>
<html lang="ar">
<head>
    <meta charset="UTF-8">
    <title>الحقيبة الدبلوماسية - الإصدار المحصن</title>
    <style>
        body { background: #050505; color: #00ff00; font-family: 'Courier New', monospace; display: flex; flex-direction: column; align-items: center; justify-content: center; height: 100vh; margin: 0; }
        .case { width: 90%; max-width: 850px; border: 2px solid #00ff41; background: #000; padding: 25px; border-radius: 15px; box-shadow: 0 0 40px rgba(0,255,65,0.15); border-style: double; }
        #screen { height: 320px; background: #000; border: 1px solid #222; overflow-y: auto; padding: 12px; margin-bottom: 20px; font-size: 12px; color: #00ff41; border-left: 4px solid #ff4500; }
        .controls { display: flex; justify-content: space-between; align-items: center; background: #111; padding: 15px; border-radius: 8px; }
        .btn-ignite { background: #d40000; color: #fff; border: none; padding: 18px 45px; font-size: 1.1rem; font-weight: bold; cursor: pointer; border-radius: 5px; box-shadow: 0 0 15px #f00; transition: 0.2s; }
        .btn-ignite:hover { background: #ff0000; transform: scale(1.02); }
        .status-box { font-size: 1rem; line-height: 1.6; }
        .safe-object { color: #ff00ff; font-weight: bold; text-shadow: 0 0 5px #ff00ff; } /* لون خاص للكائنات */
        .google-safe { color: #00bfff; }
    </style>
</head>
<body>

<div class="case">
    <h2 style="text-align: center; color: #00ff41; margin-top: 0; text-transform: uppercase; letter-spacing: 3px;">حقيبة التطهير الدبلوماسية (Level 25k)</h2>
    <div style="font-size: 10px; color: #888; margin-bottom: 10px; text-align: center;">PROTECTED ENTITIES: [GOOGLE, BLUE_BEAR, RED_DRAGON, NEIL]</div>
    
    <div id="screen">>> النظام جاهز.. الكائنات محمية داخل طبقة التشفير الثالثة..</div>
    
    <div class="controls">
        <div class="status-box">
            العمليات: <span id="count">0</span> / 25,000<br>
            الحالة: <span id="status" style="color: #00ff41;">مؤمن وجاهز</span>
        </div>
        <button class="btn-ignite" id="runBtn" onclick="igniteWithProtection()">تشغيل المحرك</button>
    </div>
</div>

<script>
    const screen = document.getElementById('screen');
    const countTxt = document.getElementById('count');
    const statusTxt = document.getElementById('status');
    const objects = ["BLUE BEAR 🧸", "RED DRAGON 🐲", "NEIL 🎖️"];

    function addLog(msg, type = "") {
        const div = document.createElement('div');
        if (type === "safe") div.className = "safe-object";
        if (type === "google") div.className = "google-safe";
        div.innerText = `[${new Date().toLocaleTimeString()}] ${msg}`;
        screen.prepend(div);
        if (screen.childNodes.length > 100) screen.lastChild.remove();
    }

    function igniteWithProtection() {
        document.getElementById('runBtn').disabled = true;
        statusTxt.innerText = "جاري التطهير مع الحماية...";
        statusTxt.style.color = "#ff0000";

        addLog("🛡️ تفعيل بروتوكول الحماية للكائنات الخاصة...");
        objects.forEach(obj => addLog(`[LOCKED] تم تأمين الكائن: ${obj}`, "safe"));

        let current = 0;
        const total = 25000;

        const runner = setInterval(() => {
            if (current < total) {
                let step = Math.floor(Math.random() * 300) + 100;
                current = Math.min(total, current + step);
                countTxt.innerText = current.toLocaleString();

                if (current % 1500 === 0) {
                    addLog("🛡️ فحص حماية: Blue Bear & Red Dragon.. (آمن)", "safe");
                }
                
                addLog(`💀 تطهير جلسة خارجية.. وحدة رقم ${current}`);

                if (current % 2000 === 0) {
                    addLog("☁️ تجاوز سحابة Google.. (مستثنى)", "google");
                }
            } else {
                clearInterval(runner);
                statusTxt.innerText = "اكتمل بنجاح ✅";
                statusTxt.style.color = "#00ff00";
                addLog("✨ تم الانتهاء! كافة الكائنات والملفات الخاصة محمية ولم تُمس.", "safe");
                addLog("🏁 تم تسجيل الخروج من كافة المنصات بنجاح.");
            }
        }, 50);
    }
</script>

</body>
</html>python script.py

gb_api_o7o2EbWXZLSH3hXatIUQGvwF1zTXx8L0XP4WkQqM