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

@Tag("16")
class Record_2424 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2424: FirstName is Leopoldo")
	void FirstNameOfRecord2424() {
		assertEquals("Leopoldo", customers.get(2423).getFirstName());
	}

	@Test
	@DisplayName("Record 2424: LastName is Prentis")
	void LastNameOfRecord2424() {
		assertEquals("Prentis", customers.get(2423).getLastName());
	}

	@Test
	@DisplayName("Record 2424: Company is Penna, Dominic A Esq")
	void CompanyOfRecord2424() {
		assertEquals("Penna, Dominic A Esq", customers.get(2423).getCompany());
	}

	@Test
	@DisplayName("Record 2424: Address is 5515 Doyle St  #-7")
	void AddressOfRecord2424() {
		assertEquals("5515 Doyle St  #-7", customers.get(2423).getAddress());
	}

	@Test
	@DisplayName("Record 2424: City is Emeryville")
	void CityOfRecord2424() {
		assertEquals("Emeryville", customers.get(2423).getCity());
	}

	@Test
	@DisplayName("Record 2424: County is Alameda")
	void CountyOfRecord2424() {
		assertEquals("Alameda", customers.get(2423).getCounty());
	}

	@Test
	@DisplayName("Record 2424: State is CA")
	void StateOfRecord2424() {
		assertEquals("CA", customers.get(2423).getState());
	}

	@Test
	@DisplayName("Record 2424: ZIP is 94608")
	void ZIPOfRecord2424() {
		assertEquals("94608", customers.get(2423).getZIP());
	}

	@Test
	@DisplayName("Record 2424: Phone is 510-601-9023")
	void PhoneOfRecord2424() {
		assertEquals("510-601-9023", customers.get(2423).getPhone());
	}

	@Test
	@DisplayName("Record 2424: Fax is 510-601-6511")
	void FaxOfRecord2424() {
		assertEquals("510-601-6511", customers.get(2423).getFax());
	}

	@Test
	@DisplayName("Record 2424: Email is leopoldo@prentis.com")
	void EmailOfRecord2424() {
		assertEquals("leopoldo@prentis.com", customers.get(2423).getEmail());
	}

	@Test
	@DisplayName("Record 2424: Web is http://www.leopoldoprentis.com")
	void WebOfRecord2424() {
		assertEquals("http://www.leopoldoprentis.com", customers.get(2423).getWeb());
	}
}
