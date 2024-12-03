document.addEventListener('DOMContentLoaded', () => {
    const cartItems = [
        { modelo: 'Modelo 1', quantidade: 1, preco: 199.99 },
        { modelo: 'Modelo 2', quantidade: 2, preco: 249.99 }
    ];

    const cartTable = document.getElementById('cart-items');
    const totalPriceElement = document.getElementById('total-price');

    function atualizarCarrinho() {
        cartTable.innerHTML = '';
        let total = 0;

        cartItems.forEach((item, index) => {
            const itemTotal = item.quantidade * item.preco;
            total += itemTotal;

            const row = `
                <tr>
                    <td>${item.modelo}</td>
                    <td>
                        <input type="number" value="${item.quantidade}" min="1" onchange="alterarQuantidade(${index}, this.value)">
                    </td>
                    <td>R$ ${item.preco.toFixed(2)}</td>
                    <td>R$ ${itemTotal.toFixed(2)}</td>
                    <td>
                        <button onclick="removerItem(${index})" class="button is-small is-danger">Remover</button>
                    </td>
                </tr>
            `;

            cartTable.insertAdjacentHTML('beforeend', row);
        });

        totalPriceElement.textContent = `R$ ${total.toFixed(2)}`;
    }

    function alterarQuantidade(index, novaQuantidade) {
        cartItems[index].quantidade = parseInt(novaQuantidade, 10);
        atualizarCarrinho();
    }

    function removerItem(index) {
        cartItems.splice(index, 1);
        atualizarCarrinho();
    }

    window.alterarQuantidade = alterarQuantidade;
    window.removerItem = removerItem;

    atualizarCarrinho();
});

function finalizarCompra() {
    const paymentMethod = document.getElementById('payment-method').value;
    alert(`Compra finalizada com o método de pagamento: ${paymentMethod}`);
}
