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
class Record_3246 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3246: FirstName is Bonnie")
	void FirstNameOfRecord3246() {
		assertEquals("Bonnie", customers.get(3245).getFirstName());
	}

	@Test
	@DisplayName("Record 3246: LastName is Jowers")
	void LastNameOfRecord3246() {
		assertEquals("Jowers", customers.get(3245).getLastName());
	}

	@Test
	@DisplayName("Record 3246: Company is Loehn, Thomas E Esq")
	void CompanyOfRecord3246() {
		assertEquals("Loehn, Thomas E Esq", customers.get(3245).getCompany());
	}

	@Test
	@DisplayName("Record 3246: Address is 2015 W Airport Fwy")
	void AddressOfRecord3246() {
		assertEquals("2015 W Airport Fwy", customers.get(3245).getAddress());
	}

	@Test
	@DisplayName("Record 3246: City is Irving")
	void CityOfRecord3246() {
		assertEquals("Irving", customers.get(3245).getCity());
	}

	@Test
	@DisplayName("Record 3246: County is Dallas")
	void CountyOfRecord3246() {
		assertEquals("Dallas", customers.get(3245).getCounty());
	}

	@Test
	@DisplayName("Record 3246: State is TX")
	void StateOfRecord3246() {
		assertEquals("TX", customers.get(3245).getState());
	}

	@Test
	@DisplayName("Record 3246: ZIP is 75062")
	void ZIPOfRecord3246() {
		assertEquals("75062", customers.get(3245).getZIP());
	}

	@Test
	@DisplayName("Record 3246: Phone is 972-913-6271")
	void PhoneOfRecord3246() {
		assertEquals("972-913-6271", customers.get(3245).getPhone());
	}

	@Test
	@DisplayName("Record 3246: Fax is 972-913-6827")
	void FaxOfRecord3246() {
		assertEquals("972-913-6827", customers.get(3245).getFax());
	}

	@Test
	@DisplayName("Record 3246: Email is bonnie@jowers.com")
	void EmailOfRecord3246() {
		assertEquals("bonnie@jowers.com", customers.get(3245).getEmail());
	}

	@Test
	@DisplayName("Record 3246: Web is http://www.bonniejowers.com")
	void WebOfRecord3246() {
		assertEquals("http://www.bonniejowers.com", customers.get(3245).getWeb());
	}
}
