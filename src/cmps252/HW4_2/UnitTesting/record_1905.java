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

@Tag("25")
class Record_1905 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1905: FirstName is Shayla")
	void FirstNameOfRecord1905() {
		assertEquals("Shayla", customers.get(1904).getFirstName());
	}

	@Test
	@DisplayName("Record 1905: LastName is Mcdougle")
	void LastNameOfRecord1905() {
		assertEquals("Mcdougle", customers.get(1904).getLastName());
	}

	@Test
	@DisplayName("Record 1905: Company is Nagy, Raymond L Esq")
	void CompanyOfRecord1905() {
		assertEquals("Nagy, Raymond L Esq", customers.get(1904).getCompany());
	}

	@Test
	@DisplayName("Record 1905: Address is 500 S Highway 55")
	void AddressOfRecord1905() {
		assertEquals("500 S Highway 55", customers.get(1904).getAddress());
	}

	@Test
	@DisplayName("Record 1905: City is Price")
	void CityOfRecord1905() {
		assertEquals("Price", customers.get(1904).getCity());
	}

	@Test
	@DisplayName("Record 1905: County is Carbon")
	void CountyOfRecord1905() {
		assertEquals("Carbon", customers.get(1904).getCounty());
	}

	@Test
	@DisplayName("Record 1905: State is UT")
	void StateOfRecord1905() {
		assertEquals("UT", customers.get(1904).getState());
	}

	@Test
	@DisplayName("Record 1905: ZIP is 84501")
	void ZIPOfRecord1905() {
		assertEquals("84501", customers.get(1904).getZIP());
	}

	@Test
	@DisplayName("Record 1905: Phone is 435-637-2112")
	void PhoneOfRecord1905() {
		assertEquals("435-637-2112", customers.get(1904).getPhone());
	}

	@Test
	@DisplayName("Record 1905: Fax is 435-637-5462")
	void FaxOfRecord1905() {
		assertEquals("435-637-5462", customers.get(1904).getFax());
	}

	@Test
	@DisplayName("Record 1905: Email is shayla@mcdougle.com")
	void EmailOfRecord1905() {
		assertEquals("shayla@mcdougle.com", customers.get(1904).getEmail());
	}

	@Test
	@DisplayName("Record 1905: Web is http://www.shaylamcdougle.com")
	void WebOfRecord1905() {
		assertEquals("http://www.shaylamcdougle.com", customers.get(1904).getWeb());
	}
}
