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

@Tag("3")
class Record_4890 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4890: FirstName is Nathan")
	void FirstNameOfRecord4890() {
		assertEquals("Nathan", customers.get(4889).getFirstName());
	}

	@Test
	@DisplayName("Record 4890: LastName is Mettee")
	void LastNameOfRecord4890() {
		assertEquals("Mettee", customers.get(4889).getLastName());
	}

	@Test
	@DisplayName("Record 4890: Company is Paradis, Vincent A Esq")
	void CompanyOfRecord4890() {
		assertEquals("Paradis, Vincent A Esq", customers.get(4889).getCompany());
	}

	@Test
	@DisplayName("Record 4890: Address is 406 State Hwy  #-35")
	void AddressOfRecord4890() {
		assertEquals("406 State Hwy  #-35", customers.get(4889).getAddress());
	}

	@Test
	@DisplayName("Record 4890: City is Red Bank")
	void CityOfRecord4890() {
		assertEquals("Red Bank", customers.get(4889).getCity());
	}

	@Test
	@DisplayName("Record 4890: County is Monmouth")
	void CountyOfRecord4890() {
		assertEquals("Monmouth", customers.get(4889).getCounty());
	}

	@Test
	@DisplayName("Record 4890: State is NJ")
	void StateOfRecord4890() {
		assertEquals("NJ", customers.get(4889).getState());
	}

	@Test
	@DisplayName("Record 4890: ZIP is 7701")
	void ZIPOfRecord4890() {
		assertEquals("7701", customers.get(4889).getZIP());
	}

	@Test
	@DisplayName("Record 4890: Phone is 732-842-4271")
	void PhoneOfRecord4890() {
		assertEquals("732-842-4271", customers.get(4889).getPhone());
	}

	@Test
	@DisplayName("Record 4890: Fax is 732-842-2383")
	void FaxOfRecord4890() {
		assertEquals("732-842-2383", customers.get(4889).getFax());
	}

	@Test
	@DisplayName("Record 4890: Email is nathan@mettee.com")
	void EmailOfRecord4890() {
		assertEquals("nathan@mettee.com", customers.get(4889).getEmail());
	}

	@Test
	@DisplayName("Record 4890: Web is http://www.nathanmettee.com")
	void WebOfRecord4890() {
		assertEquals("http://www.nathanmettee.com", customers.get(4889).getWeb());
	}
}
