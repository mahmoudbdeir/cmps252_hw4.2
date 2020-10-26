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

@Tag("45")
class Record_4282 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4282: FirstName is Joanna")
	void FirstNameOfRecord4282() {
		assertEquals("Joanna", customers.get(4281).getFirstName());
	}

	@Test
	@DisplayName("Record 4282: LastName is Lapham")
	void LastNameOfRecord4282() {
		assertEquals("Lapham", customers.get(4281).getLastName());
	}

	@Test
	@DisplayName("Record 4282: Company is Price Waterhouse")
	void CompanyOfRecord4282() {
		assertEquals("Price Waterhouse", customers.get(4281).getCompany());
	}

	@Test
	@DisplayName("Record 4282: Address is 5120 Woodway Dr  #-6010")
	void AddressOfRecord4282() {
		assertEquals("5120 Woodway Dr  #-6010", customers.get(4281).getAddress());
	}

	@Test
	@DisplayName("Record 4282: City is Houston")
	void CityOfRecord4282() {
		assertEquals("Houston", customers.get(4281).getCity());
	}

	@Test
	@DisplayName("Record 4282: County is Harris")
	void CountyOfRecord4282() {
		assertEquals("Harris", customers.get(4281).getCounty());
	}

	@Test
	@DisplayName("Record 4282: State is TX")
	void StateOfRecord4282() {
		assertEquals("TX", customers.get(4281).getState());
	}

	@Test
	@DisplayName("Record 4282: ZIP is 77056")
	void ZIPOfRecord4282() {
		assertEquals("77056", customers.get(4281).getZIP());
	}

	@Test
	@DisplayName("Record 4282: Phone is 713-622-8971")
	void PhoneOfRecord4282() {
		assertEquals("713-622-8971", customers.get(4281).getPhone());
	}

	@Test
	@DisplayName("Record 4282: Fax is 713-622-4595")
	void FaxOfRecord4282() {
		assertEquals("713-622-4595", customers.get(4281).getFax());
	}

	@Test
	@DisplayName("Record 4282: Email is joanna@lapham.com")
	void EmailOfRecord4282() {
		assertEquals("joanna@lapham.com", customers.get(4281).getEmail());
	}

	@Test
	@DisplayName("Record 4282: Web is http://www.joannalapham.com")
	void WebOfRecord4282() {
		assertEquals("http://www.joannalapham.com", customers.get(4281).getWeb());
	}
}
