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

@Tag("49")
class Record_1635 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1635: FirstName is Avis")
	void FirstNameOfRecord1635() {
		assertEquals("Avis", customers.get(1634).getFirstName());
	}

	@Test
	@DisplayName("Record 1635: LastName is Carlee")
	void LastNameOfRecord1635() {
		assertEquals("Carlee", customers.get(1634).getLastName());
	}

	@Test
	@DisplayName("Record 1635: Company is Kttk Radio Station")
	void CompanyOfRecord1635() {
		assertEquals("Kttk Radio Station", customers.get(1634).getCompany());
	}

	@Test
	@DisplayName("Record 1635: Address is 63 E Aurora Rd")
	void AddressOfRecord1635() {
		assertEquals("63 E Aurora Rd", customers.get(1634).getAddress());
	}

	@Test
	@DisplayName("Record 1635: City is Northfield")
	void CityOfRecord1635() {
		assertEquals("Northfield", customers.get(1634).getCity());
	}

	@Test
	@DisplayName("Record 1635: County is Summit")
	void CountyOfRecord1635() {
		assertEquals("Summit", customers.get(1634).getCounty());
	}

	@Test
	@DisplayName("Record 1635: State is OH")
	void StateOfRecord1635() {
		assertEquals("OH", customers.get(1634).getState());
	}

	@Test
	@DisplayName("Record 1635: ZIP is 44067")
	void ZIPOfRecord1635() {
		assertEquals("44067", customers.get(1634).getZIP());
	}

	@Test
	@DisplayName("Record 1635: Phone is 330-467-8446")
	void PhoneOfRecord1635() {
		assertEquals("330-467-8446", customers.get(1634).getPhone());
	}

	@Test
	@DisplayName("Record 1635: Fax is 330-467-9006")
	void FaxOfRecord1635() {
		assertEquals("330-467-9006", customers.get(1634).getFax());
	}

	@Test
	@DisplayName("Record 1635: Email is avis@carlee.com")
	void EmailOfRecord1635() {
		assertEquals("avis@carlee.com", customers.get(1634).getEmail());
	}

	@Test
	@DisplayName("Record 1635: Web is http://www.aviscarlee.com")
	void WebOfRecord1635() {
		assertEquals("http://www.aviscarlee.com", customers.get(1634).getWeb());
	}
}
