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

@Tag("47")
class Record_2537 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2537: FirstName is Numbers")
	void FirstNameOfRecord2537() {
		assertEquals("Numbers", customers.get(2536).getFirstName());
	}

	@Test
	@DisplayName("Record 2537: LastName is Laspina")
	void LastNameOfRecord2537() {
		assertEquals("Laspina", customers.get(2536).getLastName());
	}

	@Test
	@DisplayName("Record 2537: Company is Top Line Tooling")
	void CompanyOfRecord2537() {
		assertEquals("Top Line Tooling", customers.get(2536).getCompany());
	}

	@Test
	@DisplayName("Record 2537: Address is 17 Battery Pl")
	void AddressOfRecord2537() {
		assertEquals("17 Battery Pl", customers.get(2536).getAddress());
	}

	@Test
	@DisplayName("Record 2537: City is New York")
	void CityOfRecord2537() {
		assertEquals("New York", customers.get(2536).getCity());
	}

	@Test
	@DisplayName("Record 2537: County is New York")
	void CountyOfRecord2537() {
		assertEquals("New York", customers.get(2536).getCounty());
	}

	@Test
	@DisplayName("Record 2537: State is NY")
	void StateOfRecord2537() {
		assertEquals("NY", customers.get(2536).getState());
	}

	@Test
	@DisplayName("Record 2537: ZIP is 10004")
	void ZIPOfRecord2537() {
		assertEquals("10004", customers.get(2536).getZIP());
	}

	@Test
	@DisplayName("Record 2537: Phone is 212-269-5626")
	void PhoneOfRecord2537() {
		assertEquals("212-269-5626", customers.get(2536).getPhone());
	}

	@Test
	@DisplayName("Record 2537: Fax is 212-269-4845")
	void FaxOfRecord2537() {
		assertEquals("212-269-4845", customers.get(2536).getFax());
	}

	@Test
	@DisplayName("Record 2537: Email is numbers@laspina.com")
	void EmailOfRecord2537() {
		assertEquals("numbers@laspina.com", customers.get(2536).getEmail());
	}

	@Test
	@DisplayName("Record 2537: Web is http://www.numberslaspina.com")
	void WebOfRecord2537() {
		assertEquals("http://www.numberslaspina.com", customers.get(2536).getWeb());
	}
}
