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

@Tag("35")
class Record_4191 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4191: FirstName is Lloyd")
	void FirstNameOfRecord4191() {
		assertEquals("Lloyd", customers.get(4190).getFirstName());
	}

	@Test
	@DisplayName("Record 4191: LastName is Reys")
	void LastNameOfRecord4191() {
		assertEquals("Reys", customers.get(4190).getLastName());
	}

	@Test
	@DisplayName("Record 4191: Company is Practice Support Resources")
	void CompanyOfRecord4191() {
		assertEquals("Practice Support Resources", customers.get(4190).getCompany());
	}

	@Test
	@DisplayName("Record 4191: Address is 28 Mechanic St")
	void AddressOfRecord4191() {
		assertEquals("28 Mechanic St", customers.get(4190).getAddress());
	}

	@Test
	@DisplayName("Record 4191: City is Worcester")
	void CityOfRecord4191() {
		assertEquals("Worcester", customers.get(4190).getCity());
	}

	@Test
	@DisplayName("Record 4191: County is Worcester")
	void CountyOfRecord4191() {
		assertEquals("Worcester", customers.get(4190).getCounty());
	}

	@Test
	@DisplayName("Record 4191: State is MA")
	void StateOfRecord4191() {
		assertEquals("MA", customers.get(4190).getState());
	}

	@Test
	@DisplayName("Record 4191: ZIP is 1608")
	void ZIPOfRecord4191() {
		assertEquals("1608", customers.get(4190).getZIP());
	}

	@Test
	@DisplayName("Record 4191: Phone is 508-755-8854")
	void PhoneOfRecord4191() {
		assertEquals("508-755-8854", customers.get(4190).getPhone());
	}

	@Test
	@DisplayName("Record 4191: Fax is 508-755-2908")
	void FaxOfRecord4191() {
		assertEquals("508-755-2908", customers.get(4190).getFax());
	}

	@Test
	@DisplayName("Record 4191: Email is lloyd@reys.com")
	void EmailOfRecord4191() {
		assertEquals("lloyd@reys.com", customers.get(4190).getEmail());
	}

	@Test
	@DisplayName("Record 4191: Web is http://www.lloydreys.com")
	void WebOfRecord4191() {
		assertEquals("http://www.lloydreys.com", customers.get(4190).getWeb());
	}
}
