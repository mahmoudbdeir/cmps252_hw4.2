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
class Record_1861 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1861: FirstName is Patricia")
	void FirstNameOfRecord1861() {
		assertEquals("Patricia", customers.get(1860).getFirstName());
	}

	@Test
	@DisplayName("Record 1861: LastName is Ellerbe")
	void LastNameOfRecord1861() {
		assertEquals("Ellerbe", customers.get(1860).getLastName());
	}

	@Test
	@DisplayName("Record 1861: Company is Avery Engineering Company")
	void CompanyOfRecord1861() {
		assertEquals("Avery Engineering Company", customers.get(1860).getCompany());
	}

	@Test
	@DisplayName("Record 1861: Address is 200 Atlantic St")
	void AddressOfRecord1861() {
		assertEquals("200 Atlantic St", customers.get(1860).getAddress());
	}

	@Test
	@DisplayName("Record 1861: City is Hackensack")
	void CityOfRecord1861() {
		assertEquals("Hackensack", customers.get(1860).getCity());
	}

	@Test
	@DisplayName("Record 1861: County is Bergen")
	void CountyOfRecord1861() {
		assertEquals("Bergen", customers.get(1860).getCounty());
	}

	@Test
	@DisplayName("Record 1861: State is NJ")
	void StateOfRecord1861() {
		assertEquals("NJ", customers.get(1860).getState());
	}

	@Test
	@DisplayName("Record 1861: ZIP is 7601")
	void ZIPOfRecord1861() {
		assertEquals("7601", customers.get(1860).getZIP());
	}

	@Test
	@DisplayName("Record 1861: Phone is 201-489-7541")
	void PhoneOfRecord1861() {
		assertEquals("201-489-7541", customers.get(1860).getPhone());
	}

	@Test
	@DisplayName("Record 1861: Fax is 201-489-7883")
	void FaxOfRecord1861() {
		assertEquals("201-489-7883", customers.get(1860).getFax());
	}

	@Test
	@DisplayName("Record 1861: Email is patricia@ellerbe.com")
	void EmailOfRecord1861() {
		assertEquals("patricia@ellerbe.com", customers.get(1860).getEmail());
	}

	@Test
	@DisplayName("Record 1861: Web is http://www.patriciaellerbe.com")
	void WebOfRecord1861() {
		assertEquals("http://www.patriciaellerbe.com", customers.get(1860).getWeb());
	}
}
