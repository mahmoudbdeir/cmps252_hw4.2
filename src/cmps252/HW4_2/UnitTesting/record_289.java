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

@Tag("27")
class Record_289 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 289: FirstName is Alfreda")
	void FirstNameOfRecord289() {
		assertEquals("Alfreda", customers.get(288).getFirstName());
	}

	@Test
	@DisplayName("Record 289: LastName is Hennies")
	void LastNameOfRecord289() {
		assertEquals("Hennies", customers.get(288).getLastName());
	}

	@Test
	@DisplayName("Record 289: Company is Anne Wilson Personnel Cnslnts")
	void CompanyOfRecord289() {
		assertEquals("Anne Wilson Personnel Cnslnts", customers.get(288).getCompany());
	}

	@Test
	@DisplayName("Record 289: Address is 5427 Pearl Rd")
	void AddressOfRecord289() {
		assertEquals("5427 Pearl Rd", customers.get(288).getAddress());
	}

	@Test
	@DisplayName("Record 289: City is Cleveland")
	void CityOfRecord289() {
		assertEquals("Cleveland", customers.get(288).getCity());
	}

	@Test
	@DisplayName("Record 289: County is Cuyahoga")
	void CountyOfRecord289() {
		assertEquals("Cuyahoga", customers.get(288).getCounty());
	}

	@Test
	@DisplayName("Record 289: State is OH")
	void StateOfRecord289() {
		assertEquals("OH", customers.get(288).getState());
	}

	@Test
	@DisplayName("Record 289: ZIP is 44129")
	void ZIPOfRecord289() {
		assertEquals("44129", customers.get(288).getZIP());
	}

	@Test
	@DisplayName("Record 289: Phone is 440-886-9407")
	void PhoneOfRecord289() {
		assertEquals("440-886-9407", customers.get(288).getPhone());
	}

	@Test
	@DisplayName("Record 289: Fax is 440-886-4251")
	void FaxOfRecord289() {
		assertEquals("440-886-4251", customers.get(288).getFax());
	}

	@Test
	@DisplayName("Record 289: Email is alfreda@hennies.com")
	void EmailOfRecord289() {
		assertEquals("alfreda@hennies.com", customers.get(288).getEmail());
	}

	@Test
	@DisplayName("Record 289: Web is http://www.alfredahennies.com")
	void WebOfRecord289() {
		assertEquals("http://www.alfredahennies.com", customers.get(288).getWeb());
	}
}
