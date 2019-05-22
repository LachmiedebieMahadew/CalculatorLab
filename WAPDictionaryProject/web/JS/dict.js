
$(document).ready(function () {
    $('#search').click(function () {
        let inputWord = $('#term').val();
        let result = $('#result');
        result.text("");
          event.preventDefault();

            $.post(
                'Dictionary',
                {'word': inputWord}
                
            )
            .done(function(data){
                var str = data.reduce(function(total, currentValue, currentIndex, arr) {
                    total += '(' + (currentIndex + 1) + ')' + currentValue.wordType + "::" + currentValue.definition + '<br>';
                    return total;
                }, "");
                    result.append(str);
                })
                .fail(function(){
                    alert("error");
            });
    });

});

