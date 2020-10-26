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

@Tag("15")
class Record_363 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 363: FirstName is Helen")
	void FirstNameOfRecord363() {
		assertEquals("Helen", customers.get(362).getFirstName());
	}

	@Test
	@DisplayName("Record 363: LastName is Deteso")
	void LastNameOfRecord363() {
		assertEquals("Deteso", customers.get(362).getLastName());
	}

	@Test
	@DisplayName("Record 363: Company is Marriott Residence Inn")
	void CompanyOfRecord363() {
		assertEquals("Marriott Residence Inn", customers.get(362).getCompany());
	}

	@Test
	@DisplayName("Record 363: Address is 1416 N La Brea Ave")
	void AddressOfRecord363() {
		assertEquals("1416 N La Brea Ave", customers.get(362).getAddress());
	}

	@Test
	@DisplayName("Record 363: City is Los Angeles")
	void CityOfRecord363() {
		assertEquals("Los Angeles", customers.get(362).getCity());
	}

	@Test
	@DisplayName("Record 363: County is Los Angeles")
	void CountyOfRecord363() {
		assertEquals("Los Angeles", customers.get(362).getCounty());
	}

	@Test
	@DisplayName("Record 363: State is CA")
	void StateOfRecord363() {
		assertEquals("CA", customers.get(362).getState());
	}

	@Test
	@DisplayName("Record 363: ZIP is 90028")
	void ZIPOfRecord363() {
		assertEquals("90028", customers.get(362).getZIP());
	}

	@Test
	@DisplayName("Record 363: Phone is 323-856-7398")
	void PhoneOfRecord363() {
		assertEquals("323-856-7398", customers.get(362).getPhone());
	}

	@Test
	@DisplayName("Record 363: Fax is 323-856-7284")
	void FaxOfRecord363() {
		assertEquals("323-856-7284", customers.get(362).getFax());
	}

	@Test
	@DisplayName("Record 363: Email is helen@deteso.com")
	void EmailOfRecord363() {
		assertEquals("helen@deteso.com", customers.get(362).getEmail());
	}

	@Test
	@DisplayName("Record 363: Web is http://www.helendeteso.com")
	void WebOfRecord363() {
		assertEquals("http://www.helendeteso.com", customers.get(362).getWeb());
	}
}
