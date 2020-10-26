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

@Tag("7")
class Record_1749 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1749: FirstName is Louella")
	void FirstNameOfRecord1749() {
		assertEquals("Louella", customers.get(1748).getFirstName());
	}

	@Test
	@DisplayName("Record 1749: LastName is Delapena")
	void LastNameOfRecord1749() {
		assertEquals("Delapena", customers.get(1748).getLastName());
	}

	@Test
	@DisplayName("Record 1749: Company is Jersey City Medical Center")
	void CompanyOfRecord1749() {
		assertEquals("Jersey City Medical Center", customers.get(1748).getCompany());
	}

	@Test
	@DisplayName("Record 1749: Address is 301 Haverford Ave")
	void AddressOfRecord1749() {
		assertEquals("301 Haverford Ave", customers.get(1748).getAddress());
	}

	@Test
	@DisplayName("Record 1749: City is Narberth")
	void CityOfRecord1749() {
		assertEquals("Narberth", customers.get(1748).getCity());
	}

	@Test
	@DisplayName("Record 1749: County is Montgomery")
	void CountyOfRecord1749() {
		assertEquals("Montgomery", customers.get(1748).getCounty());
	}

	@Test
	@DisplayName("Record 1749: State is PA")
	void StateOfRecord1749() {
		assertEquals("PA", customers.get(1748).getState());
	}

	@Test
	@DisplayName("Record 1749: ZIP is 19072")
	void ZIPOfRecord1749() {
		assertEquals("19072", customers.get(1748).getZIP());
	}

	@Test
	@DisplayName("Record 1749: Phone is 610-668-1170")
	void PhoneOfRecord1749() {
		assertEquals("610-668-1170", customers.get(1748).getPhone());
	}

	@Test
	@DisplayName("Record 1749: Fax is 610-668-7406")
	void FaxOfRecord1749() {
		assertEquals("610-668-7406", customers.get(1748).getFax());
	}

	@Test
	@DisplayName("Record 1749: Email is louella@delapena.com")
	void EmailOfRecord1749() {
		assertEquals("louella@delapena.com", customers.get(1748).getEmail());
	}

	@Test
	@DisplayName("Record 1749: Web is http://www.louelladelapena.com")
	void WebOfRecord1749() {
		assertEquals("http://www.louelladelapena.com", customers.get(1748).getWeb());
	}
}
