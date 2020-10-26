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
class Record_2948 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2948: FirstName is Eliza")
	void FirstNameOfRecord2948() {
		assertEquals("Eliza", customers.get(2947).getFirstName());
	}

	@Test
	@DisplayName("Record 2948: LastName is Erps")
	void LastNameOfRecord2948() {
		assertEquals("Erps", customers.get(2947).getLastName());
	}

	@Test
	@DisplayName("Record 2948: Company is Figueroa Intrntl Distrb Ctr")
	void CompanyOfRecord2948() {
		assertEquals("Figueroa Intrntl Distrb Ctr", customers.get(2947).getCompany());
	}

	@Test
	@DisplayName("Record 2948: Address is 1908 Chicago Ave")
	void AddressOfRecord2948() {
		assertEquals("1908 Chicago Ave", customers.get(2947).getAddress());
	}

	@Test
	@DisplayName("Record 2948: City is Minneapolis")
	void CityOfRecord2948() {
		assertEquals("Minneapolis", customers.get(2947).getCity());
	}

	@Test
	@DisplayName("Record 2948: County is Hennepin")
	void CountyOfRecord2948() {
		assertEquals("Hennepin", customers.get(2947).getCounty());
	}

	@Test
	@DisplayName("Record 2948: State is MN")
	void StateOfRecord2948() {
		assertEquals("MN", customers.get(2947).getState());
	}

	@Test
	@DisplayName("Record 2948: ZIP is 55404")
	void ZIPOfRecord2948() {
		assertEquals("55404", customers.get(2947).getZIP());
	}

	@Test
	@DisplayName("Record 2948: Phone is 612-871-9488")
	void PhoneOfRecord2948() {
		assertEquals("612-871-9488", customers.get(2947).getPhone());
	}

	@Test
	@DisplayName("Record 2948: Fax is 612-871-0109")
	void FaxOfRecord2948() {
		assertEquals("612-871-0109", customers.get(2947).getFax());
	}

	@Test
	@DisplayName("Record 2948: Email is eliza@erps.com")
	void EmailOfRecord2948() {
		assertEquals("eliza@erps.com", customers.get(2947).getEmail());
	}

	@Test
	@DisplayName("Record 2948: Web is http://www.elizaerps.com")
	void WebOfRecord2948() {
		assertEquals("http://www.elizaerps.com", customers.get(2947).getWeb());
	}
}
