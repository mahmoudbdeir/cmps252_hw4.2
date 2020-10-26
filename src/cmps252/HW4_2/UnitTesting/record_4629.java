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

@Tag("11")
class Record_4629 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4629: FirstName is Clark")
	void FirstNameOfRecord4629() {
		assertEquals("Clark", customers.get(4628).getFirstName());
	}

	@Test
	@DisplayName("Record 4629: LastName is Zollars")
	void LastNameOfRecord4629() {
		assertEquals("Zollars", customers.get(4628).getLastName());
	}

	@Test
	@DisplayName("Record 4629: Company is Twin Oaks Retirement Center")
	void CompanyOfRecord4629() {
		assertEquals("Twin Oaks Retirement Center", customers.get(4628).getCompany());
	}

	@Test
	@DisplayName("Record 4629: Address is 1708 N Parkerson Ave")
	void AddressOfRecord4629() {
		assertEquals("1708 N Parkerson Ave", customers.get(4628).getAddress());
	}

	@Test
	@DisplayName("Record 4629: City is Crowley")
	void CityOfRecord4629() {
		assertEquals("Crowley", customers.get(4628).getCity());
	}

	@Test
	@DisplayName("Record 4629: County is Acadia")
	void CountyOfRecord4629() {
		assertEquals("Acadia", customers.get(4628).getCounty());
	}

	@Test
	@DisplayName("Record 4629: State is LA")
	void StateOfRecord4629() {
		assertEquals("LA", customers.get(4628).getState());
	}

	@Test
	@DisplayName("Record 4629: ZIP is 70526")
	void ZIPOfRecord4629() {
		assertEquals("70526", customers.get(4628).getZIP());
	}

	@Test
	@DisplayName("Record 4629: Phone is 337-788-0312")
	void PhoneOfRecord4629() {
		assertEquals("337-788-0312", customers.get(4628).getPhone());
	}

	@Test
	@DisplayName("Record 4629: Fax is 337-788-0733")
	void FaxOfRecord4629() {
		assertEquals("337-788-0733", customers.get(4628).getFax());
	}

	@Test
	@DisplayName("Record 4629: Email is clark@zollars.com")
	void EmailOfRecord4629() {
		assertEquals("clark@zollars.com", customers.get(4628).getEmail());
	}

	@Test
	@DisplayName("Record 4629: Web is http://www.clarkzollars.com")
	void WebOfRecord4629() {
		assertEquals("http://www.clarkzollars.com", customers.get(4628).getWeb());
	}
}
