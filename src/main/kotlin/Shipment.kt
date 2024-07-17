class Shipment(var status: String, val id: String, val notes: MutableList<String>,
               val updateHistory: MutableList<ShippingUpdate>, var expectedDeliveryDateTimestamp: Long,
               var currentLocation: String) {

    fun addNote(note: String) {
        notes.add(note)
    }

    fun addUpdate(update: ShippingUpdate) {
        updateHistory.add(update)
    }
}