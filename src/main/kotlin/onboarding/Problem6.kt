package onboarding

fun solution6(forms: List<List<String>>): List<String> {
    TODO("프로그램 구현")
}

private fun checkReduplication(nickname1: String, nickname2: String): Boolean {
    for(i in 0..nickname1.length-2){
        if(nickname2.contains(nickname1.substring(IntRange(i, i+1)))) return true
    }
    return false
}

private fun getReduplicatedEmail(forms: List<List<String>>, nickname: String): String{
    var email = ""

    for(i in 0..forms.lastIndex){
        if(forms[i][1] == nickname) email = forms[i][0]
    }
    return email
}