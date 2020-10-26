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

@Tag("36")
class Record_4653 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4653: FirstName is Maureen")
	void FirstNameOfRecord4653() {
		assertEquals("Maureen", customers.get(4652).getFirstName());
	}

	@Test
	@DisplayName("Record 4653: LastName is Chisler")
	void LastNameOfRecord4653() {
		assertEquals("Chisler", customers.get(4652).getLastName());
	}

	@Test
	@DisplayName("Record 4653: Company is Walk In 1 Hour Signs Inc")
	void CompanyOfRecord4653() {
		assertEquals("Walk In 1 Hour Signs Inc", customers.get(4652).getCompany());
	}

	@Test
	@DisplayName("Record 4653: Address is 9131 Queens Blvd  #-502")
	void AddressOfRecord4653() {
		assertEquals("9131 Queens Blvd  #-502", customers.get(4652).getAddress());
	}

	@Test
	@DisplayName("Record 4653: City is Elmhurst")
	void CityOfRecord4653() {
		assertEquals("Elmhurst", customers.get(4652).getCity());
	}

	@Test
	@DisplayName("Record 4653: County is Queens")
	void CountyOfRecord4653() {
		assertEquals("Queens", customers.get(4652).getCounty());
	}

	@Test
	@DisplayName("Record 4653: State is NY")
	void StateOfRecord4653() {
		assertEquals("NY", customers.get(4652).getState());
	}

	@Test
	@DisplayName("Record 4653: ZIP is 11373")
	void ZIPOfRecord4653() {
		assertEquals("11373", customers.get(4652).getZIP());
	}

	@Test
	@DisplayName("Record 4653: Phone is 718-424-1478")
	void PhoneOfRecord4653() {
		assertEquals("718-424-1478", customers.get(4652).getPhone());
	}

	@Test
	@DisplayName("Record 4653: Fax is 718-424-6313")
	void FaxOfRecord4653() {
		assertEquals("718-424-6313", customers.get(4652).getFax());
	}

	@Test
	@DisplayName("Record 4653: Email is maureen@chisler.com")
	void EmailOfRecord4653() {
		assertEquals("maureen@chisler.com", customers.get(4652).getEmail());
	}

	@Test
	@DisplayName("Record 4653: Web is http://www.maureenchisler.com")
	void WebOfRecord4653() {
		assertEquals("http://www.maureenchisler.com", customers.get(4652).getWeb());
	}
}
