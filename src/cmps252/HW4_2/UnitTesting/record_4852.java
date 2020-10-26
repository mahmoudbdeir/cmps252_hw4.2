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

@Tag("34")
class Record_4852 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4852: FirstName is Myrtle")
	void FirstNameOfRecord4852() {
		assertEquals("Myrtle", customers.get(4851).getFirstName());
	}

	@Test
	@DisplayName("Record 4852: LastName is Lascaro")
	void LastNameOfRecord4852() {
		assertEquals("Lascaro", customers.get(4851).getLastName());
	}

	@Test
	@DisplayName("Record 4852: Company is Nelson Precast Inc")
	void CompanyOfRecord4852() {
		assertEquals("Nelson Precast Inc", customers.get(4851).getCompany());
	}

	@Test
	@DisplayName("Record 4852: Address is 411 5th Ave")
	void AddressOfRecord4852() {
		assertEquals("411 5th Ave", customers.get(4851).getAddress());
	}

	@Test
	@DisplayName("Record 4852: City is New York")
	void CityOfRecord4852() {
		assertEquals("New York", customers.get(4851).getCity());
	}

	@Test
	@DisplayName("Record 4852: County is New York")
	void CountyOfRecord4852() {
		assertEquals("New York", customers.get(4851).getCounty());
	}

	@Test
	@DisplayName("Record 4852: State is NY")
	void StateOfRecord4852() {
		assertEquals("NY", customers.get(4851).getState());
	}

	@Test
	@DisplayName("Record 4852: ZIP is 10016")
	void ZIPOfRecord4852() {
		assertEquals("10016", customers.get(4851).getZIP());
	}

	@Test
	@DisplayName("Record 4852: Phone is 212-213-9678")
	void PhoneOfRecord4852() {
		assertEquals("212-213-9678", customers.get(4851).getPhone());
	}

	@Test
	@DisplayName("Record 4852: Fax is 212-213-1036")
	void FaxOfRecord4852() {
		assertEquals("212-213-1036", customers.get(4851).getFax());
	}

	@Test
	@DisplayName("Record 4852: Email is myrtle@lascaro.com")
	void EmailOfRecord4852() {
		assertEquals("myrtle@lascaro.com", customers.get(4851).getEmail());
	}

	@Test
	@DisplayName("Record 4852: Web is http://www.myrtlelascaro.com")
	void WebOfRecord4852() {
		assertEquals("http://www.myrtlelascaro.com", customers.get(4851).getWeb());
	}
}
