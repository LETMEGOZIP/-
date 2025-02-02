window.addEventListener("DOMContentLoaded", function(){
    const el = document.querySelector(".profile-image");
    el.addEventListener("dbclick", function() {
        const seq = this.dataset.seq;
        if(!seq || !confirm("정말로 삭제하겠습니까")){
            return;
        }
        const{fileManager} = commonLib;
        fileManager.delete(seq, function(file){
            // 삭제 후 후속 처리
            delete el.dataset.seq;
            el.innerHTML = "";
        });
    });
});

/**
* 파일 업로드 후 후속 처리
*/

function callbackFileUpload(files){
    console.log(files);
    if(!files || files.length === 0){
        return;
    }
    const el = document.querySelector(".profile-image");
    if(el){
        const file = files[0];
        el.dataset.seq = file.seq;
        el.innerHTML = `<img src='${file.thumbUrl}&width=250&height=350'>`;
    }
}