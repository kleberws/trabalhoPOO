function habilitarEdicao(botao) {
    const row = botao.closest('tr');
    const cells = row.querySelectorAll('td[contenteditable="false"]');
    
    cells.forEach(cell => {
        cell.contentEditable = "true";
        cell.style.backgroundColor = "#f0f8ff"; // Destacar a célula editável
    });
    
    botao.style.display = "none"; // Esconde o botão "Alterar"
    row.querySelector('.save-button').style.display = "inline-block"; // Mostra o botão "Salvar"
}

function salvarEdicao(botao) {
    const row = botao.closest('tr');
    const cells = row.querySelectorAll('td[contenteditable="true"]');
    
    cells.forEach(cell => {
        cell.contentEditable = "false";
        cell.style.backgroundColor = ""; // Remove destaque
    });
    
    botao.style.display = "none"; // Esconde o botão "Salvar"
    row.querySelector('.button.is-warning').style.display = "inline-block"; // Mostra o botão "Alterar"
}

function adicionarProduto() {
    const table = document.getElementById('product-table').querySelector('tbody');
    
    // Criar uma nova linha
    const newRow = document.createElement('tr');
    newRow.innerHTML = `
        <td contenteditable="true" style="background-color: #f0f8ff;">Novo Modelo</td>
        <td contenteditable="true" style="background-color: #f0f8ff;">Nova Cor</td>
        <td contenteditable="true" style="background-color: #f0f8ff;">R$ 0,00</td>
        <td contenteditable="true" style="background-color: #f0f8ff;">
            <input type="text" placeholder="URL da imagem">
        </td>
        <td>
            <button class="button is-small is-warning" style="display: none;" onclick="habilitarEdicao(this)">Alterar</button>
            <button class="button is-small is-success save-button" onclick="salvarEdicao(this)">Salvar</button>
        </td>
    `;
    
    table.appendChild(newRow);
}
