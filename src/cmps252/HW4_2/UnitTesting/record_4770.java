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

@Tag("40")
class Record_4770 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4770: FirstName is Theresa")
	void FirstNameOfRecord4770() {
		assertEquals("Theresa", customers.get(4769).getFirstName());
	}

	@Test
	@DisplayName("Record 4770: LastName is Sumners")
	void LastNameOfRecord4770() {
		assertEquals("Sumners", customers.get(4769).getLastName());
	}

	@Test
	@DisplayName("Record 4770: Company is La Quinta Inn")
	void CompanyOfRecord4770() {
		assertEquals("La Quinta Inn", customers.get(4769).getCompany());
	}

	@Test
	@DisplayName("Record 4770: Address is 3838 N 36th Ave")
	void AddressOfRecord4770() {
		assertEquals("3838 N 36th Ave", customers.get(4769).getAddress());
	}

	@Test
	@DisplayName("Record 4770: City is Phoenix")
	void CityOfRecord4770() {
		assertEquals("Phoenix", customers.get(4769).getCity());
	}

	@Test
	@DisplayName("Record 4770: County is Maricopa")
	void CountyOfRecord4770() {
		assertEquals("Maricopa", customers.get(4769).getCounty());
	}

	@Test
	@DisplayName("Record 4770: State is AZ")
	void StateOfRecord4770() {
		assertEquals("AZ", customers.get(4769).getState());
	}

	@Test
	@DisplayName("Record 4770: ZIP is 85019")
	void ZIPOfRecord4770() {
		assertEquals("85019", customers.get(4769).getZIP());
	}

	@Test
	@DisplayName("Record 4770: Phone is 602-278-9068")
	void PhoneOfRecord4770() {
		assertEquals("602-278-9068", customers.get(4769).getPhone());
	}

	@Test
	@DisplayName("Record 4770: Fax is 602-278-4537")
	void FaxOfRecord4770() {
		assertEquals("602-278-4537", customers.get(4769).getFax());
	}

	@Test
	@DisplayName("Record 4770: Email is theresa@sumners.com")
	void EmailOfRecord4770() {
		assertEquals("theresa@sumners.com", customers.get(4769).getEmail());
	}

	@Test
	@DisplayName("Record 4770: Web is http://www.theresasumners.com")
	void WebOfRecord4770() {
		assertEquals("http://www.theresasumners.com", customers.get(4769).getWeb());
	}
}
