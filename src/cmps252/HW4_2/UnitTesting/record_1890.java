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
class Record_1890 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1890: FirstName is Francine")
	void FirstNameOfRecord1890() {
		assertEquals("Francine", customers.get(1889).getFirstName());
	}

	@Test
	@DisplayName("Record 1890: LastName is Malloy")
	void LastNameOfRecord1890() {
		assertEquals("Malloy", customers.get(1889).getLastName());
	}

	@Test
	@DisplayName("Record 1890: Company is Wyssman, David R Esq")
	void CompanyOfRecord1890() {
		assertEquals("Wyssman, David R Esq", customers.get(1889).getCompany());
	}

	@Test
	@DisplayName("Record 1890: Address is 8 Central Ave")
	void AddressOfRecord1890() {
		assertEquals("8 Central Ave", customers.get(1889).getAddress());
	}

	@Test
	@DisplayName("Record 1890: City is Brocton")
	void CityOfRecord1890() {
		assertEquals("Brocton", customers.get(1889).getCity());
	}

	@Test
	@DisplayName("Record 1890: County is Chautauqua")
	void CountyOfRecord1890() {
		assertEquals("Chautauqua", customers.get(1889).getCounty());
	}

	@Test
	@DisplayName("Record 1890: State is NY")
	void StateOfRecord1890() {
		assertEquals("NY", customers.get(1889).getState());
	}

	@Test
	@DisplayName("Record 1890: ZIP is 14716")
	void ZIPOfRecord1890() {
		assertEquals("14716", customers.get(1889).getZIP());
	}

	@Test
	@DisplayName("Record 1890: Phone is 716-792-6558")
	void PhoneOfRecord1890() {
		assertEquals("716-792-6558", customers.get(1889).getPhone());
	}

	@Test
	@DisplayName("Record 1890: Fax is 716-792-7856")
	void FaxOfRecord1890() {
		assertEquals("716-792-7856", customers.get(1889).getFax());
	}

	@Test
	@DisplayName("Record 1890: Email is francine@malloy.com")
	void EmailOfRecord1890() {
		assertEquals("francine@malloy.com", customers.get(1889).getEmail());
	}

	@Test
	@DisplayName("Record 1890: Web is http://www.francinemalloy.com")
	void WebOfRecord1890() {
		assertEquals("http://www.francinemalloy.com", customers.get(1889).getWeb());
	}
}
