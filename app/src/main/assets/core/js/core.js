/**
    ColorPickerNative
    Copyright (C) Simon Raichl 2018
    MIT License
*/

class ColorPicker {
    constructor(){
        this.picked = false;
        this.input = document.getElementById("color-input");
        this.code = document.getElementById("color-code");
        this.init();
    }

    init() {
        const { code, input } = this;

        document.body.addEventListener("click", e => {
            if (!this.picked || e.target.id !== code.id) {
                input.click();
            }
        });

        input.addEventListener("change", e => {
            if (!this.picked) {
                this.picked = true;
            }
            code.innerText = e.target.value;
            document.body.style.backgroundColor = e.target.value;
            code.innerHTML += `<br> ${document.body.style.backgroundColor}`;
        });
    }
}

window.onload = () => new ColorPicker();
