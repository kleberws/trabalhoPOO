// Função para habilitar a edição de um produto
function habilitarEdicao(button) {
    const row = button.closest('tr');
    const cells = row.querySelectorAll('td');
    cells.forEach(cell => {
        if (cell.hasAttribute('contenteditable')) {
            cell.contentEditable = 'true';
        }
    });
    button.style.display = 'none';
    const saveButton = row.querySelector('.save-button');
    saveButton.style.display = 'inline-block';
}

// Função para salvar as edições feitas em um produto
function salvarEdicao(button) {
    const row = button.closest('tr');
    const cells = row.querySelectorAll('td');
    cells.forEach(cell => {
        if (cell.hasAttribute('contenteditable')) {
            cell.contentEditable = 'false';
        }
    });
    button.style.display = 'none';
    const editButton = row.querySelector('.button.is-warning');
    editButton.style.display = 'inline-block';

    // Aqui você pode adicionar lógica para salvar as mudanças em um servidor
    alert('Produto salvo com sucesso!');
}

// Função para adicionar um novo produto
function adicionarProduto() {
    const table = document.getElementById('product-table');
    const newRow = document.createElement('tr');
    newRow.innerHTML = `
        <td contenteditable="true"></td>
        <td contenteditable="true"></td>
        <td contenteditable="true"></td>
        <td><input type="file" onchange="previewImage(this)"></td>
        <td>
            <button class="button is-success" onclick="salvarEdicao(this)">Salvar</button>
            <button class="button is-danger" onclick="excluirProduto(this)">Excluir</button>
        </td>
    `;
    table.appendChild(newRow);
}

// Função para pré-visualizar a imagem de um novo produto
function previewImage(input) {
    const file = input.files[0];
    if (file) {
        const reader = new FileReader();
        reader.onload = function (e) {
            input.parentElement.previousElementSibling.innerHTML = `<img src="${e.target.result}" style="width: 50px;">`;
        };
        reader.readAsDataURL(file);
    }
}

// Função para excluir um produto
function excluirProduto(button) {
    const row = button.closest('tr');
    if (confirm('Tem certeza de que deseja excluir este produto?')) {
        row.remove();
        alert('Produto excluído com sucesso!');
    }
}
