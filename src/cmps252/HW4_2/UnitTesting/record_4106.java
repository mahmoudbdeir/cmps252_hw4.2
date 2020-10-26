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
class Record_4106 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4106: FirstName is Sasha")
	void FirstNameOfRecord4106() {
		assertEquals("Sasha", customers.get(4105).getFirstName());
	}

	@Test
	@DisplayName("Record 4106: LastName is Detlefs")
	void LastNameOfRecord4106() {
		assertEquals("Detlefs", customers.get(4105).getLastName());
	}

	@Test
	@DisplayName("Record 4106: Company is Atlas Equipment Company Inc")
	void CompanyOfRecord4106() {
		assertEquals("Atlas Equipment Company Inc", customers.get(4105).getCompany());
	}

	@Test
	@DisplayName("Record 4106: Address is Trenton Airport Rd")
	void AddressOfRecord4106() {
		assertEquals("Trenton Airport Rd", customers.get(4105).getAddress());
	}

	@Test
	@DisplayName("Record 4106: City is Ellsworth")
	void CityOfRecord4106() {
		assertEquals("Ellsworth", customers.get(4105).getCity());
	}

	@Test
	@DisplayName("Record 4106: County is Hancock")
	void CountyOfRecord4106() {
		assertEquals("Hancock", customers.get(4105).getCounty());
	}

	@Test
	@DisplayName("Record 4106: State is ME")
	void StateOfRecord4106() {
		assertEquals("ME", customers.get(4105).getState());
	}

	@Test
	@DisplayName("Record 4106: ZIP is 4605")
	void ZIPOfRecord4106() {
		assertEquals("4605", customers.get(4105).getZIP());
	}

	@Test
	@DisplayName("Record 4106: Phone is 207-667-8618")
	void PhoneOfRecord4106() {
		assertEquals("207-667-8618", customers.get(4105).getPhone());
	}

	@Test
	@DisplayName("Record 4106: Fax is 207-667-2343")
	void FaxOfRecord4106() {
		assertEquals("207-667-2343", customers.get(4105).getFax());
	}

	@Test
	@DisplayName("Record 4106: Email is sasha@detlefs.com")
	void EmailOfRecord4106() {
		assertEquals("sasha@detlefs.com", customers.get(4105).getEmail());
	}

	@Test
	@DisplayName("Record 4106: Web is http://www.sashadetlefs.com")
	void WebOfRecord4106() {
		assertEquals("http://www.sashadetlefs.com", customers.get(4105).getWeb());
	}
}
