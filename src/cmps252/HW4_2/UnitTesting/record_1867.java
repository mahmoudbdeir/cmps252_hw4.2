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

@Tag("11")
class Record_1867 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1867: FirstName is Les")
	void FirstNameOfRecord1867() {
		assertEquals("Les", customers.get(1866).getFirstName());
	}

	@Test
	@DisplayName("Record 1867: LastName is Ippolito")
	void LastNameOfRecord1867() {
		assertEquals("Ippolito", customers.get(1866).getLastName());
	}

	@Test
	@DisplayName("Record 1867: Company is Value Line Corp")
	void CompanyOfRecord1867() {
		assertEquals("Value Line Corp", customers.get(1866).getCompany());
	}

	@Test
	@DisplayName("Record 1867: Address is 180 Pond St")
	void AddressOfRecord1867() {
		assertEquals("180 Pond St", customers.get(1866).getAddress());
	}

	@Test
	@DisplayName("Record 1867: City is Leominster")
	void CityOfRecord1867() {
		assertEquals("Leominster", customers.get(1866).getCity());
	}

	@Test
	@DisplayName("Record 1867: County is Worcester")
	void CountyOfRecord1867() {
		assertEquals("Worcester", customers.get(1866).getCounty());
	}

	@Test
	@DisplayName("Record 1867: State is MA")
	void StateOfRecord1867() {
		assertEquals("MA", customers.get(1866).getState());
	}

	@Test
	@DisplayName("Record 1867: ZIP is 1453")
	void ZIPOfRecord1867() {
		assertEquals("1453", customers.get(1866).getZIP());
	}

	@Test
	@DisplayName("Record 1867: Phone is 978-534-6404")
	void PhoneOfRecord1867() {
		assertEquals("978-534-6404", customers.get(1866).getPhone());
	}

	@Test
	@DisplayName("Record 1867: Fax is 978-534-4433")
	void FaxOfRecord1867() {
		assertEquals("978-534-4433", customers.get(1866).getFax());
	}

	@Test
	@DisplayName("Record 1867: Email is les@ippolito.com")
	void EmailOfRecord1867() {
		assertEquals("les@ippolito.com", customers.get(1866).getEmail());
	}

	@Test
	@DisplayName("Record 1867: Web is http://www.lesippolito.com")
	void WebOfRecord1867() {
		assertEquals("http://www.lesippolito.com", customers.get(1866).getWeb());
	}
}
