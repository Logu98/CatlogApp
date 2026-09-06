package com.example.catlogapp.viewModel

@HiltViewModel
class ProductListViewModel @Inject constructor(
    private val productRepository: ProductRepository
) : ViewModel() {
    private val _productUiState = MutableStateFlow<ProductUiState>(ProductUiState.Loading)
    val productUiState: StateFlow<ProductUiState> = _productUiState

    init {
        viewModelScope.launch {
            try {
                val products = productRepository.getProducts()
                _productUiState.value = ProductUiState.Success(products)
            } catch (e: Exception) {
                _productUiState.value = ProductUiState.Error(e.message ?: "Unknown error")
            }
        }
    }
}