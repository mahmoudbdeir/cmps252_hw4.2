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
class Record_4839 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4839: FirstName is Felipe")
	void FirstNameOfRecord4839() {
		assertEquals("Felipe", customers.get(4838).getFirstName());
	}

	@Test
	@DisplayName("Record 4839: LastName is Brendel")
	void LastNameOfRecord4839() {
		assertEquals("Brendel", customers.get(4838).getLastName());
	}

	@Test
	@DisplayName("Record 4839: Company is Hoffman A Awning Co")
	void CompanyOfRecord4839() {
		assertEquals("Hoffman A Awning Co", customers.get(4838).getCompany());
	}

	@Test
	@DisplayName("Record 4839: Address is 10 W 33rd St")
	void AddressOfRecord4839() {
		assertEquals("10 W 33rd St", customers.get(4838).getAddress());
	}

	@Test
	@DisplayName("Record 4839: City is New York")
	void CityOfRecord4839() {
		assertEquals("New York", customers.get(4838).getCity());
	}

	@Test
	@DisplayName("Record 4839: County is New York")
	void CountyOfRecord4839() {
		assertEquals("New York", customers.get(4838).getCounty());
	}

	@Test
	@DisplayName("Record 4839: State is NY")
	void StateOfRecord4839() {
		assertEquals("NY", customers.get(4838).getState());
	}

	@Test
	@DisplayName("Record 4839: ZIP is 10001")
	void ZIPOfRecord4839() {
		assertEquals("10001", customers.get(4838).getZIP());
	}

	@Test
	@DisplayName("Record 4839: Phone is 212-967-0604")
	void PhoneOfRecord4839() {
		assertEquals("212-967-0604", customers.get(4838).getPhone());
	}

	@Test
	@DisplayName("Record 4839: Fax is 212-967-4784")
	void FaxOfRecord4839() {
		assertEquals("212-967-4784", customers.get(4838).getFax());
	}

	@Test
	@DisplayName("Record 4839: Email is felipe@brendel.com")
	void EmailOfRecord4839() {
		assertEquals("felipe@brendel.com", customers.get(4838).getEmail());
	}

	@Test
	@DisplayName("Record 4839: Web is http://www.felipebrendel.com")
	void WebOfRecord4839() {
		assertEquals("http://www.felipebrendel.com", customers.get(4838).getWeb());
	}
}
