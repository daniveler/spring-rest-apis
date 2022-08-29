package converter;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.openwebinars.rest.modelo.Producto;

import dto.ProductoDTO;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor

public class ProductoDTOConverter
{
	private final ModelMapper modelMapper;
	
	public ProductoDTO convertToDto(Producto producto) 
	{
		return modelMapper.map(producto, ProductoDTO.class);
	}
}
