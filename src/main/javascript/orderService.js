function formatOrder(orderId) {
    if (orderId != null) {
        if (orderId.length > 0) {
            return orderId.trim().toUpperCase()
        }
    }

    return "Invalid order"
}

module.exports = { formatOrder }