let promptName = prompt("Adınız nedir?");
let spanName = document.getElementById("myName");

if (promptName.length > 0) {
    spanName.innerHTML = promptName;
} else {
    document.write("Hata");
}

function showTime() {
    const today = new Date();
    let h = today.getHours();
    let m = today.getMinutes();
    let s = today.getSeconds();
    let days = [
        "Pazar",
        "Pazartesi",
        "Salı",
        "Çarşamba",
        "Perşembe",
        "Cuma",
        "Cumartesi"
    ]
    m = checktime(m);
    s = checktime(s);
    document.getElementById("myClock").innerHTML = h + ":" + m + ":" + s + " " + days[today.getDay()];
    setTimeout(showTime, 1000);
}

function checktime(i) {
    if (i < 10) {
        i = "0" + i;
    }
    return i;
}

showTime();