package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("18")
class Record_1837 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1837: FirstName is Francisco")
	void FirstNameOfRecord1837() {
		assertEquals("Francisco", customers.get(1836).getFirstName());
	}

	@Test
	@DisplayName("Record 1837: LastName is Huffstickler")
	void LastNameOfRecord1837() {
		assertEquals("Huffstickler", customers.get(1836).getLastName());
	}

	@Test
	@DisplayName("Record 1837: Company is Kinkos Copies")
	void CompanyOfRecord1837() {
		assertEquals("Kinkos Copies", customers.get(1836).getCompany());
	}

	@Test
	@DisplayName("Record 1837: Address is 2061 E Clearfield St")
	void AddressOfRecord1837() {
		assertEquals("2061 E Clearfield St", customers.get(1836).getAddress());
	}

	@Test
	@DisplayName("Record 1837: City is Philadelphia")
	void CityOfRecord1837() {
		assertEquals("Philadelphia", customers.get(1836).getCity());
	}

	@Test
	@DisplayName("Record 1837: County is Philadelphia")
	void CountyOfRecord1837() {
		assertEquals("Philadelphia", customers.get(1836).getCounty());
	}

	@Test
	@DisplayName("Record 1837: State is PA")
	void StateOfRecord1837() {
		assertEquals("PA", customers.get(1836).getState());
	}

	@Test
	@DisplayName("Record 1837: ZIP is 19134")
	void ZIPOfRecord1837() {
		assertEquals("19134", customers.get(1836).getZIP());
	}

	@Test
	@DisplayName("Record 1837: Phone is 215-425-2662")
	void PhoneOfRecord1837() {
		assertEquals("215-425-2662", customers.get(1836).getPhone());
	}

	@Test
	@DisplayName("Record 1837: Fax is 215-425-3004")
	void FaxOfRecord1837() {
		assertEquals("215-425-3004", customers.get(1836).getFax());
	}

	@Test
	@DisplayName("Record 1837: Email is francisco@huffstickler.com")
	void EmailOfRecord1837() {
		assertEquals("francisco@huffstickler.com", customers.get(1836).getEmail());
	}

	@Test
	@DisplayName("Record 1837: Web is http://www.franciscohuffstickler.com")
	void WebOfRecord1837() {
		assertEquals("http://www.franciscohuffstickler.com", customers.get(1836).getWeb());
	}
}
