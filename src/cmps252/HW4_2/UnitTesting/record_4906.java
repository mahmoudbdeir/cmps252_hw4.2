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

@Tag("9")
class Record_4906 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4906: FirstName is Roman")
	void FirstNameOfRecord4906() {
		assertEquals("Roman", customers.get(4905).getFirstName());
	}

	@Test
	@DisplayName("Record 4906: LastName is Malts")
	void LastNameOfRecord4906() {
		assertEquals("Malts", customers.get(4905).getLastName());
	}

	@Test
	@DisplayName("Record 4906: Company is Bold Machine Works Inc")
	void CompanyOfRecord4906() {
		assertEquals("Bold Machine Works Inc", customers.get(4905).getCompany());
	}

	@Test
	@DisplayName("Record 4906: Address is 9226 180th St")
	void AddressOfRecord4906() {
		assertEquals("9226 180th St", customers.get(4905).getAddress());
	}

	@Test
	@DisplayName("Record 4906: City is Jamaica")
	void CityOfRecord4906() {
		assertEquals("Jamaica", customers.get(4905).getCity());
	}

	@Test
	@DisplayName("Record 4906: County is Queens")
	void CountyOfRecord4906() {
		assertEquals("Queens", customers.get(4905).getCounty());
	}

	@Test
	@DisplayName("Record 4906: State is NY")
	void StateOfRecord4906() {
		assertEquals("NY", customers.get(4905).getState());
	}

	@Test
	@DisplayName("Record 4906: ZIP is 11433")
	void ZIPOfRecord4906() {
		assertEquals("11433", customers.get(4905).getZIP());
	}

	@Test
	@DisplayName("Record 4906: Phone is 718-657-3378")
	void PhoneOfRecord4906() {
		assertEquals("718-657-3378", customers.get(4905).getPhone());
	}

	@Test
	@DisplayName("Record 4906: Fax is 718-657-7061")
	void FaxOfRecord4906() {
		assertEquals("718-657-7061", customers.get(4905).getFax());
	}

	@Test
	@DisplayName("Record 4906: Email is roman@malts.com")
	void EmailOfRecord4906() {
		assertEquals("roman@malts.com", customers.get(4905).getEmail());
	}

	@Test
	@DisplayName("Record 4906: Web is http://www.romanmalts.com")
	void WebOfRecord4906() {
		assertEquals("http://www.romanmalts.com", customers.get(4905).getWeb());
	}
}
