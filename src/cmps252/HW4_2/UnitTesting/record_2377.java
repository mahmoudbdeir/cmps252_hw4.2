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
class Record_2377 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2377: FirstName is Hunter")
	void FirstNameOfRecord2377() {
		assertEquals("Hunter", customers.get(2376).getFirstName());
	}

	@Test
	@DisplayName("Record 2377: LastName is Voyer")
	void LastNameOfRecord2377() {
		assertEquals("Voyer", customers.get(2376).getLastName());
	}

	@Test
	@DisplayName("Record 2377: Company is Reff, Herbert L Esq")
	void CompanyOfRecord2377() {
		assertEquals("Reff, Herbert L Esq", customers.get(2376).getCompany());
	}

	@Test
	@DisplayName("Record 2377: Address is 31012 Huntwood Ave")
	void AddressOfRecord2377() {
		assertEquals("31012 Huntwood Ave", customers.get(2376).getAddress());
	}

	@Test
	@DisplayName("Record 2377: City is Hayward")
	void CityOfRecord2377() {
		assertEquals("Hayward", customers.get(2376).getCity());
	}

	@Test
	@DisplayName("Record 2377: County is Alameda")
	void CountyOfRecord2377() {
		assertEquals("Alameda", customers.get(2376).getCounty());
	}

	@Test
	@DisplayName("Record 2377: State is CA")
	void StateOfRecord2377() {
		assertEquals("CA", customers.get(2376).getState());
	}

	@Test
	@DisplayName("Record 2377: ZIP is 94544")
	void ZIPOfRecord2377() {
		assertEquals("94544", customers.get(2376).getZIP());
	}

	@Test
	@DisplayName("Record 2377: Phone is 510-471-5978")
	void PhoneOfRecord2377() {
		assertEquals("510-471-5978", customers.get(2376).getPhone());
	}

	@Test
	@DisplayName("Record 2377: Fax is 510-471-7886")
	void FaxOfRecord2377() {
		assertEquals("510-471-7886", customers.get(2376).getFax());
	}

	@Test
	@DisplayName("Record 2377: Email is hunter@voyer.com")
	void EmailOfRecord2377() {
		assertEquals("hunter@voyer.com", customers.get(2376).getEmail());
	}

	@Test
	@DisplayName("Record 2377: Web is http://www.huntervoyer.com")
	void WebOfRecord2377() {
		assertEquals("http://www.huntervoyer.com", customers.get(2376).getWeb());
	}
}
