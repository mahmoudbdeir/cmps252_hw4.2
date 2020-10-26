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

@Tag("42")
class Record_1443 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1443: FirstName is Perry")
	void FirstNameOfRecord1443() {
		assertEquals("Perry", customers.get(1442).getFirstName());
	}

	@Test
	@DisplayName("Record 1443: LastName is Ziek")
	void LastNameOfRecord1443() {
		assertEquals("Ziek", customers.get(1442).getLastName());
	}

	@Test
	@DisplayName("Record 1443: Company is Klyn Tools")
	void CompanyOfRecord1443() {
		assertEquals("Klyn Tools", customers.get(1442).getCompany());
	}

	@Test
	@DisplayName("Record 1443: Address is 2781 Whitley Rd Nw")
	void AddressOfRecord1443() {
		assertEquals("2781 Whitley Rd Nw", customers.get(1442).getAddress());
	}

	@Test
	@DisplayName("Record 1443: City is Atlanta")
	void CityOfRecord1443() {
		assertEquals("Atlanta", customers.get(1442).getCity());
	}

	@Test
	@DisplayName("Record 1443: County is Cobb")
	void CountyOfRecord1443() {
		assertEquals("Cobb", customers.get(1442).getCounty());
	}

	@Test
	@DisplayName("Record 1443: State is GA")
	void StateOfRecord1443() {
		assertEquals("GA", customers.get(1442).getState());
	}

	@Test
	@DisplayName("Record 1443: ZIP is 30339")
	void ZIPOfRecord1443() {
		assertEquals("30339", customers.get(1442).getZIP());
	}

	@Test
	@DisplayName("Record 1443: Phone is 770-953-5008")
	void PhoneOfRecord1443() {
		assertEquals("770-953-5008", customers.get(1442).getPhone());
	}

	@Test
	@DisplayName("Record 1443: Fax is 770-953-8214")
	void FaxOfRecord1443() {
		assertEquals("770-953-8214", customers.get(1442).getFax());
	}

	@Test
	@DisplayName("Record 1443: Email is perry@ziek.com")
	void EmailOfRecord1443() {
		assertEquals("perry@ziek.com", customers.get(1442).getEmail());
	}

	@Test
	@DisplayName("Record 1443: Web is http://www.perryziek.com")
	void WebOfRecord1443() {
		assertEquals("http://www.perryziek.com", customers.get(1442).getWeb());
	}
}
