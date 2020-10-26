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

@Tag("33")
class Record_1533 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1533: FirstName is Bryce")
	void FirstNameOfRecord1533() {
		assertEquals("Bryce", customers.get(1532).getFirstName());
	}

	@Test
	@DisplayName("Record 1533: LastName is Riscen")
	void LastNameOfRecord1533() {
		assertEquals("Riscen", customers.get(1532).getLastName());
	}

	@Test
	@DisplayName("Record 1533: Company is Tack Shop")
	void CompanyOfRecord1533() {
		assertEquals("Tack Shop", customers.get(1532).getCompany());
	}

	@Test
	@DisplayName("Record 1533: Address is 5708 Patterson Ave")
	void AddressOfRecord1533() {
		assertEquals("5708 Patterson Ave", customers.get(1532).getAddress());
	}

	@Test
	@DisplayName("Record 1533: City is Richmond")
	void CityOfRecord1533() {
		assertEquals("Richmond", customers.get(1532).getCity());
	}

	@Test
	@DisplayName("Record 1533: County is Henrico")
	void CountyOfRecord1533() {
		assertEquals("Henrico", customers.get(1532).getCounty());
	}

	@Test
	@DisplayName("Record 1533: State is VA")
	void StateOfRecord1533() {
		assertEquals("VA", customers.get(1532).getState());
	}

	@Test
	@DisplayName("Record 1533: ZIP is 23226")
	void ZIPOfRecord1533() {
		assertEquals("23226", customers.get(1532).getZIP());
	}

	@Test
	@DisplayName("Record 1533: Phone is 804-288-9786")
	void PhoneOfRecord1533() {
		assertEquals("804-288-9786", customers.get(1532).getPhone());
	}

	@Test
	@DisplayName("Record 1533: Fax is 804-288-1927")
	void FaxOfRecord1533() {
		assertEquals("804-288-1927", customers.get(1532).getFax());
	}

	@Test
	@DisplayName("Record 1533: Email is bryce@riscen.com")
	void EmailOfRecord1533() {
		assertEquals("bryce@riscen.com", customers.get(1532).getEmail());
	}

	@Test
	@DisplayName("Record 1533: Web is http://www.bryceriscen.com")
	void WebOfRecord1533() {
		assertEquals("http://www.bryceriscen.com", customers.get(1532).getWeb());
	}
}
