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

@Tag("22")
class Record_3207 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3207: FirstName is Dydre")
	void FirstNameOfRecord3207() {
		assertEquals("Dydre", customers.get(3206).getFirstName());
	}

	@Test
	@DisplayName("Record 3207: LastName is Rastegar")
	void LastNameOfRecord3207() {
		assertEquals("Rastegar", customers.get(3206).getLastName());
	}

	@Test
	@DisplayName("Record 3207: Company is J G Stewart Contractors Inc")
	void CompanyOfRecord3207() {
		assertEquals("J G Stewart Contractors Inc", customers.get(3206).getCompany());
	}

	@Test
	@DisplayName("Record 3207: Address is 66 High St")
	void AddressOfRecord3207() {
		assertEquals("66 High St", customers.get(3206).getAddress());
	}

	@Test
	@DisplayName("Record 3207: City is Mount Holly")
	void CityOfRecord3207() {
		assertEquals("Mount Holly", customers.get(3206).getCity());
	}

	@Test
	@DisplayName("Record 3207: County is Burlington")
	void CountyOfRecord3207() {
		assertEquals("Burlington", customers.get(3206).getCounty());
	}

	@Test
	@DisplayName("Record 3207: State is NJ")
	void StateOfRecord3207() {
		assertEquals("NJ", customers.get(3206).getState());
	}

	@Test
	@DisplayName("Record 3207: ZIP is 8060")
	void ZIPOfRecord3207() {
		assertEquals("8060", customers.get(3206).getZIP());
	}

	@Test
	@DisplayName("Record 3207: Phone is 609-267-6167")
	void PhoneOfRecord3207() {
		assertEquals("609-267-6167", customers.get(3206).getPhone());
	}

	@Test
	@DisplayName("Record 3207: Fax is 609-267-0628")
	void FaxOfRecord3207() {
		assertEquals("609-267-0628", customers.get(3206).getFax());
	}

	@Test
	@DisplayName("Record 3207: Email is dydre@rastegar.com")
	void EmailOfRecord3207() {
		assertEquals("dydre@rastegar.com", customers.get(3206).getEmail());
	}

	@Test
	@DisplayName("Record 3207: Web is http://www.dydrerastegar.com")
	void WebOfRecord3207() {
		assertEquals("http://www.dydrerastegar.com", customers.get(3206).getWeb());
	}
}
