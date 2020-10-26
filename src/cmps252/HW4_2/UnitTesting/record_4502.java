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

@Tag("37")
class Record_4502 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4502: FirstName is Wilber")
	void FirstNameOfRecord4502() {
		assertEquals("Wilber", customers.get(4501).getFirstName());
	}

	@Test
	@DisplayName("Record 4502: LastName is Taliaferro")
	void LastNameOfRecord4502() {
		assertEquals("Taliaferro", customers.get(4501).getLastName());
	}

	@Test
	@DisplayName("Record 4502: Company is John M Burman Of Counsel")
	void CompanyOfRecord4502() {
		assertEquals("John M Burman Of Counsel", customers.get(4501).getCompany());
	}

	@Test
	@DisplayName("Record 4502: Address is 2207 Fowler Ave")
	void AddressOfRecord4502() {
		assertEquals("2207 Fowler Ave", customers.get(4501).getAddress());
	}

	@Test
	@DisplayName("Record 4502: City is Jonesboro")
	void CityOfRecord4502() {
		assertEquals("Jonesboro", customers.get(4501).getCity());
	}

	@Test
	@DisplayName("Record 4502: County is Craighead")
	void CountyOfRecord4502() {
		assertEquals("Craighead", customers.get(4501).getCounty());
	}

	@Test
	@DisplayName("Record 4502: State is AR")
	void StateOfRecord4502() {
		assertEquals("AR", customers.get(4501).getState());
	}

	@Test
	@DisplayName("Record 4502: ZIP is 72401")
	void ZIPOfRecord4502() {
		assertEquals("72401", customers.get(4501).getZIP());
	}

	@Test
	@DisplayName("Record 4502: Phone is 870-935-0433")
	void PhoneOfRecord4502() {
		assertEquals("870-935-0433", customers.get(4501).getPhone());
	}

	@Test
	@DisplayName("Record 4502: Fax is 870-935-3452")
	void FaxOfRecord4502() {
		assertEquals("870-935-3452", customers.get(4501).getFax());
	}

	@Test
	@DisplayName("Record 4502: Email is wilber@taliaferro.com")
	void EmailOfRecord4502() {
		assertEquals("wilber@taliaferro.com", customers.get(4501).getEmail());
	}

	@Test
	@DisplayName("Record 4502: Web is http://www.wilbertaliaferro.com")
	void WebOfRecord4502() {
		assertEquals("http://www.wilbertaliaferro.com", customers.get(4501).getWeb());
	}
}
