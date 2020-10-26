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

@Tag("17")
class Record_3881 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3881: FirstName is Edwina")
	void FirstNameOfRecord3881() {
		assertEquals("Edwina", customers.get(3880).getFirstName());
	}

	@Test
	@DisplayName("Record 3881: LastName is Klohs")
	void LastNameOfRecord3881() {
		assertEquals("Klohs", customers.get(3880).getLastName());
	}

	@Test
	@DisplayName("Record 3881: Company is Lowman, Sarah A Esq")
	void CompanyOfRecord3881() {
		assertEquals("Lowman, Sarah A Esq", customers.get(3880).getCompany());
	}

	@Test
	@DisplayName("Record 3881: Address is Quarry")
	void AddressOfRecord3881() {
		assertEquals("Quarry", customers.get(3880).getAddress());
	}

	@Test
	@DisplayName("Record 3881: City is Darby")
	void CityOfRecord3881() {
		assertEquals("Darby", customers.get(3880).getCity());
	}

	@Test
	@DisplayName("Record 3881: County is Delaware")
	void CountyOfRecord3881() {
		assertEquals("Delaware", customers.get(3880).getCounty());
	}

	@Test
	@DisplayName("Record 3881: State is PA")
	void StateOfRecord3881() {
		assertEquals("PA", customers.get(3880).getState());
	}

	@Test
	@DisplayName("Record 3881: ZIP is 19023")
	void ZIPOfRecord3881() {
		assertEquals("19023", customers.get(3880).getZIP());
	}

	@Test
	@DisplayName("Record 3881: Phone is 610-583-8138")
	void PhoneOfRecord3881() {
		assertEquals("610-583-8138", customers.get(3880).getPhone());
	}

	@Test
	@DisplayName("Record 3881: Fax is 610-583-1551")
	void FaxOfRecord3881() {
		assertEquals("610-583-1551", customers.get(3880).getFax());
	}

	@Test
	@DisplayName("Record 3881: Email is edwina@klohs.com")
	void EmailOfRecord3881() {
		assertEquals("edwina@klohs.com", customers.get(3880).getEmail());
	}

	@Test
	@DisplayName("Record 3881: Web is http://www.edwinaklohs.com")
	void WebOfRecord3881() {
		assertEquals("http://www.edwinaklohs.com", customers.get(3880).getWeb());
	}
}
