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

@Tag("31")
class Record_1106 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1106: FirstName is Perry")
	void FirstNameOfRecord1106() {
		assertEquals("Perry", customers.get(1105).getFirstName());
	}

	@Test
	@DisplayName("Record 1106: LastName is Pica")
	void LastNameOfRecord1106() {
		assertEquals("Pica", customers.get(1105).getLastName());
	}

	@Test
	@DisplayName("Record 1106: Company is United Speaker Systems")
	void CompanyOfRecord1106() {
		assertEquals("United Speaker Systems", customers.get(1105).getCompany());
	}

	@Test
	@DisplayName("Record 1106: Address is 1571 Fort Campbell Blvd")
	void AddressOfRecord1106() {
		assertEquals("1571 Fort Campbell Blvd", customers.get(1105).getAddress());
	}

	@Test
	@DisplayName("Record 1106: City is Clarksville")
	void CityOfRecord1106() {
		assertEquals("Clarksville", customers.get(1105).getCity());
	}

	@Test
	@DisplayName("Record 1106: County is Montgomery")
	void CountyOfRecord1106() {
		assertEquals("Montgomery", customers.get(1105).getCounty());
	}

	@Test
	@DisplayName("Record 1106: State is TN")
	void StateOfRecord1106() {
		assertEquals("TN", customers.get(1105).getState());
	}

	@Test
	@DisplayName("Record 1106: ZIP is 37042")
	void ZIPOfRecord1106() {
		assertEquals("37042", customers.get(1105).getZIP());
	}

	@Test
	@DisplayName("Record 1106: Phone is 931-645-9590")
	void PhoneOfRecord1106() {
		assertEquals("931-645-9590", customers.get(1105).getPhone());
	}

	@Test
	@DisplayName("Record 1106: Fax is 931-645-0394")
	void FaxOfRecord1106() {
		assertEquals("931-645-0394", customers.get(1105).getFax());
	}

	@Test
	@DisplayName("Record 1106: Email is perry@pica.com")
	void EmailOfRecord1106() {
		assertEquals("perry@pica.com", customers.get(1105).getEmail());
	}

	@Test
	@DisplayName("Record 1106: Web is http://www.perrypica.com")
	void WebOfRecord1106() {
		assertEquals("http://www.perrypica.com", customers.get(1105).getWeb());
	}
}
