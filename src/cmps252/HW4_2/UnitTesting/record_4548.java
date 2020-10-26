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

@Tag("13")
class Record_4548 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4548: FirstName is Warren")
	void FirstNameOfRecord4548() {
		assertEquals("Warren", customers.get(4547).getFirstName());
	}

	@Test
	@DisplayName("Record 4548: LastName is Gory")
	void LastNameOfRecord4548() {
		assertEquals("Gory", customers.get(4547).getLastName());
	}

	@Test
	@DisplayName("Record 4548: Company is Hage & Associates Inc")
	void CompanyOfRecord4548() {
		assertEquals("Hage & Associates Inc", customers.get(4547).getCompany());
	}

	@Test
	@DisplayName("Record 4548: Address is 51 Louisiana Ave Nw")
	void AddressOfRecord4548() {
		assertEquals("51 Louisiana Ave Nw", customers.get(4547).getAddress());
	}

	@Test
	@DisplayName("Record 4548: City is Washington")
	void CityOfRecord4548() {
		assertEquals("Washington", customers.get(4547).getCity());
	}

	@Test
	@DisplayName("Record 4548: County is District of Columbia")
	void CountyOfRecord4548() {
		assertEquals("District of Columbia", customers.get(4547).getCounty());
	}

	@Test
	@DisplayName("Record 4548: State is DC")
	void StateOfRecord4548() {
		assertEquals("DC", customers.get(4547).getState());
	}

	@Test
	@DisplayName("Record 4548: ZIP is 20001")
	void ZIPOfRecord4548() {
		assertEquals("20001", customers.get(4547).getZIP());
	}

	@Test
	@DisplayName("Record 4548: Phone is 202-737-3075")
	void PhoneOfRecord4548() {
		assertEquals("202-737-3075", customers.get(4547).getPhone());
	}

	@Test
	@DisplayName("Record 4548: Fax is 202-737-0984")
	void FaxOfRecord4548() {
		assertEquals("202-737-0984", customers.get(4547).getFax());
	}

	@Test
	@DisplayName("Record 4548: Email is warren@gory.com")
	void EmailOfRecord4548() {
		assertEquals("warren@gory.com", customers.get(4547).getEmail());
	}

	@Test
	@DisplayName("Record 4548: Web is http://www.warrengory.com")
	void WebOfRecord4548() {
		assertEquals("http://www.warrengory.com", customers.get(4547).getWeb());
	}
}
