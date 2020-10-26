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
class Record_3291 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3291: FirstName is Miriam")
	void FirstNameOfRecord3291() {
		assertEquals("Miriam", customers.get(3290).getFirstName());
	}

	@Test
	@DisplayName("Record 3291: LastName is Lavole")
	void LastNameOfRecord3291() {
		assertEquals("Lavole", customers.get(3290).getLastName());
	}

	@Test
	@DisplayName("Record 3291: Company is Center Transmission Services")
	void CompanyOfRecord3291() {
		assertEquals("Center Transmission Services", customers.get(3290).getCompany());
	}

	@Test
	@DisplayName("Record 3291: Address is 415 De Baliviere Ave")
	void AddressOfRecord3291() {
		assertEquals("415 De Baliviere Ave", customers.get(3290).getAddress());
	}

	@Test
	@DisplayName("Record 3291: City is Saint Louis")
	void CityOfRecord3291() {
		assertEquals("Saint Louis", customers.get(3290).getCity());
	}

	@Test
	@DisplayName("Record 3291: County is Saint Louis City")
	void CountyOfRecord3291() {
		assertEquals("Saint Louis City", customers.get(3290).getCounty());
	}

	@Test
	@DisplayName("Record 3291: State is MO")
	void StateOfRecord3291() {
		assertEquals("MO", customers.get(3290).getState());
	}

	@Test
	@DisplayName("Record 3291: ZIP is 63112")
	void ZIPOfRecord3291() {
		assertEquals("63112", customers.get(3290).getZIP());
	}

	@Test
	@DisplayName("Record 3291: Phone is 314-367-0311")
	void PhoneOfRecord3291() {
		assertEquals("314-367-0311", customers.get(3290).getPhone());
	}

	@Test
	@DisplayName("Record 3291: Fax is 314-367-8567")
	void FaxOfRecord3291() {
		assertEquals("314-367-8567", customers.get(3290).getFax());
	}

	@Test
	@DisplayName("Record 3291: Email is miriam@lavole.com")
	void EmailOfRecord3291() {
		assertEquals("miriam@lavole.com", customers.get(3290).getEmail());
	}

	@Test
	@DisplayName("Record 3291: Web is http://www.miriamlavole.com")
	void WebOfRecord3291() {
		assertEquals("http://www.miriamlavole.com", customers.get(3290).getWeb());
	}
}
