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

@Tag("8")
class Record_3874 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3874: FirstName is Rudolf")
	void FirstNameOfRecord3874() {
		assertEquals("Rudolf", customers.get(3873).getFirstName());
	}

	@Test
	@DisplayName("Record 3874: LastName is Oyabu")
	void LastNameOfRecord3874() {
		assertEquals("Oyabu", customers.get(3873).getLastName());
	}

	@Test
	@DisplayName("Record 3874: Company is Us Fulfillment Services Inc")
	void CompanyOfRecord3874() {
		assertEquals("Us Fulfillment Services Inc", customers.get(3873).getCompany());
	}

	@Test
	@DisplayName("Record 3874: Address is 1424 Higgs Rd")
	void AddressOfRecord3874() {
		assertEquals("1424 Higgs Rd", customers.get(3873).getAddress());
	}

	@Test
	@DisplayName("Record 3874: City is Lewisburg")
	void CityOfRecord3874() {
		assertEquals("Lewisburg", customers.get(3873).getCity());
	}

	@Test
	@DisplayName("Record 3874: County is Marshall")
	void CountyOfRecord3874() {
		assertEquals("Marshall", customers.get(3873).getCounty());
	}

	@Test
	@DisplayName("Record 3874: State is TN")
	void StateOfRecord3874() {
		assertEquals("TN", customers.get(3873).getState());
	}

	@Test
	@DisplayName("Record 3874: ZIP is 37091")
	void ZIPOfRecord3874() {
		assertEquals("37091", customers.get(3873).getZIP());
	}

	@Test
	@DisplayName("Record 3874: Phone is 931-359-1119")
	void PhoneOfRecord3874() {
		assertEquals("931-359-1119", customers.get(3873).getPhone());
	}

	@Test
	@DisplayName("Record 3874: Fax is 931-359-8022")
	void FaxOfRecord3874() {
		assertEquals("931-359-8022", customers.get(3873).getFax());
	}

	@Test
	@DisplayName("Record 3874: Email is rudolf@oyabu.com")
	void EmailOfRecord3874() {
		assertEquals("rudolf@oyabu.com", customers.get(3873).getEmail());
	}

	@Test
	@DisplayName("Record 3874: Web is http://www.rudolfoyabu.com")
	void WebOfRecord3874() {
		assertEquals("http://www.rudolfoyabu.com", customers.get(3873).getWeb());
	}
}
