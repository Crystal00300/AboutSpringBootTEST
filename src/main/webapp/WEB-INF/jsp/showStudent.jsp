<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
        <style>
            table,
            tr,
            th,
            td {
                border: 1px solid black;
                border-collapse: collapse;
            }
        </style>
    </head>

    <body>
        學生清單
        <div>
            <table>
                <thead>
                    <tr>
                        <th>學號</th>
                        <th>姓名</th>
                        <th>性別</th>
                        <th>修改</th>
                        <th>刪除</th>
                    </tr>
                </thead>
                <tbody class="student" id="student">
                    <tr>

                    </tr>

                </tbody>

            </table>




        </div>



        </table>


        </div>


    </body>

    <script>
        $(function() {
            fetch("http://localhost:8080/myapp/findAllStudent").then(function(response) {
                return response.json();
            }).then(function(array) {
                $.each(array, function(index, value) {
                    $("#student").append(

                        `
                        <tr>
                   
                    <td>` + value.number + `</td>
                    <td>` + value.name + `</td>
                    <td>` + value.gender + `</td>
                    <td>  <form action="deleteStudent" method="post">
                            <input type="submit" value="刪除">
                            <input type="hidden" value="` + value.number + `" name="number">
                        </form></td>
                    <td></td>
                    </tr>
                   
                    
                    
                    
                    
                    `);
                })

            })
        })
    </script>

    </html>